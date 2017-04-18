package com.yt.app.api.v1.service;

import java.util.List;
import java.util.Map;

import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Role;
import com.yt.app.common.base.IBaseService;
import com.yt.app.frame.page.IPage;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public interface RoleService extends IBaseService<Role, Long> {

	/**
	 * 删除 huanghao
	 * 
	 * @param id
	 * @return
	 */
	Integer deletebyid(long id);

	/**
	 * 添加
	 * 
	 * @param role
	 * @return
	 */
	Integer addobject(Role role);

	/**
	 * 更新
	 * 
	 * @param role
	 * @return
	 */
	Integer updateobject(Role role);

	/**
	 * 根据id查询单个数据
	 * 
	 * @param id
	 * @return
	 */
	Map<String, Object> getid(long id);

	/**
	 * 列表分页
	 * 
	 * @author huanghao
	 * @param param
	 * @return
	 */
	IPage<Role> getlistAll(Map<String, Object> param);

	/**
	 * 获取类型
	 * 
	 * @author huanghao
	 * @return
	 */
	List<Dictionary> getdicttype();

}