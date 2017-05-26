package com.yt.app.api.v1.service;

import com.yt.app.api.v1.entity.Orders;
import com.yt.app.common.base.IBaseService;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */

public interface OrdersService extends IBaseService<Orders, Long> {

	/**
	 * 
	 * @param t
	 * @return
	 */
	Long sava(Orders t);
}