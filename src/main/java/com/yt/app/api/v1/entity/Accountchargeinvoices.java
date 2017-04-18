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
public class Accountchargeinvoices implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long applyid;
  Long invoiceid;
  String invoiceno;
  Object invoicemoney;
  String invoiceclauses;
  String invoiceheader;
  String invoicetime;
  String invoicememo;
  String invoicestatus;
  String isdiscarded;
  String returntime;
  String returnmemo;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Accountchargeinvoices(){
  }
  public Accountchargeinvoices(Long id,Integer version,Long applyid,Long invoiceid,String invoiceno,Object invoicemoney,String invoiceclauses,String invoiceheader,String invoicetime,String invoicememo,String invoicestatus,String isdiscarded,String returntime,String returnmemo,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.applyid=applyid;
      this.invoiceid=invoiceid;
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