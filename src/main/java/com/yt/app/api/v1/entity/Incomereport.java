package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:46
*/
@Getter
@Setter
public class Incomereport implements Serializable{

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
  String jobnature;
  String jobnaturename;
  String incometype;
  String incometypename;
  String producttype;
  String producttypename;
  String grade;
  String gradename;
  String subject;
  String subjectname;
  Integer persons;
  Object periods;
  Object hours;
  Object income;
  Object priceperperiod;
  Object priceperhour;
  Object periodperperson;
  Object hourperperson;
  Object returnmoney;
  public Incomereport(){
  }
  public Incomereport(Long id,Integer version,Long snapshotid,String statdatekey,String statdatename,String regionid,String regionname,String branchid,String branchname,String campusid,String campusname,Integer campusage,String jobnature,String jobnaturename,String incometype,String incometypename,String producttype,String producttypename,String grade,String gradename,String subject,String subjectname,Integer persons,Object periods,Object hours,Object income,Object priceperperiod,Object priceperhour,Object periodperperson,Object hourperperson,Object returnmoney){
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
      this.jobnature=jobnature;
      this.jobnaturename=jobnaturename;
      this.incometype=incometype;
      this.incometypename=incometypename;
      this.producttype=producttype;
      this.producttypename=producttypename;
      this.grade=grade;
      this.gradename=gradename;
      this.subject=subject;
      this.subjectname=subjectname;
      this.persons=persons;
      this.periods=periods;
      this.hours=hours;
      this.income=income;
      this.priceperperiod=priceperperiod;
      this.priceperhour=priceperhour;
      this.periodperperson=periodperperson;
      this.hourperperson=hourperperson;
      this.returnmoney=returnmoney;
  }
}