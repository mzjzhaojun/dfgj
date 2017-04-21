package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatecountryperfdaysumMapper;
import com.yt.app.api.v1.service.EducatecountryperfdaysumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Educatecountryperfdaysum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:41
*/

@Service
public class EducatecountryperfdaysumServiceImpl extends BaseServiceImpl<Educatecountryperfdaysum, Long> implements EducatecountryperfdaysumService{
  @Autowired
  private EducatecountryperfdaysumMapper mapper;

}