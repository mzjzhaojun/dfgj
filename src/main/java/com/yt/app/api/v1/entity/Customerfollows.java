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
public class Customerfollows implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long orgid;
	String orgname;
	String orgtype;
	Long customerid;
	java.util.Date followtime;
	Long followerid;
	String followername;
	Long followerjobid;
	String followerjobname;
	String followtype;
	String followstage;
	String followobject;
	String followphone;
	String followmemo;
	String talkmainresult;
	String talksubresult;
	String customerlevel;
	String invalidreason;
	String purchaseintention;
	String intensionsubjects;
	Integer isvalidfiling;
	java.util.Date nextfollowtime;
	java.util.Date planverifytime;
	java.util.Date plansigndate;
	Integer isstudythere;
	Integer ispotential;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;

	public Customerfollows() {
	}

	public Customerfollows(Long id, Integer version, Long orgid, String orgname, String orgtype, Long customerid, java.util.Date followtime,
			Long followerid, String followername, Long followerjobid, String followerjobname, String followtype, String followstage,
			String followobject, String followphone, String followmemo, String talkmainresult, String talksubresult, String customerlevel,
			String invalidreason, String purchaseintention, String intensionsubjects, Integer isvalidfiling, java.util.Date nextfollowtime,
			java.util.Date planverifytime, java.util.Date plansigndate, Integer isstudythere, Integer ispotential, Long creatorid,
			String creatorname, java.util.Date createtime, Long modifierid, String modifiername, java.util.Date modifytime) {
		this.id = id;
		this.version = version;
		this.orgid = orgid;
		this.orgname = orgname;
		this.orgtype = orgtype;
		this.customerid = customerid;
		this.followtime = followtime;
		this.followerid = followerid;
		this.followername = followername;
		this.followerjobid = followerjobid;
		this.followerjobname = followerjobname;
		this.followtype = followtype;
		this.followstage = followstage;
		this.followobject = followobject;
		this.followphone = followphone;
		this.followmemo = followmemo;
		this.talkmainresult = talkmainresult;
		this.talksubresult = talksubresult;
		this.customerlevel = customerlevel;
		this.invalidreason = invalidreason;
		this.purchaseintention = purchaseintention;
		this.intensionsubjects = intensionsubjects;
		this.isvalidfiling = isvalidfiling;
		this.nextfollowtime = nextfollowtime;
		this.planverifytime = planverifytime;
		this.plansigndate = plansigndate;
		this.isstudythere = isstudythere;
		this.ispotential = ispotential;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
	}
}