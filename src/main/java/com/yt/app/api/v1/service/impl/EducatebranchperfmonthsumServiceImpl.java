package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.EducatebranchperfmonthsumMapper;
import com.yt.app.api.v1.service.EducatebranchperfmonthsumService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.Educatebranchperfmonthsum;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:40
*/

@Service
public class EducatebranchperfmonthsumServiceImpl extends BaseServiceImpl<Educatebranchperfmonthsum, Long> implements EducatebranchperfmonthsumService{
  @Autowired
  private EducatebranchperfmonthsumMapper mapper;

}