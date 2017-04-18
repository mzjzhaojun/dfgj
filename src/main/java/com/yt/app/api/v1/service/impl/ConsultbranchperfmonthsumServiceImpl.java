package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultbranchperfmonthsumMapper;
import com.yt.app.api.v1.service.ConsultbranchperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultbranchperfmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class ConsultbranchperfmonthsumServiceImpl extends BaseServiceImpl<Consultbranchperfmonthsum, Long> implements ConsultbranchperfmonthsumService{
  @Autowired
  private ConsultbranchperfmonthsumMapper mapper;

}