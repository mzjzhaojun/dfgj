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
public class Phones implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long ownerid;
	Integer itemid;
	Integer isprimary;
	String phonetype;
	String countrycode;
	String areanumber;
	String phonenumber;
	String extension;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long tenantcode;

	public Phones() {
	}

	public Phones(Long id, Integer version, Long ownerid, Integer itemid, Integer isprimary, String phonetype, String countrycode, String areanumber,
			String phonenumber, String extension, Long creatorid, String creatorname, java.util.Date createtime, Long tenantcode) {
		this.id = id;
		this.version = version;
		this.ownerid = ownerid;
		this.itemid = itemid;
		this.isprimary = isprimary;
		this.phonetype = phonetype;
		this.countrycode = countrycode;
		this.areanumber = areanumber;
		this.phonenumber = phonenumber;
		this.extension = extension;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.tenantcode = tenantcode;
	}
}