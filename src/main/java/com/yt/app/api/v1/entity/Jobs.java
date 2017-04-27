package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/
@Getter
@Setter
public class Jobs implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String jobname;
  Long orgid;
  Long staffid;
  Long parentid;
  Integer isprimary;
  String isfulltime;
  Long jobcodeid;
  String fullpath;
  String status;
  String bistatus;
  public Jobs(){
  }
  public Jobs(Long id,Integer version,String jobname,Long orgid,Long staffid,Long parentid,Integer isprimary,String isfulltime,Long jobcodeid,String fullpath,String status,String bistatus){
      this.id=id;
      this.version=version;
      this.jobname=jobname;
      this.orgid=orgid;
      this.staffid=staffid;
      this.parentid=parentid;
      this.isprimary=isprimary;
      this.isfulltime=isfulltime;
      this.jobcodeid=jobcodeid;
      this.fullpath=fullpath;
      this.status=status;
      this.bistatus=bistatus;
  }
}