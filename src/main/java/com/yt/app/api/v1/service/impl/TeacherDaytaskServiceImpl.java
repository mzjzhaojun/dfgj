package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeacherDaytaskMapper;
import com.yt.app.api.v1.service.TeacherDaytaskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.TeacherDaytask;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:00
*/

@Service
public class TeacherDaytaskServiceImpl extends BaseServiceImpl<TeacherDaytask, Long> implements TeacherDaytaskService{
  @Autowired
  private TeacherDaytaskMapper mapper;

}