package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:37
*/
@Getter
@Setter
public class Customertransferapplies implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String campusname;
  Long customerid;
  String applystatus;
  java.util.Date applytime;
  String applymemo;
  Long applierid;
  String appliername;
  Long applierjobid;
  String applierjobname;
  String processstatus;
  java.util.Date processtime;
  String processmemo;
  String transfertype;
  Long tocampusid;
  String tocampusname;
  Long submitterid;
  String submittername;
  Long submitterjobid;
  String submitterjobname;
  java.util.Date submittime;
  Long approverid;
  String approvername;
  Long approverjobid;
  String approverjobname;
  java.util.Date approvetime;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  Long modifierid;
  String modifiername;
  java.util.Date modifytime;
  public Customertransferapplies(){
  }
  public Customertransferapplies(Long id,Integer version,Long campusid,String campusname,Long customerid,String applystatus,java.util.Date applytime,String applymemo,Long applierid,String appliername,Long applierjobid,String applierjobname,String processstatus,java.util.Date processtime,String processmemo,String transfertype,Long tocampusid,String tocampusname,Long submitterid,String submittername,Long submitterjobid,String submitterjobname,java.util.Date submittime,Long approverid,String approvername,Long approverjobid,String approverjobname,java.util.Date approvetime,Long creatorid,String creatorname,java.util.Date createtime,Long modifierid,String modifiername,java.util.Date modifytime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.customerid=customerid;
      this.applystatus=applystatus;
      this.applytime=applytime;
      this.applymemo=applymemo;
      this.applierid=applierid;
      this.appliername=appliername;
      this.applierjobid=applierjobid;
      this.applierjobname=applierjobname;
      this.processstatus=processstatus;
      this.processtime=processtime;
      this.processmemo=processmemo;
      this.transfertype=transfertype;
      this.tocampusid=tocampusid;
      this.tocampusname=tocampusname;
      this.submitterid=submitterid;
      this.submittername=submittername;
      this.submitterjobid=submitterjobid;
      this.submitterjobname=submitterjobname;
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