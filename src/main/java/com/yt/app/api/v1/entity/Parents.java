package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:51
*/
@Getter
@Setter
public class Parents implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String parentcode;
  String parentname;
  String gender;
  String email;
  String industry;
  String career;
  String income;
  java.util.Date birthday;
  String idtype;
  String idnumber;
  String country;
  String province;
  String city;
  String county;
  String streetname;
  String addressdetail;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  Long modifierid;
  String modifiername;
  java.util.Date modifytime;
  Long tenantcode;
  public Parents(){
  }
  public Parents(Long id,Integer version,String parentcode,String parentname,String gender,String email,String industry,String career,String income,java.util.Date birthday,String idtype,String idnumber,String country,String province,String city,String county,String streetname,String addressdetail,Long creatorid,String creatorname,java.util.Date createtime,Long modifierid,String modifiername,java.util.Date modifytime,Long tenantcode){
      this.id=id;
      this.version=version;
      this.parentcode=parentcode;
      this.parentname=parentname;
      this.gender=gender;
      this.email=email;
      this.industry=industry;
      this.career=career;
      this.income=income;
      this.birthday=birthday;
      this.idtype=idtype;
      this.idnumber=idnumber;
      this.country=country;
      this.province=province;
      this.city=city;
      this.county=county;
      this.streetname=streetname;
      this.addressdetail=addressdetail;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
      this.tenantcode=tenantcode;
  }
}