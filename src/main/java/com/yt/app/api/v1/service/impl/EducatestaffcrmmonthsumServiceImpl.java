package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatestaffcrmmonthsumMapper;
import com.yt.app.api.v1.service.EducatestaffcrmmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Educatestaffcrmmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:42
*/

@Service
public class EducatestaffcrmmonthsumServiceImpl extends BaseServiceImpl<Educatestaffcrmmonthsum, Long> implements EducatestaffcrmmonthsumService{
  @Autowired
  private EducatestaffcrmmonthsumMapper mapper;

}