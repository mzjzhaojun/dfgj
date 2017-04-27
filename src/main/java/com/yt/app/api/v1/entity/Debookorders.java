package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/
@Getter
@Setter
public class Debookorders implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String campusname;
  Long parentid;
  String parentname;
  Long customerid;
  String customercode;
  String customername;
  String debookno;
  java.util.Date debooktime;
  String debookstatus;
  String debookmemo;
  String processstatus;
  java.util.Date processtime;
  String processmemo;
  String contacttel;
  String contacter;
  Long submitterid;
  String submittername;
  Long submitterjobid;
  String submitterjobname;
  String submitterjobtype;
  java.util.Date submittime;
  Long approverid;
  Long approvername;
  Long approverjobid;
  String approverjobname;
  java.util.Date approvetime;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  Long modifierid;
  String modifiername;
  java.util.Date modifytime;
  public Debookorders(){
  }
  public Debookorders(Long id,Integer version,Long campusid,String campusname,Long parentid,String parentname,Long customerid,String customercode,String customername,String debookno,java.util.Date debooktime,String debookstatus,String debookmemo,String processstatus,java.util.Date processtime,String processmemo,String contacttel,String contacter,Long submitterid,String submittername,Long submitterjobid,String submitterjobname,String submitterjobtype,java.util.Date submittime,Long approverid,Long approvername,Long approverjobid,String approverjobname,java.util.Date approvetime,Long creatorid,String creatorname,java.util.Date createtime,Long modifierid,String modifiername,java.util.Date modifytime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.parentid=parentid;
      this.parentname=parentname;
      this.customerid=customerid;
      this.customercode=customercode;
      this.customername=customername;
      this.debookno=debookno;
      this.debooktime=debooktime;
      this.debookstatus=debookstatus;
      this.debookmemo=debookmemo;
      this.processstatus=processstatus;
      this.processtime=processtime;
      this.processmemo=processmemo;
      this.contacttel=contacttel;
      this.contacter=contacter;
      this.submitterid=submitterid;
      this.submittername=submittername;
      this.submitterjobid=submitterjobid;
      this.submitterjobname=submitterjobname;
      this.submitterjobtype=submitterjobtype;
      this.submittime=submittime;
      this.approverid=approverid;
      this.approvername=approvername;
      this.approverjobid=approverjobid;
      this.approverjobname=approverjobname;
      this.approvetime=approvetime;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}