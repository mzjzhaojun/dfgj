package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AccountchargepaymentsMapper;
import com.yt.app.api.v1.service.AccountchargepaymentsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Accountchargepayments;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:16
*/

@Service
public class AccountchargepaymentsServiceImpl extends BaseServiceImpl<Accountchargepayments, Long> implements AccountchargepaymentsService{
  @Autowired
  private AccountchargepaymentsMapper mapper;

}