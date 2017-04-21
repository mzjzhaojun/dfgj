package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeachcountrycrmmonthsumMapper;
import com.yt.app.api.v1.service.TeachcountrycrmmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teachcountrycrmmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:59
*/

@Service
public class TeachcountrycrmmonthsumServiceImpl extends BaseServiceImpl<Teachcountrycrmmonthsum, Long> implements TeachcountrycrmmonthsumService{
  @Autowired
  private TeachcountrycrmmonthsumMapper mapper;

}