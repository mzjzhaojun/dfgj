package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.OrderitemsMapper;
import com.yt.app.api.v1.service.OrderitemsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Orderitems;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class OrderitemsServiceImpl extends BaseServiceImpl<Orderitems, Long> implements OrderitemsService{
  @Autowired
  private OrderitemsMapper mapper;

}