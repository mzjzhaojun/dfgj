package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yt.app.frame.p.DateTimeUtil;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */
@Getter
@Setter
public class Parents implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	String mp;
	String parentcode;
	String parentname;
	Long gender;
	String gendername;
	String email;
	Long industry;
	String industryname;
	Long career;
	String careername;
	String income;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date birthday;
	Long idtype;
	String idtypename;
	String idnumber;
	String country;
	Long province;
	String provincename;
	Long city;
	String cityname;
	Long county;
	String countyname;
	Long streetname;
	String streetnamename;
	String addressdetail;
	Long creatorid;
	String creatorname;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date modifytime;
	Long tenantcode;

	public Parents() {
	}
}