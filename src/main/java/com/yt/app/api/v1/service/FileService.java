package com.yt.app.api.v1.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.yt.app.modul.File;
import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.common.base.IBaseService;
import com.yt.app.enums.DataSourceEnum;

/**
 * @author zj default
 * 
 * @version 1.1
 */

public interface FileService extends IBaseService<File, Long> {
	/**
	 * 保存文件
	 * 
	 * @param file
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	File addFile(MultipartFile file) throws IOException;

	/**
	 * 保存文件
	 * 
	 * @param file
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	String importexcel(MultipartFile file, String branchid, String branchname, String staffid, String staffname, String campusid, String campusname)
			throws IOException;

	/**
	 * 保存文件
	 * 
	 * @param file
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	File addFile(MultipartFile file, String url) throws IOException;

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer remove(long id);

	/**
	 * 根据数组id删除
	 * 
	 * @param list
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer removeArray(List<String> list);

}