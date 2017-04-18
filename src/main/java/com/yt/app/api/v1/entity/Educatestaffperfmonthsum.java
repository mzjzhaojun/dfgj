package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/
@Getter
@Setter
public class Educatestaffperfmonthsum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Long campusid;
  Long staffid;
  Long staffjobid;
  Integer year;
  Integer month;
  Integer onetoonehourcount;
  Object onetoonehourincome;
  Integer onetoonecampusrank;
  Integer onetoonebranchrank;
  Integer onetoonecountryrank;
  Integer grouphourcount;
  Object grouphourincome;
  Integer groupcampusrank;
  Integer groupbranchrank;
  Integer groupcountryrank;
  Object renewalmoney;
  Integer renewalcampusrank;
  Integer renewalbranchrank;
  Integer renewalcountryrank;
  Object refundmoney;
  Integer hourcounttask;
  Object renewalmoneytask;
  String createtime;
  public Educatestaffperfmonthsum(){
  }
  public Educatestaffperfmonthsum(Long id,Integer version,Long regionid,Long branchid,Long campusid,Long staffid,Long staffjobid,Integer year,Integer month,Integer onetoonehourcount,Object onetoonehourincome,Integer onetoonecampusrank,Integer onetoonebranchrank,Integer onetoonecountryrank,Integer grouphourcount,Object grouphourincome,Integer groupcampusrank,Integer groupbranchrank,Integer groupcountryrank,Object renewalmoney,Integer renewalcampusrank,Integer renewalbranchrank,Integer renewalcountryrank,Object refundmoney,Integer hourcounttask,Object renewalmoneytask,String createtime){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.campusid=campusid;
      this.staffid=staffid;
      this.staffjobid=staffjobid;
      this.year=year;
      this.month=month;
      this.onetoonehourcount=onetoonehourcount;
      this.onetoonehourincome=onetoonehourincome;
      this.onetoonecampusrank=onetoonecampusrank;
      this.onetoonebranchrank=onetoonebranchrank;
      this.onetoonecountryrank=onetoonecountryrank;
      this.grouphourcount=grouphourcount;
      this.grouphourincome=grouphourincome;
      this.groupcampusrank=groupcampusrank;
      this.groupbranchrank=groupbranchrank;
      this.groupcountryrank=groupcountryrank;
      this.renewalmoney=renewalmoney;
      this.renewalcampusrank=renewalcampusrank;
      this.renewalbranchrank=renewalbranchrank;
      this.renewalcountryrank=renewalcountryrank;
      this.refundmoney=refundmoney;
      this.hourcounttask=hourcounttask;
      this.renewalmoneytask=renewalmoneytask;
      this.createtime=createtime;
  }
}