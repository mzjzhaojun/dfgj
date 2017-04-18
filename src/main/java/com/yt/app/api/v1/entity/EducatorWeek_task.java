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
public class EducatorWeek_task implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Long campusid;
  String campusname;
  Long staffid;
  String staffoacode;
  String staffname;
  Long customerid;
  Long customercode;
  String customername;
  String customergrade;
  String studentstatus;
  String tasktype;
  Integer year;
  Integer month;
  Object w1;
  Object w2;
  Object w3;
  Object w4;
  Object w5;
  Object w6;
  String createtime;
  Long creatorid;
  String creatorname;
  String creatorjobname;
  String modifytime;
  Long modifierid;
  String modifiername;
  String modifierjobname;
  public EducatorWeek_task(){
  }
  public EducatorWeek_task(Long id,Integer version,Long regionid,Long branchid,Long campusid,String campusname,Long staffid,String staffoacode,String staffname,Long customerid,Long customercode,String customername,String customergrade,String studentstatus,String tasktype,Integer year,Integer month,Object w1,Object w2,Object w3,Object w4,Object w5,Object w6,String createtime,Long creatorid,String creatorname,String creatorjobname,String modifytime,Long modifierid,String modifiername,String modifierjobname){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.campusid=campusid;
      this.campusname=campusname;
      this.staffid=staffid;
      this.staffoacode=staffoacode;
      this.staffname=staffname;
      this.customerid=customerid;
      this.customercode=customercode;
      this.customername=customername;
      this.customergrade=customergrade;
      this.studentstatus=studentstatus;
      this.tasktype=tasktype;
      this.year=year;
      this.month=month;
      this.w1=w1;
      this.w2=w2;
      this.w3=w3;
      this.w4=w4;
      this.w5=w5;
      this.w6=w6;
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