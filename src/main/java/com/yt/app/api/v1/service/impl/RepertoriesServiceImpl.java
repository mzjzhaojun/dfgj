package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.RepertoriesMapper;
import com.yt.app.api.v1.service.RepertoriesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Repertories;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:55
*/

@Service
public class RepertoriesServiceImpl extends BaseServiceImpl<Repertories, Long> implements RepertoriesService{
  @Autowired
  private RepertoriesMapper mapper;

}