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
public class Discountitems implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long itemid;
  Long discountid;
  Object discountvalue;
  Object discountstandard;
  public Discountitems(){
  }
  public Discountitems(Long id,Integer version,Long itemid,Long discountid,Object discountvalue,Object discountstandard){
      this.id=id;
      this.version=version;
      this.itemid=itemid;
      this.discountid=discountid;
      this.discountvalue=discountvalue;
      this.discountstandard=discountstandard;
  }
}