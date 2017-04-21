package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AssetsMapper;
import com.yt.app.api.v1.service.AssetsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Assets;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:18
*/

@Service
public class AssetsServiceImpl extends BaseServiceImpl<Assets, Long> implements AssetsService{
  @Autowired
  private AssetsMapper mapper;

}