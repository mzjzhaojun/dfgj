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
public class Productsalaryrules implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long ruleid;
  Long productid;
  String ruleobject;
  Object moneyperhour;
  Object moneyperperiod;
  public Productsalaryrules(){
  }
  public Productsalaryrules(Long id,Integer version,Long ruleid,Long productid,String ruleobject,Object moneyperhour,Object moneyperperiod){
      this.id=id;
      this.version=version;
      this.ruleid=ruleid;
      this.productid=productid;
      this.ruleobject=ruleobject;
      this.moneyperhour=moneyperhour;
      this.moneyperperiod=moneyperperiod;
  }
}