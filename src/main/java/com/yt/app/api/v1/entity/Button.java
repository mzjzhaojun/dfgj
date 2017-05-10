package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version 1.1
 */
@Getter
@Setter
public class Button implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	String name;
	Integer status;
	String remark;
	Integer version;
	String code;
	boolean flag;

	public Button() {
	}

	public Button(Long id, String name, Integer status, String remark) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.remark = remark;
	}
}