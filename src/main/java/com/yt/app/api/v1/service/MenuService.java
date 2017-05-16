package com.yt.app.api.v1.service;

import java.util.List;
import java.util.Map;

import com.yt.app.frame.b.DataSourceAnnotation;
import com.yt.app.api.v1.entity.Link;
import com.yt.app.api.v1.entity.Menu;
import com.yt.app.common.base.IBaseService;
import com.yt.app.frame.f.DataSourceEnum;
import com.yt.app.frame.m.IPage;

/**
 * @author zgp default
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public interface MenuService extends IBaseService<Menu, Long> {

	/**
	 * 获取菜单模块
	 * 
	 * @author huanghao
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Menu> getlist();

	/**
	 * 菜单添加功能（包括关联表操作）
	 * 
	 * @param menu
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer add(Menu menu);

	/**
	 * 菜单的修改（修改中可能包括关联表的修改，需单独操作）
	 * 
	 * @param menu
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer update(Menu menu);

	/**
	 * 根据id删除菜单和菜单关联链接
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer delete(Long id);

	/**
	 * 查询所有链接（和菜单下已竟选中的）
	 * 
	 * @param param
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	List<Link> listLinks(Map<String, Object> param);

	/**
	 * 加载系统及对应子系统和菜单
	 * 
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	Map<String, Object> sysmenu(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的list数据，如果存在分页参数则返回分页数据 （关联查询其他信息）
	 * 
	 * @param requestEntity
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	public IPage<Menu> list(Map<String, Object> param);

	/**
	 * 便捷修改菜单顺序
	 * 
	 * @param menu
	 * @return
	 */
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	Integer updatesortno(Map<String, Object> param);
}