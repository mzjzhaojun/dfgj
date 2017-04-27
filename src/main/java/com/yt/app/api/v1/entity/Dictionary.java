package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-19 17:03:14
 */
@Getter
@Setter
public class Dictionary implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Long code;
	String name;
	Long typecode;
	String typename;
	Long parent_id;
	Integer level;
	Integer version;

	public Dictionary() {
	}

	public Dictionary(Long id, Long code, String name, Long typecode, String typename, Long parent_id, Integer level, Integer version) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.typecode = typecode;
		this.typename = typename;
		this.parent_id = parent_id;
		this.level = level;
		this.version = version;
	}
}