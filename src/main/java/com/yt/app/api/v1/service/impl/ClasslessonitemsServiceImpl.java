package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ClasslessonitemsMapper;
import com.yt.app.api.v1.service.ClasslessonitemsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Classlessonitems;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class ClasslessonitemsServiceImpl extends BaseServiceImpl<Classlessonitems, Long> implements ClasslessonitemsService{
  @Autowired
  private ClasslessonitemsMapper mapper;

}