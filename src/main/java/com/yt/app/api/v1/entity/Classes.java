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
public class Classes implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String campusname;
  Long productid;
  String productcode;
  String productname;
  Long classid;
  String classcode;
  String classname;
  String classstatus;
  Long roomid;
  String roomcode;
  String roomname;
  String classtype;
  String classtypename;
  String grade;
  String gradename;
  String subject;
  String subjectname;
  String starttime;
  String endtime;
  Integer lessoncount;
  Integer invalidlessons;
  Integer finishedlessons;
  Object lessondurationvalue;
  Object perioddurationvalue;
  Object periodsoflesson;
  Integer classpeoples;
  Integer secondpeoples;
  Integer latestpeoples;
  String teachernames;
  Object confirmedmoney;
  Integer minpeoples;
  Integer maxpeoples;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Classes(){
  }
  public Classes(Long id,Integer version,Long campusid,String campusname,Long productid,String productcode,String productname,Long classid,String classcode,String classname,String classstatus,Long roomid,String roomcode,String roomname,String classtype,String classtypename,String grade,String gradename,String subject,String subjectname,String starttime,String endtime,Integer lessoncount,Integer invalidlessons,Integer finishedlessons,Object lessondurationvalue,Object perioddurationvalue,Object periodsoflesson,Integer classpeoples,Integer secondpeoples,Integer latestpeoples,String teachernames,Object confirmedmoney,Integer minpeoples,Integer maxpeoples,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.productid=productid;
      this.productcode=productcode;
      this.productname=productname;
      this.classid=classid;
      this.classcode=classcode;
      this.classname=classname;
      this.classstatus=classstatus;
      this.roomid=roomid;
      this.roomcode=roomcode;
      this.roomname=roomname;
      this.classtype=classtype;
      this.classtypename=classtypename;
      this.grade=grade;
      this.gradename=gradename;
      this.subject=subject;
      this.subjectname=subjectname;
      this.starttime=starttime;
      this.endtime=endtime;
      this.lessoncount=lessoncount;
      this.invalidlessons=invalidlessons;
      this.finishedlessons=finishedlessons;
      this.lessondurationvalue=lessondurationvalue;
      this.perioddurationvalue=perioddurationvalue;
      this.periodsoflesson=periodsoflesson;
      this.classpeoples=classpeoples;
      this.secondpeoples=secondpeoples;
      this.latestpeoples=latestpeoples;
      this.teachernames=teachernames;
      this.confirmedmoney=confirmedmoney;
      this.minpeoples=minpeoples;
      this.maxpeoples=maxpeoples;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}