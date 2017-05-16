package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yt.app.frame.p.DateTimeUtil;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
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
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date followtime;
	Long followerid;
	String followername;
	Long followerjobid;
	String followerjobname;
	Long followtype;
	String followtypename;
	Long followstage;
	String followstagename;
	Long followobject;
	String followobjectname;
	String followphone;
	String followmemo;
	Long talkmainresult;
	String talkmainresultname;
	String talksubresult;
	Long customerlevel;
	String customerlevelname;
	Long invalidreason;
	String invalidreasonname;
	Long purchaseintention;
	Long intensionsubjects;
	Long isvalidfiling;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date nextfollowtime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date planverifytime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date plansigndate;
	Long isstudythere;
	Long ispotential;
	String ispotentialname;
	Long creatorid;
	String creatorname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date modifytime;

	public Customerfollows() {
	}

}