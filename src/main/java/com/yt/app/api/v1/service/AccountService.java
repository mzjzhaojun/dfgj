package com.yt.app.api.v1.service;

import java.util.List;
import java.util.Map;

import com.yt.app.frame.b.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Account;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.common.base.IBaseService;
import com.yt.app.frame.f.DataSourceEnum;
import com.yt.app.frame.m.IPage;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-27 17:32:56
 */

public interface AccountService extends IBaseService<Account, Long> {

	/**
	 * 新增
	 * 
	 * @author huanghao
	 * @param param
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer addobject(Account param);

	/**
	 * 删除
	 * 
	 * @author huanghao
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer deletebyid(long id);

	/**
	 * 查询
	 * 
	 * @author huanghao
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	Account getById(long id);

	/**
	 * 更新
	 * 
	 * @author huanghao
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer updatebyid(Account id);

	/**
	 * 查询字典中账户类型数据
	 * 
	 * @author huanghao
	 * @param param
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Dictionary> getlistaccount();

	/**
	 * 列表分页
	 * 
	 * @author huanghao
	 * @param param
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	IPage<Account> getlist(Map<String, Object> param);

	/**
	 * 根据名称查询
	 * 
	 * @param account
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	public Account getAccountByName(String account);
}