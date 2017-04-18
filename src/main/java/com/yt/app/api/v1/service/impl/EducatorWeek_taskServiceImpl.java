package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatorWeek_taskMapper;
import com.yt.app.api.v1.service.EducatorWeek_taskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.EducatorWeek_task;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

@Service
public class EducatorWeek_taskServiceImpl extends BaseServiceImpl<EducatorWeek_task, Long> implements EducatorWeek_taskService{
  @Autowired
  private EducatorWeek_taskMapper mapper;

}