package com.yt.app.api.v1.service;

import java.util.List;
import java.util.Map;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Sys;
import com.yt.app.common.base.IBaseService;
import com.yt.app.enums.DataSourceEnum;
import com.yt.app.frame.page.IPage;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public interface SysService extends IBaseService<Sys, Long> {

	/**
	 * 获取等级
	 * 
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Sys> listSys();

	/**
	 * 查询父类数据
	 * 
	 * @author huanghao
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Sys> listSyslevel();

	/**
	 * 保存（持久化）对象
	 * 
	 * @param t
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	public Integer addSys(Sys t);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	Map<String, Object> getid(long id);

	/**
	 * 列表分页
	 * 
	 * @author huanghao
	 * @param param
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	IPage<Sys> getlist(Map<String, Object> param);

	/**
	 * 查询字典等级
	 * 
	 * @author huanghao
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Dictionary> syslevel();
}