package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultcountryperfmonthsumMapper;
import com.yt.app.api.v1.service.ConsultcountryperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Consultcountryperfmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:27
*/

@Service
public class ConsultcountryperfmonthsumServiceImpl extends BaseServiceImpl<Consultcountryperfmonthsum, Long> implements ConsultcountryperfmonthsumService{
  @Autowired
  private ConsultcountryperfmonthsumMapper mapper;

}