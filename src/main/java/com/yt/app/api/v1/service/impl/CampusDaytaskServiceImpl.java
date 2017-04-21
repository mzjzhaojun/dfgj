package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampusDaytaskMapper;
import com.yt.app.api.v1.service.CampusDaytaskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.CampusDaytask;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:19
*/

@Service
public class CampusDaytaskServiceImpl extends BaseServiceImpl<CampusDaytask, Long> implements CampusDaytaskService{
  @Autowired
  private CampusDaytaskMapper mapper;

}