package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/
@Getter
@Setter
public class Campuses implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String campusname;
  String campusshortname;
  Long branchid;
  String branchname;
  String branchshortname;
  Long regionid;
  String regionname;
  String regionshortname;
  public Campuses(){
  }
  public Campuses(Long id,Integer version,Long campusid,String campusname,String campusshortname,Long branchid,String branchname,String branchshortname,Long regionid,String regionname,String regionshortname){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.campusshortname=campusshortname;
      this.branchid=branchid;
      this.branchname=branchname;
      this.branchshortname=branchshortname;
      this.regionid=regionid;
      this.regionname=regionname;
      this.regionshortname=regionshortname;
  }
}