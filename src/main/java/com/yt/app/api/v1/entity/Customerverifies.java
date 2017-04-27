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
public class Customerverifies implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long campusid;
	String campusname;
	Long customerid;
	java.util.Date verifytime;
	Long verifierid;
	String verifiername;
	Long verifierjobid;
	String verifierjobname;
	String verifypeoples;
	String verifyrelations;
	java.util.Date planverifytime;
	Integer isinvited;
	Integer issigned;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;

	public Customerverifies() {
	}

	public Customerverifies(Long id, Integer version, Long campusid, String campusname, Long customerid, java.util.Date verifytime, Long verifierid,
			String verifiername, Long verifierjobid, String verifierjobname, String verifypeoples, String verifyrelations,
			java.util.Date planverifytime, Integer isinvited, Integer issigned, Long creatorid, String creatorname, java.util.Date createtime) {
		this.id = id;
		this.version = version;
		this.campusid = campusid;
		this.campusname = campusname;
		this.customerid = customerid;
		this.verifytime = verifytime;
		this.verifierid = verifierid;
		this.verifiername = verifiername;
		this.verifierjobid = verifierjobid;
		this.verifierjobname = verifierjobname;
		this.verifypeoples = verifypeoples;
		this.verifyrelations = verifyrelations;
		this.planverifytime = planverifytime;
		this.isinvited = isinvited;
		this.issigned = issigned;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
	}
}