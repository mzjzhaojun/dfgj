package com.yt.app.api.v1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.yt.app.api.v1.mapper.CustomerMapper;
import com.yt.app.api.v1.mapper.CustomerstaffchargesMapper;
import com.yt.app.api.v1.service.CustomerstaffchargesService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.api.v1.entity.Customer;
import com.yt.app.api.v1.entity.Customerstaffcharges;
import com.yt.app.frame.m.IPage;
import com.yt.app.frame.m.PageBean;
import com.yt.app.frame.p.RequestUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */

@Service
public class CustomerstaffchargesServiceImpl extends BaseServiceImpl<Customerstaffcharges, Long> implements CustomerstaffchargesService {
	@Autowired
	private CustomerstaffchargesMapper mapper;
	@Autowired
	private CustomerMapper customermapper;

	@Override
	@Transactional
	public Integer post(Customerstaffcharges t) {
		Integer i = mapper.post(t);
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Customerstaffcharges> list(RequestEntity<Object> requestEntity) {
		Map<String, Object> param = RequestUtil.requestEntityToParamMap(requestEntity);
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Customerstaffcharges> list = mapper.list(param);
		return new PageBean<Customerstaffcharges>(param, list, count);
	}

	@Override
	public Customerstaffcharges get(Long id) {
		Customerstaffcharges t = mapper.get(id);
		return t;
	}

	@Override
	public Integer sava(Map<String, Object> parm) {
		Integer i = 0;
		Long code = Long.valueOf(parm.get("chargetype").toString());
		Long orderid = Long.valueOf(parm.get("orderid").toString());
		Long customerid = Long.valueOf(parm.get("customerid").toString());
		float paidprice = Long.valueOf(parm.get("paidprice").toString());
		Long campusid = Long.valueOf(parm.get("campusid").toString());
		Customerstaffcharges csc = null;
		Customer c = customermapper.get(customerid);
		if (parm.get("consultantid") != null) {
			c.setConsultantid(Long.valueOf(parm.get("consultantid").toString()));
			c.setConsultantname(parm.get("consultantname").toString());
		}
		if (parm.get("educatorid") != null) {
			c.setEducatorid(Long.valueOf(parm.get("educatorid").toString()));
			c.setEducatorname(parm.get("educatorname").toString());
		}
		if (parm.get("marketingid") != null) {
			c.setMarketingid(Long.valueOf(parm.get("marketingid").toString()));
			c.setMarketingname(parm.get("marketingname").toString());
		}
		if (parm.get("callcenterid") != null) {
			c.setCallcenterid(Long.valueOf(parm.get("callcenterid").toString()));
			c.setCallcentername(parm.get("callcentername").toString());
		}
		customermapper.put(c);
		if (code.longValue() == DictionaryResource.ACCOUNTCHARGEAPPLIES_CHARGETYPE_2141) {
			if (parm.get("consultantid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("consultantid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2141, paidprice, 0f, 0f);
				i = mapper.post(csc);
			}
			if (parm.get("educatorid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("educatorid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2142, paidprice, 0f, 0f);
				i = mapper.post(csc);
			}
			if (parm.get("marketingid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("marketingid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2144, paidprice, 0f, 0f);
				i = mapper.post(csc);
			}
			if (parm.get("callcenterid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("callcenterid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2145, paidprice, 0f, 0f);
				i = mapper.post(csc);
			}
		} else if (code.longValue() == DictionaryResource.ACCOUNTCHARGEAPPLIES_CHARGETYPE_2142) {
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("orderid", orderid);
			csc = mapper.list(param).get(0);
			csc.setNewchargeamount(csc.getNewchargeamount() + paidprice);
			i = mapper.putByOrderId(csc);
		} else if (code.longValue() == DictionaryResource.ACCOUNTCHARGEAPPLIES_CHARGETYPE_2143
				|| code.longValue() == DictionaryResource.ACCOUNTCHARGEAPPLIES_CHARGETYPE_2144) {
			if (parm.get("consultantid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("consultantid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2141, 0f, paidprice, 0f);
				i = mapper.post(csc);
			}
			if (parm.get("teacherid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("teacherid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2143, 0f, paidprice, 0f);
				i = mapper.post(csc);
			}
			if (parm.get("educatorid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("educatorid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2142, 0f, paidprice, 0f);
				i = mapper.post(csc);
			}
		} else if (code.longValue() == DictionaryResource.ACCOUNTCHARGEAPPLIES_CHARGETYPE_2145
				|| code.longValue() == DictionaryResource.ACCOUNTCHARGEAPPLIES_CHARGETYPE_2146) {
			if (parm.get("teacherid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("teacherid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2143, 0f, 0f, paidprice);
				i = mapper.post(csc);
			}
			if (parm.get("consultantid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("consultantid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2141, 0f, 0f, paidprice);
				i = mapper.post(csc);
			}
			if (parm.get("educatorid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("educatorid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2142, 0f, 0f, paidprice);
				i = mapper.post(csc);
			}
			if (parm.get("marketingid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("marketingid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2144, 0f, 0f, paidprice);
				i = mapper.post(csc);
			}
			if (parm.get("callcenterid") != null) {
				csc = new Customerstaffcharges(orderid, customerid, Long.valueOf(parm.get("callcenterid").toString()), new Date(), campusid,
						DictionaryResource.CUSTOMERSTAFFCHARGES_RELATIONTYPE_2145, 0f, 0f, paidprice);
				i = mapper.post(csc);
			}
		}
		return i;
	}
}