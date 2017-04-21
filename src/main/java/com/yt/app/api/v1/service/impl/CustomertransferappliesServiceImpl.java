package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomertransferappliesMapper;
import com.yt.app.api.v1.service.CustomertransferappliesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customertransferapplies;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:37
*/

@Service
public class CustomertransferappliesServiceImpl extends BaseServiceImpl<Customertransferapplies, Long> implements CustomertransferappliesService{
  @Autowired
  private CustomertransferappliesMapper mapper;

}