package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-10-14 10:16:02
*/
@Getter
@Setter
public class MenuLinks implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Long menu_id;
  Long links_id;
  Integer version;
  public MenuLinks(){
  }
  public MenuLinks(Long id,Long menu_id,Long links_id,Integer version){
      this.id=id;
      this.menu_id=menu_id;
      this.links_id=links_id;
      this.version=version;
  }
}