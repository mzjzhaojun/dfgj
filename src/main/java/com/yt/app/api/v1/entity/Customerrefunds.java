package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */
@Getter
@Setter
public class Customerrefunds implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long refundapplyid;
	Long staffid;
	Long staffjobid;
	Long customerid;
	String customercode;
	Long campusid;
	java.util.Date chargepaytime;
	java.util.Date refundverifytime;
	Object refundrealmoney;
	java.util.Date createtime;
	Long taskid;

	public Customerrefunds() {
	}

	public Customerrefunds(Long id, Integer version, Long refundapplyid, Long staffid, Long staffjobid, Long customerid, String customercode,
			Long campusid, java.util.Date chargepaytime, java.util.Date refundverifytime, Object refundrealmoney, java.util.Date createtime,
			Long taskid) {
		this.id = id;
		this.version = version;
		this.refundapplyid = refundapplyid;
		this.staffid = staffid;
		this.staffjobid = staffjobid;
		this.customerid = customerid;
		this.customercode = customercode;
		this.campusid = campusid;
		this.chargepaytime = chargepaytime;
		this.refundverifytime = refundverifytime;
		this.refundrealmoney = refundrealmoney;
		this.createtime = createtime;
		this.taskid = taskid;
	}
}