package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:46
*/
@Getter
@Setter
public class HrAcharges implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long chargeapplyid;
  Long staffid;
  Long staffjobid;
  Long customerid;
  String customercode;
  Long campusid;
  java.util.Date chargepaytime;
  Object chargepaidmoney;
  String chargetype;
  Integer subjectcount;
  java.util.Date createtime;
  Long taskid;
  public HrAcharges(){
  }
  public HrAcharges(Long id,Integer version,Long chargeapplyid,Long staffid,Long staffjobid,Long customerid,String customercode,Long campusid,java.util.Date chargepaytime,Object chargepaidmoney,String chargetype,Integer subjectcount,java.util.Date createtime,Long taskid){
      this.id=id;
      this.version=version;
      this.chargeapplyid=chargeapplyid;
      this.staffid=staffid;
      this.staffjobid=staffjobid;
      this.customerid=customerid;
      this.customercode=customercode;
      this.campusid=campusid;
      this.chargepaytime=chargepaytime;
      this.chargepaidmoney=chargepaidmoney;
      this.chargetype=chargetype;
      this.subjectcount=subjectcount;
      this.createtime=createtime;
      this.taskid=taskid;
  }
}