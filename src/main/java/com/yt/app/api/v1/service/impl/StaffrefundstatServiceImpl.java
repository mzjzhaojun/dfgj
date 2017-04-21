package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.StaffrefundstatMapper;
import com.yt.app.api.v1.service.StaffrefundstatService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Staffrefundstat;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:57
*/

@Service
public class StaffrefundstatServiceImpl extends BaseServiceImpl<Staffrefundstat, Long> implements StaffrefundstatService{
  @Autowired
  private StaffrefundstatMapper mapper;

}