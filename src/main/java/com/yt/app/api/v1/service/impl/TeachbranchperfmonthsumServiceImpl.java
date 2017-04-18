package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeachbranchperfmonthsumMapper;
import com.yt.app.api.v1.service.TeachbranchperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teachbranchperfmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class TeachbranchperfmonthsumServiceImpl extends BaseServiceImpl<Teachbranchperfmonthsum, Long> implements TeachbranchperfmonthsumService{
  @Autowired
  private TeachbranchperfmonthsumMapper mapper;

}