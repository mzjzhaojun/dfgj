package com.yt.app.api.v1.service;

import com.yt.app.api.v1.entity.Presents;
import com.yt.app.common.base.IBaseService;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */

public interface PresentsService extends IBaseService<Presents, Long> {

	/**
	 * 重写新增
	 * 
	 * @param t
	 * @return
	 */
	Long sava(Presents t);
}