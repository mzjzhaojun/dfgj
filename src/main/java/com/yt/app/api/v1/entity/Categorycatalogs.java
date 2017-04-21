package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:23
*/
@Getter
@Setter
public class Categorycatalogs implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long catalogid;
  String catalog;
  String catalogname;
  Integer haspartner;
  Integer eanbled;
  Long creatorid;
  String creatorname;
  java.util.Date createtime;
  Long modifierid;
  String modifiername;
  java.util.Date modifytime;
  public Categorycatalogs(){
  }
  public Categorycatalogs(Long id,Integer version,Long catalogid,String catalog,String catalogname,Integer haspartner,Integer eanbled,Long creatorid,String creatorname,java.util.Date createtime,Long modifierid,String modifiername,java.util.Date modifytime){
      this.id=id;
      this.version=version;
      this.catalogid=catalogid;
      this.catalog=catalog;
      this.catalogname=catalogname;
      this.haspartner=haspartner;
      this.eanbled=eanbled;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}