package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampussalesweeklystatMapper;
import com.yt.app.api.v1.service.CampussalesweeklystatService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Campussalesweeklystat;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:22
*/

@Service
public class CampussalesweeklystatServiceImpl extends BaseServiceImpl<Campussalesweeklystat, Long> implements CampussalesweeklystatService{
  @Autowired
  private CampussalesweeklystatMapper mapper;

}