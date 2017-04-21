package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerrelationsMapper;
import com.yt.app.api.v1.service.CustomerrelationsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerrelations;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:32
*/

@Service
public class CustomerrelationsServiceImpl extends BaseServiceImpl<Customerrelations, Long> implements CustomerrelationsService{
  @Autowired
  private CustomerrelationsMapper mapper;

}