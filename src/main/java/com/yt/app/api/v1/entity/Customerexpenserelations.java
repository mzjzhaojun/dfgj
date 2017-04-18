package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/
@Getter
@Setter
public class Customerexpenserelations implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long customerid;
  Long expenseid;
  String expensetype;
  Object expensemoney;
  Long accountid;
  Long orderid;
  Long creatorid;
  String creatorname;
  String createtime;
  String tenantcode;
  public Customerexpenserelations(){
  }
  public Customerexpenserelations(Long id,Integer version,Long customerid,Long expenseid,String expensetype,Object expensemoney,Long accountid,Long orderid,Long creatorid,String creatorname,String createtime,String tenantcode){
      this.id=id;
      this.version=version;
      this.customerid=customerid;
      this.expenseid=expenseid;
      this.expensetype=expensetype;
      this.expensemoney=expensemoney;
      this.accountid=accountid;
      this.orderid=orderid;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.tenantcode=tenantcode;
  }
}