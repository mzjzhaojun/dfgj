package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampusDay_taskMapper;
import com.yt.app.api.v1.service.CampusDay_taskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.CampusDay_task;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class CampusDay_taskServiceImpl extends BaseServiceImpl<CampusDay_task, Long> implements CampusDay_taskService{
  @Autowired
  private CampusDay_taskMapper mapper;

}