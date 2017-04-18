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
public class Campuschargestat implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String statlocaldate;
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
  Object newchargeamount;
  Object renewamount;
  Object refundamount;
  public Campuschargestat(){
  }
  public Campuschargestat(Long id,Integer version,String statlocaldate,Long campusid,String campusname,String campusshortname,Long branchid,String branchname,String branchshortname,Long regionid,String regionname,String regionshortname,Long hqid,String hqname,String hqshortname,String campusdeliverdate,Integer campusage,Object newchargeamount,Object renewamount,Object refundamount){
      this.id=id;
      this.version=version;
      this.statlocaldate=statlocaldate;
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
      this.newchargeamount=newchargeamount;
      this.renewamount=renewamount;
      this.refundamount=refundamount;
  }
}