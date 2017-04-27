package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */
@Getter
@Setter
public class Productsexofcourse implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Integer lessoncount;
	String lessonduration;
	Object lessondurationvalue;
	String periodduration;
	Object perioddurationvalue;
	Object periodsoflesson;
	String courselevel;
	String coachtype;
	String grouptype;
	String classtype;
	Integer minpeoples;
	Integer maxpeoples;
	String incomebelonging;
	Integer iscrosscampus;

	public Productsexofcourse() {
	}

	public Productsexofcourse(Long id, Integer version, Integer lessoncount, String lessonduration, Object lessondurationvalue,
			String periodduration, Object perioddurationvalue, Object periodsoflesson, String courselevel, String coachtype, String grouptype,
			String classtype, Integer minpeoples, Integer maxpeoples, String incomebelonging, Integer iscrosscampus) {
		this.id = id;
		this.version = version;
		this.lessoncount = lessoncount;
		this.lessonduration = lessonduration;
		this.lessondurationvalue = lessondurationvalue;
		this.periodduration = periodduration;
		this.perioddurationvalue = perioddurationvalue;
		this.periodsoflesson = periodsoflesson;
		this.courselevel = courselevel;
		this.coachtype = coachtype;
		this.grouptype = grouptype;
		this.classtype = classtype;
		this.minpeoples = minpeoples;
		this.maxpeoples = maxpeoples;
		this.incomebelonging = incomebelonging;
		this.iscrosscampus = iscrosscampus;
	}
}