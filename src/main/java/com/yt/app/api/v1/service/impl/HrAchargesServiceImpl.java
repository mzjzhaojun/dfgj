package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.HrAchargesMapper;
import com.yt.app.api.v1.service.HrAchargesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.HrAcharges;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:46
*/

@Service
public class HrAchargesServiceImpl extends BaseServiceImpl<HrAcharges, Long> implements HrAchargesService{
  @Autowired
  private HrAchargesMapper mapper;

}