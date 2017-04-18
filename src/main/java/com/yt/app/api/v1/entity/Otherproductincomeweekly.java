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
public class Otherproductincomeweekly implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Integer isstart;
  Long campusid;
  Object income;
  public Otherproductincomeweekly(){
  }
  public Otherproductincomeweekly(Long id,Integer version,Integer isstart,Long campusid,Object income){
      this.id=id;
      this.version=version;
      this.isstart=isstart;
      this.campusid=campusid;
      this.income=income;
  }
}