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
 * @createdate 2017-04-27 19:22:21
 */
@Getter
@Setter
public class Rooms implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long campusid;
	String campusname;
	String roomcode;
	String roomname;
	Long roomstatus;
	String roomstatusname;
	Long creatorid;
	String creatorname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date modifytime;

	public Rooms() {
	}

	public Rooms(Long id, Integer version, Long campusid, String campusname, String roomcode, String roomname, Long roomstatus, Long creatorid,
			String creatorname, java.util.Date createtime, Long modifierid, String modifiername, java.util.Date modifytime) {
		this.id = id;
		this.version = version;
		this.campusid = campusid;
		this.campusname = campusname;
		this.roomcode = roomcode;
		this.roomname = roomname;
		this.roomstatus = roomstatus;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
	}
}