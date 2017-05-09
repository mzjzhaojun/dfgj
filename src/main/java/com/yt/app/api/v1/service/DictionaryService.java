package com.yt.app.api.v1.service;

import java.util.List;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.common.base.IBaseService;
import com.yt.app.enums.DataSourceEnum;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-19 17:03:14
 */

public interface DictionaryService extends IBaseService<Dictionary, Long> {

	/**
	 * 
	 * @param ids
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Dictionary> listtypecodes(long[] ids);
}