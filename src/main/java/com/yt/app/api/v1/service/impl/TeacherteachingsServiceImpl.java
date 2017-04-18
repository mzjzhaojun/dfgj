package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeacherteachingsMapper;
import com.yt.app.api.v1.service.TeacherteachingsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teacherteachings;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

@Service
public class TeacherteachingsServiceImpl extends BaseServiceImpl<Teacherteachings, Long> implements TeacherteachingsService{
  @Autowired
  private TeacherteachingsMapper mapper;

}