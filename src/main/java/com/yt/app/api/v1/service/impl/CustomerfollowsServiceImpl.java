package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.CustomerfollowsMapper;
import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.PotentialcustomersMapper;
import com.yt.app.api.v1.service.CustomerfollowsService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.api.v1.entity.Customerfollows;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Potentialcustomers;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.util.RequestUtil;
import com.yt.app.util.StreamUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

@Service
public class CustomerfollowsServiceImpl extends BaseServiceImpl<Customerfollows, Long> implements CustomerfollowsService {
	@Autowired
	private CustomerfollowsMapper mapper;
	@Autowired
	private DictionaryMapper dictionarymapper;
	@Autowired
	private PotentialcustomersMapper potentialcustomersmapper;

	@Override
	@Transactional
	public Integer post(Customerfollows t) {
		t.setCreatetime(new Date());
		Integer i = mapper.post(t);
		if (i > 0) {
			Potentialcustomers pc = potentialcustomersmapper.get(t.getCustomerid());
			// 不是潜在客户
			if (t.getIspotential() != null && t.getIspotential().longValue() == DictionaryResource.STATUS_21) {
				pc.setCustomerstatus(DictionaryResource.PATRIARCH_STATUS_1972);
			}else{
				pc.setCustomerstatus(DictionaryResource.PATRIARCH_STATUS_1973);
			}
			pc.setCustomerlevel(t.getCustomerlevel());
			pc.setContacttype(t.getFollowtype());
			pc.setFollowstage(t.getFollowstage());
			pc.setFollowedcount(pc.getFollowedcount() + 1);
			pc.setInvalidreason(t.getInvalidreason());
			pc.setPurchaseintention(t.getPurchaseintention());
			pc.setFollowtime(t.getPlanverifytime());
			pc.setNextfollowtime(t.getNextfollowtime());
			pc.setModifierid(t.getModifierid());
			pc.setModifiername(t.getModifiername());
			pc.setModifytime(new Date());
			potentialcustomersmapper.put(pc);
		}
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Customerfollows> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Customerfollows> list = mapper.list(param);
		if (list.size() == 0)
			return PageBean.EMPTY_PAGE;
		long[] dids = StreamUtil
				.concat(list.stream().mapToLong(Customerfollows::getFollowtype), list.stream().mapToLong(Customerfollows::getTalkmainresult),
						list.stream().mapToLong(Customerfollows::getIspotential), list.stream().mapToLong(Customerfollows::getFollowstage),
						list.stream().mapToLong(Customerfollows::getFollowobject)// ,
				/*
				 * list.stream().filter(t -> t.getCustomerlevel() !=
				 * null).mapToLong(Customerfollows::getCustomerlevel),
				 * list.stream().filter(t -> t.getInvalidreason() !=
				 * null).mapToLong(Customerfollows::getInvalidreason),
				 * list.stream().filter(t -> t.getIntensionsubjects() !=
				 * null).mapToLong(Customerfollows::getIntensionsubjects),
				 * list.stream().filter(t -> t.getIsstudythere() !=
				 * null).mapToLong(Customerfollows::getIsstudythere),
				 * list.stream().filter(t -> t.getPurchaseintention() !=
				 * null).mapToLong(Customerfollows::getPurchaseintention)
				 */
				).distinct().toArray();
		List<Dictionary> listd = dictionarymapper.listByArrayId(dids);
		list.forEach(t -> {
			listd.forEach(d -> {
				if (t.getFollowtype().longValue() == d.getCode().longValue())
					t.setFollowtypename(d.getName());
				if (t.getTalkmainresult().longValue() == d.getCode().longValue())
					t.setTalkmainresultname(d.getName());
				if (t.getIspotential().longValue() == d.getCode().longValue())
					t.setIspotentialname(d.getName());
				if (t.getFollowstage().longValue() == d.getCode().longValue())
					t.setFollowstagename(d.getName());
				if (t.getFollowobject().longValue() == d.getCode().longValue())
					t.setFollowobjectname(d.getName());

			});
		});
		return new PageBean<Customerfollows>(param, list, count);
	}

	@Override
	public Customerfollows get(Long id) {
		Customerfollows t = mapper.get(id);
		return t;
	}
}