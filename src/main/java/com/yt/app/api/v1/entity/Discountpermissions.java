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
public class Discountpermissions implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  Long discountid;
  String startdate;
  String enddate;
  Long creatorid;
  String creatorname;
  String createtime;
  public Discountpermissions(){
  }
  public Discountpermissions(Long id,Integer version,Long campusid,Long discountid,String startdate,String enddate,Long creatorid,String creatorname,String createtime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.discountid=discountid;
      this.startdate=startdate;
      this.enddate=enddate;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
  }
}