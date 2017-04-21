package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.DebookorderitemsMapper;
import com.yt.app.api.v1.service.DebookorderitemsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Debookorderitems;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:38
*/

@Service
public class DebookorderitemsServiceImpl extends BaseServiceImpl<Debookorderitems, Long> implements DebookorderitemsService{
  @Autowired
  private DebookorderitemsMapper mapper;

}