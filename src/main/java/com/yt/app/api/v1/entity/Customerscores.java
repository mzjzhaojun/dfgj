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
public class Customerscores implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long campusid;
	String campusname;
	Long customerid;
	String scoretype;
	String scoregrade;
	String studyyear;
	String studyterm;
	String studystage;
	Integer classpeoples;
	String satisficing;
	String studenttype;
	String admissiontype;
	String admissionschool;
	String otherscoretypename;
	Integer iskeycollege;
	Integer isalladded;
	Integer examinemonth;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;

	public Customerscores() {
	}

	public Customerscores(Long id, Integer version, Long campusid, String campusname, Long customerid, String scoretype, String scoregrade,
			String studyyear, String studyterm, String studystage, Integer classpeoples, String satisficing, String studenttype,
			String admissiontype, String admissionschool, String otherscoretypename, Integer iskeycollege, Integer isalladded, Integer examinemonth,
			Long creatorid, String creatorname, java.util.Date createtime, Long modifierid, String modifiername, java.util.Date modifytime) {
		this.id = id;
		this.version = version;
		this.campusid = campusid;
		this.campusname = campusname;
		this.customerid = customerid;
		this.scoretype = scoretype;
		this.scoregrade = scoregrade;
		this.studyyear = studyyear;
		this.studyterm = studyterm;
		this.studystage = studystage;
		this.classpeoples = classpeoples;
		this.satisficing = satisficing;
		this.studenttype = studenttype;
		this.admissiontype = admissiontype;
		this.admissionschool = admissionschool;
		this.otherscoretypename = otherscoretypename;
		this.iskeycollege = iskeycollege;
		this.isalladded = isalladded;
		this.examinemonth = examinemonth;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
	}
}