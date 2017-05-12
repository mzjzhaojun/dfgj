package com.yt.app.api.v1.mapper;

import java.util.List;
import java.util.Map;

import com.yt.app.annotation.RedisCacheAnnotation;
import com.yt.app.annotation.RedisCacheEvictAnnotation;
import com.yt.app.api.v1.entity.Button;
import com.yt.app.api.v1.entity.RoleModulbutton;
import com.yt.app.common.base.IBaseMapper;

/**
 * @author zj default
 * 
 * @version 1.1
 */

public interface RoleModulbuttonMapper extends IBaseMapper<RoleModulbutton> {
	/**
	 * 保存（持久化）对象
	 * 
	 * @param o
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	@RedisCacheEvictAnnotation(classs = { RoleModulbutton.class })
	public Integer post(Object t);

	/**
	 * 更新（持久化）对象
	 * 
	 * @param o
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	@RedisCacheEvictAnnotation(classs = { RoleModulbutton.class })
	public Integer put(Object t);

	/**
	 * 获取指定的唯一标识符对应的持久化对象
	 *
	 * @param id
	 *            指定的唯一标识符
	 * @return 指定的唯一标识符对应的持久化对象，如果没有对应的持久化对象，则返回null。
	 */
	@RedisCacheAnnotation(classs = RoleModulbutton.class)
	public RoleModulbutton get(Long id);

	/**
	 * 删除指定的唯一标识符数组对应的持久化对象
	 *
	 * @param ids
	 *            指定的唯一标识符数组
	 * @return 删除的对象数量
	 */
	@RedisCacheEvictAnnotation(classs = { RoleModulbutton.class })
	public Integer delete(Long id);

	/**
	 * 获取满足查询参数条件的数据总数
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据总数
	 */
	@RedisCacheAnnotation(classs = RoleModulbutton.class)
	public Integer countlist(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据总数
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据总数
	 */
	@RedisCacheAnnotation(classs = RoleModulbutton.class)
	public Integer countmap(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = RoleModulbutton.class)
	public List<RoleModulbutton> list(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = RoleModulbutton.class)
	public List<Map<String, Object>> map(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param id
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = RoleModulbutton.class)
	public List<RoleModulbutton> listByArrayId(long[] id);

	/**
	 * 查询模块按照主键分组
	 * 
	 * @param param
	 * @return
	 */
	@RedisCacheAnnotation(classs = RoleModulbutton.class)
	List<RoleModulbutton> getModulGroupBy(Map<String, Object> param);

	/**
	 * 根据模块查询按钮权限
	 * 
	 * @param param
	 * @return
	 */
	@RedisCacheAnnotation(classs = RoleModulbutton.class)
	List<RoleModulbutton> getButtonByModul(Map<String, Object> param);

	/**
	 * 获得模块下所有按钮
	 * 
	 * @param param
	 * @return
	 */
	@RedisCacheAnnotation(classs = RoleModulbutton.class)
	List<Button> getButtons(Map<String, Object> param);

	/**
	 * 根据角色id模块id按钮id查询
	 * 
	 * @param param
	 * @return
	 */
	@RedisCacheAnnotation(classs = RoleModulbutton.class)
	RoleModulbutton getByRidMidBid(RoleModulbutton param);

	/**
	 * 根据角色id删除
	 * 
	 * @param id
	 * @return
	 */
	@RedisCacheEvictAnnotation(classs = RoleModulbutton.class)
	Integer deleteByRoleId(String id);
}