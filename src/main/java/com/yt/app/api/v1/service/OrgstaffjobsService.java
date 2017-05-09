package com.yt.app.api.v1.service;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Orgstaffjobs;
import com.yt.app.common.base.IBaseService;
import com.yt.app.enums.DataSourceEnum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public interface OrgstaffjobsService extends IBaseService<Orgstaffjobs, Long> {
	/**
	 * 重写get
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	Orgstaffjobs getByStaffId(Long id);
}