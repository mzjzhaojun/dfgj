package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerexpenserelationsMapper;
import com.yt.app.api.v1.service.CustomerexpenserelationsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerexpenserelations;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:30
*/

@Service
public class CustomerexpenserelationsServiceImpl extends BaseServiceImpl<Customerexpenserelations, Long> implements CustomerexpenserelationsService{
  @Autowired
  private CustomerexpenserelationsMapper mapper;

}