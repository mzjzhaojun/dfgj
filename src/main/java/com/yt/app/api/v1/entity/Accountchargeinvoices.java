package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:16
*/
@Getter
@Setter
public class Accountchargeinvoices implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long applyid;
  String invoiceno;
  Object invoicemoney;
  String invoiceclauses;
  String invoiceheader;
  java.util.Date invoicetime;
  String invoicememo;
  String invoicestatus;
  String isdiscarded;
  java.util.Date returntime;
  String returnmemo;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  Long modifierid;
  String modifiername;
  java.util.Date modifytime;
  public Accountchargeinvoices(){
  }
  public Accountchargeinvoices(Long id,Integer version,Long applyid,String invoiceno,Object invoicemoney,String invoiceclauses,String invoiceheader,java.util.Date invoicetime,String invoicememo,String invoicestatus,String isdiscarded,java.util.Date returntime,String returnmemo,Long creatorid,String creatorname,java.util.Date createtime,Long modifierid,String modifiername,java.util.Date modifytime){
      this.id=id;
      this.version=version;
      this.applyid=applyid;
      this.invoiceno=invoiceno;
      this.invoicemoney=invoicemoney;
      this.invoiceclauses=invoiceclauses;
      this.invoiceheader=invoiceheader;
      this.invoicetime=invoicetime;
      this.invoicememo=invoicememo;
      this.invoicestatus=invoicestatus;
      this.isdiscarded=isdiscarded;
      this.returntime=returntime;
      this.returnmemo=returnmemo;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}