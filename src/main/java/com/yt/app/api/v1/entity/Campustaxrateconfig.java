package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */
@Getter
@Setter
public class Campustaxrateconfig implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long campusid;
	String campusname;
	String kingdeeorganizationid;
	String kingdeeorganizationname;
	Object taxrate;
	String formula;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;

	public Campustaxrateconfig() {
	}

	public Campustaxrateconfig(Long id, Integer version, Long campusid, String campusname, String kingdeeorganizationid,
			String kingdeeorganizationname, Object taxrate, String formula, Long creatorid, String creatorname, java.util.Date createtime,
			Long modifierid, String modifiername, java.util.Date modifytime) {
		this.id = id;
		this.version = version;
		this.campusid = campusid;
		this.campusname = campusname;
		this.kingdeeorganizationid = kingdeeorganizationid;
		this.kingdeeorganizationname = kingdeeorganizationname;
		this.taxrate = taxrate;
		this.formula = formula;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
	}
}