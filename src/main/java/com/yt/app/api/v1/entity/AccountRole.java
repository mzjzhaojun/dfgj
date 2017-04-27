package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-27 17:32:56
 */
@Getter
@Setter
public class AccountRole implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Long account_id;
	Long role_id;

	public AccountRole() {
	}

	public AccountRole(Long id, Long account_id, Long role_id) {
		this.id = id;
		this.account_id = account_id;
		this.role_id = role_id;
	}
}