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
public class LogSys_info implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String username;
  String userid;
  String userdn;
  String hostaddress;
  String hostname;
  String iever;
  String winver;
  String killinfo;
  String environment;
  String log_date;
  public LogSys_info(){
  }
  public LogSys_info(Long id,Integer version,String username,String userid,String userdn,String hostaddress,String hostname,String iever,String winver,String killinfo,String environment,String log_date){
      this.id=id;
      this.version=version;
      this.username=username;
      this.userid=userid;
      this.userdn=userdn;
      this.hostaddress=hostaddress;
      this.hostname=hostname;
      this.iever=iever;
      this.winver=winver;
      this.killinfo=killinfo;
      this.environment=environment;
      this.log_date=log_date;
  }
}