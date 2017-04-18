package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.HrB_assignsMapper;
import com.yt.app.api.v1.service.HrB_assignsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.HrB_assigns;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class HrB_assignsServiceImpl extends BaseServiceImpl<HrB_assigns, Long> implements HrB_assignsService{
  @Autowired
  private HrB_assignsMapper mapper;

}