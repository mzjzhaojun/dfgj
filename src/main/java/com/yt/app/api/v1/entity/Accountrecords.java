package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:17
*/
@Getter
@Setter
public class Accountrecords implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  Long customerid;
  Long accountid;
  java.util.Date recordtime;
  String recordtype;
  Integer recordflag;
  Long billid;
  String billno;
  Long billparentid;
  String billparentno;
  Long billrelateid;
  String billrelateno;
  java.util.Date billtime;
  String billtype;
  String billtypename;
  Object billmoney;
  String billmemo;
  Long billerid;
  String billername;
  Long billerjobid;
  String billerjobname;
  public Accountrecords(){
  }
  public Accountrecords(Long id,Integer version,Long campusid,Long customerid,Long accountid,java.util.Date recordtime,String recordtype,Integer recordflag,Long billid,String billno,Long billparentid,String billparentno,Long billrelateid,String billrelateno,java.util.Date billtime,String billtype,String billtypename,Object billmoney,String billmemo,Long billerid,String billername,Long billerjobid,String billerjobname){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.customerid=customerid;
      this.accountid=accountid;
      this.recordtime=recordtime;
      this.recordtype=recordtype;
      this.recordflag=recordflag;
      this.billid=billid;
      this.billno=billno;
      this.billparentid=billparentid;
      this.billparentno=billparentno;
      this.billrelateid=billrelateid;
      this.billrelateno=billrelateno;
      this.billtime=billtime;
      this.billtype=billtype;
      this.billtypename=billtypename;
      this.billmoney=billmoney;
      this.billmemo=billmemo;
      this.billerid=billerid;
      this.billername=billername;
      this.billerjobid=billerjobid;
      this.billerjobname=billerjobname;
  }
}