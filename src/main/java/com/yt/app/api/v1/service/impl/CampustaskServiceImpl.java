package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampustaskMapper;
import com.yt.app.api.v1.service.CampustaskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Campustask;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class CampustaskServiceImpl extends BaseServiceImpl<Campustask, Long> implements CampustaskService{
  @Autowired
  private CampustaskMapper mapper;

}