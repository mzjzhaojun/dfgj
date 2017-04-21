package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.StaffbasestatMapper;
import com.yt.app.api.v1.service.StaffbasestatService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Staffbasestat;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:56
*/

@Service
public class StaffbasestatServiceImpl extends BaseServiceImpl<Staffbasestat, Long> implements StaffbasestatService{
  @Autowired
  private StaffbasestatMapper mapper;

}