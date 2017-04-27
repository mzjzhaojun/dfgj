package com.yt.app.api.v1.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.yt.app.modul.File;
import com.yt.app.common.base.IBaseService;

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
	File addFile(MultipartFile file) throws IOException;

	/**
	 * 保存文件
	 * 
	 * @param file
	 * @return
	 */
	File addFile(MultipartFile file, String url) throws IOException;

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	Integer remove(long id);

	/**
	 * 根据数组id删除
	 * 
	 * @param list
	 * @return
	 */
	Integer removeArray(List<String> list);

}