package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AccountreturnappliesMapper;
import com.yt.app.api.v1.service.AccountreturnappliesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Accountreturnapplies;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:18
*/

@Service
public class AccountreturnappliesServiceImpl extends BaseServiceImpl<Accountreturnapplies, Long> implements AccountreturnappliesService{
  @Autowired
  private AccountreturnappliesMapper mapper;

}