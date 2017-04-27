package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:45
*/
@Getter
@Setter
public class Jobcode implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  String name;
  Long type;
  Long status;
  java.util.Date createtime;
  java.util.Date modifytime;
  public Jobcode(){
  }
  public Jobcode(Long id,String name,Long type,Long status,java.util.Date createtime,java.util.Date modifytime){
      this.id=id;
      this.name=name;
      this.type=type;
      this.status=status;
      this.createtime=createtime;
      this.modifytime=modifytime;
  }
}