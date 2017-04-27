package com.yt.app.api.v1.service;

import java.util.List;

import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.common.base.IBaseService;

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
	List<Dictionary> listtypecodes(long[] ids);
}