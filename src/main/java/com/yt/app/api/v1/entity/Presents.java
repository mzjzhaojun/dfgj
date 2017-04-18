package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/
@Getter
@Setter
public class Presents implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long presentid;
  String presentcode;
  String presentname;
  String presentstatus;
  String applystartdate;
  String startdate;
  Long branchid;
  String branchname;
  String submittime;
  Long submitterid;
  String submittername;
  Long submitterjobid;
  String submitterjobname;
  Long approverid;
  String approvername;
  Long approverjobid;
  String approverjobname;
  String approvetime;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Presents(){
  }
  public Presents(Long id,Integer version,Long presentid,String presentcode,String presentname,String presentstatus,String applystartdate,String startdate,Long branchid,String branchname,String submittime,Long submitterid,String submittername,Long submitterjobid,String submitterjobname,Long approverid,String approvername,Long approverjobid,String approverjobname,String approvetime,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.presentid=presentid;
      this.presentcode=presentcode;
      this.presentname=presentname;
      this.presentstatus=presentstatus;
      this.applystartdate=applystartdate;
      this.startdate=startdate;
      this.branchid=branchid;
      this.branchname=branchname;
      this.submittime=submittime;
      this.submitterid=submitterid;
      this.submittername=submittername;
      this.submitterjobid=submitterjobid;
      this.submitterjobname=submitterjobname;
      this.approverid=approverid;
      this.approvername=approvername;
      this.approverjobid=approverjobid;
      this.approverjobname=approverjobname;
      this.approvetime=approvetime;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}