package com.yt.app.api.v1.service;

import com.yt.app.api.v1.entity.Customer;
import com.yt.app.common.base.IBaseService;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

public interface CustomerService extends IBaseService<Customer, Long> {
	/**
	 * 
	 * @param t
	 * @return
	 */
	Customer sava(Customer t);
}