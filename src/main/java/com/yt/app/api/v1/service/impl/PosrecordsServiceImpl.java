package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.PosrecordsMapper;
import com.yt.app.api.v1.service.PosrecordsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Posrecords;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class PosrecordsServiceImpl extends BaseServiceImpl<Posrecords, Long> implements PosrecordsService{
  @Autowired
  private PosrecordsMapper mapper;

}