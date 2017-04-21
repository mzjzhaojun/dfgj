package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampusassetsdetailMapper;
import com.yt.app.api.v1.service.CampusassetsdetailService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Campusassetsdetail;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:20
*/

@Service
public class CampusassetsdetailServiceImpl extends BaseServiceImpl<Campusassetsdetail, Long> implements CampusassetsdetailService{
  @Autowired
  private CampusassetsdetailMapper mapper;

}