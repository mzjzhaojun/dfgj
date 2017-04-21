package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ExpensesMapper;
import com.yt.app.api.v1.service.ExpensesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Expenses;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:45
*/

@Service
public class ExpensesServiceImpl extends BaseServiceImpl<Expenses, Long> implements ExpensesService{
  @Autowired
  private ExpensesMapper mapper;

}