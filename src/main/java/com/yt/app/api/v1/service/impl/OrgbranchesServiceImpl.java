package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.OrgbranchesMapper;
import com.yt.app.api.v1.service.OrgbranchesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Orgbranches;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/

@Service
public class OrgbranchesServiceImpl extends BaseServiceImpl<Orgbranches, Long> implements OrgbranchesService{
  @Autowired
  private OrgbranchesMapper mapper;

}