package com.yt.app.api.v1.service;

import com.yt.app.frame.b.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Orgstaffjobs;
import com.yt.app.common.base.IBaseService;
import com.yt.app.frame.f.DataSourceEnum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public interface OrgstaffjobsService extends IBaseService<Orgstaffjobs, Long> {
	/**
	 * 重写get
	 * 
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	Orgstaffjobs getByStaffId(Long id);
}