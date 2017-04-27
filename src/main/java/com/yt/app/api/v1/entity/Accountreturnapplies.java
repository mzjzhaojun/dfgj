package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/
@Getter
@Setter
public class Accountreturnapplies implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String campusname;
  Long customerid;
  String customercode;
  String customername;
  Long accountid;
  String accountcode;
  String applyno;
  String applystatus;
  String applymemo;
  java.util.Date applytime;
  Long applierid;
  String appliername;
  Long applierjobid;
  String applierjobname;
  String applierjobtype;
  String processstatus;
  java.util.Date processtime;
  String processmemo;
  Long expenseid;
  String expensetype;
  Object expensemoney;
  Long thatdiscountid;
  String thatdiscountcode;
  Object thatdiscountbase;
  Object thatdiscountrate;
  Object thataccountvalue;
  Object thataccountmoney;
  Long thisdiscountid;
  String thisdiscountcode;
  Object thisdiscountbase;
  Object thisdiscountrate;
  Object thisaccountvalue;
  Object thisaccountmoney;
  Long consultantid;
  String consultantname;
  Long consultantjobid;
  Long educatorid;
  String educatorname;
  Long educatorjobid;
  Long submitterid;
  String submittername;
  Long submitterjobid;
  String submitterjobname;
  String submitterjobtype;
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
  public Accountreturnapplies(){
  }
  public Accountreturnapplies(Long id,Integer version,Long campusid,String campusname,Long customerid,String customercode,String customername,Long accountid,String accountcode,String applyno,String applystatus,String applymemo,java.util.Date applytime,Long applierid,String appliername,Long applierjobid,String applierjobname,String applierjobtype,String processstatus,java.util.Date processtime,String processmemo,Long expenseid,String expensetype,Object expensemoney,Long thatdiscountid,String thatdiscountcode,Object thatdiscountbase,Object thatdiscountrate,Object thataccountvalue,Object thataccountmoney,Long thisdiscountid,String thisdiscountcode,Object thisdiscountbase,Object thisdiscountrate,Object thisaccountvalue,Object thisaccountmoney,Long consultantid,String consultantname,Long consultantjobid,Long educatorid,String educatorname,Long educatorjobid,Long submitterid,String submittername,Long submitterjobid,String submitterjobname,String submitterjobtype,java.util.Date submittime,Long approverid,String approvername,Long approverjobid,String approverjobname,java.util.Date approvetime,Long creatorid,String creatorname,java.util.Date createtime,Long modifierid,String modifiername,java.util.Date modifytime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.customerid=customerid;
      this.customercode=customercode;
      this.customername=customername;
      this.accountid=accountid;
      this.accountcode=accountcode;
      this.applyno=applyno;
      this.applystatus=applystatus;
      this.applymemo=applymemo;
      this.applytime=applytime;
      this.applierid=applierid;
      this.appliername=appliername;
      this.applierjobid=applierjobid;
      this.applierjobname=applierjobname;
      this.applierjobtype=applierjobtype;
      this.processstatus=processstatus;
      this.processtime=processtime;
      this.processmemo=processmemo;
      this.expenseid=expenseid;
      this.expensetype=expensetype;
      this.expensemoney=expensemoney;
      this.thatdiscountid=thatdiscountid;
      this.thatdiscountcode=thatdiscountcode;
      this.thatdiscountbase=thatdiscountbase;
      this.thatdiscountrate=thatdiscountrate;
      this.thataccountvalue=thataccountvalue;
      this.thataccountmoney=thataccountmoney;
      this.thisdiscountid=thisdiscountid;
      this.thisdiscountcode=thisdiscountcode;
      this.thisdiscountbase=thisdiscountbase;
      this.thisdiscountrate=thisdiscountrate;
      this.thisaccountvalue=thisaccountvalue;
      this.thisaccountmoney=thisaccountmoney;
      this.consultantid=consultantid;
      this.consultantname=consultantname;
      this.consultantjobid=consultantjobid;
      this.educatorid=educatorid;
      this.educatorname=educatorname;
      this.educatorjobid=educatorjobid;
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