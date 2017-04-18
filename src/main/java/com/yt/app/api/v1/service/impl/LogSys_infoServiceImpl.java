package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.LogSys_infoMapper;
import com.yt.app.api.v1.service.LogSys_infoService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.LogSys_info;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class LogSys_infoServiceImpl extends BaseServiceImpl<LogSys_info, Long> implements LogSys_infoService{
  @Autowired
  private LogSys_infoMapper mapper;

}