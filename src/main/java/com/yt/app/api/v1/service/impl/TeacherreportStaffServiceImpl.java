package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeacherreportStaffMapper;
import com.yt.app.api.v1.service.TeacherreportStaffService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.TeacherreportStaff;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:01
*/

@Service
public class TeacherreportStaffServiceImpl extends BaseServiceImpl<TeacherreportStaff, Long> implements TeacherreportStaffService{
  @Autowired
  private TeacherreportStaffMapper mapper;

}