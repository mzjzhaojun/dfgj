package com.yt.app.api.v1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.service.DictionaryService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Dictionary;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-19 17:03:14
 */

@Service
public class DictionaryServiceImpl extends BaseServiceImpl<Dictionary, Long> implements DictionaryService {
	@Autowired
	private DictionaryMapper mapper;

	@Override
	public List<Dictionary> listtypecodes(long[] ids) {
		return mapper.listByArrayTypeCode(ids);
	}

}