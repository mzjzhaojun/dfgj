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
public class Orderitems implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long orderid;
	String itemno;
	Long productid;
	String productcode;
	String productname;
	String productunit;
	String productunitname;
	Long productcampusid;
	String productcampusname;
	Long grade;
	String gradename;
	Long subject;
	String subjectname;
	Long catalog;
	String catalogname;
	Long category;
	String categoryname;
	Long categorytype;
	String categorytypename;
	Long courselevel;
	String courselevelname;
	Integer lessoncount;
	Long lessonduration;
	Object lessondurationvalue;
	Long periodduration;
	Object perioddurationvalue;
	Object periodsoflesson;
	Object orderprice;
	Object orderamount;
	Long presentid;
	Object presentquato;
	Object presentamount;
	Object tunlandrate;
	Object specialrate;
	String discounttype;
	Object discountrate;
	Object realprice;
	Object realamount;
	Object promotionquota;
	java.util.Date expirationdate;
	Long joinedclassid;
	Long relatedassetid;
	String relatedassetcode;
	java.util.Date confirmstartdate;
	java.util.Date confirmenddate;
	String confirmmode;
	Integer confirmstaging;

	public Orderitems() {
	}

}