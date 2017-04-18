package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomertransferassetsMapper;
import com.yt.app.api.v1.service.CustomertransferassetsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customertransferassets;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

@Service
public class CustomertransferassetsServiceImpl extends BaseServiceImpl<Customertransferassets, Long> implements CustomertransferassetsService{
  @Autowired
  private CustomertransferassetsMapper mapper;

}