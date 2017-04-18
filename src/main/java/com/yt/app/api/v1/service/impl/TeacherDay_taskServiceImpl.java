package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeacherDay_taskMapper;
import com.yt.app.api.v1.service.TeacherDay_taskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.TeacherDay_task;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

@Service
public class TeacherDay_taskServiceImpl extends BaseServiceImpl<TeacherDay_task, Long> implements TeacherDay_taskService{
  @Autowired
  private TeacherDay_taskMapper mapper;

}