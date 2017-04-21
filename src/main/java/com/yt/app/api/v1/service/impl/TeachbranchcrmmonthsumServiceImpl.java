package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeachbranchcrmmonthsumMapper;
import com.yt.app.api.v1.service.TeachbranchcrmmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teachbranchcrmmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:58
*/

@Service
public class TeachbranchcrmmonthsumServiceImpl extends BaseServiceImpl<Teachbranchcrmmonthsum, Long> implements TeachbranchcrmmonthsumService{
  @Autowired
  private TeachbranchcrmmonthsumMapper mapper;

}