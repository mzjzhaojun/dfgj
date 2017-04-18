package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatorDay_taskMapper;
import com.yt.app.api.v1.service.EducatorDay_taskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.EducatorDay_task;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

@Service
public class EducatorDay_taskServiceImpl extends BaseServiceImpl<EducatorDay_task, Long> implements EducatorDay_taskService{
  @Autowired
  private EducatorDay_taskMapper mapper;

}