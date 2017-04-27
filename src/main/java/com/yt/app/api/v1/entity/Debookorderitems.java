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
public class Debookorderitems implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long debookid;
  Long assetid;
  Long accountid;
  String accountcode;
  Object debookamount;
  Object debookmoney;
  Object presentamountofdebook;
  Object returnmoney;
  Object confirmedamount;
  Object confirmedmoney;
  Object assignedamount;
  Object assignedmoney;
  public Debookorderitems(){
  }
  public Debookorderitems(Long id,Integer version,Long debookid,Long assetid,Long accountid,String accountcode,Object debookamount,Object debookmoney,Object presentamountofdebook,Object returnmoney,Object confirmedamount,Object confirmedmoney,Object assignedamount,Object assignedmoney){
      this.id=id;
      this.version=version;
      this.debookid=debookid;
      this.assetid=assetid;
      this.accountid=accountid;
      this.accountcode=accountcode;
      this.debookamount=debookamount;
      this.debookmoney=debookmoney;
      this.presentamountofdebook=presentamountofdebook;
      this.returnmoney=returnmoney;
      this.confirmedamount=confirmedamount;
      this.confirmedmoney=confirmedmoney;
      this.assignedamount=assignedamount;
      this.assignedmoney=assignedmoney;
  }
}