package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/
@Getter
@Setter
public class Teachers implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long teacherid;
  String teachercode;
  String teachername;
  String teacheroacode;
  String gender;
  String birthday;
  String gradememo;
  String subjectmemo;
  public Teachers(){
  }
  public Teachers(Long id,Integer version,Long teacherid,String teachercode,String teachername,String teacheroacode,String gender,String birthday,String gradememo,String subjectmemo){
      this.id=id;
      this.version=version;
      this.teacherid=teacherid;
      this.teachercode=teachercode;
      this.teachername=teachername;
      this.teacheroacode=teacheroacode;
      this.gender=gender;
      this.birthday=birthday;
      this.gradememo=gradememo;
      this.subjectmemo=subjectmemo;
  }
}