package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CountryCodeMapper;
import com.yt.app.api.v1.service.CountryCodeService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.CountryCode;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:27
*/

@Service
public class CountryCodeServiceImpl extends BaseServiceImpl<CountryCode, Long> implements CountryCodeService{
  @Autowired
  private CountryCodeMapper mapper;

}