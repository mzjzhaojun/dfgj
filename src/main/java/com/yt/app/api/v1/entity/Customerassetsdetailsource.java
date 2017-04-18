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
public class Customerassetsdetailsource implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String statlocaldate;
  Long assetid;
  String categorytype;
  String grade;
  String orderid;
  Object confirmedamount;
  Object confirmedmoney;
  public Customerassetsdetailsource(){
  }
  public Customerassetsdetailsource(Long id,Integer version,String statlocaldate,Long assetid,String categorytype,String grade,String orderid,Object confirmedamount,Object confirmedmoney){
      this.id=id;
      this.version=version;
      this.statlocaldate=statlocaldate;
      this.assetid=assetid;
      this.categorytype=categorytype;
      this.grade=grade;
      this.orderid=orderid;
      this.confirmedamount=confirmedamount;
      this.confirmedmoney=confirmedmoney;
  }
}