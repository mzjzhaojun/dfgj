package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AccountchargeinvoicesMapper;
import com.yt.app.api.v1.service.AccountchargeinvoicesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Accountchargeinvoices;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class AccountchargeinvoicesServiceImpl extends BaseServiceImpl<Accountchargeinvoices, Long> implements AccountchargeinvoicesService{
  @Autowired
  private AccountchargeinvoicesMapper mapper;

}