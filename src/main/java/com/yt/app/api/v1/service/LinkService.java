package com.yt.app.api.v1.service;

import org.springframework.http.RequestEntity;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Link;
import com.yt.app.common.base.IBaseService;
import com.yt.app.enums.DataSourceEnum;
import com.yt.app.frame.page.IPage;

/**
 * @author ssh
 * 
 * @version v1
 * @createdate 2016-10-14 10:17:35
 */

public interface LinkService extends IBaseService<Link, Long> {

	/**
	 * 链接新增
	 * 
	 * @param requestEntity
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer add(RequestEntity<Link> requestEntity);

	/**
	 * 链接修改
	 * 
	 * @param requestEntity
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer update(RequestEntity<Link> requestEntity);

	/**
	 * 链接删除
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer delete(Long id);

	/**
	 * 链接查看
	 * 
	 * @param id
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	Link get(Long id);

	/**
	 * 链接列表
	 * 
	 * @param requestEntity
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	IPage<Link> getlist(RequestEntity<Object> requestEntity);
}