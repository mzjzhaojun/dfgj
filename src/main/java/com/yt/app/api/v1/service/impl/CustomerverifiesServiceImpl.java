package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerverifiesMapper;
import com.yt.app.api.v1.service.CustomerverifiesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerverifies;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:38
*/

@Service
public class CustomerverifiesServiceImpl extends BaseServiceImpl<Customerverifies, Long> implements CustomerverifiesService{
  @Autowired
  private CustomerverifiesMapper mapper;

}