package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerschoolrelationsMapper;
import com.yt.app.api.v1.service.CustomerschoolrelationsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerschoolrelations;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:33
*/

@Service
public class CustomerschoolrelationsServiceImpl extends BaseServiceImpl<Customerschoolrelations, Long> implements CustomerschoolrelationsService{
  @Autowired
  private CustomerschoolrelationsMapper mapper;

}