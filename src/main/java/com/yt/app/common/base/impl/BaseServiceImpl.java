package com.yt.app.common.base.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.common.base.IBaseService;
import com.yt.app.util.RequestUtil;
import com.yt.app.common.base.IBaseMapper;
import com.yt.app.enums.DataSourceEnum;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;

/**
 * 
 * 实现类
 * 
 * @author zj
 * 
 */
@Service
public abstract class BaseServiceImpl<T, ID extends Serializable> implements IBaseService<T, ID> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IBaseMapper<T> mapper;

	@Override
	@Transactional
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	public Integer post(T t) {
		return mapper.post(t);
	}

	@Override
	@Transactional
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	public Integer put(T t) {
		return mapper.put(t);
	}

	@Override
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	public T get(Long id) {
		return mapper.get(id);
	}

	@Override
	@Transactional
	@DataSourceAnnotation(datasource = DataSourceEnum.MASTER)
	public Integer delete(Long id) {
		return mapper.delete(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	public IPage<T> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		return new PageBean<T>(param, mapper.list(param), count);
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	public IPage<T> list(Map<String, Object> param) {
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		return new PageBean<T>(param, mapper.list(param), count);
	}

	@Override
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	public List<T> list() {
		Map<String, Object> param = new HashMap<String, Object>();
		return mapper.list(param);
	}

	@SuppressWarnings("unchecked")
	@Override
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	public IPage<List<Map<String, Object>>> map(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countmap(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		return new PageBean<List<Map<String, Object>>>(param, count, mapper.map(param));
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	public IPage<List<Map<String, Object>>> map(Map<String, Object> param) {
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countmap(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		return new PageBean<List<Map<String, Object>>>(param, count, mapper.map(param));
	}

	@Override
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	public List<Map<String, Object>> map() {
		Map<String, Object> param = new HashMap<String, Object>();
		return mapper.map(param);
	}

	@Override
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	public List<T> listByArrayId(long[] id) {
		return mapper.listByArrayId(id);
	}

}
