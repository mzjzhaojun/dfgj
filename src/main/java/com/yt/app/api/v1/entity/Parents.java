package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/
@Getter
@Setter
public class Parents implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long parentid;
  String parentcode;
  String parentname;
  String gender;
  String email;
  String industry;
  String career;
  String income;
  String birthday;
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
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  Long tenantcode;
  String versionstarttime;
  String versionendtime;
  public Parents(){
  }
  public Parents(Long id,Integer version,Long parentid,String parentcode,String parentname,String gender,String email,String industry,String career,String income,String birthday,String idtype,String idnumber,String country,String province,String city,String county,String streetname,String addressdetail,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime,Long tenantcode,String versionstarttime,String versionendtime){
      this.id=id;
      this.version=version;
      this.parentid=parentid;
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
      this.versionstarttime=versionstarttime;
      this.versionendtime=versionendtime;
  }
}