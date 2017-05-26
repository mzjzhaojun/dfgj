package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.AccountchargeappliesMapper;
import com.yt.app.api.v1.mapper.AccountchargepaymentsMapper;
import com.yt.app.api.v1.service.AccountchargeappliesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.api.v1.entity.Accountchargeapplies;
import com.yt.app.api.v1.entity.Accountchargepayments;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.NumberUtil;
import com.yt.app.frame.p.RequestUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */

@Service
public class AccountchargeappliesServiceImpl extends BaseServiceImpl<Accountchargeapplies, Long> implements AccountchargeappliesService {
	@Autowired
	private AccountchargeappliesMapper mapper;

	@Autowired
	private AccountchargepaymentsMapper accountchargepaymentsmapper;

	@Override
	@Transactional
	public Integer post(Accountchargeapplies t) {
		t.setCreatetime(new Date());
		t.setPaystatus(DictionaryResource.ACCOUNTCHARGEAPPLIES_PAYSTATUS_2151);
		t.setPaytime(new Date());
		t.setApplyno(NumberUtil.getOrderNo());
		Integer i = mapper.post(t);
		if (i > 0) {
			Accountchargepayments acpm = new Accountchargepayments();
			acpm.setApplyid(t.getId());
			acpm.setPayno(NumberUtil.getOrderNo());
			acpm.setPaytime(t.getPaytime());
			acpm.setPaytype(t.getPaytype());
			acpm.setPayticket(t.getPayticket());
			acpm.setPaystatus(DictionaryResource.ACCOUNTCHARGEAPPLIES_PAYSTATUS_2151);
			acpm.setPaymoney(t.getPaidmoney());
			acpm.setPayer(t.getCustomername());
			acpm.setPayeeid(t.getCreatorid());
			acpm.setPayeename(t.getCreatorname());
			acpm.setPayeejobid(t.getSubmitterjobid());
			acpm.setPayeejobname(t.getSubmitterjobname());
			acpm.setCreatetime(new Date());
			acpm.setCreatorid(t.getCreatorid());
			acpm.setCreatorname(t.getCreatorname());
			accountchargepaymentsmapper.post(acpm);
		}
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Accountchargeapplies> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Accountchargeapplies> list = mapper.list(param);
		return new PageBean<Accountchargeapplies>(param, list, count);
	}

	@Override
	public Accountchargeapplies get(Long id) {
		Accountchargeapplies t = mapper.get(id);
		return t;
	}
}