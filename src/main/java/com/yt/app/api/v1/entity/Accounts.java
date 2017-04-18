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
public class Accounts implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long customerid;
  Long accountid;
  String accountcode;
  String accounttype;
  String accountmemo;
  String accountstatus;
  Object accountmoney;
  Long discountid;
  String discountcode;
  Object discountrate;
  Object discountbase;
  Long chargeapplyid;
  String chargepaytime;
  String firstchargepaytime;
  Long firstchargeapplyid;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  String versionstarttime;
  String versionendtime;
  public Accounts(){
  }
  public Accounts(Long id,Integer version,Long customerid,Long accountid,String accountcode,String accounttype,String accountmemo,String accountstatus,Object accountmoney,Long discountid,String discountcode,Object discountrate,Object discountbase,Long chargeapplyid,String chargepaytime,String firstchargepaytime,Long firstchargeapplyid,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime,String versionstarttime,String versionendtime){
      this.id=id;
      this.version=version;
      this.customerid=customerid;
      this.accountid=accountid;
      this.accountcode=accountcode;
      this.accounttype=accounttype;
      this.accountmemo=accountmemo;
      this.accountstatus=accountstatus;
      this.accountmoney=accountmoney;
      this.discountid=discountid;
      this.discountcode=discountcode;
      this.discountrate=discountrate;
      this.discountbase=discountbase;
      this.chargeapplyid=chargeapplyid;
      this.chargepaytime=chargepaytime;
      this.firstchargepaytime=firstchargepaytime;
      this.firstchargeapplyid=firstchargeapplyid;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
      this.versionstarttime=versionstarttime;
      this.versionendtime=versionendtime;
  }
}