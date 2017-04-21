package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.OrganizationsMapper;
import com.yt.app.api.v1.service.OrganizationsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Organizations;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:48
*/

@Service
public class OrganizationsServiceImpl extends BaseServiceImpl<Organizations, Long> implements OrganizationsService{
  @Autowired
  private OrganizationsMapper mapper;

}