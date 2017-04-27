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
public class Teacherrefundallots implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long refundallotid;
  Long staffid;
  Long customerid;
  String customercode;
  Long campusid;
  java.util.Date refundverifytime;
  Object refundallotmoney;
  java.util.Date createtime;
  Long taskid;
  public Teacherrefundallots(){
  }
  public Teacherrefundallots(Long id,Integer version,Long refundallotid,Long staffid,Long customerid,String customercode,Long campusid,java.util.Date refundverifytime,Object refundallotmoney,java.util.Date createtime,Long taskid){
      this.id=id;
      this.version=version;
      this.refundallotid=refundallotid;
      this.staffid=staffid;
      this.customerid=customerid;
      this.customercode=customercode;
      this.campusid=campusid;
      this.refundverifytime=refundverifytime;
      this.refundallotmoney=refundallotmoney;
      this.createtime=createtime;
      this.taskid=taskid;
  }
}