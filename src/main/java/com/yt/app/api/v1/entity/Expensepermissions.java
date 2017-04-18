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
public class Expensepermissions implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  Long expenseid;
  Long creatorid;
  String creatorname;
  String createtime;
  public Expensepermissions(){
  }
  public Expensepermissions(Long id,Integer version,Long campusid,Long expenseid,Long creatorid,String creatorname,String createtime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.expenseid=expenseid;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
  }
}