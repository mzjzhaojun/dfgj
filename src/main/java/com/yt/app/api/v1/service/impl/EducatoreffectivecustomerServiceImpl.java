package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatoreffectivecustomerMapper;
import com.yt.app.api.v1.service.EducatoreffectivecustomerService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Educatoreffectivecustomer;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:44
*/

@Service
public class EducatoreffectivecustomerServiceImpl extends BaseServiceImpl<Educatoreffectivecustomer, Long> implements EducatoreffectivecustomerService{
  @Autowired
  private EducatoreffectivecustomerMapper mapper;

}