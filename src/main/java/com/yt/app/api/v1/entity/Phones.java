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
public class Phones implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long ownerid;
  Integer itemid;
  Integer isprimary;
  String phonetype;
  String countrycode;
  String areanumber;
  String phonenumber;
  String extension;
  Long creatorid;
  String creatorname;
  String createtime;
  Long tenantcode;
  String versionstarttime;
  String versionendtime;
  public Phones(){
  }
  public Phones(Long id,Integer version,Long ownerid,Integer itemid,Integer isprimary,String phonetype,String countrycode,String areanumber,String phonenumber,String extension,Long creatorid,String creatorname,String createtime,Long tenantcode,String versionstarttime,String versionendtime){
      this.id=id;
      this.version=version;
      this.ownerid=ownerid;
      this.itemid=itemid;
      this.isprimary=isprimary;
      this.phonetype=phonetype;
      this.countrycode=countrycode;
      this.areanumber=areanumber;
      this.phonenumber=phonenumber;
      this.extension=extension;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.tenantcode=tenantcode;
      this.versionstarttime=versionstarttime;
      this.versionendtime=versionendtime;
  }
}