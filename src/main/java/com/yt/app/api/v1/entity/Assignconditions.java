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
public class Assignconditions implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long conditionid;
  String conditionname4customer;
  String conditionname4teacher;
  Long customerid;
  String customercode;
  String customername;
  Long accountid;
  Long assetid;
  String assetcode;
  Long productid;
  String productcode;
  String productname;
  String categorytype;
  String categorytypename;
  String grade;
  String gradename;
  String subject;
  String subjectname;
  Long roomid;
  String roomcode;
  String roomname;
  Long teacherid;
  String teachername;
  String teacheroacode;
  Long teacherjobid;
  Long teacherjoborgid;
  String teacherjoborgname;
  Integer isfulltimeteacher;
  String courselevel;
  String courselevelname;
  String lessonduration;
  Object lessondurationvalue;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Assignconditions(){
  }
  public Assignconditions(Long id,Integer version,Long conditionid,String conditionname4customer,String conditionname4teacher,Long customerid,String customercode,String customername,Long accountid,Long assetid,String assetcode,Long productid,String productcode,String productname,String categorytype,String categorytypename,String grade,String gradename,String subject,String subjectname,Long roomid,String roomcode,String roomname,Long teacherid,String teachername,String teacheroacode,Long teacherjobid,Long teacherjoborgid,String teacherjoborgname,Integer isfulltimeteacher,String courselevel,String courselevelname,String lessonduration,Object lessondurationvalue,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.conditionid=conditionid;
      this.conditionname4customer=conditionname4customer;
      this.conditionname4teacher=conditionname4teacher;
      this.customerid=customerid;
      this.customercode=customercode;
      this.customername=customername;
      this.accountid=accountid;
      this.assetid=assetid;
      this.assetcode=assetcode;
      this.productid=productid;
      this.productcode=productcode;
      this.productname=productname;
      this.categorytype=categorytype;
      this.categorytypename=categorytypename;
      this.grade=grade;
      this.gradename=gradename;
      this.subject=subject;
      this.subjectname=subjectname;
      this.roomid=roomid;
      this.roomcode=roomcode;
      this.roomname=roomname;
      this.teacherid=teacherid;
      this.teachername=teachername;
      this.teacheroacode=teacheroacode;
      this.teacherjobid=teacherjobid;
      this.teacherjoborgid=teacherjoborgid;
      this.teacherjoborgname=teacherjoborgname;
      this.isfulltimeteacher=isfulltimeteacher;
      this.courselevel=courselevel;
      this.courselevelname=courselevelname;
      this.lessonduration=lessonduration;
      this.lessondurationvalue=lessondurationvalue;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}