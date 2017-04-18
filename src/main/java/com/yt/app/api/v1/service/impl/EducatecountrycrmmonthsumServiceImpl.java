package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatecountrycrmmonthsumMapper;
import com.yt.app.api.v1.service.EducatecountrycrmmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Educatecountrycrmmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

@Service
public class EducatecountrycrmmonthsumServiceImpl extends BaseServiceImpl<Educatecountrycrmmonthsum, Long> implements EducatecountrycrmmonthsumService{
  @Autowired
  private EducatecountrycrmmonthsumMapper mapper;

}