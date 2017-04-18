package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/
@Getter
@Setter
public class Customerstopalerts implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long alertid;
  String alerttype;
  String alerttime;
  String alertreason;
  String alertreasonname;
  Long operatorid;
  String operatorname;
  Long operatorjobid;
  String operatorjobname;
  Long customerid;
  public Customerstopalerts(){
  }
  public Customerstopalerts(Long id,Integer version,Long alertid,String alerttype,String alerttime,String alertreason,String alertreasonname,Long operatorid,String operatorname,Long operatorjobid,String operatorjobname,Long customerid){
      this.id=id;
      this.version=version;
      this.alertid=alertid;
      this.alerttype=alerttype;
      this.alerttime=alerttime;
      this.alertreason=alertreason;
      this.alertreasonname=alertreasonname;
      this.operatorid=operatorid;
      this.operatorname=operatorname;
      this.operatorjobid=operatorjobid;
      this.operatorjobname=operatorjobname;
      this.customerid=customerid;
  }
}