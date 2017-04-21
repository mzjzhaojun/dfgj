package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.UserTaskcategoryMapper;
import com.yt.app.api.v1.service.UserTaskcategoryService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.UserTaskcategory;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:04
*/

@Service
public class UserTaskcategoryServiceImpl extends BaseServiceImpl<UserTaskcategory, Long> implements UserTaskcategoryService{
  @Autowired
  private UserTaskcategoryMapper mapper;

}