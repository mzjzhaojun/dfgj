package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ChargereportMapper;
import com.yt.app.api.v1.service.ChargereportService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Chargereport;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class ChargereportServiceImpl extends BaseServiceImpl<Chargereport, Long> implements ChargereportService{
  @Autowired
  private ChargereportMapper mapper;

}