package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.ConsultantMonthtaskMapper;
import com.yt.app.api.v1.service.ConsultantMonthtaskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.ConsultantMonthtask;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:25
*/

@Service
public class ConsultantMonthtaskServiceImpl extends BaseServiceImpl<ConsultantMonthtask, Long> implements ConsultantMonthtaskService{
  @Autowired
  private ConsultantMonthtaskMapper mapper;

}