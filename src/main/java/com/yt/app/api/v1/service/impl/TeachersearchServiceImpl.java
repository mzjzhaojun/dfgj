package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.TeachersearchMapper;
import com.yt.app.api.v1.service.TeachersearchService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Teachersearch;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

@Service
public class TeachersearchServiceImpl extends BaseServiceImpl<Teachersearch, Long> implements TeachersearchService{
  @Autowired
  private TeachersearchMapper mapper;

}