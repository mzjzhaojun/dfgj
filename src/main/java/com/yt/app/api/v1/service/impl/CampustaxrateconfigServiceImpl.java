package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampustaxrateconfigMapper;
import com.yt.app.api.v1.service.CampustaxrateconfigService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Campustaxrateconfig;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:23
*/

@Service
public class CampustaxrateconfigServiceImpl extends BaseServiceImpl<Campustaxrateconfig, Long> implements CampustaxrateconfigService{
  @Autowired
  private CampustaxrateconfigMapper mapper;

}