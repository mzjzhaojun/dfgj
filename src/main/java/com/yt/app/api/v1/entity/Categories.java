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
public class Categories implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long categoryid;
  String category;
  String categoryname;
  String categorytype;
  Integer hascourse;
  Integer caninput;
  Integer enabled;
  Integer sortno;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Categories(){
  }
  public Categories(Long id,Integer version,Long categoryid,String category,String categoryname,String categorytype,Integer hascourse,Integer caninput,Integer enabled,Integer sortno,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.categoryid=categoryid;
      this.category=category;
      this.categoryname=categoryname;
      this.categorytype=categorytype;
      this.hascourse=hascourse;
      this.caninput=caninput;
      this.enabled=enabled;
      this.sortno=sortno;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}