package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-10-17 13:54:29
*/
@Getter
@Setter
public class Dictionary implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Long code;
  String name;
  Long typecode;
  String typename;
  Long parent_id;
  Integer level;
  Integer version;
  public Dictionary(){
  }
  public Dictionary(Long id,Long code,String name,Long typecode,String typename,Long parent_id,Integer level,Integer version){
      this.id=id;
      this.code=code;
      this.name=name;
      this.typecode=typecode;
      this.typename=typename;
      this.parent_id=parent_id;
      this.level=level;
      this.version=version;
  }
}