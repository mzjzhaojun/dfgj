package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */
@Getter
@Setter
public class Customerassigns implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long assignid;
	Long teacherid;
	Integer isfulltimeteacher;
	Long educatorid;
	Long consultantid;
	Long customerid;
	String customercode;
	Long campusid;
	java.util.Date starttime;
	java.util.Date endtime;
	String categorytype;
	String classtype;
	String ps_classtype;
	String courselevel;
	String subject;
	String grade;
	Object amount;
	Object durationvalue;
	Object confirmprice;
	Object confirmmoney;
	Object amountperhour;
	Object priceperhour;
	java.util.Date createtime;
	Long taskid;

	public Customerassigns() {
	}

	public Customerassigns(Long id, Integer version, Long assignid, Long teacherid, Integer isfulltimeteacher, Long educatorid, Long consultantid,
			Long customerid, String customercode, Long campusid, java.util.Date starttime, java.util.Date endtime, String categorytype,
			String classtype, String ps_classtype, String courselevel, String subject, String grade, Object amount, Object durationvalue,
			Object confirmprice, Object confirmmoney, Object amountperhour, Object priceperhour, java.util.Date createtime, Long taskid) {
		this.id = id;
		this.version = version;
		this.assignid = assignid;
		this.teacherid = teacherid;
		this.isfulltimeteacher = isfulltimeteacher;
		this.educatorid = educatorid;
		this.consultantid = consultantid;
		this.customerid = customerid;
		this.customercode = customercode;
		this.campusid = campusid;
		this.starttime = starttime;
		this.endtime = endtime;
		this.categorytype = categorytype;
		this.classtype = classtype;
		this.ps_classtype = ps_classtype;
		this.courselevel = courselevel;
		this.subject = subject;
		this.grade = grade;
		this.amount = amount;
		this.durationvalue = durationvalue;
		this.confirmprice = confirmprice;
		this.confirmmoney = confirmmoney;
		this.amountperhour = amountperhour;
		this.priceperhour = priceperhour;
		this.createtime = createtime;
		this.taskid = taskid;
	}
}