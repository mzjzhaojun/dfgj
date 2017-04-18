package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/
@Getter
@Setter
public class Consultbranchcrmdaysum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Integer year;
  Integer month;
  Integer day;
  Integer followingcountofpotential;
  Integer followingcountofstudent;
  Integer verifyingcount;
  Integer signingcount;
  Integer weekfollowingcountofpotential;
  Integer weekfollowingcountofstudent;
  Integer weekverifyingcount;
  Integer weeksigningcount;
  String createtime;
  public Consultbranchcrmdaysum(){
  }
  public Consultbranchcrmdaysum(Long id,Integer version,Long regionid,Long branchid,Integer year,Integer month,Integer day,Integer followingcountofpotential,Integer followingcountofstudent,Integer verifyingcount,Integer signingcount,Integer weekfollowingcountofpotential,Integer weekfollowingcountofstudent,Integer weekverifyingcount,Integer weeksigningcount,String createtime){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.year=year;
      this.month=month;
      this.day=day;
      this.followingcountofpotential=followingcountofpotential;
      this.followingcountofstudent=followingcountofstudent;
      this.verifyingcount=verifyingcount;
      this.signingcount=signingcount;
      this.weekfollowingcountofpotential=weekfollowingcountofpotential;
      this.weekfollowingcountofstudent=weekfollowingcountofstudent;
      this.weekverifyingcount=weekverifyingcount;
      this.weeksigningcount=weeksigningcount;
      this.createtime=createtime;
  }
}