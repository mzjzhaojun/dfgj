package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.DiscountsMapper;
import com.yt.app.api.v1.service.DiscountsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Discounts;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:39
*/

@Service
public class DiscountsServiceImpl extends BaseServiceImpl<Discounts, Long> implements DiscountsService{
  @Autowired
  private DiscountsMapper mapper;

}