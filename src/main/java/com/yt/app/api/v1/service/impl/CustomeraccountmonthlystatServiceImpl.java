package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomeraccountmonthlystatMapper;
import com.yt.app.api.v1.service.CustomeraccountmonthlystatService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customeraccountmonthlystat;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:28
*/

@Service
public class CustomeraccountmonthlystatServiceImpl extends BaseServiceImpl<Customeraccountmonthlystat, Long> implements CustomeraccountmonthlystatService{
  @Autowired
  private CustomeraccountmonthlystatMapper mapper;

}