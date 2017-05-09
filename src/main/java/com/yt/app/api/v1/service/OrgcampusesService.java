package com.yt.app.api.v1.service;

import java.util.Map;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Orgcampuses;
import com.yt.app.common.base.IBaseService;
import com.yt.app.enums.DataSourceEnum;
import com.yt.app.frame.page.IPage;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:49
 */

public interface OrgcampusesService extends IBaseService<Orgcampuses, Long> {
	/**
	 * 重写get
	 * 
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	Orgcampuses getById(Long id);

	/**
	 * 重写list
	 * 
	 * @param param
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	IPage<Orgcampuses> listpage(Map<String, Object> param);
}