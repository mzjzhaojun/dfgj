package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/
@Getter
@Setter
public class Customerparentrelations implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long customerid;
  String customerrole;
  Long parentid;
  String parentrole;
  Integer isprimary;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  String versionstarttime;
  String versionendtime;
  Long tenantcode;
  public Customerparentrelations(){
  }
  public Customerparentrelations(Long id,Integer version,Long customerid,String customerrole,Long parentid,String parentrole,Integer isprimary,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime,String versionstarttime,String versionendtime,Long tenantcode){
      this.id=id;
      this.version=version;
      this.customerid=customerid;
      this.customerrole=customerrole;
      this.parentid=parentid;
      this.parentrole=parentrole;
      this.isprimary=isprimary;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
      this.versionstarttime=versionstarttime;
      this.versionendtime=versionendtime;
      this.tenantcode=tenantcode;
  }
}