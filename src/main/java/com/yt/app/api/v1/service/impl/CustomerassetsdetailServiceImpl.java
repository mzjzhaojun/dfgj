package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerassetsdetailMapper;
import com.yt.app.api.v1.service.CustomerassetsdetailService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerassetsdetail;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class CustomerassetsdetailServiceImpl extends BaseServiceImpl<Customerassetsdetail, Long> implements CustomerassetsdetailService{
  @Autowired
  private CustomerassetsdetailMapper mapper;

}