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
public class Customerfollowitems implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long followid;
	String subject;
	String institude;
	java.util.Date startdate;
	java.util.Date enddate;

	public Customerfollowitems() {
	}

	public Customerfollowitems(Long id, Integer version, Long followid, String subject, String institude, java.util.Date startdate,
			java.util.Date enddate) {
		this.id = id;
		this.version = version;
		this.followid = followid;
		this.subject = subject;
		this.institude = institude;
		this.startdate = startdate;
		this.enddate = enddate;
	}
}