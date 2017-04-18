package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerparentrelationsMapper;
import com.yt.app.api.v1.service.CustomerparentrelationsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerparentrelations;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

@Service
public class CustomerparentrelationsServiceImpl extends BaseServiceImpl<Customerparentrelations, Long> implements CustomerparentrelationsService{
  @Autowired
  private CustomerparentrelationsMapper mapper;

}