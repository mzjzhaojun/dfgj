package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomermeetingitemsMapper;
import com.yt.app.api.v1.service.CustomermeetingitemsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customermeetingitems;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:31
*/

@Service
public class CustomermeetingitemsServiceImpl extends BaseServiceImpl<Customermeetingitems, Long> implements CustomermeetingitemsService{
  @Autowired
  private CustomermeetingitemsMapper mapper;

}