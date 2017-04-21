package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatecountryperfmonthsumMapper;
import com.yt.app.api.v1.service.EducatecountryperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Educatecountryperfmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:42
*/

@Service
public class EducatecountryperfmonthsumServiceImpl extends BaseServiceImpl<Educatecountryperfmonthsum, Long> implements EducatecountryperfmonthsumService{
  @Autowired
  private EducatecountryperfmonthsumMapper mapper;

}