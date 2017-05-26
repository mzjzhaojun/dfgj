package com.yt.app.api.v1.service;

import java.util.List;

import com.yt.app.api.v1.entity.Orderitems;
import com.yt.app.common.base.IBaseService;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public interface OrderitemsService extends IBaseService<Orderitems, Long> {
	/**
	 * 批量插入
	 * 
	 * @param list
	 * @return
	 */
	Integer sava(List<Orderitems> list);
}