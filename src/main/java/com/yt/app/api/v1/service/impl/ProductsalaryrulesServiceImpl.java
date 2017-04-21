package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ProductsalaryrulesMapper;
import com.yt.app.api.v1.service.ProductsalaryrulesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Productsalaryrules;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:54
*/

@Service
public class ProductsalaryrulesServiceImpl extends BaseServiceImpl<Productsalaryrules, Long> implements ProductsalaryrulesService{
  @Autowired
  private ProductsalaryrulesMapper mapper;

}