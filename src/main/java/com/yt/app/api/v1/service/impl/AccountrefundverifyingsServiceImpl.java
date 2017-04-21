package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AccountrefundverifyingsMapper;
import com.yt.app.api.v1.service.AccountrefundverifyingsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Accountrefundverifyings;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:17
*/

@Service
public class AccountrefundverifyingsServiceImpl extends BaseServiceImpl<Accountrefundverifyings, Long> implements AccountrefundverifyingsService{
  @Autowired
  private AccountrefundverifyingsMapper mapper;

}