package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.UserOperation_logMapper;
import com.yt.app.api.v1.service.UserOperation_logService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.UserOperation_log;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

@Service
public class UserOperation_logServiceImpl extends BaseServiceImpl<UserOperation_log, Long> implements UserOperation_logService{
  @Autowired
  private UserOperation_logMapper mapper;

}