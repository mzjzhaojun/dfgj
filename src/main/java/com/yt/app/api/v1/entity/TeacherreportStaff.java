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
public class TeacherreportStaff implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long snapshotid;
  String dt;
  String regionid;
  String regionname;
  String branchid;
  String branchname;
  String campusid;
  String campusname;
  String orgid;
  String orgname;
  Integer campusmonth;
  String jobname;
  String jobnature;
  Integer fulltimecount;
  Integer fulltimeteachcount;
  Integer parttimecount;
  Integer parttimeteachcount;
  String oacode;
  Long staffid;
  String staffname;
  Integer customercount;
  Integer customerclasscount;
  Integer customerg3classcount;
  Integer customeravailablecount;
  Integer customerg3availablecount;
  Integer customerclasssuspendedcount;
  Integer customerschoolsuspendedcount;
  Integer customerclassfinishedcount;
  Object allteacherassignedamount;
  Object allteacherassignedamountvol;
  Object allteacherassignedamountyoydiff;
  Object allteacherassignedamountyoy;
  Object allteacherassignedamounttask;
  Object allteacherassignedamounttcr;
  Object allcustomerassignedamount;
  Object allcustomerassignedamountvol;
  Object allcustomerassignedamountyoydiff;
  Object allcustomerassignedamountyoy;
  Object allassignedincome;
  Object allassignedincomevol;
  Object allassignedincomeyoydiff;
  Object allassignedincomeyoy;
  Object onetooneassignedamount;
  Object onetooneassignedamountvol;
  Object onetooneassignedamountyoydiff;
  Object onetooneassignedamountyoy;
  Object onetooneassignedincome;
  Object onetooneassignedincomevol;
  Object onetooneassignedincomeyoydiff;
  Object onetooneassignedincomeyoy;
  Object onetoonecustomercount;
  Object onetoonecustomercountvol;
  Object onetoonecustomercountyoydiff;
  Object onetoonecustomercountyoy;
  Object teacherclassgroupassignedamount;
  Object teacherclassgroupassignedamountvol;
  Object teacherclassgroupassignedamountyoydiff;
  Object teacherclassgroupassignedamountyoy;
  Object customerclassgroupassignedamount;
  Object customerclassgroupassignedamountvol;
  Object customerclassgroupassignedamountyoydiff;
  Object customerclassgroupassignedamountyoy;
  Object classgroupassignedincome;
  Object classgroupassignedincomevol;
  Object classgroupassignedincomeyoydiff;
  Object classgroupassignedincomeyoy;
  Object classgroupcustomercount;
  Object classgroupcustomercountvol;
  Object classgroupcustomercountyoydiff;
  Object classgroupcustomercountyoy;
  Object customerrenewalrate;
  Object customeraveragehour;
  Object customeraverageaddignedamount;
  Object fulltimeteacheraveragehour;
  Object parttimeteacheraveragehourpercent;
  Object customerlossrate;
  Integer customertransferintroductioncount;
  Object customersatisfactiondegree;
  Object rechargeamount;
  Integer rechargecount;
  Object refundamount;
  Integer refundcount;
  public TeacherreportStaff(){
  }
  public TeacherreportStaff(Long id,Integer version,Long snapshotid,String dt,String regionid,String regionname,String branchid,String branchname,String campusid,String campusname,String orgid,String orgname,Integer campusmonth,String jobname,String jobnature,Integer fulltimecount,Integer fulltimeteachcount,Integer parttimecount,Integer parttimeteachcount,String oacode,Long staffid,String staffname,Integer customercount,Integer customerclasscount,Integer customerg3classcount,Integer customeravailablecount,Integer customerg3availablecount,Integer customerclasssuspendedcount,Integer customerschoolsuspendedcount,Integer customerclassfinishedcount,Object allteacherassignedamount,Object allteacherassignedamountvol,Object allteacherassignedamountyoydiff,Object allteacherassignedamountyoy,Object allteacherassignedamounttask,Object allteacherassignedamounttcr,Object allcustomerassignedamount,Object allcustomerassignedamountvol,Object allcustomerassignedamountyoydiff,Object allcustomerassignedamountyoy,Object allassignedincome,Object allassignedincomevol,Object allassignedincomeyoydiff,Object allassignedincomeyoy,Object onetooneassignedamount,Object onetooneassignedamountvol,Object onetooneassignedamountyoydiff,Object onetooneassignedamountyoy,Object onetooneassignedincome,Object onetooneassignedincomevol,Object onetooneassignedincomeyoydiff,Object onetooneassignedincomeyoy,Object onetoonecustomercount,Object onetoonecustomercountvol,Object onetoonecustomercountyoydiff,Object onetoonecustomercountyoy,Object teacherclassgroupassignedamount,Object teacherclassgroupassignedamountvol,Object teacherclassgroupassignedamountyoydiff,Object teacherclassgroupassignedamountyoy,Object customerclassgroupassignedamount,Object customerclassgroupassignedamountvol,Object customerclassgroupassignedamountyoydiff,Object customerclassgroupassignedamountyoy,Object classgroupassignedincome,Object classgroupassignedincomevol,Object classgroupassignedincomeyoydiff,Object classgroupassignedincomeyoy,Object classgroupcustomercount,Object classgroupcustomercountvol,Object classgroupcustomercountyoydiff,Object classgroupcustomercountyoy,Object customerrenewalrate,Object customeraveragehour,Object customeraverageaddignedamount,Object fulltimeteacheraveragehour,Object parttimeteacheraveragehourpercent,Object customerlossrate,Integer customertransferintroductioncount,Object customersatisfactiondegree,Object rechargeamount,Integer rechargecount,Object refundamount,Integer refundcount){
      this.id=id;
      this.version=version;
      this.snapshotid=snapshotid;
      this.dt=dt;
      this.regionid=regionid;
      this.regionname=regionname;
      this.branchid=branchid;
      this.branchname=branchname;
      this.campusid=campusid;
      this.campusname=campusname;
      this.orgid=orgid;
      this.orgname=orgname;
      this.campusmonth=campusmonth;
      this.jobname=jobname;
      this.jobnature=jobnature;
      this.fulltimecount=fulltimecount;
      this.fulltimeteachcount=fulltimeteachcount;
      this.parttimecount=parttimecount;
      this.parttimeteachcount=parttimeteachcount;
      this.oacode=oacode;
      this.staffid=staffid;
      this.staffname=staffname;
      this.customercount=customercount;
      this.customerclasscount=customerclasscount;
      this.customerg3classcount=customerg3classcount;
      this.customeravailablecount=customeravailablecount;
      this.customerg3availablecount=customerg3availablecount;
      this.customerclasssuspendedcount=customerclasssuspendedcount;
      this.customerschoolsuspendedcount=customerschoolsuspendedcount;
      this.customerclassfinishedcount=customerclassfinishedcount;
      this.allteacherassignedamount=allteacherassignedamount;
      this.allteacherassignedamountvol=allteacherassignedamountvol;
      this.allteacherassignedamountyoydiff=allteacherassignedamountyoydiff;
      this.allteacherassignedamountyoy=allteacherassignedamountyoy;
      this.allteacherassignedamounttask=allteacherassignedamounttask;
      this.allteacherassignedamounttcr=allteacherassignedamounttcr;
      this.allcustomerassignedamount=allcustomerassignedamount;
      this.allcustomerassignedamountvol=allcustomerassignedamountvol;
      this.allcustomerassignedamountyoydiff=allcustomerassignedamountyoydiff;
      this.allcustomerassignedamountyoy=allcustomerassignedamountyoy;
      this.allassignedincome=allassignedincome;
      this.allassignedincomevol=allassignedincomevol;
      this.allassignedincomeyoydiff=allassignedincomeyoydiff;
      this.allassignedincomeyoy=allassignedincomeyoy;
      this.onetooneassignedamount=onetooneassignedamount;
      this.onetooneassignedamountvol=onetooneassignedamountvol;
      this.onetooneassignedamountyoydiff=onetooneassignedamountyoydiff;
      this.onetooneassignedamountyoy=onetooneassignedamountyoy;
      this.onetooneassignedincome=onetooneassignedincome;
      this.onetooneassignedincomevol=onetooneassignedincomevol;
      this.onetooneassignedincomeyoydiff=onetooneassignedincomeyoydiff;
      this.onetooneassignedincomeyoy=onetooneassignedincomeyoy;
      this.onetoonecustomercount=onetoonecustomercount;
      this.onetoonecustomercountvol=onetoonecustomercountvol;
      this.onetoonecustomercountyoydiff=onetoonecustomercountyoydiff;
      this.onetoonecustomercountyoy=onetoonecustomercountyoy;
      this.teacherclassgroupassignedamount=teacherclassgroupassignedamount;
      this.teacherclassgroupassignedamountvol=teacherclassgroupassignedamountvol;
      this.teacherclassgroupassignedamountyoydiff=teacherclassgroupassignedamountyoydiff;
      this.teacherclassgroupassignedamountyoy=teacherclassgroupassignedamountyoy;
      this.customerclassgroupassignedamount=customerclassgroupassignedamount;
      this.customerclassgroupassignedamountvol=customerclassgroupassignedamountvol;
      this.customerclassgroupassignedamountyoydiff=customerclassgroupassignedamountyoydiff;
      this.customerclassgroupassignedamountyoy=customerclassgroupassignedamountyoy;
      this.classgroupassignedincome=classgroupassignedincome;
      this.classgroupassignedincomevol=classgroupassignedincomevol;
      this.classgroupassignedincomeyoydiff=classgroupassignedincomeyoydiff;
      this.classgroupassignedincomeyoy=classgroupassignedincomeyoy;
      this.classgroupcustomercount=classgroupcustomercount;
      this.classgroupcustomercountvol=classgroupcustomercountvol;
      this.classgroupcustomercountyoydiff=classgroupcustomercountyoydiff;
      this.classgroupcustomercountyoy=classgroupcustomercountyoy;
      this.customerrenewalrate=customerrenewalrate;
      this.customeraveragehour=customeraveragehour;
      this.customeraverageaddignedamount=customeraverageaddignedamount;
      this.fulltimeteacheraveragehour=fulltimeteacheraveragehour;
      this.parttimeteacheraveragehourpercent=parttimeteacheraveragehourpercent;
      this.customerlossrate=customerlossrate;
      this.customertransferintroductioncount=customertransferintroductioncount;
      this.customersatisfactiondegree=customersatisfactiondegree;
      this.rechargeamount=rechargeamount;
      this.rechargecount=rechargecount;
      this.refundamount=refundamount;
      this.refundcount=refundcount;
  }
}