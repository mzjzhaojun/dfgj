package com.yt.app.api.v1.service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.yt.app.frame.c.AppConfig;
import com.yt.app.frame.i.Ar;
import com.yt.app.frame.k.File;
import com.yt.app.api.v1.entity.Potentialcustomers;
import com.yt.app.api.v1.mapper.FileMapper;
import com.yt.app.api.v1.mapper.PotentialcustomersMapper;
import com.yt.app.api.v1.service.FileService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.frame.p.DateTimeUtil;
import com.yt.app.frame.p.FileUtil;

/**
 * @author zj default
 * 
 * @version 1.1
 */

@Service
public class FileServiceImpl extends BaseServiceImpl<File, Long> implements FileService {
	@Autowired
	private FileMapper mapper;
	
	@Autowired
	private PotentialcustomersMapper potentialcustomersmapper;
	
	@Autowired
	private Ar generateid;

	@Autowired
	AppConfig appConfig;

	@Override
	@Transactional
	public File addFile(MultipartFile file) throws IOException {
		String filename = file.getOriginalFilename();
		String type = (filename.substring(filename.lastIndexOf(".") + 1));
		String filenametemp = "";
		if (filename.indexOf("\\") != -1) {
			filenametemp = filename.substring(filename.lastIndexOf("\\") + 1, filename.lastIndexOf("."));
		} else {
			filenametemp = filename.substring(0, filename.lastIndexOf("."));
		}
		Date uploaddate = new Date();
		String filepath = createfilepath(uploaddate);
		InputStream is = file.getInputStream();
		File fl = null;
		StringBuffer sb = new StringBuffer();
		String name = "";
		String path = "";
		fl = new File();
		fl.setRoot_path(appConfig.getFilePath());
		fl.setRelative_path(filepath);
		fl.setCreatetime(new Date());
		fl.setFile_size((int) file.getSize());
		fl.setSuffix(type);
		mapper.post(fl);
		name = sb.append(fl.getId()).append("_").append(filenametemp).append(".").append(type).toString();
		sb = new StringBuffer();
		String apath = sb.append(filepath).append(java.io.File.separator).append(name).toString();
		sb = new StringBuffer();
		path = sb.append(appConfig.getFilePath()).append(apath).toString();
		java.io.File uploadfile = new java.io.File(path);
		FileUtil.writeFile(is, uploadfile);
		File f = mapper.get(fl.getId());
		if (!name.equals(""))
			f.setFile_name(name);
		f.setModifytime(new Date());
		mapper.put(f);
		f.setUrl(appConfig.getUrl().replace("{id}", fl.getId() + ""));
		return f;
	}

	@Override
	@Transactional
	public File addFile(MultipartFile file, String url) throws IOException {
		String filename = file.getOriginalFilename();
		String type = (filename.substring(filename.lastIndexOf(".") + 1));
		String filenametemp = "";
		if (filename.indexOf("\\") != -1) {
			filenametemp = filename.substring(filename.lastIndexOf("\\") + 1, filename.lastIndexOf("."));
		} else {
			filenametemp = filename.substring(0, filename.lastIndexOf("."));
		}
		Date uploaddate = new Date();
		String filepath = createfilepath(uploaddate);
		InputStream is = file.getInputStream();
		File fl = new File();
		StringBuffer sb = new StringBuffer();
		String name = "";
		String path = "";
		if (url == null)
			url = "";
		String id = this.findId(url);
		boolean mat = id.matches("\\d+");
		if (mat) {
			fl = mapper.get(Long.valueOf(id));
			if (fl != null) {
				path = sb.append(fl.getRoot_path()).append(fl.getRelative_path()).append(java.io.File.separator).append(fl.getFile_name()).toString();
				java.io.File deletefile = new java.io.File(path);
				deletefile.delete();
				fl.setFile_size((int) file.getSize());
				fl.setSuffix(type);
				mapper.put(fl);
				sb = new StringBuffer();
				name = sb.append(fl.getId()).append("_").append(filenametemp).append(".").append(type).toString();
				sb = new StringBuffer();
				String apath = sb.append(fl.getRelative_path()).append(java.io.File.separator).append(name).toString();
				sb = new StringBuffer();
				path = sb.append(fl.getRoot_path()).append(apath).toString();
			} else {
				fl = new File();
				fl.setId(Long.valueOf(id));
				fl.setRoot_path(appConfig.getFilePath());
				fl.setRelative_path(filepath);
				fl.setCreatetime(new Date());
				fl.setFile_size((int) file.getSize());
				fl.setSuffix(type);
				mapper.post(fl);
				name = sb.append(fl.getId()).append("_").append(filenametemp).append(".").append(type).toString();
				sb = new StringBuffer();
				String apath = sb.append(filepath).append(java.io.File.separator).append(name).toString();
				sb = new StringBuffer();
				path = sb.append(appConfig.getFilePath()).append(apath).toString();
			}
		} else {
			fl.setRoot_path(appConfig.getFilePath());
			fl.setRelative_path(filepath);
			fl.setCreatetime(new Date());
			fl.setFile_size((int) file.getSize());
			fl.setSuffix(type);
			mapper.post(fl);
			name = sb.append(fl.getId()).append("_").append(filenametemp).append(".").append(type).toString();
			sb = new StringBuffer();
			String apath = sb.append(filepath).append(java.io.File.separator).append(name).toString();
			sb = new StringBuffer();
			path = sb.append(appConfig.getFilePath()).append(apath).toString();
		}
		java.io.File uploadfile = new java.io.File(path);
		FileUtil.writeFile(is, uploadfile);
		File f = mapper.get(fl.getId());
		if (!name.equals(""))
			f.setFile_name(name);
		f.setModifytime(new Date());
		mapper.put(f);
		String curl = appConfig.getUrl().replace("{file}", "file");
		f.setUrl(curl.replace("{id}", fl.getId() + ""));
		return f;
	}

	public String createfilepath(Date date) {
		StringBuffer sb = new StringBuffer();
		String yearfolder = DateTimeUtil.getDateTime(date, DateTimeUtil.DEFAULT_DATE_FORMAT);
		java.io.File filePath = new java.io.File(appConfig.getFilePath());
		if (!filePath.exists()) {
			try {
				filePath.mkdir();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String ypath = sb.append(java.io.File.separator).append(yearfolder).toString();
		java.io.File yfile = new java.io.File(filePath + ypath);
		if (!yfile.exists()) {
			try {
				yfile.mkdir();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String hfolder = DateTimeUtil.getDateTime(date, DateTimeUtil.DEFAULT_HOUR_FORMAT);
		String hpath = sb.append(java.io.File.separator).append(hfolder).toString();
		java.io.File hfile = new java.io.File(filePath + hpath);
		if (!hfile.exists()) {
			try {
				hfile.mkdir();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return hpath;
	}

	public String findId(String url) {
		return url.substring(url.lastIndexOf("/") + 1);
	}

	@Override
	@Transactional
	public Integer remove(long id) {
		Integer i = 0;
		File fl = mapper.get(id);
		if (fl != null) {
			StringBuffer sb = new StringBuffer();
			sb.append(appConfig.getFilePath()).append(fl.getRelative_path()).append(java.io.File.separator).append(fl.getFile_name()).toString();
			java.io.File deletefile = new java.io.File(sb.toString());
			deletefile.delete();
			i = mapper.delete(id);
		}
		return i;
	}

	@Override
	@Transactional
	public Integer removeArray(List<String> list) {
		Integer i = 0;
		for (String id : list) {
			File fl = mapper.get(Long.parseLong(id));
			if (fl != null) {
				StringBuffer sb = new StringBuffer();
				sb.append(appConfig.getFilePath()).append(fl.getRelative_path()).append(java.io.File.separator).append(fl.getFile_name()).toString();
				java.io.File deletefile = new java.io.File(sb.toString());
				deletefile.delete();
				i = mapper.delete(Long.parseLong(id));
			}
		}
		return i;
	}

	@SuppressWarnings("static-access")
	@Override
	public String importexcel(MultipartFile file, String branchid, String branchname, String staffid, String staffname, String campusid,
			String campusname) throws IOException {
		String filename = file.getOriginalFilename();
		String type = (filename.substring(filename.lastIndexOf(".") + 1));
		if (type.equals("xlsx")) {
			String filepath = createfilepath(new Date());
			InputStream is = file.getInputStream();
			StringBuffer sb = new StringBuffer();
			String path = sb.append(appConfig.getFilePath()).append(filepath).append(java.io.File.separator).append(filename).toString();
			java.io.File uploadfile = new java.io.File(path);
			FileUtil.writeFile(is, uploadfile);
			XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(uploadfile));
			XSSFSheet sheet = book.getSheetAt(0);
			List<Potentialcustomers> list = new ArrayList<Potentialcustomers>();
			Potentialcustomers t;
			for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
				t = new Potentialcustomers();
				XSSFRow row = sheet.getRow(i);
				t.setCustomername(row.getCell(0).getStringCellValue());
				XSSFCell cell = row.getCell(1);
				if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
					cell.setCellType(cell.CELL_TYPE_STRING);
					t.setMp(cell.getStringCellValue());
				}
				String key = row.getCell(2).getStringCellValue();
				switch (key) {
				case "市场活动":
					t.setSourcemaintype(DictionaryResource.PATRIARCH_SOURCE_561);
					break;
				case "电话咨询":
					t.setSourcemaintype(DictionaryResource.PATRIARCH_SOURCE_562);
					break;
				default:
					t.setSourcemaintype(DictionaryResource.PATRIARCH_SOURCE_563);
					break;
				}
				t.setId(generateid.nextId());
				t.setOrgid(Long.valueOf(branchid));
				t.setOrgname(branchname);
				t.setCampusid(Long.valueOf(campusid));
				t.setCampusname(campusname);
				t.setCreatorid(Long.valueOf(staffid));
				t.setCreatorname(staffname);
				t.setCreatetime(new Date());
				t.setModifytime(new Date());
				t.setCustomerlevel(DictionaryResource.PATRIARCH_LEVEL_1951);
				t.setCustomerstatus(DictionaryResource.PATRIARCH_STATUS_1971);
				t.setFollowstage(DictionaryResource.PATRIARCH_FLLOWSTATUS_571);
				t.setViptype(DictionaryResource.PATRIARCH_VIP_1993);
				t.setFollowedcount(0);
				list.add(t);
			}
			Integer i = potentialcustomersmapper.savebatch(list);
			uploadfile.delete();
			return "导入完成！共导入[ " + i + " ]条数据。";
		} else {
			return "请上传符合模板的数据!";
		}
	}

}