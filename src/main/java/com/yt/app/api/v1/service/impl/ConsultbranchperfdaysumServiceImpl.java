package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultbranchperfdaysumMapper;
import com.yt.app.api.v1.service.ConsultbranchperfdaysumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultbranchperfdaysum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:25
*/

@Service
public class ConsultbranchperfdaysumServiceImpl extends BaseServiceImpl<Consultbranchperfdaysum, Long> implements ConsultbranchperfdaysumService{
  @Autowired
  private ConsultbranchperfdaysumMapper mapper;

}