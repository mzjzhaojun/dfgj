package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.OtherproductincomeMapper;
import com.yt.app.api.v1.service.OtherproductincomeService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Otherproductincome;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:50
*/

@Service
public class OtherproductincomeServiceImpl extends BaseServiceImpl<Otherproductincome, Long> implements OtherproductincomeService{
  @Autowired
  private OtherproductincomeMapper mapper;

}