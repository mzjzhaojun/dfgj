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
public class Teachersearch implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long customerid;
  Long teacherid;
  String teachername;
  Long teacherjobid;
  Long teacherjoborgid;
  String teacherjoborgname;
  Long subject;
  String subjectname;
  String createtime;
  String modifytime;
  public Teachersearch(){
  }
  public Teachersearch(Long id,Integer version,Long customerid,Long teacherid,String teachername,Long teacherjobid,Long teacherjoborgid,String teacherjoborgname,Long subject,String subjectname,String createtime,String modifytime){
      this.id=id;
      this.version=version;
      this.customerid=customerid;
      this.teacherid=teacherid;
      this.teachername=teachername;
      this.teacherjobid=teacherjobid;
      this.teacherjoborgid=teacherjoborgid;
      this.teacherjoborgname=teacherjoborgname;
      this.subject=subject;
      this.subjectname=subjectname;
      this.createtime=createtime;
      this.modifytime=modifytime;
  }
}