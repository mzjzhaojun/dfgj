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
public class Customerserviceitems implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long serviceid;
	java.util.Date handletime;
	String handlestatus;
	String handlememo;
	Long handlerid;
	String handlername;
	Long handlerjobid;
	String handlerjobname;

	public Customerserviceitems() {
	}

	public Customerserviceitems(Long id, Integer version, Long serviceid, java.util.Date handletime, String handlestatus, String handlememo,
			Long handlerid, String handlername, Long handlerjobid, String handlerjobname) {
		this.id = id;
		this.version = version;
		this.serviceid = serviceid;
		this.handletime = handletime;
		this.handlestatus = handlestatus;
		this.handlememo = handlememo;
		this.handlerid = handlerid;
		this.handlername = handlername;
		this.handlerjobid = handlerjobid;
		this.handlerjobname = handlerjobname;
	}
}