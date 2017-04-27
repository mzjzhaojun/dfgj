package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:47
 */
@Getter
@Setter
public class Customerreplies implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long branchid;
	String branchname;
	Long campusid;
	String campusname;
	Long customerid;
	String customername;
	Long parentid;
	Long parentpassportid;
	String parentname;
	String phonenumber;
	java.util.Date replytime;
	String replyobject;
	String replycontent;
	String replyfrom;
	Long replierid;
	Long replierjobid;
	String repliername;
	String poster;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long fromsystemid;
	String status;

	public Customerreplies() {
	}

	public Customerreplies(Long id, Integer version, Long branchid, String branchname, Long campusid, String campusname, Long customerid,
			String customername, Long parentid, Long parentpassportid, String parentname, String phonenumber, java.util.Date replytime,
			String replyobject, String replycontent, String replyfrom, Long replierid, Long replierjobid, String repliername, String poster,
			Long creatorid, String creatorname, java.util.Date createtime, Long fromsystemid, String status) {
		this.id = id;
		this.version = version;
		this.branchid = branchid;
		this.branchname = branchname;
		this.campusid = campusid;
		this.campusname = campusname;
		this.customerid = customerid;
		this.customername = customername;
		this.parentid = parentid;
		this.parentpassportid = parentpassportid;
		this.parentname = parentname;
		this.phonenumber = phonenumber;
		this.replytime = replytime;
		this.replyobject = replyobject;
		this.replycontent = replycontent;
		this.replyfrom = replyfrom;
		this.replierid = replierid;
		this.replierjobid = replierjobid;
		this.repliername = repliername;
		this.poster = poster;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.fromsystemid = fromsystemid;
		this.status = status;
	}
}