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
public class HrC_refunds implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long refundapplyid;
  Long staffid;
  Long staffjobid;
  Long customerid;
  String customercode;
  Long campusid;
  String chargepaytime;
  String refundverifytime;
  Object refundrealmoney;
  String createtime;
  Long taskid;
  public HrC_refunds(){
  }
  public HrC_refunds(Long id,Integer version,Long refundapplyid,Long staffid,Long staffjobid,Long customerid,String customercode,Long campusid,String chargepaytime,String refundverifytime,Object refundrealmoney,String createtime,Long taskid){
      this.id=id;
      this.version=version;
      this.refundapplyid=refundapplyid;
      this.staffid=staffid;
      this.staffjobid=staffjobid;
      this.customerid=customerid;
      this.customercode=customercode;
      this.campusid=campusid;
      this.chargepaytime=chargepaytime;
      this.refundverifytime=refundverifytime;
      this.refundrealmoney=refundrealmoney;
      this.createtime=createtime;
      this.taskid=taskid;
  }
}