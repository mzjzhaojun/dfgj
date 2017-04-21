package com.yt.app.api.v1.controller;

import io.swagger.annotations.ApiOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.yt.app.api.v1.entity.File;
import com.yt.app.api.v1.resource.FileResourceAssembler;
import com.yt.app.api.v1.service.FileService;
import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.frame.page.IPage;
import com.yt.app.util.FileUtil;

/**
 * @author zj default test
 * 
 * @version 1.1
 */

@RestController
@RequestMapping("/rest/v1/file")
public class FileController extends BaseControllerImpl<File, Long> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private FileService service;

	@Override
	@ApiOperation(value = "列表分页", response = File.class)
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response) {
		IPage<File> pagebean = service.list(requestEntity);
		return new ResponseEntity<Object>(new FileResourceAssembler().toResources(pagebean.getPageList()), pagebean.getHeaders(), HttpStatus.OK);
	}

	/**
	 * 普通上传
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@ApiOperation(value = "上传", response = File.class)
	@RequestMapping(value = "/upload", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<File> add(MultipartHttpServletRequest request) throws IOException {
		MultipartFile file = request.getFile("fileList");
		String url = request.getParameter("url");
		File furl = service.addFile(file, url);
		return new ResponseEntity<File>(furl, HttpStatus.OK);
	}

	/**
	 * 下载
	 * 
	 * @param id
	 * @param response
	 */
	@ApiOperation(value = "下载", response = File.class)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public void dowload(@PathVariable Long id, HttpServletResponse response) {
		File fl = service.get(id);
		if (fl == null) {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		StringBuffer sb = new StringBuffer();
		String filepath = sb.append(fl.getRoot_path()).append(fl.getRelative_path()).append(java.io.File.separator).append(fl.getFile_name())
				.toString();
		java.io.File file = new java.io.File(filepath);
		if (FileUtil.isImage(file)) {
			if (file.exists()) {
				response.setContentType("image/" + fl.getSuffix());
			} else {
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
				return;
			}
		} else {
			response.setContentType("application/octet-stream");
			response.setHeader("Accept-Ranges", "bytes");
			response.setHeader("Content-Disposition", "attachment;fileName=" + new String(fl.getFile_name()));
		}
		try {
			FileInputStream inputStream = new FileInputStream(file);
			byte[] data = new byte[(int) file.length()];
			inputStream.read(data);
			inputStream.close();
			OutputStream stream = response.getOutputStream();
			stream.write(data);
			stream.flush();
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
