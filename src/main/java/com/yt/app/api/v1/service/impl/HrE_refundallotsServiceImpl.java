package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.HrE_refundallotsMapper;
import com.yt.app.api.v1.service.HrE_refundallotsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.HrE_refundallots;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class HrE_refundallotsServiceImpl extends BaseServiceImpl<HrE_refundallots, Long> implements HrE_refundallotsService{
  @Autowired
  private HrE_refundallotsMapper mapper;

}