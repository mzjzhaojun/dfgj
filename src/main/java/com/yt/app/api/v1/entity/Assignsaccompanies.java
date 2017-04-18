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
public class Assignsaccompanies implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long assignid;
  String assigntime;
  String assignstatus;
  Long campusid;
  String campusname;
  Object assignprice;
  String assignsource;
  String assignmemo;
  Integer copyallowed;
  Long confirmid;
  String confirmtime;
  String confirmstatus;
  Object confirmprice;
  Long assetid;
  String assetcode;
  Long customerid;
  Long accountid;
  String customercode;
  String customername;
  Long productid;
  String productcode;
  String productname;
  String categorytype;
  String categorytypename;
  Long roomid;
  String roomcode;
  String roomname;
  Long teacherid;
  String teachername;
  Long teacherjobid;
  Long teacherjoborgid;
  String teacherjoborgname;
  String teacheroacode;
  Integer isfulltimeteacher;
  Long consultantid;
  String consultantname;
  Long consultantjobid;
  Long educatorid;
  String educatorname;
  Long educatorjobid;
  String grade;
  String gradename;
  String subject;
  String subjectname;
  Object durationvalue;
  Object amount;
  String starttime;
  String endtime;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Assignsaccompanies(){
  }
  public Assignsaccompanies(Long id,Integer version,Long assignid,String assigntime,String assignstatus,Long campusid,String campusname,Object assignprice,String assignsource,String assignmemo,Integer copyallowed,Long confirmid,String confirmtime,String confirmstatus,Object confirmprice,Long assetid,String assetcode,Long customerid,Long accountid,String customercode,String customername,Long productid,String productcode,String productname,String categorytype,String categorytypename,Long roomid,String roomcode,String roomname,Long teacherid,String teachername,Long teacherjobid,Long teacherjoborgid,String teacherjoborgname,String teacheroacode,Integer isfulltimeteacher,Long consultantid,String consultantname,Long consultantjobid,Long educatorid,String educatorname,Long educatorjobid,String grade,String gradename,String subject,String subjectname,Object durationvalue,Object amount,String starttime,String endtime,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.assignid=assignid;
      this.assigntime=assigntime;
      this.assignstatus=assignstatus;
      this.campusid=campusid;
      this.campusname=campusname;
      this.assignprice=assignprice;
      this.assignsource=assignsource;
      this.assignmemo=assignmemo;
      this.copyallowed=copyallowed;
      this.confirmid=confirmid;
      this.confirmtime=confirmtime;
      this.confirmstatus=confirmstatus;
      this.confirmprice=confirmprice;
      this.assetid=assetid;
      this.assetcode=assetcode;
      this.customerid=customerid;
      this.accountid=accountid;
      this.customercode=customercode;
      this.customername=customername;
      this.productid=productid;
      this.productcode=productcode;
      this.productname=productname;
      this.categorytype=categorytype;
      this.categorytypename=categorytypename;
      this.roomid=roomid;
      this.roomcode=roomcode;
      this.roomname=roomname;
      this.teacherid=teacherid;
      this.teachername=teachername;
      this.teacherjobid=teacherjobid;
      this.teacherjoborgid=teacherjoborgid;
      this.teacherjoborgname=teacherjoborgname;
      this.teacheroacode=teacheroacode;
      this.isfulltimeteacher=isfulltimeteacher;
      this.consultantid=consultantid;
      this.consultantname=consultantname;
      this.consultantjobid=consultantjobid;
      this.educatorid=educatorid;
      this.educatorname=educatorname;
      this.educatorjobid=educatorjobid;
      this.grade=grade;
      this.gradename=gradename;
      this.subject=subject;
      this.subjectname=subjectname;
      this.durationvalue=durationvalue;
      this.amount=amount;
      this.starttime=starttime;
      this.endtime=endtime;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}