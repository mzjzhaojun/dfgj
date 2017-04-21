package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatorWeektaskMapper;
import com.yt.app.api.v1.service.EducatorWeektaskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.EducatorWeektask;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:43
*/

@Service
public class EducatorWeektaskServiceImpl extends BaseServiceImpl<EducatorWeektask, Long> implements EducatorWeektaskService{
  @Autowired
  private EducatorWeektaskMapper mapper;

}