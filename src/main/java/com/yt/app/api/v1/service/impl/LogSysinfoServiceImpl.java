package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.LogSysinfoMapper;
import com.yt.app.api.v1.service.LogSysinfoService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.LogSysinfo;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:47
*/

@Service
public class LogSysinfoServiceImpl extends BaseServiceImpl<LogSysinfo, Long> implements LogSysinfoService{
  @Autowired
  private LogSysinfoMapper mapper;

}