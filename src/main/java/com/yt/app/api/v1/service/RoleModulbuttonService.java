package com.yt.app.api.v1.service;

import java.util.List;

import com.yt.app.frame.b.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Menu;
import com.yt.app.api.v1.entity.RoleModulbutton;
import com.yt.app.common.base.IBaseService;
import com.yt.app.frame.f.DataSourceEnum;

/**
 * @author zj default
 * 
 * @version 1.1
 */

public interface RoleModulbuttonService extends IBaseService<RoleModulbutton, Long> {

	/**
	 * 获取角色下所有模块功能
	 * 
	 * @param roleId
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Menu> getModulsByRoleId(String roleId);

	/**
	 * 获取角色下所有模块功能
	 * 
	 * @param roleId
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer adds(String role_id, RoleModulbutton[] rmbs);
}