package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:48
*/
@Getter
@Setter
public class LogUserinfo implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String username;
  String userid;
  String userdn;
  String hostaddress;
  String application_name;
  String program_name;
  String url;
  Long resourceid;
  String operation_type;
  Object state_before;
  Object state_after;
  java.util.Date log_date;
  Object app_data;
  public LogUserinfo(){
  }
  public LogUserinfo(Long id,Integer version,String username,String userid,String userdn,String hostaddress,String application_name,String program_name,String url,Long resourceid,String operation_type,Object state_before,Object state_after,java.util.Date log_date,Object app_data){
      this.id=id;
      this.version=version;
      this.username=username;
      this.userid=userid;
      this.userdn=userdn;
      this.hostaddress=hostaddress;
      this.application_name=application_name;
      this.program_name=program_name;
      this.url=url;
      this.resourceid=resourceid;
      this.operation_type=operation_type;
      this.state_before=state_before;
      this.state_after=state_after;
      this.log_date=log_date;
      this.app_data=app_data;
  }
}