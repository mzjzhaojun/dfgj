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
public class HrD_chargeallots implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long chargeallotid;
  Long staffid;
  Long customerid;
  String customercode;
  Long campusid;
  String chargepaytime;
  Object chargeallotmoney;
  String createtime;
  Long taskid;
  public HrD_chargeallots(){
  }
  public HrD_chargeallots(Long id,Integer version,Long chargeallotid,Long staffid,Long customerid,String customercode,Long campusid,String chargepaytime,Object chargeallotmoney,String createtime,Long taskid){
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