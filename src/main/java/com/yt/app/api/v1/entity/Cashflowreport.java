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
public class Cashflowreport implements Serializable{

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
  Object newchargeamount;
  Object renewamount;
  Object refundamount;
  Object rechargeamount;
  Object contrastnewchargeamount;
  Object contrastnewchargedifference;
  Object newchargeamountyearrate;
  Object netrechargeamount;
  Object contrastnetrechargeamount;
  Object contrastnetrechargedifference;
  Object netrechargeamountyearrate;
  public Cashflowreport(){
  }
  public Cashflowreport(Long id,Integer version,Long snapshotid,String statdatekey,String statdatename,String regionid,String regionname,String branchid,String branchname,String campusid,String campusname,Integer campusage,Object newchargeamount,Object renewamount,Object refundamount,Object rechargeamount,Object contrastnewchargeamount,Object contrastnewchargedifference,Object newchargeamountyearrate,Object netrechargeamount,Object contrastnetrechargeamount,Object contrastnetrechargedifference,Object netrechargeamountyearrate){
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
      this.newchargeamount=newchargeamount;
      this.renewamount=renewamount;
      this.refundamount=refundamount;
      this.rechargeamount=rechargeamount;
      this.contrastnewchargeamount=contrastnewchargeamount;
      this.contrastnewchargedifference=contrastnewchargedifference;
      this.newchargeamountyearrate=newchargeamountyearrate;
      this.netrechargeamount=netrechargeamount;
      this.contrastnetrechargeamount=contrastnetrechargeamount;
      this.contrastnetrechargedifference=contrastnetrechargedifference;
      this.netrechargeamountyearrate=netrechargeamountyearrate;
  }
}