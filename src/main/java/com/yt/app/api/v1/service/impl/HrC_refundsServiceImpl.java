package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.HrC_refundsMapper;
import com.yt.app.api.v1.service.HrC_refundsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.HrC_refunds;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class HrC_refundsServiceImpl extends BaseServiceImpl<HrC_refunds, Long> implements HrC_refundsService{
  @Autowired
  private HrC_refundsMapper mapper;

}