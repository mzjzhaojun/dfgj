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
public class Staffrefundstat implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String statlocaldate;
  Long customerid;
  Long staffid;
  String staffoacode;
  String staffoaname;
  Long campusid;
  String campusname;
  String campusshortname;
  Long branchid;
  String branchname;
  String branchshortname;
  Long regionid;
  String regionname;
  String regionshortname;
  Long hqid;
  String hqname;
  String hqshortname;
  String campusdeliverdate;
  Integer campusage;
  Integer staffjobtype;
  String staffjobname;
  String grade;
  String gradename;
  Integer refundtype;
  String refundtypename;
  Object applyrefundmoney;
  Object realrefundmoney;
  public Staffrefundstat(){
  }
  public Staffrefundstat(Long id,Integer version,String statlocaldate,Long customerid,Long staffid,String staffoacode,String staffoaname,Long campusid,String campusname,String campusshortname,Long branchid,String branchname,String branchshortname,Long regionid,String regionname,String regionshortname,Long hqid,String hqname,String hqshortname,String campusdeliverdate,Integer campusage,Integer staffjobtype,String staffjobname,String grade,String gradename,Integer refundtype,String refundtypename,Object applyrefundmoney,Object realrefundmoney){
      this.id=id;
      this.version=version;
      this.statlocaldate=statlocaldate;
      this.customerid=customerid;
      this.staffid=staffid;
      this.staffoacode=staffoacode;
      this.staffoaname=staffoaname;
      this.campusid=campusid;
      this.campusname=campusname;
      this.campusshortname=campusshortname;
      this.branchid=branchid;
      this.branchname=branchname;
      this.branchshortname=branchshortname;
      this.regionid=regionid;
      this.regionname=regionname;
      this.regionshortname=regionshortname;
      this.hqid=hqid;
      this.hqname=hqname;
      this.hqshortname=hqshortname;
      this.campusdeliverdate=campusdeliverdate;
      this.campusage=campusage;
      this.staffjobtype=staffjobtype;
      this.staffjobname=staffjobname;
      this.grade=grade;
      this.gradename=gradename;
      this.refundtype=refundtype;
      this.refundtypename=refundtypename;
      this.applyrefundmoney=applyrefundmoney;
      this.realrefundmoney=realrefundmoney;
  }
}