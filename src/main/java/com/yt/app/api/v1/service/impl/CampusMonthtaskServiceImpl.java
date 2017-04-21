package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampusMonthtaskMapper;
import com.yt.app.api.v1.service.CampusMonthtaskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.CampusMonthtask;

/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:20
*/

@Service
public class CampusMonthtaskServiceImpl extends BaseServiceImpl<CampusMonthtask, Long> implements CampusMonthtaskService{
  @Autowired
  private CampusMonthtaskMapper mapper;

}