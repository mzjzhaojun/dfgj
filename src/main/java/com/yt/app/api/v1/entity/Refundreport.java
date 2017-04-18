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
public class Refundreport implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long snapshotid;
  String statdatekey;
  String statdatename;
  String regionid;
  String regionname;
  String branchid;
  String branchname;
  String campusid;
  String campusname;
  Integer campusage;
  String staffid;
  String staffoaname;
  String staffjobtype;
  String staffjobname;
  Integer staffage;
  String grade;
  String gradename;
  String refundtype;
  String refundtypename;
  Object applyrefundmoney;
  Object realrefundmoney;
  Integer refundpeople;
  Object refundaverage;
  public Refundreport(){
  }
  public Refundreport(Long id,Integer version,Long snapshotid,String statdatekey,String statdatename,String regionid,String regionname,String branchid,String branchname,String campusid,String campusname,Integer campusage,String staffid,String staffoaname,String staffjobtype,String staffjobname,Integer staffage,String grade,String gradename,String refundtype,String refundtypename,Object applyrefundmoney,Object realrefundmoney,Integer refundpeople,Object refundaverage){
      this.id=id;
      this.version=version;
      this.snapshotid=snapshotid;
      this.statdatekey=statdatekey;
      this.statdatename=statdatename;
      this.regionid=regionid;
      this.regionname=regionname;
      this.branchid=branchid;
      this.branchname=branchname;
      this.campusid=campusid;
      this.campusname=campusname;
      this.campusage=campusage;
      this.staffid=staffid;
      this.staffoaname=staffoaname;
      this.staffjobtype=staffjobtype;
      this.staffjobname=staffjobname;
      this.staffage=staffage;
      this.grade=grade;
      this.gradename=gradename;
      this.refundtype=refundtype;
      this.refundtypename=refundtypename;
      this.applyrefundmoney=applyrefundmoney;
      this.realrefundmoney=realrefundmoney;
      this.refundpeople=refundpeople;
      this.refundaverage=refundaverage;
  }
}