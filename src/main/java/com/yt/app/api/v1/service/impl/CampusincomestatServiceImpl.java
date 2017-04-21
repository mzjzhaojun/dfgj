package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampusincomestatMapper;
import com.yt.app.api.v1.service.CampusincomestatService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Campusincomestat;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:21
*/

@Service
public class CampusincomestatServiceImpl extends BaseServiceImpl<Campusincomestat, Long> implements CampusincomestatService{
  @Autowired
  private CampusincomestatMapper mapper;

}