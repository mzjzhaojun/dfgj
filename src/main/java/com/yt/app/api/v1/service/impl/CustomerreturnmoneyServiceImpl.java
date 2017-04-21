package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerreturnmoneyMapper;
import com.yt.app.api.v1.service.CustomerreturnmoneyService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerreturnmoney;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:33
*/

@Service
public class CustomerreturnmoneyServiceImpl extends BaseServiceImpl<Customerreturnmoney, Long> implements CustomerreturnmoneyService{
  @Autowired
  private CustomerreturnmoneyMapper mapper;

}