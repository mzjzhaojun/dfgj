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
public class Consultbranchcrmmonthsum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Integer year;
  Integer month;
  Integer followingcountofpotential;
  Integer followingcountofstudent;
  Integer verifyingcount;
  Integer signingcount;
  Integer unfollowcountofpotential;
  Integer unfollowcountofstudent;
  Integer unverifycount;
  Integer unsigncount;
  Integer followedcountofpotential;
  Integer followedcountofstudent;
  Integer verifiedcount;
  Integer signedcount;
  Integer newpotentialcount;
  Object convertedratio;
  Object verifiedratio;
  Object signedratio;
  java.util.Date createtime;
  public Consultbranchcrmmonthsum(){
  }
  public Consultbranchcrmmonthsum(Long id,Integer version,Long regionid,Long branchid,Integer year,Integer month,Integer followingcountofpotential,Integer followingcountofstudent,Integer verifyingcount,Integer signingcount,Integer unfollowcountofpotential,Integer unfollowcountofstudent,Integer unverifycount,Integer unsigncount,Integer followedcountofpotential,Integer followedcountofstudent,Integer verifiedcount,Integer signedcount,Integer newpotentialcount,Object convertedratio,Object verifiedratio,Object signedratio,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.year=year;
      this.month=month;
      this.followingcountofpotential=followingcountofpotential;
      this.followingcountofstudent=followingcountofstudent;
      this.verifyingcount=verifyingcount;
      this.signingcount=signingcount;
      this.unfollowcountofpotential=unfollowcountofpotential;
      this.unfollowcountofstudent=unfollowcountofstudent;
      this.unverifycount=unverifycount;
      this.unsigncount=unsigncount;
      this.followedcountofpotential=followedcountofpotential;
      this.followedcountofstudent=followedcountofstudent;
      this.verifiedcount=verifiedcount;
      this.signedcount=signedcount;
      this.newpotentialcount=newpotentialcount;
      this.convertedratio=convertedratio;
      this.verifiedratio=verifiedratio;
      this.signedratio=signedratio;
      this.createtime=createtime;
  }
}