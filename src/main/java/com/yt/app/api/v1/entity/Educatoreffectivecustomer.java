package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:48
 */
@Getter
@Setter
public class Educatoreffectivecustomer implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long campusid;
	Long educatorid;
	Long educatorjobid;
	String educatorname;
	Integer customernumber;
	java.util.Date createtime;
	Long taskid;

	public Educatoreffectivecustomer() {
	}

	public Educatoreffectivecustomer(Long id, Integer version, Long campusid, Long educatorid, Long educatorjobid, String educatorname,
			Integer customernumber, java.util.Date createtime, Long taskid) {
		this.id = id;
		this.version = version;
		this.campusid = campusid;
		this.educatorid = educatorid;
		this.educatorjobid = educatorjobid;
		this.educatorname = educatorname;
		this.customernumber = customernumber;
		this.createtime = createtime;
		this.taskid = taskid;
	}
}