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
public class CountryCode implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	String cnname;
	String enname;
	Long abbreviation;
	Integer validstatus;

	public CountryCode() {
	}

	public CountryCode(Long id, Integer version, String cnname, String enname, Long abbreviation, Integer validstatus) {
		this.id = id;
		this.version = version;
		this.cnname = cnname;
		this.enname = enname;
		this.abbreviation = abbreviation;
		this.validstatus = validstatus;
	}
}