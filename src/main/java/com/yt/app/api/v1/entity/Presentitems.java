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
public class Presentitems implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long itemid;
  Long presentid;
  Object presentvalue;
  Object presentstandard;
  public Presentitems(){
  }
  public Presentitems(Long id,Integer version,Long itemid,Long presentid,Object presentvalue,Object presentstandard){
      this.id=id;
      this.version=version;
      this.itemid=itemid;
      this.presentid=presentid;
      this.presentvalue=presentvalue;
      this.presentstandard=presentstandard;
  }
}