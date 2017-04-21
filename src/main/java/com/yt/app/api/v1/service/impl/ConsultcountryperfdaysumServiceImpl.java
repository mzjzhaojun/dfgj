package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultcountryperfdaysumMapper;
import com.yt.app.api.v1.service.ConsultcountryperfdaysumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultcountryperfdaysum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:26
*/

@Service
public class ConsultcountryperfdaysumServiceImpl extends BaseServiceImpl<Consultcountryperfdaysum, Long> implements ConsultcountryperfdaysumService{
  @Autowired
  private ConsultcountryperfdaysumMapper mapper;

}