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
public class RoleMenu implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Long role_id;
	Long menu_id;
	Integer version;

	public RoleMenu() {
	}

	public RoleMenu(Long id, Long role_id, Long menu_id, Integer version) {
		this.id = id;
		this.role_id = role_id;
		this.menu_id = menu_id;
		this.version = version;
	}
}