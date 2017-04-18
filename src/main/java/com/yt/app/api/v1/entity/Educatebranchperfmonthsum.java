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
public class Educatebranchperfmonthsum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Integer year;
  Integer month;
  Integer onetoonehourcount;
  Object onetoonehourincome;
  Integer onetoonebranchrank;
  Integer onetoonecountryrank;
  Integer grouphourcount;
  Object grouphourincome;
  Integer groupbranchrank;
  Integer groupcountryrank;
  Object renewalmoney;
  Integer renewalbranchrank;
  Integer renewalcountryrank;
  Object refundmoney;
  Integer hourcounttask;
  Object renewalmoneytask;
  Object hourincometask;
  Object refundmoneytask;
  String createtime;
  public Educatebranchperfmonthsum(){
  }
  public Educatebranchperfmonthsum(Long id,Integer version,Long regionid,Long branchid,Integer year,Integer month,Integer onetoonehourcount,Object onetoonehourincome,Integer onetoonebranchrank,Integer onetoonecountryrank,Integer grouphourcount,Object grouphourincome,Integer groupbranchrank,Integer groupcountryrank,Object renewalmoney,Integer renewalbranchrank,Integer renewalcountryrank,Object refundmoney,Integer hourcounttask,Object renewalmoneytask,Object hourincometask,Object refundmoneytask,String createtime){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.year=year;
      this.month=month;
      this.onetoonehourcount=onetoonehourcount;
      this.onetoonehourincome=onetoonehourincome;
      this.onetoonebranchrank=onetoonebranchrank;
      this.onetoonecountryrank=onetoonecountryrank;
      this.grouphourcount=grouphourcount;
      this.grouphourincome=grouphourincome;
      this.groupbranchrank=groupbranchrank;
      this.groupcountryrank=groupcountryrank;
      this.renewalmoney=renewalmoney;
      this.renewalbranchrank=renewalbranchrank;
      this.renewalcountryrank=renewalcountryrank;
      this.refundmoney=refundmoney;
      this.hourcounttask=hourcounttask;
      this.renewalmoneytask=renewalmoneytask;
      this.hourincometask=hourincometask;
      this.refundmoneytask=refundmoneytask;
      this.createtime=createtime;
  }
}