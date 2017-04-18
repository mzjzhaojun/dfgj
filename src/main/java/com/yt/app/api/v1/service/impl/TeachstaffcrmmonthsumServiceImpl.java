package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeachstaffcrmmonthsumMapper;
import com.yt.app.api.v1.service.TeachstaffcrmmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teachstaffcrmmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

@Service
public class TeachstaffcrmmonthsumServiceImpl extends BaseServiceImpl<Teachstaffcrmmonthsum, Long> implements TeachstaffcrmmonthsumService{
  @Autowired
  private TeachstaffcrmmonthsumMapper mapper;

}