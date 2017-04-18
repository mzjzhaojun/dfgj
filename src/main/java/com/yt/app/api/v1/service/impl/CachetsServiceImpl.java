package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CachetsMapper;
import com.yt.app.api.v1.service.CachetsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Cachets;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class CachetsServiceImpl extends BaseServiceImpl<Cachets, Long> implements CachetsService{
  @Autowired
  private CachetsMapper mapper;

}