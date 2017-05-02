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
public class Teacherteachings implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long teacherid;
	Long subject;
	Long grade;
	String teachername;
	String subjectname;
	String gradename;

	public Teacherteachings() {
	}

	public Teacherteachings(Long id, Integer version, Long teacherid, Long subject, Long grade) {
		this.id = id;
		this.version = version;
		this.teacherid = teacherid;
		this.subject = subject;
		this.grade = grade;
	}
}