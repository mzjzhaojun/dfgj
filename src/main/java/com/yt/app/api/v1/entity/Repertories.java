package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/
@Getter
@Setter
public class Repertories implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long productid;
  Long productname;
  Integer totalquantity;
  Integer usedquantity;
  String createtime;
  public Repertories(){
  }
  public Repertories(Long id,Integer version,Long productid,Long productname,Integer totalquantity,Integer usedquantity,String createtime){
      this.id=id;
      this.version=version;
      this.productid=productid;
      this.productname=productname;
      this.totalquantity=totalquantity;
      this.usedquantity=usedquantity;
      this.createtime=createtime;
  }
}