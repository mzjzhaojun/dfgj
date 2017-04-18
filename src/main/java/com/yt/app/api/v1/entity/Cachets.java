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
public class Cachets implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  Long materialid;
  String materialname;
  String materialalias;
  String createtime;
  public Cachets(){
  }
  public Cachets(Long id,Integer version,Long campusid,Long materialid,String materialname,String materialalias,String createtime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.materialid=materialid;
      this.materialname=materialname;
      this.materialalias=materialalias;
      this.createtime=createtime;
  }
}