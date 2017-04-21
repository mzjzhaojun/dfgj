package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:17
*/
@Getter
@Setter
public class Accountrefundverifyings implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long applyid;
  java.util.Date verifytime;
  String verifyaction;
  String verifymemo;
  Long verifierid;
  String verifiername;
  Long verifierjobid;
  String verifierjobname;
  String verifierorgid;
  String verifierorgname;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  public Accountrefundverifyings(){
  }
  public Accountrefundverifyings(Long id,Integer version,Long applyid,java.util.Date verifytime,String verifyaction,String verifymemo,Long verifierid,String verifiername,Long verifierjobid,String verifierjobname,String verifierorgid,String verifierorgname,Long creatorid,String creatorname,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.applyid=applyid;
      this.verifytime=verifytime;
      this.verifyaction=verifyaction;
      this.verifymemo=verifymemo;
      this.verifierid=verifierid;
      this.verifiername=verifiername;
      this.verifierjobid=verifierjobid;
      this.verifierjobname=verifierjobname;
      this.verifierorgid=verifierorgid;
      this.verifierorgname=verifierorgname;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
  }
}