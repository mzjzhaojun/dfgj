package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:50
*/
@Getter
@Setter
public class Teacherjobs implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String jobname;
  Long joborgid;
  String joborgname;
  String joborgtype;
  String jobstatus;
  Long teacherid;
  Long campusid;
  String campusname;
  Integer isfulltime;
  public Teacherjobs(){
  }
  public Teacherjobs(Long id,Integer version,String jobname,Long joborgid,String joborgname,String joborgtype,String jobstatus,Long teacherid,Long campusid,String campusname,Integer isfulltime){
      this.id=id;
      this.version=version;
      this.jobname=jobname;
      this.joborgid=joborgid;
      this.joborgname=joborgname;
      this.joborgtype=joborgtype;
      this.jobstatus=jobstatus;
      this.teacherid=teacherid;
      this.campusid=campusid;
      this.campusname=campusname;
      this.isfulltime=isfulltime;
  }
}