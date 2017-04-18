package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/
@Getter
@Setter
public class Classlessons implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long classid;
  Integer sortno;
  Long lessonid;
  String lessoncode;
  String lessonstatus;
  String starttime;
  String endtime;
  String confirmstatus;
  String confirmtime;
  Integer confirmedpeoples;
  Object confirmedmoney;
  Integer lessonpeoples;
  Long roomid;
  String roomcode;
  String roomname;
  Long teacherid;
  String teachername;
  String teacheroacode;
  Long teacherjobid;
  Long teacherjoborgid;
  String teacherjoborgname;
  Integer isfulltimeteacher;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Classlessons(){
  }
  public Classlessons(Long id,Integer version,Long classid,Integer sortno,Long lessonid,String lessoncode,String lessonstatus,String starttime,String endtime,String confirmstatus,String confirmtime,Integer confirmedpeoples,Object confirmedmoney,Integer lessonpeoples,Long roomid,String roomcode,String roomname,Long teacherid,String teachername,String teacheroacode,Long teacherjobid,Long teacherjoborgid,String teacherjoborgname,Integer isfulltimeteacher,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.classid=classid;
      this.sortno=sortno;
      this.lessonid=lessonid;
      this.lessoncode=lessoncode;
      this.lessonstatus=lessonstatus;
      this.starttime=starttime;
      this.endtime=endtime;
      this.confirmstatus=confirmstatus;
      this.confirmtime=confirmtime;
      this.confirmedpeoples=confirmedpeoples;
      this.confirmedmoney=confirmedmoney;
      this.lessonpeoples=lessonpeoples;
      this.roomid=roomid;
      this.roomcode=roomcode;
      this.roomname=roomname;
      this.teacherid=teacherid;
      this.teachername=teachername;
      this.teacheroacode=teacheroacode;
      this.teacherjobid=teacherjobid;
      this.teacherjoborgid=teacherjoborgid;
      this.teacherjoborgname=teacherjoborgname;
      this.isfulltimeteacher=isfulltimeteacher;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}