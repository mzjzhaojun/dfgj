package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AccountchargeallotsMapper;
import com.yt.app.api.v1.service.AccountchargeallotsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Accountchargeallots;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:43:59
*/

@Service
public class AccountchargeallotsServiceImpl extends BaseServiceImpl<Accountchargeallots, Long> implements AccountchargeallotsService{
  @Autowired
  private AccountchargeallotsMapper mapper;

}