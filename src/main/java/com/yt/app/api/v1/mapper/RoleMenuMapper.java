package com.yt.app.api.v1.mapper;

import java.util.List;
import java.util.Map;
import com.yt.app.api.v1.entity.RoleMenu;
import com.yt.app.annotation.RedisCacheAnnotation;
import com.yt.app.annotation.RedisCacheEvictAnnotation;
import com.yt.app.common.base.IBaseMapper;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

public interface RoleMenuMapper extends IBaseMapper<RoleMenu> {
	/**
	 * 保存（持久化）对象
	 * 
	 * @param o
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	@RedisCacheEvictAnnotation(classs = { RoleMenu.class })
	public Integer post(Object t);

	/**
	 * 更新（持久化）对象
	 * 
	 * @param o
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	@RedisCacheEvictAnnotation(classs = { RoleMenu.class })
	public Integer put(Object t);

	/**
	 * 获取指定的唯一标识符对应的持久化对象
	 *
	 * @param id
	 *            指定的唯一标识符
	 * @return 指定的唯一标识符对应的持久化对象，如果没有对应的持久化对象，则返回null。
	 */
	@RedisCacheAnnotation(classs = RoleMenu.class)
	public RoleMenu get(Long id);

	/**
	 * 删除指定的唯一标识符数组对应的持久化对象
	 *
	 * @param ids
	 *            指定的唯一标识符数组
	 * @return 删除的对象数量
	 */
	@RedisCacheEvictAnnotation(classs = { RoleMenu.class })
	public Integer delete(Long id);

	/**
	 * 删除指定的唯一标识符数组对应的持久化对象
	 *
	 * @param ids
	 *            指定的唯一标识符数组
	 * @return 删除的对象数量
	 */
	@RedisCacheEvictAnnotation(classs = { RoleMenu.class })
	public Integer deletebyroleid(Long id);

	/**
	 * 获取满足查询参数条件的数据总数
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据总数
	 */
	@RedisCacheAnnotation(classs = RoleMenu.class)
	public Integer countlist(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据总数
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据总数
	 */
	@RedisCacheAnnotation(classs = RoleMenu.class)
	public Integer countmap(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = RoleMenu.class)
	public List<RoleMenu> list(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = RoleMenu.class)
	public List<Map<String, Object>> map(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param id
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = RoleMenu.class)
	public List<RoleMenu> getByIds(long[] id);

	/**
	 * 删除指定的唯一标识符数组对应的持久化对象
	 *
	 * @param t
	 *            指定的唯一标识符数组
	 * @return 删除的对象数量
	 */
	@RedisCacheEvictAnnotation(classs = { RoleMenu.class })
	public Integer deleteObject(Object t);

	/**
	 * 批量插入数据
	 * 
	 * @param list
	 * @return
	 */
	@RedisCacheEvictAnnotation(classs = { RoleMenu.class })
	public int insertRoleMenu(List<RoleMenu> list);

	/**
	 * 通过roleid查询所有数据
	 * 
	 * @param id
	 * @return
	 */
	@RedisCacheEvictAnnotation(classs = { RoleMenu.class })
	public List<RoleMenu> getroleid(long id);

	/**
	 * 获取满足查询参数条件的数据总数
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据总数
	 */
	@RedisCacheAnnotation(classs = RoleMenu.class)
	public Integer countObject(RoleMenu param);
}