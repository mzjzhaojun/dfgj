package com.yt.app.api.v1.service;

import java.util.List;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Menu;
import com.yt.app.api.v1.entity.RoleModulbutton;
import com.yt.app.common.base.IBaseService;
import com.yt.app.enums.DataSourceEnum;

/**
 * @author zj default
 * 
 * @version 1.1
 */

public interface RoleModulbuttonService extends IBaseService<RoleModulbutton, Long > {

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