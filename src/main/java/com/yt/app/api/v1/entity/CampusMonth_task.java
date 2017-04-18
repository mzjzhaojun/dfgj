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
public class CampusMonth_task implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Long campusid;
  String campusname;
  String tasktype;
  Integer year;
  Object m01;
  Object m02;
  Object m03;
  Object m04;
  Object m05;
  Object m06;
  Object m07;
  Object m08;
  Object m09;
  Object m10;
  Object m11;
  Object m12;
  String createtime;
  Long creatorid;
  String creatorname;
  String creatorjobname;
  String modifytime;
  Long modifierid;
  String modifiername;
  String modifierjobname;
  public CampusMonth_task(){
  }
  public CampusMonth_task(Long id,Integer version,Long regionid,Long branchid,Long campusid,String campusname,String tasktype,Integer year,Object m01,Object m02,Object m03,Object m04,Object m05,Object m06,Object m07,Object m08,Object m09,Object m10,Object m11,Object m12,String createtime,Long creatorid,String creatorname,String creatorjobname,String modifytime,Long modifierid,String modifiername,String modifierjobname){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.campusid=campusid;
      this.campusname=campusname;
      this.tasktype=tasktype;
      this.year=year;
      this.m01=m01;
      this.m02=m02;
      this.m03=m03;
      this.m04=m04;
      this.m05=m05;
      this.m06=m06;
      this.m07=m07;
      this.m08=m08;
      this.m09=m09;
      this.m10=m10;
      this.m11=m11;
      this.m12=m12;
      this.createtime=createtime;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.creatorjobname=creatorjobname;
      this.modifytime=modifytime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifierjobname=modifierjobname;
  }
}