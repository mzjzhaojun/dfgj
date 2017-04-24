package com.yt.app.api.v1.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.modul.File;
import com.yt.app.api.v1.mapper.FileMapper;
import com.yt.app.api.v1.service.FileService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.enums.DataSourceEnum;
import com.yt.app.frame.config.AppConfig;
import com.yt.app.util.DateTimeUtil;
import com.yt.app.util.FileUtil;

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
	AppConfig appConfig;

	@Override
	@Transactional
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	public File addFile(MultipartFile file) throws IOException {
		String filename = file.getOriginalFilename();
		String type = (filename.substring(filename.lastIndexOf(".") + 1));
		Date uploaddate = new Date();
		String filepath = createfilepath(uploaddate);
		InputStream is = file.getInputStream();
		Date now = new Date();
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
		name = sb.append(fl.getId()).append("_").append(now.getTime()).append(".").append(type).toString();
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
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	public File addFile(MultipartFile file, String url) throws IOException {
		String filename = file.getOriginalFilename();
		String type = (filename.substring(filename.lastIndexOf(".") + 1));
		Date uploaddate = new Date();
		String filepath = createfilepath(uploaddate);
		InputStream is = file.getInputStream();
		Date now = new Date();
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
				path = sb.append(appConfig.getFilePath()).append(fl.getRelative_path()).append(java.io.File.separator).append(fl.getFile_name())
						.toString();
				java.io.File deletefile = new java.io.File(path);
				deletefile.delete();

				fl.setRelative_path(filepath);
				fl.setFile_size((int) file.getSize());
				fl.setSuffix(type);
				mapper.put(fl);
				sb = new StringBuffer();
				name = sb.append(fl.getId()).append("_").append(now.getTime()).append(".").append(type).toString();
				sb = new StringBuffer();
				String apath = sb.append(filepath).append(java.io.File.separator).append(name).toString();
				sb = new StringBuffer();
				path = sb.append(appConfig.getFilePath()).append(apath).toString();
			} else {
				fl = new File();
				fl.setId(Long.valueOf(id));
				fl.setRoot_path(appConfig.getFilePath());
				fl.setRelative_path(filepath);
				fl.setCreatetime(new Date());
				fl.setFile_size((int) file.getSize());
				fl.setSuffix(type);
				mapper.post(fl);
				name = sb.append(fl.getId()).append("_").append(now.getTime()).append(".").append(type).toString();
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
			name = sb.append(fl.getId()).append("_").append(now.getTime()).append(".").append(type).toString();
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
		f.setUrl(appConfig.getUrl().replace("{id}", fl.getId() + ""));
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

}