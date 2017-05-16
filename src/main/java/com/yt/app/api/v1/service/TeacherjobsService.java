package com.yt.app.api.v1.service;

import com.yt.app.frame.b.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Teacherjobs;
import com.yt.app.common.base.IBaseService;
import com.yt.app.frame.f.DataSourceEnum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:22
 */

public interface TeacherjobsService extends IBaseService<Teacherjobs, Long> {

	/**
	 * 
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	Teacherjobs getByTeacherId(Long id);
}