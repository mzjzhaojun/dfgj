package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerassetsdetailsourceMapper;
import com.yt.app.api.v1.service.CustomerassetsdetailsourceService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerassetsdetailsource;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:29
*/

@Service
public class CustomerassetsdetailsourceServiceImpl extends BaseServiceImpl<Customerassetsdetailsource, Long> implements CustomerassetsdetailsourceService{
  @Autowired
  private CustomerassetsdetailsourceMapper mapper;

}