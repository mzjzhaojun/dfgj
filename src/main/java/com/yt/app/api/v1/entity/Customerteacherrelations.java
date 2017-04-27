package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/
@Getter
@Setter
public class Customerteacherrelations implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long customerid;
  Long teacherid;
  String teachername;
  Long teacherjobid;
  String teacherjobname;
  String teacheroacode;
  Long teacherjoborgid;
  String teacherjoborgname;
  Integer isfulltimeteacher;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  public Customerteacherrelations(){
  }
  public Customerteacherrelations(Long id,Integer version,Long customerid,Long teacherid,String teachername,Long teacherjobid,String teacherjobname,String teacheroacode,Long teacherjoborgid,String teacherjoborgname,Integer isfulltimeteacher,Long creatorid,String creatorname,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.customerid=customerid;
      this.teacherid=teacherid;
      this.teachername=teachername;
      this.teacherjobid=teacherjobid;
      this.teacherjobname=teacherjobname;
      this.teacheroacode=teacheroacode;
      this.teacherjoborgid=teacherjoborgid;
      this.teacherjoborgname=teacherjoborgname;
      this.isfulltimeteacher=isfulltimeteacher;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
  }
}