package com.yt.app.api.v1.mapper;

import java.util.List;
import java.util.Map;

import com.yt.app.api.v1.entity.Menu;
import com.yt.app.frame.b.RedisCacheAnnotation;
import com.yt.app.frame.b.RedisCacheEvictAnnotation;
import com.yt.app.common.base.IBaseMapper;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public interface MenuMapper extends IBaseMapper<Menu> {
	/**
	 * 保存（持久化）对象
	 * 
	 * @param o
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	@RedisCacheEvictAnnotation(classs = { Menu.class })
	public Integer post(Object t);

	/**
	 * 更新（持久化）对象
	 * 
	 * @param o
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	@RedisCacheEvictAnnotation(classs = { Menu.class })
	public Integer put(Object t);

	/**
	 * 获取指定的唯一标识符对应的持久化对象
	 *
	 * @param id
	 *            指定的唯一标识符
	 * @return 指定的唯一标识符对应的持久化对象，如果没有对应的持久化对象，则返回null。
	 */
	@RedisCacheAnnotation(classs = Menu.class)
	public Menu get(Long id);

	/**
	 * 删除指定的唯一标识符数组对应的持久化对象
	 *
	 * @param ids
	 *            指定的唯一标识符数组
	 * @return 删除的对象数量
	 */
	@RedisCacheEvictAnnotation(classs = { Menu.class })
	public Integer delete(Long id);

	/**
	 * 获取满足查询参数条件的数据总数
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据总数
	 */
	@RedisCacheAnnotation(classs = Menu.class)
	public Integer countlist(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据总数
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据总数
	 */
	@RedisCacheAnnotation(classs = Menu.class)
	public Integer countmap(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = Menu.class)
	public List<Menu> list(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = Menu.class)
	public List<Map<String, Object>> map(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param id
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = Menu.class)
	public List<Menu> listByArrayId(long[] id);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * 查询模块菜单
	 * 
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = Menu.class)
	public List<Menu> getlist();

	/**
	 * 查询一级菜单的父级树
	 * 
	 * @author huanghao
	 * @return
	 */
	@RedisCacheAnnotation(classs = Menu.class)
	public List<Menu> getlistlevel();

	/**
	 * 用于生成系统树的菜单便捷查询 zgp
	 * 
	 * @return
	 */
	@RedisCacheAnnotation(classs = Menu.class)
	public List<Menu> sysmenu(Map<String, Object> param);

	/**
	 * 便捷修改菜单顺序
	 * 
	 * @param param
	 * @return
	 */
	@RedisCacheEvictAnnotation(classs = { Menu.class })
	Integer updatestorn(Map<String, Object> param);
}