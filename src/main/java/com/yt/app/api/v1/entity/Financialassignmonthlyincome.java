package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */
@Getter
@Setter
public class Financialassignmonthlyincome implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Integer checkyear;
	Integer checkmonth;
	String branchid;
	String branchname;
	String campusid;
	String campusname;
	String categorytype;
	String categoryname;
	String catalog;
	String catalogname;
	Object amount;
	Object taxamount;
	Object allamount;
	Object taxrate;
	String issyn;
	java.util.Date syntime;
	java.util.Date createtime;
	java.util.Date modifytime;
	String financialcode;

	public Financialassignmonthlyincome() {
	}

	public Financialassignmonthlyincome(Long id, Integer version, Integer checkyear, Integer checkmonth, String branchid, String branchname,
			String campusid, String campusname, String categorytype, String categoryname, String catalog, String catalogname, Object amount,
			Object taxamount, Object allamount, Object taxrate, String issyn, java.util.Date syntime, java.util.Date createtime,
			java.util.Date modifytime, String financialcode) {
		this.id = id;
		this.version = version;
		this.checkyear = checkyear;
		this.checkmonth = checkmonth;
		this.branchid = branchid;
		this.branchname = branchname;
		this.campusid = campusid;
		this.campusname = campusname;
		this.categorytype = categorytype;
		this.categoryname = categoryname;
		this.catalog = catalog;
		this.catalogname = catalogname;
		this.amount = amount;
		this.taxamount = taxamount;
		this.allamount = allamount;
		this.taxrate = taxrate;
		this.issyn = issyn;
		this.syntime = syntime;
		this.createtime = createtime;
		this.modifytime = modifytime;
		this.financialcode = financialcode;
	}
}