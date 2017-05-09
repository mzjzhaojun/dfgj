package com.yt.app.api.v1.service;

import java.util.List;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Region;
import com.yt.app.common.base.IBaseService;
import com.yt.app.enums.DataSourceEnum;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-11-04 15:40:04
 */

public interface RegionService extends IBaseService<Region, Long> {
	/**
	 * 获取菜单模块
	 * 
	 * @author huanghao
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Region> getlist();

	/**
	 * 省市县查询
	 * 
	 * @author huanghao
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Region> getlistAll();

	/**
	 * 省市县查询级别分类
	 * 
	 * @author huanghao
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Region> getlistAllStyle();

	/**
	 * 根据parendid查询
	 * 
	 * @author huanghao
	 * @param parendid
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Region> getbyparentid(long parendid);

	/**
	 * 添加
	 * 
	 * @author huanghao
	 * @param param
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer addobject(Region param);

}