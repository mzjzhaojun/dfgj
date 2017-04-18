package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultbranchcrmdaysumMapper;
import com.yt.app.api.v1.service.ConsultbranchcrmdaysumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultbranchcrmdaysum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class ConsultbranchcrmdaysumServiceImpl extends BaseServiceImpl<Consultbranchcrmdaysum, Long> implements ConsultbranchcrmdaysumService{
  @Autowired
  private ConsultbranchcrmdaysumMapper mapper;

}