package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampusMonth_taskMapper;
import com.yt.app.api.v1.service.CampusMonth_taskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.CampusMonth_task;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class CampusMonth_taskServiceImpl extends BaseServiceImpl<CampusMonth_task, Long> implements CampusMonth_taskService{
  @Autowired
  private CampusMonth_taskMapper mapper;

}