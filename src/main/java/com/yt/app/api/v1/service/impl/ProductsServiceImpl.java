package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ProductsMapper;
import com.yt.app.api.v1.service.ProductsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Products;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:54
*/

@Service
public class ProductsServiceImpl extends BaseServiceImpl<Products, Long> implements ProductsService{
  @Autowired
  private ProductsMapper mapper;

}