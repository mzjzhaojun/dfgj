package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/
@Getter
@Setter
public class Customeraccountmonthlystat implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Integer monthkey;
  Long customerid;
  String customername;
  Object accountvaluebegin;
  Object accountmoneybegin;
  Object chargeamountplmccm;
  Object chargeamountcm;
  Object debookamountcm;
  Object debookreturnamountcm;
  Object nerefundamountcm;
  Object orderamountcm;
  Object deductamountcm;
  Object returnamountcm;
  Object accountmoneyend;
  Object assetsmoneybegin;
  Object dlreturnmoneycm;
  Object assignamountplmccm;
  Object assignamountcm;
  Object assetsmoneyend;
  Object accountvalueend;
  public Customeraccountmonthlystat(){
  }
  public Customeraccountmonthlystat(Long id,Integer version,Integer monthkey,Long customerid,String customername,Object accountvaluebegin,Object accountmoneybegin,Object chargeamountplmccm,Object chargeamountcm,Object debookamountcm,Object debookreturnamountcm,Object nerefundamountcm,Object orderamountcm,Object deductamountcm,Object returnamountcm,Object accountmoneyend,Object assetsmoneybegin,Object dlreturnmoneycm,Object assignamountplmccm,Object assignamountcm,Object assetsmoneyend,Object accountvalueend){
      this.id=id;
      this.version=version;
      this.monthkey=monthkey;
      this.customerid=customerid;
      this.customername=customername;
      this.accountvaluebegin=accountvaluebegin;
      this.accountmoneybegin=accountmoneybegin;
      this.chargeamountplmccm=chargeamountplmccm;
      this.chargeamountcm=chargeamountcm;
      this.debookamountcm=debookamountcm;
      this.debookreturnamountcm=debookreturnamountcm;
      this.nerefundamountcm=nerefundamountcm;
      this.orderamountcm=orderamountcm;
      this.deductamountcm=deductamountcm;
      this.returnamountcm=returnamountcm;
      this.accountmoneyend=accountmoneyend;
      this.assetsmoneybegin=assetsmoneybegin;
      this.dlreturnmoneycm=dlreturnmoneycm;
      this.assignamountplmccm=assignamountplmccm;
      this.assignamountcm=assignamountcm;
      this.assetsmoneyend=assetsmoneyend;
      this.accountvalueend=accountvalueend;
  }
}