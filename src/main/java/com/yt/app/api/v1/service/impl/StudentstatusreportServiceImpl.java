package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.StudentstatusreportMapper;
import com.yt.app.api.v1.service.StudentstatusreportService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Studentstatusreport;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:58
*/

@Service
public class StudentstatusreportServiceImpl extends BaseServiceImpl<Studentstatusreport, Long> implements StudentstatusreportService{
  @Autowired
  private StudentstatusreportMapper mapper;

}