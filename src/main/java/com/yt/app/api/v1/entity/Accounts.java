package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:17
 */
@Getter
@Setter
public class Accounts implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long customerid;
	String accountcode;
	String accounttype;
	String accountmemo;
	String accountstatus;
	Object accountmoney;
	Long discountid;
	String discountcode;
	Object discountrate;
	Object discountbase;
	Long chargeapplyid;
	java.util.Date chargepaytime;
	java.util.Date firstchargepaytime;
	Long firstchargeapplyid;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;

	public Accounts() {
	}

	public Accounts(Long id, Integer version, Long customerid, String accountcode, String accounttype, String accountmemo, String accountstatus,
			Object accountmoney, Long discountid, String discountcode, Object discountrate, Object discountbase, Long chargeapplyid,
			java.util.Date chargepaytime, java.util.Date firstchargepaytime, Long firstchargeapplyid, Long creatorid, String creatorname,
			java.util.Date createtime, Long modifierid, String modifiername, java.util.Date modifytime) {
		this.id = id;
		this.version = version;
		this.customerid = customerid;
		this.accountcode = accountcode;
		this.accounttype = accounttype;
		this.accountmemo = accountmemo;
		this.accountstatus = accountstatus;
		this.accountmoney = accountmoney;
		this.discountid = discountid;
		this.discountcode = discountcode;
		this.discountrate = discountrate;
		this.discountbase = discountbase;
		this.chargeapplyid = chargeapplyid;
		this.chargepaytime = chargepaytime;
		this.firstchargepaytime = firstchargepaytime;
		this.firstchargeapplyid = firstchargeapplyid;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
	}
}