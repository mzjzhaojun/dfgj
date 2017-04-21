package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.PotentialcustomersMapper;
import com.yt.app.api.v1.service.PotentialcustomersService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Potentialcustomers;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:53
*/

@Service
public class PotentialcustomersServiceImpl extends BaseServiceImpl<Potentialcustomers, Long> implements PotentialcustomersService{
  @Autowired
  private PotentialcustomersMapper mapper;

}