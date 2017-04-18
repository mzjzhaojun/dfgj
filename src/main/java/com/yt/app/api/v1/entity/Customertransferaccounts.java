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
public class Customertransferaccounts implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long applyid;
  Long accountid;
  String accountcode;
  Object accountmoney;
  Object accountvalue;
  Long discountid;
  String discountcode;
  Object discountbase;
  Object discountrate;
  public Customertransferaccounts(){
  }
  public Customertransferaccounts(Long id,Integer version,Long applyid,Long accountid,String accountcode,Object accountmoney,Object accountvalue,Long discountid,String discountcode,Object discountbase,Object discountrate){
      this.id=id;
      this.version=version;
      this.applyid=applyid;
      this.accountid=accountid;
      this.accountcode=accountcode;
      this.accountmoney=accountmoney;
      this.accountvalue=accountvalue;
      this.discountid=discountid;
      this.discountcode=discountcode;
      this.discountbase=discountbase;
      this.discountrate=discountrate;
  }
}