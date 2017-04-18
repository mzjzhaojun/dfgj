package com.yt.app.common.base;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.http.ResponseEntity;

/**
 * 
 * BaseController
 * 
 * @author zj
 * 
 */
public interface IBaseController<T, ID extends Serializable> {
	/**
	 * 保存（持久化）对象
	 * 
	 * @param o
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	public ResponseEntity<Object> post(RequestEntity<T> requestEntity, HttpServletRequest request, HttpServletResponse response);

	/**
	 * 更新（持久化）对象
	 * 
	 * @param o
	 *            要持久化的对象
	 * @return 执行成功的记录个数
	 */
	public ResponseEntity<Object> put(@PathVariable Long id, RequestEntity<T> requestEntity, HttpServletRequest request, HttpServletResponse response);

	/**
	 * 获取指定的唯一标识符对应的持久化对象
	 * 
	 * @param id
	 *            指定的唯一标识符
	 * @return 指定的唯一标识符对应的持久化对象，如果没有对应的持久化对象，则返回null。
	 */
	public ResponseEntity<Object> get(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response);

	/**
	 * 删除指定的唯一标识符数组对应的持久化对象
	 * 
	 * @param ids
	 *            指定的唯一标识符数组
	 * @return 删除的对象数量
	 */
	public ResponseEntity<Object> delete(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response);

	/**
	 * 全部数据或有分页参数返回分页数据
	 * 
	 * @return 查询结果列表
	 */
	public ResponseEntity<Object> list(RequestEntity<Object> requestEntity, HttpServletRequest request, HttpServletResponse response);

}
