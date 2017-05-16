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
 * @createdate 2017-04-27 19:22:22
 */
@Getter
@Setter
public class Teachers implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	String teachercode;
	String teachername;
	String teacheroacode;
	String mp;
	String idnumber;
	String mail;
	String address;
	Long gender;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date birthday;
	String gradememo;
	String subjectmemo;
	String gendername;
	Long status;
	String statusname;

	public Teachers() {
	}

	public Teachers(Long id, Integer version, String teachercode, String teachername, String teacheroacode, Long gender, java.util.Date birthday,
			String gradememo, String subjectmemo) {
		this.id = id;
		this.version = version;
		this.teachercode = teachercode;
		this.teachername = teachername;
		this.teacheroacode = teacheroacode;
		this.gender = gender;
		this.birthday = birthday;
		this.gradememo = gradememo;
		this.subjectmemo = subjectmemo;
	}
}