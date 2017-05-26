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
 * @createdate 2017-04-27 19:22:21
 */
@Getter
@Setter
public class Potentialcustomers implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long orgid;
	String orgname;
	String orgtype;
	Long campusid;
	String mp;
	String campusname;
	String customercode;
	String customername;
	Long customerlevel;
	String customerlevelname;
	Long invalidreason;
	String invalidreasonname;
	Long customerstatus;
	String customerstatusname;
	Long isoneparent;
	String isoneparentname;
	String describes;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date birthday;
	Long gender;
	String gendername;
	String email;
	Long idtype;
	String idtypename;
	String idnumber;
	Long viptype;
	String viptypename;
	Long viplevel;
	String viplevelname;
	Long entrancegrade;
	String entrancegradename;
	Long grade;
	String gradename;
	Long schoolyear;
	String schoolyearname;
	Long subjecttype;
	String subjecttypename;
	Long studenttype;
	String studenttypename;
	Long contacttype;
	String contacttypename;
	Long sourcemaintype;
	String sourcemaintypename;
	Long sourcesubtype;
	String sourcesystem;
	Long referralstaffid;
	String referralstaffname;
	Long referralstaffjobid;
	String referralstaffjobname;
	String referralstaffoacode;
	Long referralcustomerid;
	String referralcustomercode;
	String referralcustomername;
	Long purchaseintention;
	String purchaseintentionname;
	Long schoolid;
	String schoolname;
	Long isstudyagain;
	String isstudyagainname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date followtime;
	Long followstage;
	String followstagename;
	Integer followedcount;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date nextfollowtime;
	Long creatorid;
	String creatorname;
	Long creatorjobid;
	String creatorjobname;
	String creatorjobtype;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date modifytime;
	Long principalid;
	String principalname;

	public Potentialcustomers() {
	}
}