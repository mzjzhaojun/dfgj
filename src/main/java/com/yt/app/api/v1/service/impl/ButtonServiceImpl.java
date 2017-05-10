package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.entity.Button;
import com.yt.app.api.v1.mapper.ButtonMapper;
import com.yt.app.api.v1.service.ButtonService;
import com.yt.app.common.base.impl.BaseServiceImpl;

/**
 * @author zj default
 * 
 * @version 1.1
 */

@Service
public class ButtonServiceImpl extends BaseServiceImpl<Button, Long> implements ButtonService {
	@Autowired
	private ButtonMapper mapper;

}