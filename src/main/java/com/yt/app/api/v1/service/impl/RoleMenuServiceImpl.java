package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.RoleMenuMapper;
import com.yt.app.api.v1.service.RoleMenuService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.RoleMenu;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

@Service
public class RoleMenuServiceImpl extends BaseServiceImpl<RoleMenu, Long> implements RoleMenuService {
	@Autowired
	private RoleMenuMapper mapper;

}