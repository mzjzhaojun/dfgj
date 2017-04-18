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
public class Customervisits implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String campusname;
  Long customerid;
  Long visitid;
  String visittype;
  String visitway;
  String visitcontent;
  String visittime;
  Long visitorid;
  String visitorname;
  Long visitorjobid;
  String visitorjobname;
  String nextvisittime;
  String satisficing;
  String remindtime;
  String creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Customervisits(){
  }
  public Customervisits(Long id,Integer version,Long campusid,String campusname,Long customerid,Long visitid,String visittype,String visitway,String visitcontent,String visittime,Long visitorid,String visitorname,Long visitorjobid,String visitorjobname,String nextvisittime,String satisficing,String remindtime,String creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.customerid=customerid;
      this.visitid=visitid;
      this.visittype=visittype;
      this.visitway=visitway;
      this.visitcontent=visitcontent;
      this.visittime=visittime;
      this.visitorid=visitorid;
      this.visitorname=visitorname;
      this.visitorjobid=visitorjobid;
      this.visitorjobname=visitorjobname;
      this.nextvisittime=nextvisittime;
      this.satisficing=satisficing;
      this.remindtime=remindtime;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}