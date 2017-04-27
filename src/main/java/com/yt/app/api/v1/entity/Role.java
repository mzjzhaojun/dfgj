package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */
@Getter
@Setter
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	String name;
	Integer type;
	Integer is_manage;
	Integer version;
	String menucode;
	String typename;
	String is_managename;

	public Role() {
	}

	public Role(Long id, String name, Integer type, Integer is_manage, Integer version) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.is_manage = is_manage;
		this.version = version;
	}
}