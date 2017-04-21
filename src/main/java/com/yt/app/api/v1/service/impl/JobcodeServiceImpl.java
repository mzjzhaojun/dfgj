package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.JobcodeMapper;
import com.yt.app.api.v1.service.JobcodeService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Jobcode;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:16
*/

@Service
public class JobcodeServiceImpl extends BaseServiceImpl<Jobcode, Long> implements JobcodeService{
  @Autowired
  private JobcodeMapper mapper;

}