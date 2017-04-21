package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatorDaytaskMapper;
import com.yt.app.api.v1.service.EducatorDaytaskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.EducatorDaytask;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:43
*/

@Service
public class EducatorDaytaskServiceImpl extends BaseServiceImpl<EducatorDaytask, Long> implements EducatorDaytaskService{
  @Autowired
  private EducatorDaytaskMapper mapper;

}