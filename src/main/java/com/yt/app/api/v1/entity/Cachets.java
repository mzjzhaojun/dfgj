package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:19
*/
@Getter
@Setter
public class Cachets implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  Long materialid;
  String materialname;
  String materialalias;
  java.util.Date createtime;
  public Cachets(){
  }
  public Cachets(Long id,Integer version,Long campusid,Long materialid,String materialname,String materialalias,java.util.Date createtime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.materialid=materialid;
      this.materialname=materialname;
      this.materialalias=materialalias;
      this.createtime=createtime;
  }
}