package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.AccountdeductappliesMapper;
import com.yt.app.api.v1.service.AccountdeductappliesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Accountdeductapplies;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:17
*/

@Service
public class AccountdeductappliesServiceImpl extends BaseServiceImpl<Accountdeductapplies, Long> implements AccountdeductappliesService{
  @Autowired
  private AccountdeductappliesMapper mapper;

}