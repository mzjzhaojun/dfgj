package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AccounttransferappliesMapper;
import com.yt.app.api.v1.service.AccounttransferappliesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Accounttransferapplies;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class AccounttransferappliesServiceImpl extends BaseServiceImpl<Accounttransferapplies, Long> implements AccounttransferappliesService{
  @Autowired
  private AccounttransferappliesMapper mapper;

}