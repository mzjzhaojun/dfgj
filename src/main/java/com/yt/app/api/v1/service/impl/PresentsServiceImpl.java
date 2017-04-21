package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.PresentsMapper;
import com.yt.app.api.v1.service.PresentsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Presents;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:53
*/

@Service
public class PresentsServiceImpl extends BaseServiceImpl<Presents, Long> implements PresentsService{
  @Autowired
  private PresentsMapper mapper;

}