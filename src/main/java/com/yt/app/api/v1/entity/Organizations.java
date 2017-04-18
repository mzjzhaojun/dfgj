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
public class Organizations implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long organizationid;
  String codename;
  String name;
  String shortname;
  String departmenttype;
  String legalentitycode;
  String legalentity;
  Long managerid;
  String orgtype;
  Object campusarea;
  Object campususingarea;
  Long cityid;
  String cityname;
  String fullpath;
  String deliverdate;
  String versionstarttime;
  String versionendtime;
  String bistatus;
  String status;
  public Organizations(){
  }
  public Organizations(Long id,Integer version,Long organizationid,String codename,String name,String shortname,String departmenttype,String legalentitycode,String legalentity,Long managerid,String orgtype,Object campusarea,Object campususingarea,Long cityid,String cityname,String fullpath,String deliverdate,String versionstarttime,String versionendtime,String bistatus,String status){
      this.id=id;
      this.version=version;
      this.organizationid=organizationid;
      this.codename=codename;
      this.name=name;
      this.shortname=shortname;
      this.departmenttype=departmenttype;
      this.legalentitycode=legalentitycode;
      this.legalentity=legalentity;
      this.managerid=managerid;
      this.orgtype=orgtype;
      this.campusarea=campusarea;
      this.campususingarea=campususingarea;
      this.cityid=cityid;
      this.cityname=cityname;
      this.fullpath=fullpath;
      this.deliverdate=deliverdate;
      this.versionstarttime=versionstarttime;
      this.versionendtime=versionendtime;
      this.bistatus=bistatus;
      this.status=status;
  }
}