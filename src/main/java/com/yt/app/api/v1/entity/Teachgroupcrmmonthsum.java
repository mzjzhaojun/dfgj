package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:02
*/
@Getter
@Setter
public class Teachgroupcrmmonthsum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Long campusid;
  Long groupid;
  Integer year;
  Integer month;
  Integer classpeoplecount;
  Integer initialeffective;
  Integer neweffective;
  Object classhours;
  Integer outschoolwarningcount;
  Integer closedwarningcount;
  Integer refundwarningcount;
  Integer classnosatisfied;
  Integer scorenosatisfied;
  Integer newstudentcount;
  Integer waitmeetingcount;
  Integer birthdaytoday;
  Integer birthdayfuture;
  Integer managestudentcount;
  Integer validstudentcount;
  Integer closedstudentcount;
  Integer outschoolstudentcount;
  Integer renewalcount;
  Integer endclasscount;
  Integer refundcount;
  Integer introducecount;
  Integer switchcount;
  Integer receivecount;
  Integer newclosedcount;
  Integer closedactivationcount;
  Integer newoutschoolcount;
  Integer outschoolactivationcount;
  java.util.Date createtime;
  public Teachgroupcrmmonthsum(){
  }
  public Teachgroupcrmmonthsum(Long id,Integer version,Long regionid,Long branchid,Long campusid,Long groupid,Integer year,Integer month,Integer classpeoplecount,Integer initialeffective,Integer neweffective,Object classhours,Integer outschoolwarningcount,Integer closedwarningcount,Integer refundwarningcount,Integer classnosatisfied,Integer scorenosatisfied,Integer newstudentcount,Integer waitmeetingcount,Integer birthdaytoday,Integer birthdayfuture,Integer managestudentcount,Integer validstudentcount,Integer closedstudentcount,Integer outschoolstudentcount,Integer renewalcount,Integer endclasscount,Integer refundcount,Integer introducecount,Integer switchcount,Integer receivecount,Integer newclosedcount,Integer closedactivationcount,Integer newoutschoolcount,Integer outschoolactivationcount,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.campusid=campusid;
      this.groupid=groupid;
      this.year=year;
      this.month=month;
      this.classpeoplecount=classpeoplecount;
      this.initialeffective=initialeffective;
      this.neweffective=neweffective;
      this.classhours=classhours;
      this.outschoolwarningcount=outschoolwarningcount;
      this.closedwarningcount=closedwarningcount;
      this.refundwarningcount=refundwarningcount;
      this.classnosatisfied=classnosatisfied;
      this.scorenosatisfied=scorenosatisfied;
      this.newstudentcount=newstudentcount;
      this.waitmeetingcount=waitmeetingcount;
      this.birthdaytoday=birthdaytoday;
      this.birthdayfuture=birthdayfuture;
      this.managestudentcount=managestudentcount;
      this.validstudentcount=validstudentcount;
      this.closedstudentcount=closedstudentcount;
      this.outschoolstudentcount=outschoolstudentcount;
      this.renewalcount=renewalcount;
      this.endclasscount=endclasscount;
      this.refundcount=refundcount;
      this.introducecount=introducecount;
      this.switchcount=switchcount;
      this.receivecount=receivecount;
      this.newclosedcount=newclosedcount;
      this.closedactivationcount=closedactivationcount;
      this.newoutschoolcount=newoutschoolcount;
      this.outschoolactivationcount=outschoolactivationcount;
      this.createtime=createtime;
  }
}