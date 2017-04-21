package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeacherrefundallotsMapper;
import com.yt.app.api.v1.service.TeacherrefundallotsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teacherrefundallots;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:00
*/

@Service
public class TeacherrefundallotsServiceImpl extends BaseServiceImpl<Teacherrefundallots, Long> implements TeacherrefundallotsService{
  @Autowired
  private TeacherrefundallotsMapper mapper;

}