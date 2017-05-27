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
public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long campusid;
	String campusname;
	Long parentid;
	String parentname;
	Long customerid;
	String customercode;
	String customername;
	String customergrade;
	String customergradename;
	Long accountid;
	String accountcode;
	String orderno;
	java.util.Date ordertime;
	String orderkind;
	String ordertype;
	Long orderstatus;
	String specialtype;
	String specialmemo;
	String processstatus;
	java.util.Date processtime;
	String processmemo;
	Long consultantid;
	String consultantname;
	Long consultantjobid;
	Long educatorid;
	String educatorname;
	Long educatorjobid;
	Long submitterid;
	String submittername;
	Long submitterjobid;
	String submitterjobname;
	String submitterjobtype;
	java.util.Date submittime;
	Long approverid;
	Long approvername;
	Long approverjobid;
	String approverjobname;
	java.util.Date approvetime;
	Long chargeapplyid;
	String chargeapplymemo;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;

	public Orders() {
	}

}