package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/
@Getter
@Setter
public class Orders implements Serializable{

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
  String customergrade;
  String customergradename;
  Long accountid;
  String accountcode;
  String orderno;
  java.util.Date ordertime;
  String orderkind;
  String ordertype;
  String orderstatus;
  String specialtype;
  String specialmemo;
  String processstatus;
  java.util.Date processtime;
  String processmemo;
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
  Long approvername;
  Long approverjobid;
  String approverjobname;
  java.util.Date approvetime;
  Long chargeapplyid;
  String chargeapplymemo;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  Long modifierid;
  String modifiername;
  java.util.Date modifytime;
  public Orders(){
  }
  public Orders(Long id,Integer version,Long campusid,String campusname,Long parentid,String parentname,Long customerid,String customercode,String customername,String customergrade,String customergradename,Long accountid,String accountcode,String orderno,java.util.Date ordertime,String orderkind,String ordertype,String orderstatus,String specialtype,String specialmemo,String processstatus,java.util.Date processtime,String processmemo,Long consultantid,String consultantname,Long consultantjobid,Long educatorid,String educatorname,Long educatorjobid,Long submitterid,String submittername,Long submitterjobid,String submitterjobname,String submitterjobtype,java.util.Date submittime,Long approverid,Long approvername,Long approverjobid,String approverjobname,java.util.Date approvetime,Long chargeapplyid,String chargeapplymemo,Long creatorid,String creatorname,java.util.Date createtime,Long modifierid,String modifiername,java.util.Date modifytime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.parentid=parentid;
      this.parentname=parentname;
      this.customerid=customerid;
      this.customercode=customercode;
      this.customername=customername;
      this.customergrade=customergrade;
      this.customergradename=customergradename;
      this.accountid=accountid;
      this.accountcode=accountcode;
      this.orderno=orderno;
      this.ordertime=ordertime;
      this.orderkind=orderkind;
      this.ordertype=ordertype;
      this.orderstatus=orderstatus;
      this.specialtype=specialtype;
      this.specialmemo=specialmemo;
      this.processstatus=processstatus;
      this.processtime=processtime;
      this.processmemo=processmemo;
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
      this.chargeapplyid=chargeapplyid;
      this.chargeapplymemo=chargeapplymemo;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}