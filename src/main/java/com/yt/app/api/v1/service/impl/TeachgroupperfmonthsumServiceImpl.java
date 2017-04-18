package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeachgroupperfmonthsumMapper;
import com.yt.app.api.v1.service.TeachgroupperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teachgroupperfmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

@Service
public class TeachgroupperfmonthsumServiceImpl extends BaseServiceImpl<Teachgroupperfmonthsum, Long> implements TeachgroupperfmonthsumService{
  @Autowired
  private TeachgroupperfmonthsumMapper mapper;

}