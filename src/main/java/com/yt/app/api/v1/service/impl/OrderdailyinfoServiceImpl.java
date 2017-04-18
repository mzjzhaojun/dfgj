package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.OrderdailyinfoMapper;
import com.yt.app.api.v1.service.OrderdailyinfoService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Orderdailyinfo;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class OrderdailyinfoServiceImpl extends BaseServiceImpl<Orderdailyinfo, Long> implements OrderdailyinfoService{
  @Autowired
  private OrderdailyinfoMapper mapper;

}