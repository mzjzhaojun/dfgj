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
public class Educatebranchcrmmonthsum implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long regionid;
	Long branchid;
	Integer year;
	Integer month;
	Integer classpeoplecount;
	Integer initialeffective;
	Integer neweffective;
	Integer classhours;
	Integer finaleffective;
	Integer renewalcount;
	Integer endclasscount;
	Integer refundcount;
	Integer remaininghourscount;
	Integer outschoolwarningcount;
	Integer closedwarningcount;
	Integer refundwarningcount;
	Integer waitvisitingcount;
	Integer waitweekfeedbackcount;
	Integer waitmeetingcount;
	Integer waitordercount;
	Integer birthdaytoday;
	Integer birthdayfuture;
	Integer managestudentcount;
	Integer validstudentcount;
	Integer noclassstudentcount;
	Integer closedstudentcount;
	Integer outschoolstudentcount;
	Integer onlystudentcount;
	Integer noorderstudentcount;
	Integer introducecount;
	Integer switchcount;
	Integer receivecount;
	Integer newclosedcount;
	Integer closedactivationcount;
	Integer newoutschoolcount;
	Integer outschoolactivationcount;
	java.util.Date createtime;

	public Educatebranchcrmmonthsum() {
	}

	public Educatebranchcrmmonthsum(Long id, Integer version, Long regionid, Long branchid, Integer year, Integer month, Integer classpeoplecount,
			Integer initialeffective, Integer neweffective, Integer classhours, Integer finaleffective, Integer renewalcount, Integer endclasscount,
			Integer refundcount, Integer remaininghourscount, Integer outschoolwarningcount, Integer closedwarningcount, Integer refundwarningcount,
			Integer waitvisitingcount, Integer waitweekfeedbackcount, Integer waitmeetingcount, Integer waitordercount, Integer birthdaytoday,
			Integer birthdayfuture, Integer managestudentcount, Integer validstudentcount, Integer noclassstudentcount, Integer closedstudentcount,
			Integer outschoolstudentcount, Integer onlystudentcount, Integer noorderstudentcount, Integer introducecount, Integer switchcount,
			Integer receivecount, Integer newclosedcount, Integer closedactivationcount, Integer newoutschoolcount, Integer outschoolactivationcount,
			java.util.Date createtime) {
		this.id = id;
		this.version = version;
		this.regionid = regionid;
		this.branchid = branchid;
		this.year = year;
		this.month = month;
		this.classpeoplecount = classpeoplecount;
		this.initialeffective = initialeffective;
		this.neweffective = neweffective;
		this.classhours = classhours;
		this.finaleffective = finaleffective;
		this.renewalcount = renewalcount;
		this.endclasscount = endclasscount;
		this.refundcount = refundcount;
		this.remaininghourscount = remaininghourscount;
		this.outschoolwarningcount = outschoolwarningcount;
		this.closedwarningcount = closedwarningcount;
		this.refundwarningcount = refundwarningcount;
		this.waitvisitingcount = waitvisitingcount;
		this.waitweekfeedbackcount = waitweekfeedbackcount;
		this.waitmeetingcount = waitmeetingcount;
		this.waitordercount = waitordercount;
		this.birthdaytoday = birthdaytoday;
		this.birthdayfuture = birthdayfuture;
		this.managestudentcount = managestudentcount;
		this.validstudentcount = validstudentcount;
		this.noclassstudentcount = noclassstudentcount;
		this.closedstudentcount = closedstudentcount;
		this.outschoolstudentcount = outschoolstudentcount;
		this.onlystudentcount = onlystudentcount;
		this.noorderstudentcount = noorderstudentcount;
		this.introducecount = introducecount;
		this.switchcount = switchcount;
		this.receivecount = receivecount;
		this.newclosedcount = newclosedcount;
		this.closedactivationcount = closedactivationcount;
		this.newoutschoolcount = newoutschoolcount;
		this.outschoolactivationcount = outschoolactivationcount;
		this.createtime = createtime;
	}
}