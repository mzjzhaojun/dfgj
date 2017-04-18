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
public class Customertransferresources implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long orgid;
  String orgname;
  String orgtype;
  Long customerid;
  Long transferid;
  String transfertime;
  String transfermemo;
  Long transferorid;
  String transferorname;
  Long transferorjobid;
  String transferorjobname;
  Long toorgid;
  String toorgname;
  String toorgtype;
  Long creatorid;
  String creatorname;
  String createtime;
  public Customertransferresources(){
  }
  public Customertransferresources(Long id,Integer version,Long orgid,String orgname,String orgtype,Long customerid,Long transferid,String transfertime,String transfermemo,Long transferorid,String transferorname,Long transferorjobid,String transferorjobname,Long toorgid,String toorgname,String toorgtype,Long creatorid,String creatorname,String createtime){
      this.id=id;
      this.version=version;
      this.orgid=orgid;
      this.orgname=orgname;
      this.orgtype=orgtype;
      this.customerid=customerid;
      this.transferid=transferid;
      this.transfertime=transfertime;
      this.transfermemo=transfermemo;
      this.transferorid=transferorid;
      this.transferorname=transferorname;
      this.transferorjobid=transferorjobid;
      this.transferorjobname=transferorjobname;
      this.toorgid=toorgid;
      this.toorgname=toorgname;
      this.toorgtype=toorgtype;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
  }
}