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
public class Rooms implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String campusname;
  Long roomid;
  String roomcode;
  String roomname;
  String roomstatus;
  Integer sortno;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Rooms(){
  }
  public Rooms(Long id,Integer version,Long campusid,String campusname,Long roomid,String roomcode,String roomname,String roomstatus,Integer sortno,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.campusname=campusname;
      this.roomid=roomid;
      this.roomcode=roomcode;
      this.roomname=roomname;
      this.roomstatus=roomstatus;
      this.sortno=sortno;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}