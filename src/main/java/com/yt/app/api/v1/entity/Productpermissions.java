package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/
@Getter
@Setter
public class Productpermissions implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  Long productid;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  public Productpermissions(){
  }
  public Productpermissions(Long id,Integer version,Long campusid,Long productid,Long creatorid,String creatorname,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.productid=productid;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
  }
}