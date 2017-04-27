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
public class Assets implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String assetcode;
  String assetname;
  String assettype;
  String assetreftype;
  String assetrefpid;
  String assetrefid;
  Long accountid;
  Long customerid;
  String customercode;
  String customername;
  Long productid;
  String productcode;
  String productname;
  String productunit;
  String productunitname;
  String grade;
  String gradename;
  String subject;
  Long subjectname;
  String catalog;
  String catalogname;
  String categorytype;
  String categorytypename;
  String courselevel;
  String courselevelname;
  String lessonduration;
  Object lessondurationvalue;
  Object orderprice;
  Object orderamount;
  Object presentamount;
  Object tunlandrate;
  Object specialrate;
  String discounttype;
  Object discountrate;
  Object realprice;
  Object realamount;
  java.util.Date expirationdate;
  Object assignedamount;
  Object confirmedamount;
  Object exchangedamount;
  Object debookedamount;
  Object confirmedmoney;
  Object returnedmoney;
  Object amount;
  Object price;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  Long modifierid;
  String modifiername;
  java.util.Date modifytime;
  public Assets(){
  }
  public Assets(Long id,Integer version,String assetcode,String assetname,String assettype,String assetreftype,String assetrefpid,String assetrefid,Long accountid,Long customerid,String customercode,String customername,Long productid,String productcode,String productname,String productunit,String productunitname,String grade,String gradename,String subject,Long subjectname,String catalog,String catalogname,String categorytype,String categorytypename,String courselevel,String courselevelname,String lessonduration,Object lessondurationvalue,Object orderprice,Object orderamount,Object presentamount,Object tunlandrate,Object specialrate,String discounttype,Object discountrate,Object realprice,Object realamount,java.util.Date expirationdate,Object assignedamount,Object confirmedamount,Object exchangedamount,Object debookedamount,Object confirmedmoney,Object returnedmoney,Object amount,Object price,Long creatorid,String creatorname,java.util.Date createtime,Long modifierid,String modifiername,java.util.Date modifytime){
      this.id=id;
      this.version=version;
      this.assetcode=assetcode;
      this.assetname=assetname;
      this.assettype=assettype;
      this.assetreftype=assetreftype;
      this.assetrefpid=assetrefpid;
      this.assetrefid=assetrefid;
      this.accountid=accountid;
      this.customerid=customerid;
      this.customercode=customercode;
      this.customername=customername;
      this.productid=productid;
      this.productcode=productcode;
      this.productname=productname;
      this.productunit=productunit;
      this.productunitname=productunitname;
      this.grade=grade;
      this.gradename=gradename;
      this.subject=subject;
      this.subjectname=subjectname;
      this.catalog=catalog;
      this.catalogname=catalogname;
      this.categorytype=categorytype;
      this.categorytypename=categorytypename;
      this.courselevel=courselevel;
      this.courselevelname=courselevelname;
      this.lessonduration=lessonduration;
      this.lessondurationvalue=lessondurationvalue;
      this.orderprice=orderprice;
      this.orderamount=orderamount;
      this.presentamount=presentamount;
      this.tunlandrate=tunlandrate;
      this.specialrate=specialrate;
      this.discounttype=discounttype;
      this.discountrate=discountrate;
      this.realprice=realprice;
      this.realamount=realamount;
      this.expirationdate=expirationdate;
      this.assignedamount=assignedamount;
      this.confirmedamount=confirmedamount;
      this.exchangedamount=exchangedamount;
      this.debookedamount=debookedamount;
      this.confirmedmoney=confirmedmoney;
      this.returnedmoney=returnedmoney;
      this.amount=amount;
      this.price=price;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}