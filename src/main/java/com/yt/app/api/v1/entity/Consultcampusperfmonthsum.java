package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:47
*/
@Getter
@Setter
public class Consultcampusperfmonthsum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Long campusid;
  Integer year;
  Integer month;
  Object moneycount;
  Integer moneybranchrank;
  Integer moneycountryrank;
  Object peoplecount;
  Integer peoplebranchrank;
  Integer peoplecountryrank;
  Object newmoneytask;
  Object newmoney;
  Integer newmoneybranchrank;
  Integer newmoneycountryrank;
  Integer newpeoplecount;
  Integer newpeoplebranchrank;
  Integer newpeoplecountryrank;
  Integer newpeoplecounttask;
  java.util.Date createtime;
  public Consultcampusperfmonthsum(){
  }
  public Consultcampusperfmonthsum(Long id,Integer version,Long regionid,Long branchid,Long campusid,Integer year,Integer month,Object moneycount,Integer moneybranchrank,Integer moneycountryrank,Object peoplecount,Integer peoplebranchrank,Integer peoplecountryrank,Object newmoneytask,Object newmoney,Integer newmoneybranchrank,Integer newmoneycountryrank,Integer newpeoplecount,Integer newpeoplebranchrank,Integer newpeoplecountryrank,Integer newpeoplecounttask,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.campusid=campusid;
      this.year=year;
      this.month=month;
      this.moneycount=moneycount;
      this.moneybranchrank=moneybranchrank;
      this.moneycountryrank=moneycountryrank;
      this.peoplecount=peoplecount;
      this.peoplebranchrank=peoplebranchrank;
      this.peoplecountryrank=peoplecountryrank;
      this.newmoneytask=newmoneytask;
      this.newmoney=newmoney;
      this.newmoneybranchrank=newmoneybranchrank;
      this.newmoneycountryrank=newmoneycountryrank;
      this.newpeoplecount=newpeoplecount;
      this.newpeoplebranchrank=newpeoplebranchrank;
      this.newpeoplecountryrank=newpeoplecountryrank;
      this.newpeoplecounttask=newpeoplecounttask;
      this.createtime=createtime;
  }
}