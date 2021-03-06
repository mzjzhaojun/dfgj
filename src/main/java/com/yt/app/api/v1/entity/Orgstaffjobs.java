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
public class Orgstaffjobs implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long regionid;
	Long branchid;
	Long campusid;
	Long staffid;
	String staffname;
	Long staffjobtype;
	Long staffjobid;
	String branchidname;
	String campusidname;
	String staffjobtypename;
	String staffjobidname;

	public Orgstaffjobs() {
	}

	public Orgstaffjobs(Long id, Integer version, Long regionid, Long branchid, Long campusid, Long staffid, String staffname, Long staffjobtype) {
		this.id = id;
		this.version = version;
		this.regionid = regionid;
		this.branchid = branchid;
		this.campusid = campusid;
		this.staffid = staffid;
		this.staffname = staffname;
		this.staffjobtype = staffjobtype;
	}
}