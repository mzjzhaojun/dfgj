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
public class Customerstaffrelationships implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long customerid;
  Long staffid;
  java.util.Date statlocaldate;
  String relationtype;
  Long campusid;
  Long referralstaffid;
  Long referralcustomerid;
  Object accountvalue;
  java.util.Date lastestclasstime;
  java.util.Date lastestpaytime;
  java.util.Date lastestrefundverifytime;
  Object onetooneamountinasset;
  Object classgroupamountinasset;
  Object youxueamountinasset;
  Object otheramountinasset;
  Object totalamountinasset;
  String isavailable;
  String isclasssuspended;
  String isactive;
  String isschoolsuspended;
  String isclassfinished;
  Integer graduated;
  public Customerstaffrelationships(){
  }
  public Customerstaffrelationships(Long id,Integer version,Long customerid,Long staffid,java.util.Date statlocaldate,String relationtype,Long campusid,Long referralstaffid,Long referralcustomerid,Object accountvalue,java.util.Date lastestclasstime,java.util.Date lastestpaytime,java.util.Date lastestrefundverifytime,Object onetooneamountinasset,Object classgroupamountinasset,Object youxueamountinasset,Object otheramountinasset,Object totalamountinasset,String isavailable,String isclasssuspended,String isactive,String isschoolsuspended,String isclassfinished,Integer graduated){
      this.id=id;
      this.version=version;
      this.customerid=customerid;
      this.staffid=staffid;
      this.statlocaldate=statlocaldate;
      this.relationtype=relationtype;
      this.campusid=campusid;
      this.referralstaffid=referralstaffid;
      this.referralcustomerid=referralcustomerid;
      this.accountvalue=accountvalue;
      this.lastestclasstime=lastestclasstime;
      this.lastestpaytime=lastestpaytime;
      this.lastestrefundverifytime=lastestrefundverifytime;
      this.onetooneamountinasset=onetooneamountinasset;
      this.classgroupamountinasset=classgroupamountinasset;
      this.youxueamountinasset=youxueamountinasset;
      this.otheramountinasset=otheramountinasset;
      this.totalamountinasset=totalamountinasset;
      this.isavailable=isavailable;
      this.isclasssuspended=isclasssuspended;
      this.isactive=isactive;
      this.isschoolsuspended=isschoolsuspended;
      this.isclassfinished=isclassfinished;
      this.graduated=graduated;
  }
}