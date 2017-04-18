package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CategorycatalogsMapper;
import com.yt.app.api.v1.service.CategorycatalogsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Categorycatalogs;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/

@Service
public class CategorycatalogsServiceImpl extends BaseServiceImpl<Categorycatalogs, Long> implements CategorycatalogsService{
  @Autowired
  private CategorycatalogsMapper mapper;

}