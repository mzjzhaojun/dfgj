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
public class Customermeetings implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String campusname;
  Long customerid;
  Long meetingid;
  String meetingtime;
  String meetingendtime;
  String meetingduration;
  Object meetingdurationvalue;
  String meetingtype;
  String meetingevent;
  String meetingtitle;
  String satisficing;
  Long organizerid;
  String organizername;
  Long organizerjobid;
  String organizerjobname;
  String nextmeetingtime;
  String participants;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Customermeetings(){
  }
  public Customermeetings(Long id,Integer version,Long campusid,String campusname,Long customerid,Long meetingid,String meetingtime,String meetingendtime,String meetingduration,Object meetingdurationvalue,String meetingtype,String meetingevent,String meetingtitle,String satisficing,Long organizerid,String organizername,Long organizerjobid,String organizerjobname,String nextmeetingtime,String participants,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.customerid=customerid;
      this.meetingid=meetingid;
      this.meetingtime=meetingtime;
      this.meetingendtime=meetingendtime;
      this.meetingduration=meetingduration;
      this.meetingdurationvalue=meetingdurationvalue;
      this.meetingtype=meetingtype;
      this.meetingevent=meetingevent;
      this.meetingtitle=meetingtitle;
      this.satisficing=satisficing;
      this.organizerid=organizerid;
      this.organizername=organizername;
      this.organizerjobid=organizerjobid;
      this.organizerjobname=organizerjobname;
      this.nextmeetingtime=nextmeetingtime;
      this.participants=participants;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}