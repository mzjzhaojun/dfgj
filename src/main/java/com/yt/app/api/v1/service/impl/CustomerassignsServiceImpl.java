package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerassignsMapper;
import com.yt.app.api.v1.service.CustomerassignsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerassigns;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:29
*/

@Service
public class CustomerassignsServiceImpl extends BaseServiceImpl<Customerassigns, Long> implements CustomerassignsService{
  @Autowired
  private CustomerassignsMapper mapper;

}