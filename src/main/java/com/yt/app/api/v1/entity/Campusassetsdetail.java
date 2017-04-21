package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:20
*/
@Getter
@Setter
public class Campusassetsdetail implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Integer monthkey;
  java.util.Date statlocaldate;
  Long campusid;
  String categorytype;
  String grade;
  Object residualamount;
  Object residualmoney;
  Object dailyorderamount;
  Object dailyordermoney;
  Object dailydebookamount;
  Object dailydebookmoney;
  Object dailyincomeamount;
  Object dailyincomemoney;
  public Campusassetsdetail(){
  }
  public Campusassetsdetail(Long id,Integer version,Integer monthkey,java.util.Date statlocaldate,Long campusid,String categorytype,String grade,Object residualamount,Object residualmoney,Object dailyorderamount,Object dailyordermoney,Object dailydebookamount,Object dailydebookmoney,Object dailyincomeamount,Object dailyincomemoney){
      this.id=id;
      this.version=version;
      this.monthkey=monthkey;
      this.statlocaldate=statlocaldate;
      this.campusid=campusid;
      this.categorytype=categorytype;
      this.grade=grade;
      this.residualamount=residualamount;
      this.residualmoney=residualmoney;
      this.dailyorderamount=dailyorderamount;
      this.dailyordermoney=dailyordermoney;
      this.dailydebookamount=dailydebookamount;
      this.dailydebookmoney=dailydebookmoney;
      this.dailyincomeamount=dailyincomeamount;
      this.dailyincomemoney=dailyincomemoney;
  }
}