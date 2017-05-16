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
 * @createdate 2017-04-27 19:22:17
 */
@Getter
@Setter
public class Jobcode implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	String name;
	Long type;
	Long status;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date createtime;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date modifytime;
	String typename;
	String statusname;

	public Jobcode() {
	}

	public Jobcode(Long id, String name, Long type, Long status, java.util.Date createtime, java.util.Date modifytime) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.status = status;
		this.createtime = createtime;
		this.modifytime = modifytime;
	}
}