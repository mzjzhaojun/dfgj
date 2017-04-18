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
public class Customerfollowitems implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long followid;
  Long itemid;
  String subject;
  String institude;
  String startdate;
  String enddate;
  public Customerfollowitems(){
  }
  public Customerfollowitems(Long id,Integer version,Long followid,Long itemid,String subject,String institude,String startdate,String enddate){
      this.id=id;
      this.version=version;
      this.followid=followid;
      this.itemid=itemid;
      this.subject=subject;
      this.institude=institude;
      this.startdate=startdate;
      this.enddate=enddate;
  }
}