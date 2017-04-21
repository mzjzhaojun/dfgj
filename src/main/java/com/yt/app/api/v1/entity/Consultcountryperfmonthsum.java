package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:27
*/
@Getter
@Setter
public class Consultcountryperfmonthsum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Integer year;
  Integer month;
  Object moneycount;
  Object peoplecount;
  Object newmoneytask;
  Object newmoney;
  Integer newpeoplecount;
  Integer newpeoplecounttask;
  java.util.Date createtime;
  public Consultcountryperfmonthsum(){
  }
  public Consultcountryperfmonthsum(Long id,Integer version,Integer year,Integer month,Object moneycount,Object peoplecount,Object newmoneytask,Object newmoney,Integer newpeoplecount,Integer newpeoplecounttask,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.year=year;
      this.month=month;
      this.moneycount=moneycount;
      this.peoplecount=peoplecount;
      this.newmoneytask=newmoneytask;
      this.newmoney=newmoney;
      this.newpeoplecount=newpeoplecount;
      this.newpeoplecounttask=newpeoplecounttask;
      this.createtime=createtime;
  }
}