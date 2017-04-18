package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/
@Getter
@Setter
public class HrA_charges implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long chargeapplyid;
  Long staffid;
  Long staffjobid;
  Long customerid;
  String customercode;
  Long campusid;
  String chargepaytime;
  Object chargepaidmoney;
  String chargetype;
  Integer subjectcount;
  String createtime;
  Long taskid;
  public HrA_charges(){
  }
  public HrA_charges(Long id,Integer version,Long chargeapplyid,Long staffid,Long staffjobid,Long customerid,String customercode,Long campusid,String chargepaytime,Object chargepaidmoney,String chargetype,Integer subjectcount,String createtime,Long taskid){
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