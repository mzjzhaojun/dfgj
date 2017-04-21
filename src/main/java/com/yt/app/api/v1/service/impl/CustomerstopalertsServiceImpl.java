package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerstopalertsMapper;
import com.yt.app.api.v1.service.CustomerstopalertsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerstopalerts;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:35
*/

@Service
public class CustomerstopalertsServiceImpl extends BaseServiceImpl<Customerstopalerts, Long> implements CustomerstopalertsService{
  @Autowired
  private CustomerstopalertsMapper mapper;

}