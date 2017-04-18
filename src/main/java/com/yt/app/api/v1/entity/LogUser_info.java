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
public class LogUser_info implements Serializable{

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
  String log_date;
  Object app_data;
  public LogUser_info(){
  }
  public LogUser_info(Long id,Integer version,String username,String userid,String userdn,String hostaddress,String application_name,String program_name,String url,Long resourceid,String operation_type,Object state_before,Object state_after,String log_date,Object app_data){
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