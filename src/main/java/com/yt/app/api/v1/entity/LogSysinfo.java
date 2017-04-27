package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */
@Getter
@Setter
public class LogSysinfo implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	String username;
	String userid;
	String userdn;
	String hostaddress;
	String hostname;
	String iever;
	String winver;
	String killinfo;
	String environment;
	java.util.Date log_date;

	public LogSysinfo() {
	}

	public LogSysinfo(Long id, Integer version, String username, String userid, String userdn, String hostaddress, String hostname, String iever,
			String winver, String killinfo, String environment, java.util.Date log_date) {
		this.id = id;
		this.version = version;
		this.username = username;
		this.userid = userid;
		this.userdn = userdn;
		this.hostaddress = hostaddress;
		this.hostname = hostname;
		this.iever = iever;
		this.winver = winver;
		this.killinfo = killinfo;
		this.environment = environment;
		this.log_date = log_date;
	}
}