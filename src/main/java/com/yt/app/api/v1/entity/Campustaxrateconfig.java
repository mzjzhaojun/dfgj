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
public class Campustaxrateconfig implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String campusname;
  String kingdeeorganizationid;
  String kingdeeorganizationname;
  Object taxrate;
  String formula;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Campustaxrateconfig(){
  }
  public Campustaxrateconfig(Long id,Integer version,Long campusid,String campusname,String kingdeeorganizationid,String kingdeeorganizationname,Object taxrate,String formula,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.kingdeeorganizationid=kingdeeorganizationid;
      this.kingdeeorganizationname=kingdeeorganizationname;
      this.taxrate=taxrate;
      this.formula=formula;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}