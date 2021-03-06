package com.yt.app.api.v1.service;

import java.util.Map;

import com.yt.app.api.v1.entity.Customerstaffcharges;
import com.yt.app.common.base.IBaseService;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public interface CustomerstaffchargesService extends IBaseService<Customerstaffcharges, Long> {

	/**
	 * 
	 * @param parm
	 * @return
	 */
	Integer sava(Map<String, Object> parm);
}