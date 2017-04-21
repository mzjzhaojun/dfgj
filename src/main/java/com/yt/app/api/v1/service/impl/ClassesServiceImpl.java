package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ClassesMapper;
import com.yt.app.api.v1.service.ClassesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Classes;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:24
*/

@Service
public class ClassesServiceImpl extends BaseServiceImpl<Classes, Long> implements ClassesService{
  @Autowired
  private ClassesMapper mapper;

}