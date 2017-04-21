package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ClasslessonsMapper;
import com.yt.app.api.v1.service.ClasslessonsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Classlessons;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:24
*/

@Service
public class ClasslessonsServiceImpl extends BaseServiceImpl<Classlessons, Long> implements ClasslessonsService{
  @Autowired
  private ClasslessonsMapper mapper;

}