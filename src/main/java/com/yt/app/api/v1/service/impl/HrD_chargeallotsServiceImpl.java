package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.HrD_chargeallotsMapper;
import com.yt.app.api.v1.service.HrD_chargeallotsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.HrD_chargeallots;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class HrD_chargeallotsServiceImpl extends BaseServiceImpl<HrD_chargeallots, Long> implements HrD_chargeallotsService{
  @Autowired
  private HrD_chargeallotsMapper mapper;

}