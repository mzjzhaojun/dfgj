package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.JobsMapper;
import com.yt.app.api.v1.service.JobsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Jobs;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class JobsServiceImpl extends BaseServiceImpl<Jobs, Long> implements JobsService{
  @Autowired
  private JobsMapper mapper;

}