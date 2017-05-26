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
public class Accountchargepayments implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long applyid;
	String payno;
	java.util.Date paytime;
	Long paytype;
	String payticket;
	Long paystatus;
	Object paymoney;
	String paymemo;
	java.util.Date inputtime;
	java.util.Date swipetime;
	String printstatus;
	String salesman;
	String payer;
	Long payeeid;
	String payeename;
	Long payeejobid;
	String payeejobname;
	Long checkerid;
	String checkername;
	Long checkerjobid;
	String checkerjobname;
	String checkstatus;
	java.util.Date checktime;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;
	String issyn;
	java.util.Date syntime;

	public Accountchargepayments() {
	}

}