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
public class Educatecountryperfdaysum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Integer year;
  Integer month;
  Integer day;
  Integer onetoonehourcount;
  Object onetoonehourincome;
  Integer grouphourcount;
  Object grouphourincome;
  Object renewalmoney;
  Object refundmoney;
  String createtime;
  public Educatecountryperfdaysum(){
  }
  public Educatecountryperfdaysum(Long id,Integer version,Integer year,Integer month,Integer day,Integer onetoonehourcount,Object onetoonehourincome,Integer grouphourcount,Object grouphourincome,Object renewalmoney,Object refundmoney,String createtime){
      this.id=id;
      this.version=version;
      this.year=year;
      this.month=month;
      this.day=day;
      this.onetoonehourcount=onetoonehourcount;
      this.onetoonehourincome=onetoonehourincome;
      this.grouphourcount=grouphourcount;
      this.grouphourincome=grouphourincome;
      this.renewalmoney=renewalmoney;
      this.refundmoney=refundmoney;
      this.createtime=createtime;
  }
}