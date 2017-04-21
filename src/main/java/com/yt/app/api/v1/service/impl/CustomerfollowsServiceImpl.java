package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerfollowsMapper;
import com.yt.app.api.v1.service.CustomerfollowsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerfollows;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:31
*/

@Service
public class CustomerfollowsServiceImpl extends BaseServiceImpl<Customerfollows, Long> implements CustomerfollowsService{
  @Autowired
  private CustomerfollowsMapper mapper;

}