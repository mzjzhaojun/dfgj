package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/
@Getter
@Setter
public class Customerteachercharges implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long customerid;
  Long teacherid;
  java.util.Date statlocaldate;
  Long campusid;
  Object newchargeamount;
  Object renewamount;
  Object refundamount;
  public Customerteachercharges(){
  }
  public Customerteachercharges(Long id,Integer version,Long customerid,Long teacherid,java.util.Date statlocaldate,Long campusid,Object newchargeamount,Object renewamount,Object refundamount){
      this.id=id;
      this.version=version;
      this.customerid=customerid;
      this.teacherid=teacherid;
      this.statlocaldate=statlocaldate;
      this.campusid=campusid;
      this.newchargeamount=newchargeamount;
      this.renewamount=renewamount;
      this.refundamount=refundamount;
  }
}