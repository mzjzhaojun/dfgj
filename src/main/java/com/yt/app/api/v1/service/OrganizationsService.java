package com.yt.app.api.v1.service;


import com.yt.app.api.v1.entity.Organizations;
import com.yt.app.common.base.IBaseService;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:48
 */

public interface OrganizationsService extends IBaseService<Organizations, Long> {
	
	/**
	 * 重写根据id查询
	 * @param id
	 * @return
	 *//*
	Organizations get(Long id);
	*//**
	 * 重写保存
	 * 
	 * @param t
	 * @return
	 *//*
	Integer post(Organizations t);

	*//**
	 * 重写集合
	 * 
	 * @param param
	 * @return
	 *//*
	IPage<Organizations> list(RequestEntity<Object> requestEntity);*/
}