package com.yt.app.api.v1.service;

import com.yt.app.api.v1.entity.Customerfollows;
import com.yt.app.common.base.IBaseService;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public interface CustomerfollowsService extends IBaseService<Customerfollows, Long> {
	/**
	 * 正是学员跟进信息保存
	 * 
	 * @param t
	 * @return
	 */
	Integer sava(Customerfollows t);
}