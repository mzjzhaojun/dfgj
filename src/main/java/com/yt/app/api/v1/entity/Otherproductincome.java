package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:50
*/
@Getter
@Setter
public class Otherproductincome implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  java.util.Date statlocaldate;
  Long customerid;
  Long campusid;
  Integer producttype;
  Object amount;
  Object duration;
  Object income;
  public Otherproductincome(){
  }
  public Otherproductincome(Long id,Integer version,java.util.Date statlocaldate,Long customerid,Long campusid,Integer producttype,Object amount,Object duration,Object income){
      this.id=id;
      this.version=version;
      this.statlocaldate=statlocaldate;
      this.customerid=customerid;
      this.campusid=campusid;
      this.producttype=producttype;
      this.amount=amount;
      this.duration=duration;
      this.income=income;
  }
}