package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultbranchcrmmonthsumMapper;
import com.yt.app.api.v1.service.ConsultbranchcrmmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultbranchcrmmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class ConsultbranchcrmmonthsumServiceImpl extends BaseServiceImpl<Consultbranchcrmmonthsum, Long> implements ConsultbranchcrmmonthsumService{
  @Autowired
  private ConsultbranchcrmmonthsumMapper mapper;

}