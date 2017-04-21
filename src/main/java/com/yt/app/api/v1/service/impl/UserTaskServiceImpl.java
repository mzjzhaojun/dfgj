package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.UserTaskMapper;
import com.yt.app.api.v1.service.UserTaskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.UserTask;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:03
*/

@Service
public class UserTaskServiceImpl extends BaseServiceImpl<UserTask, Long> implements UserTaskService{
  @Autowired
  private UserTaskMapper mapper;

}