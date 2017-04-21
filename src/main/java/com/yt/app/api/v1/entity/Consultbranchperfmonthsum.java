package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:26
*/
@Getter
@Setter
public class Consultbranchperfmonthsum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Integer year;
  Integer month;
  Object moneycount;
  Object moneybranchrank;
  Integer moneyregionrank;
  Integer moneycountryrank;
  Object moneygrowthrate;
  Object peoplecount;
  Object peoplebranchrank;
  Integer peopleregionrank;
  Integer peoplecountryrank;
  Object newmoneytask;
  Object newmoney;
  String newmoneybranchrank;
  Integer newmoneyregionrank;
  Integer newmoneycountryrank;
  Integer newpeoplecount;
  Integer newpeoplebranchrank;
  Integer newpeoplecountryrank;
  Integer newpeoplecounttask;
  java.util.Date createtime;
  public Consultbranchperfmonthsum(){
  }
  public Consultbranchperfmonthsum(Long id,Integer version,Long regionid,Long branchid,Integer year,Integer month,Object moneycount,Object moneybranchrank,Integer moneyregionrank,Integer moneycountryrank,Object moneygrowthrate,Object peoplecount,Object peoplebranchrank,Integer peopleregionrank,Integer peoplecountryrank,Object newmoneytask,Object newmoney,String newmoneybranchrank,Integer newmoneyregionrank,Integer newmoneycountryrank,Integer newpeoplecount,Integer newpeoplebranchrank,Integer newpeoplecountryrank,Integer newpeoplecounttask,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.year=year;
      this.month=month;
      this.moneycount=moneycount;
      this.moneybranchrank=moneybranchrank;
      this.moneyregionrank=moneyregionrank;
      this.moneycountryrank=moneycountryrank;
      this.moneygrowthrate=moneygrowthrate;
      this.peoplecount=peoplecount;
      this.peoplebranchrank=peoplebranchrank;
      this.peopleregionrank=peopleregionrank;
      this.peoplecountryrank=peoplecountryrank;
      this.newmoneytask=newmoneytask;
      this.newmoney=newmoney;
      this.newmoneybranchrank=newmoneybranchrank;
      this.newmoneyregionrank=newmoneyregionrank;
      this.newmoneycountryrank=newmoneycountryrank;
      this.newpeoplecount=newpeoplecount;
      this.newpeoplebranchrank=newpeoplebranchrank;
      this.newpeoplecountryrank=newpeoplecountryrank;
      this.newpeoplecounttask=newpeoplecounttask;
      this.createtime=createtime;
  }
}