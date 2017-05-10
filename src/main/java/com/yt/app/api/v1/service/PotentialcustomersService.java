package com.yt.app.api.v1.service;

import java.util.List;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Potentialcustomers;
import com.yt.app.common.base.IBaseService;
import com.yt.app.enums.DataSourceEnum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public interface PotentialcustomersService extends IBaseService<Potentialcustomers, Long> {

	/**
	 * 批量修改负责人
	 * 
	 * @param list
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	public Integer updatebatch(List<Long> list, Long id);
}