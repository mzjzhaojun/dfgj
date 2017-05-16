package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
//import com.yt.app.frame.p.DateTimeUtil;
import com.yt.app.frame.p.DateTimeUtil;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */
@Getter
@Setter
public class Categories implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	String category;
	String categoryname;
	Long categorytype;
	Long hascourse;
	Long caninput;
	Long enabled;
	Long creatorid;
	String creatorname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date modifytime;
	String categorytypename;
	String hascoursename;
	String caninputname;
	String enabledname;

	public Categories() {
	}

	public Categories(Long id, Integer version, String category, String categoryname, Long categorytype, Long hascourse, Long caninput, Long enabled,
			Long creatorid, String creatorname, java.util.Date createtime, Long modifierid, String modifiername, java.util.Date modifytime) {
		this.id = id;
		this.version = version;
		this.category = category;
		this.categoryname = categoryname;
		this.categorytype = categorytype;
		this.hascourse = hascourse;
		this.caninput = caninput;
		this.enabled = enabled;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
	}
}