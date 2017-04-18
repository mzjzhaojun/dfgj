package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.HrG_educatoreffectivecustomerMapper;
import com.yt.app.api.v1.service.HrG_educatoreffectivecustomerService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.HrG_educatoreffectivecustomer;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class HrG_educatoreffectivecustomerServiceImpl extends BaseServiceImpl<HrG_educatoreffectivecustomer, Long> implements HrG_educatoreffectivecustomerService{
  @Autowired
  private HrG_educatoreffectivecustomerMapper mapper;

}