package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerrefundsMapper;
import com.yt.app.api.v1.service.CustomerrefundsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerrefunds;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:32
*/

@Service
public class CustomerrefundsServiceImpl extends BaseServiceImpl<Customerrefunds, Long> implements CustomerrefundsService{
  @Autowired
  private CustomerrefundsMapper mapper;

}