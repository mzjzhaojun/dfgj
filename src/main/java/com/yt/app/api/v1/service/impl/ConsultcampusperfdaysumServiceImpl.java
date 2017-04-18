package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultcampusperfdaysumMapper;
import com.yt.app.api.v1.service.ConsultcampusperfdaysumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultcampusperfdaysum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class ConsultcampusperfdaysumServiceImpl extends BaseServiceImpl<Consultcampusperfdaysum, Long> implements ConsultcampusperfdaysumService{
  @Autowired
  private ConsultcampusperfdaysumMapper mapper;

}