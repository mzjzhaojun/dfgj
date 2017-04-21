package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomerscoresMapper;
import com.yt.app.api.v1.service.CustomerscoresService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customerscores;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:34
*/

@Service
public class CustomerscoresServiceImpl extends BaseServiceImpl<Customerscores, Long> implements CustomerscoresService{
  @Autowired
  private CustomerscoresMapper mapper;

}