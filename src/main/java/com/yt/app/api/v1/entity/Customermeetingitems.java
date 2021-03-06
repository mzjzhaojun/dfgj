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
public class Customermeetingitems implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long meetingid;
	String objecttype;
	String objectname;
	String contenttype;
	String contentdata;

	public Customermeetingitems() {
	}

	public Customermeetingitems(Long id, Integer version, Long meetingid, String objecttype, String objectname, String contenttype, String contentdata) {
		this.id = id;
		this.version = version;
		this.meetingid = meetingid;
		this.objecttype = objecttype;
		this.objectname = objectname;
		this.contenttype = contenttype;
		this.contentdata = contentdata;
	}
}