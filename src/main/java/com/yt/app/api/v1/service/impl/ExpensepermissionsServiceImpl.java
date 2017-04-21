package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ExpensepermissionsMapper;
import com.yt.app.api.v1.service.ExpensepermissionsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Expensepermissions;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:45
*/

@Service
public class ExpensepermissionsServiceImpl extends BaseServiceImpl<Expensepermissions, Long> implements ExpensepermissionsService{
  @Autowired
  private ExpensepermissionsMapper mapper;

}