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
public class Consultstaffperfdaysum implements Serializable{

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
  Integer day;
  Object moneycount;
  Integer peoplecount;
  Object newmoneycount;
  Integer newpeoplecount;
  java.util.Date createtime;
  public Consultstaffperfdaysum(){
  }
  public Consultstaffperfdaysum(Long id,Integer version,Long regionid,Long branchid,Long campusid,Long staffid,Long staffjobid,Integer year,Integer month,Integer day,Object moneycount,Integer peoplecount,Object newmoneycount,Integer newpeoplecount,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.campusid=campusid;
      this.staffid=staffid;
      this.staffjobid=staffjobid;
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