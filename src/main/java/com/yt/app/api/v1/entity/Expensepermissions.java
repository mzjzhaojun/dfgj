package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:45
*/
@Getter
@Setter
public class Expensepermissions implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  Long expenseid;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  public Expensepermissions(){
  }
  public Expensepermissions(Long id,Integer version,Long campusid,Long expenseid,Long creatorid,String creatorname,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.expenseid=expenseid;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
  }
}