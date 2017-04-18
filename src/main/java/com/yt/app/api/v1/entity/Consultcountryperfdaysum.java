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
public class Consultcountryperfdaysum implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Integer year;
  Integer month;
  Integer day;
  Object moneycount;
  Integer peoplecount;
  Object newmoneycount;
  Integer newpeoplecount;
  String createtime;
  public Consultcountryperfdaysum(){
  }
  public Consultcountryperfdaysum(Long id,Integer version,Integer year,Integer month,Integer day,Object moneycount,Integer peoplecount,Object newmoneycount,Integer newpeoplecount,String createtime){
      this.id=id;
      this.version=version;
      this.year=year;
      this.month=month;
      this.day=day;
      this.moneycount=moneycount;
      this.peoplecount=peoplecount;
      this.newmoneycount=newmoneycount;
      this.newpeoplecount=newpeoplecount;
      this.createtime=createtime;
  }
}