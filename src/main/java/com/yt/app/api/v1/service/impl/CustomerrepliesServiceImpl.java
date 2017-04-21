package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerrepliesMapper;
import com.yt.app.api.v1.service.CustomerrepliesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerreplies;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:33
*/

@Service
public class CustomerrepliesServiceImpl extends BaseServiceImpl<Customerreplies, Long> implements CustomerrepliesService{
  @Autowired
  private CustomerrepliesMapper mapper;

}