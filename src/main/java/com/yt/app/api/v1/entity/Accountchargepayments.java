package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:45
*/
@Getter
@Setter
public class Accountchargepayments implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long applyid;
  String payno;
  java.util.Date paytime;
  String paytype;
  String payticket;
  String paystatus;
  Object paymoney;
  String paymemo;
  java.util.Date inputtime;
  java.util.Date swipetime;
  String printstatus;
  String salesman;
  String payer;
  Long payeeid;
  String payeename;
  Long payeejobid;
  String payeejobname;
  Long checkerid;
  String checkername;
  Long checkerjobid;
  String checkerjobname;
  String checkstatus;
  java.util.Date checktime;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  Long modifierid;
  String modifiername;
  java.util.Date modifytime;
  String issyn;
  java.util.Date syntime;
  public Accountchargepayments(){
  }
  public Accountchargepayments(Long id,Integer version,Long applyid,String payno,java.util.Date paytime,String paytype,String payticket,String paystatus,Object paymoney,String paymemo,java.util.Date inputtime,java.util.Date swipetime,String printstatus,String salesman,String payer,Long payeeid,String payeename,Long payeejobid,String payeejobname,Long checkerid,String checkername,Long checkerjobid,String checkerjobname,String checkstatus,java.util.Date checktime,Long creatorid,String creatorname,java.util.Date createtime,Long modifierid,String modifiername,java.util.Date modifytime,String issyn,java.util.Date syntime){
      this.id=id;
      this.version=version;
      this.applyid=applyid;
      this.payno=payno;
      this.paytime=paytime;
      this.paytype=paytype;
      this.payticket=payticket;
      this.paystatus=paystatus;
      this.paymoney=paymoney;
      this.paymemo=paymemo;
      this.inputtime=inputtime;
      this.swipetime=swipetime;
      this.printstatus=printstatus;
      this.salesman=salesman;
      this.payer=payer;
      this.payeeid=payeeid;
      this.payeename=payeename;
      this.payeejobid=payeejobid;
      this.payeejobname=payeejobname;
      this.checkerid=checkerid;
      this.checkername=checkername;
      this.checkerjobid=checkerjobid;
      this.checkerjobname=checkerjobname;
      this.checkstatus=checkstatus;
      this.checktime=checktime;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
      this.issyn=issyn;
      this.syntime=syntime;
  }
}