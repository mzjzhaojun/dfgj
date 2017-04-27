package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.OrgregionsMapper;
import com.yt.app.api.v1.service.OrgregionsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Orgregions;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:49
 */

@Service
public class OrgregionsServiceImpl extends BaseServiceImpl<Orgregions, Long> implements OrgregionsService {
	@Autowired
	private OrgregionsMapper mapper;

}