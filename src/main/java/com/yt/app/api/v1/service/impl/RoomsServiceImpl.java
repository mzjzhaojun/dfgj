package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.RoomsMapper;
import com.yt.app.api.v1.service.RoomsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Rooms;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:56
*/

@Service
public class RoomsServiceImpl extends BaseServiceImpl<Rooms, Long> implements RoomsService{
  @Autowired
  private RoomsMapper mapper;

}