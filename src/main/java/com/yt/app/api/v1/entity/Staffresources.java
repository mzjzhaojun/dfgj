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
public class Staffresources implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long customerid;
  Long staffid;
  String statlocaldate;
  Long campusid;
  String relationtype;
  Integer istodayfollow;
  Integer istodayverify;
  Integer istodaysigned;
  String customerlevel;
  String verifytime;
  String followtime;
  String followstage;
  Long referralstaffid;
  String firstsigntime;
  Long firstsignerid;
  public Staffresources(){
  }
  public Staffresources(Long id,Integer version,Long customerid,Long staffid,String statlocaldate,Long campusid,String relationtype,Integer istodayfollow,Integer istodayverify,Integer istodaysigned,String customerlevel,String verifytime,String followtime,String followstage,Long referralstaffid,String firstsigntime,Long firstsignerid){
      this.id=id;
      this.version=version;
      this.customerid=customerid;
      this.staffid=staffid;
      this.statlocaldate=statlocaldate;
      this.campusid=campusid;
      this.relationtype=relationtype;
      this.istodayfollow=istodayfollow;
      this.istodayverify=istodayverify;
      this.istodaysigned=istodaysigned;
      this.customerlevel=customerlevel;
      this.verifytime=verifytime;
      this.followtime=followtime;
      this.followstage=followstage;
      this.referralstaffid=referralstaffid;
      this.firstsigntime=firstsigntime;
      this.firstsignerid=firstsignerid;
  }
}