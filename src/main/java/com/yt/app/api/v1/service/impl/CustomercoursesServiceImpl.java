package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CustomercoursesMapper;
import com.yt.app.api.v1.service.CustomercoursesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Customercourses;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:30
*/

@Service
public class CustomercoursesServiceImpl extends BaseServiceImpl<Customercourses, Long> implements CustomercoursesService{
  @Autowired
  private CustomercoursesMapper mapper;

}