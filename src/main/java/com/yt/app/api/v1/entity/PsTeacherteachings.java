package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */
@Getter
@Setter
public class PsTeacherteachings implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long teacherid;
	String grade;
	String subject;

	public PsTeacherteachings() {
	}

	public PsTeacherteachings(Long id, Integer version, Long teacherid, String grade, String subject) {
		this.id = id;
		this.version = version;
		this.teacherid = teacherid;
		this.grade = grade;
		this.subject = subject;
	}
}