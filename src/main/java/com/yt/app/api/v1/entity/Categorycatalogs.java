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
public class Categorycatalogs implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long categoryid;
  Long catalogid;
  String catalog;
  String catalogname;
  Integer haspartner;
  Integer eanbled;
  Integer sortno;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Categorycatalogs(){
  }
  public Categorycatalogs(Long id,Integer version,Long categoryid,Long catalogid,String catalog,String catalogname,Integer haspartner,Integer eanbled,Integer sortno,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.categoryid=categoryid;
      this.catalogid=catalogid;
      this.catalog=catalog;
      this.catalogname=catalogname;
      this.haspartner=haspartner;
      this.eanbled=eanbled;
      this.sortno=sortno;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}