package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultcampusperfmonthsumMapper;
import com.yt.app.api.v1.service.ConsultcampusperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultcampusperfmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:26
*/

@Service
public class ConsultcampusperfmonthsumServiceImpl extends BaseServiceImpl<Consultcampusperfmonthsum, Long> implements ConsultcampusperfmonthsumService{
  @Autowired
  private ConsultcampusperfmonthsumMapper mapper;

}