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
public class Assetconfirms implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String campusname;
  Long customerid;
  String customercode;
  String customername;
  Long accountid;
  Long assetid;
  String assetcode;
  String assettype;
  String assetreftype;
  Long assetrefpid;
  Long assetrefid;
  Object assetmoney;
  Long confirmid;
  Long assignid;
  Integer confirmflag;
  Object confirmmoney;
  String confirmmemo;
  String confirmstatus;
  String confirmtime;
  Long confirmerid;
  String confirmername;
  Long confirmerjobid;
  String confirmerjobname;
  String confirmerjobtype;
  String processstatus;
  String processtime;
  String processmemo;
  Long consultantid;
  String consultantname;
  Long consultantjobid;
  Long educatorid;
  String educatorname;
  Long educatorjobid;
  Long teacherid;
  String teachername;
  Long teacherjobid;
  String starttime;
  String endtime;
  Object durationvalue;
  Object amount;
  Object price;
  Long creatorid;
  String creatorname;
  String createtime;
  public Assetconfirms(){
  }
  public Assetconfirms(Long id,Integer version,Long campusid,String campusname,Long customerid,String customercode,String customername,Long accountid,Long assetid,String assetcode,String assettype,String assetreftype,Long assetrefpid,Long assetrefid,Object assetmoney,Long confirmid,Long assignid,Integer confirmflag,Object confirmmoney,String confirmmemo,String confirmstatus,String confirmtime,Long confirmerid,String confirmername,Long confirmerjobid,String confirmerjobname,String confirmerjobtype,String processstatus,String processtime,String processmemo,Long consultantid,String consultantname,Long consultantjobid,Long educatorid,String educatorname,Long educatorjobid,Long teacherid,String teachername,Long teacherjobid,String starttime,String endtime,Object durationvalue,Object amount,Object price,Long creatorid,String creatorname,String createtime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.customerid=customerid;
      this.customercode=customercode;
      this.customername=customername;
      this.accountid=accountid;
      this.assetid=assetid;
      this.assetcode=assetcode;
      this.assettype=assettype;
      this.assetreftype=assetreftype;
      this.assetrefpid=assetrefpid;
      this.assetrefid=assetrefid;
      this.assetmoney=assetmoney;
      this.confirmid=confirmid;
      this.assignid=assignid;
      this.confirmflag=confirmflag;
      this.confirmmoney=confirmmoney;
      this.confirmmemo=confirmmemo;
      this.confirmstatus=confirmstatus;
      this.confirmtime=confirmtime;
      this.confirmerid=confirmerid;
      this.confirmername=confirmername;
      this.confirmerjobid=confirmerjobid;
      this.confirmerjobname=confirmerjobname;
      this.confirmerjobtype=confirmerjobtype;
      this.processstatus=processstatus;
      this.processtime=processtime;
      this.processmemo=processmemo;
      this.consultantid=consultantid;
      this.consultantname=consultantname;
      this.consultantjobid=consultantjobid;
      this.educatorid=educatorid;
      this.educatorname=educatorname;
      this.educatorjobid=educatorjobid;
      this.teacherid=teacherid;
      this.teachername=teachername;
      this.teacherjobid=teacherjobid;
      this.starttime=starttime;
      this.endtime=endtime;
      this.durationvalue=durationvalue;
      this.amount=amount;
      this.price=price;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
  }
}