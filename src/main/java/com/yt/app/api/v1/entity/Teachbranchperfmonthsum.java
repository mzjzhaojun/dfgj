package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/
@Getter
@Setter
public class Teachbranchperfmonthsum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Integer year;
  Integer month;
  Object hourcount;
  Object hourcounttask;
  Object renewalmoney;
  Object refundmoney;
  Object onetoonehourcount;
  Object onetoonebranchrank;
  Object onetoonecountryrank;
  Object grouphourcount;
  Object groupbranchrank;
  Object groupcountryrank;
  java.util.Date createtime;
  public Teachbranchperfmonthsum(){
  }
  public Teachbranchperfmonthsum(Long id,Integer version,Long regionid,Long branchid,Integer year,Integer month,Object hourcount,Object hourcounttask,Object renewalmoney,Object refundmoney,Object onetoonehourcount,Object onetoonebranchrank,Object onetoonecountryrank,Object grouphourcount,Object groupbranchrank,Object groupcountryrank,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.year=year;
      this.month=month;
      this.hourcount=hourcount;
      this.hourcounttask=hourcounttask;
      this.renewalmoney=renewalmoney;
      this.refundmoney=refundmoney;
      this.onetoonehourcount=onetoonehourcount;
      this.onetoonebranchrank=onetoonebranchrank;
      this.onetoonecountryrank=onetoonecountryrank;
      this.grouphourcount=grouphourcount;
      this.groupbranchrank=groupbranchrank;
      this.groupcountryrank=groupcountryrank;
      this.createtime=createtime;
  }
}