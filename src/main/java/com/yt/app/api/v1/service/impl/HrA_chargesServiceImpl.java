package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.HrA_chargesMapper;
import com.yt.app.api.v1.service.HrA_chargesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.HrA_charges;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class HrA_chargesServiceImpl extends BaseServiceImpl<HrA_charges, Long> implements HrA_chargesService{
  @Autowired
  private HrA_chargesMapper mapper;

}