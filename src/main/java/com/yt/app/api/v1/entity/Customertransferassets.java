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
public class Customertransferassets implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long applyid;
  Long assetid;
  String assettype;
  String assetcode;
  String assetname;
  Long accountid;
  Long productid;
  Object orderprice;
  Object orderamount;
  Object presentamount;
  Object realprice;
  Object realamount;
  Object realmoney;
  Object amount;
  Object price;
  Object remainmoney;
  Object confirmedamount;
  Object exchangeamount;
  Object debookedamount;
  Object confirmedmoney;
  Object returnedmoney;
  public Customertransferassets(){
  }
  public Customertransferassets(Long id,Integer version,Long applyid,Long assetid,String assettype,String assetcode,String assetname,Long accountid,Long productid,Object orderprice,Object orderamount,Object presentamount,Object realprice,Object realamount,Object realmoney,Object amount,Object price,Object remainmoney,Object confirmedamount,Object exchangeamount,Object debookedamount,Object confirmedmoney,Object returnedmoney){
      this.id=id;
      this.version=version;
      this.applyid=applyid;
      this.assetid=assetid;
      this.assettype=assettype;
      this.assetcode=assetcode;
      this.assetname=assetname;
      this.accountid=accountid;
      this.productid=productid;
      this.orderprice=orderprice;
      this.orderamount=orderamount;
      this.presentamount=presentamount;
      this.realprice=realprice;
      this.realamount=realamount;
      this.realmoney=realmoney;
      this.amount=amount;
      this.price=price;
      this.remainmoney=remainmoney;
      this.confirmedamount=confirmedamount;
      this.exchangeamount=exchangeamount;
      this.debookedamount=debookedamount;
      this.confirmedmoney=confirmedmoney;
      this.returnedmoney=returnedmoney;
  }
}