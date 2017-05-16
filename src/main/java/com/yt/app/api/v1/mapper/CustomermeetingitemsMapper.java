package com.yt.app.api.v1.mapper;

import java.util.List;
import java.util.Map;
import com.yt.app.api.v1.entity.Customermeetingitems;
import com.yt.app.frame.b.RedisCacheAnnotation;
import com.yt.app.frame.b.RedisCacheEvictAnnotation;
import com.yt.app.common.base.IBaseMapper;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

public interface CustomermeetingitemsMapper extends IBaseMapper<Customermeetingitems> {
	/**
	 * 保存（持久化）对象
	 * 
	 * @param o
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	@RedisCacheEvictAnnotation(classs = { Customermeetingitems.class })
	public Integer post(Object t);

	/**
	 * 更新（持久化）对象
	 * 
	 * @param o
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	@RedisCacheEvictAnnotation(classs = { Customermeetingitems.class })
	public Integer put(Object t);

	/**
	 * 获取指定的唯一标识符对应的持久化对象
	 *
	 * @param id
	 *            指定的唯一标识符
	 * @return 指定的唯一标识符对应的持久化对象，如果没有对应的持久化对象，则返回null。
	 */
	@RedisCacheAnnotation(classs = Customermeetingitems.class)
	public Customermeetingitems get(Long id);

	/**
	 * 删除指定的唯一标识符数组对应的持久化对象
	 *
	 * @param ids
	 *            指定的唯一标识符数组
	 * @return 删除的对象数量
	 */
	@RedisCacheEvictAnnotation(classs = { Customermeetingitems.class })
	public Integer delete(Long id);

	/**
	 * 获取满足查询参数条件的数据总数
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据总数
	 */
	@RedisCacheAnnotation(classs = Customermeetingitems.class)
	public Integer countlist(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据总数
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据总数
	 */
	@RedisCacheAnnotation(classs = Customermeetingitems.class)
	public Integer countmap(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = Customermeetingitems.class)
	public List<Customermeetingitems> list(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param param
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = Customermeetingitems.class)
	public List<Map<String, Object>> map(Map<String, Object> param);

	/**
	 * 获取满足查询参数条件的数据
	 * 
	 * @param id
	 *            查询参数
	 * @return 数据
	 */
	@RedisCacheAnnotation(classs = Customermeetingitems.class)
	public List<Customermeetingitems> listByArrayId(long[] id);
}