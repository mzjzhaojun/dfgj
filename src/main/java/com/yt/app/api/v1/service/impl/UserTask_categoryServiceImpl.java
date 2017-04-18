package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.UserTask_categoryMapper;
import com.yt.app.api.v1.service.UserTask_categoryService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.UserTask_category;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/

@Service
public class UserTask_categoryServiceImpl extends BaseServiceImpl<UserTask_category, Long> implements UserTask_categoryService{
  @Autowired
  private UserTask_categoryMapper mapper;

}