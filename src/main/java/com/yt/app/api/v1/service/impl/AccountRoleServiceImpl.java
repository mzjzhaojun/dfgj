package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AccountRoleMapper;
import com.yt.app.api.v1.service.AccountRoleService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.AccountRole;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-27 17:32:56
 */

@Service
public class AccountRoleServiceImpl extends BaseServiceImpl<AccountRole, Long> implements AccountRoleService {
	@Autowired
	private AccountRoleMapper mapper;

}