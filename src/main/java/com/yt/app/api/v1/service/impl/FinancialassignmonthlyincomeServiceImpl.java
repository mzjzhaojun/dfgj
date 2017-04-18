package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.FinancialassignmonthlyincomeMapper;
import com.yt.app.api.v1.service.FinancialassignmonthlyincomeService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Financialassignmonthlyincome;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/

@Service
public class FinancialassignmonthlyincomeServiceImpl extends BaseServiceImpl<Financialassignmonthlyincome, Long> implements FinancialassignmonthlyincomeService{
  @Autowired
  private FinancialassignmonthlyincomeMapper mapper;

}