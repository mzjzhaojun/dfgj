package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.app.api.v1.mapper.MenuLinksMapper;
import com.yt.app.api.v1.service.MenuLinksService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.api.v1.entity.MenuLinks;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

@Service
public class MenuLinksServiceImpl extends BaseServiceImpl<MenuLinks, Long> implements MenuLinksService {
	@Autowired
	private MenuLinksMapper mapper;

}