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
public class Teacherteachings implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long teacherid;
  Long teachingid;
  String subject;
  String grade;
  public Teacherteachings(){
  }
  public Teacherteachings(Long id,Integer version,Long teacherid,Long teachingid,String subject,String grade){
      this.id=id;
      this.version=version;
      this.teacherid=teacherid;
      this.teachingid=teachingid;
      this.subject=subject;
      this.grade=grade;
  }
}