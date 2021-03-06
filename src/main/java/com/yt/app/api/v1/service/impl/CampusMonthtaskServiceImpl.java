package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.CampusMonthtaskMapper;
import com.yt.app.api.v1.service.CampusMonthtaskService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.CampusMonthtask;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */

@Service
public class CampusMonthtaskServiceImpl extends BaseServiceImpl<CampusMonthtask, Long> implements CampusMonthtaskService {
	@Autowired
	private CampusMonthtaskMapper mapper;

	@Override
	@Transactional
	public Integer post(CampusMonthtask t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<CampusMonthtask> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<CampusMonthtask> list = mapper.list(param);
		return new PageBean<CampusMonthtask>(param, list, count);
	}

	@Override
	public CampusMonthtask get(Long id) {
		CampusMonthtask t = mapper.get(id);
		return t;
	}
}