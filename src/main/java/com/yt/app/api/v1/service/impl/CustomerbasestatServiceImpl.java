package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerbasestatMapper;
import com.yt.app.api.v1.service.CustomerbasestatService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerbasestat;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:29
*/

@Service
public class CustomerbasestatServiceImpl extends BaseServiceImpl<Customerbasestat, Long> implements CustomerbasestatService{
  @Autowired
  private CustomerbasestatMapper mapper;

}