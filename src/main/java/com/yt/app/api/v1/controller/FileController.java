package com.yt.app.api.v1.controller;

import io.swagger.annotations.ApiOperation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.yt.app.api.v1.resource.FileResourceAssembler;
import com.yt.app.api.v1.service.FileService;
import com.yt.app.common.base.impl.BaseControllerImpl;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.p.FileUtil;
import com.yt.app.frame.k.File;

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
	 * 导入数据
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@ApiOperation(value = "导入数据", response = File.class)
	@RequestMapping(value = "/import", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> importexcel(MultipartHttpServletRequest request) throws IOException {
		MultipartFile file = request.getFile("file");
		String orgid = request.getParameter("orgid");
		String orgname = request.getParameter("orgname");
		String creatorid = request.getParameter("creatorid");
		String creatorname = request.getParameter("creatorname");
		String campusid = request.getParameter("campusid");
		String campusname = request.getParameter("campusname");
		String msg = service.importexcel(file, orgid, orgname, creatorid, creatorname, campusid, campusname);
		return new ResponseEntity<Object>(msg, HttpStatus.OK);
	}

	/**
	 * 下载
	 * 
	 * @param id
	 * @param response
	 */
	@ApiOperation(value = "下载", response = File.class)
	@RequestMapping(value = "/{ids}", method = RequestMethod.GET)
	public void dowloadall(@PathVariable String ids, HttpServletResponse response) {
		if (ids.indexOf(",") != -1) {
			String[] arrayid = ids.split(",");
			List<File> listfiles = new ArrayList<File>();
			for (String string : arrayid) {
				File fl = service.get(Long.valueOf(string));
				listfiles.add(fl);
			}
			FileUtil.dowloadfiles(listfiles, response);
		} else {
			File fl = service.get(Long.valueOf(ids));
			FileUtil.dowloadfile(fl, response);
		}
	}

}
