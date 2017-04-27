package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:50
*/
@Getter
@Setter
public class Teacherchargeallots implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long chargeallotid;
  Long staffid;
  Long customerid;
  String customercode;
  Long campusid;
  java.util.Date chargepaytime;
  Object chargeallotmoney;
  java.util.Date createtime;
  Long taskid;
  public Teacherchargeallots(){
  }
  public Teacherchargeallots(Long id,Integer version,Long chargeallotid,Long staffid,Long customerid,String customercode,Long campusid,java.util.Date chargepaytime,Object chargeallotmoney,java.util.Date createtime,Long taskid){
      this.id=id;
      this.version=version;
      this.chargeallotid=chargeallotid;
      this.staffid=staffid;
      this.customerid=customerid;
      this.customercode=customercode;
      this.campusid=campusid;
      this.chargepaytime=chargepaytime;
      this.chargeallotmoney=chargeallotmoney;
      this.createtime=createtime;
      this.taskid=taskid;
  }
}