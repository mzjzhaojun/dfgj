package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

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
	String gender;
	java.util.Date birthday;
	String gradememo;
	String subjectmemo;

	public Teachers() {
	}

	public Teachers(Long id, Integer version, String teachercode, String teachername, String teacheroacode, String gender, java.util.Date birthday,
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