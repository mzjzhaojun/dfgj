package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
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
  java.util.Date starttime;
  java.util.Date endtime;
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
  java.util.Date createtime;
  Long modifierid;
  String modifiername;
  java.util.Date modifytime;
  public Classes(){
  }
  public Classes(Long id,Integer version,Long campusid,String campusname,Long productid,String productcode,String productname,String classcode,String classname,String classstatus,Long roomid,String roomcode,String roomname,String classtype,String classtypename,String grade,String gradename,String subject,String subjectname,java.util.Date starttime,java.util.Date endtime,Integer lessoncount,Integer invalidlessons,Integer finishedlessons,Object lessondurationvalue,Object perioddurationvalue,Object periodsoflesson,Integer classpeoples,Integer secondpeoples,Integer latestpeoples,String teachernames,Object confirmedmoney,Integer minpeoples,Integer maxpeoples,Long creatorid,String creatorname,java.util.Date createtime,Long modifierid,String modifiername,java.util.Date modifytime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.productid=productid;
      this.productcode=productcode;
      this.productname=productname;
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