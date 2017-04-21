package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeachcampusperfmonthsumMapper;
import com.yt.app.api.v1.service.TeachcampusperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teachcampusperfmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:59
*/

@Service
public class TeachcampusperfmonthsumServiceImpl extends BaseServiceImpl<Teachcampusperfmonthsum, Long> implements TeachcampusperfmonthsumService{
  @Autowired
  private TeachcampusperfmonthsumMapper mapper;

}