package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampuschargestatMapper;
import com.yt.app.api.v1.service.CampuschargestatService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Campuschargestat;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class CampuschargestatServiceImpl extends BaseServiceImpl<Campuschargestat, Long> implements CampuschargestatService{
  @Autowired
  private CampuschargestatMapper mapper;

}