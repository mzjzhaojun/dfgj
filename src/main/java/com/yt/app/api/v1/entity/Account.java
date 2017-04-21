package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-10-27 17:32:56
*/
@Getter
@Setter
public class Account implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  String account;
  String psw;
  String position;
  String phone;
  String mobile;
  String mail;
  Integer state;
  Integer flag;
  Integer lockstatus;
  Integer deletestatus;
  Integer validstatus;
  String picurl;
  String birthday;
  String name;
  String card_id;
  Integer type;
  String endtime;
  String lastlogin_time;
  String lastlogin_ip;
  String create_time;
  String create_user;
  String modify_time;
  Long staffid;
  Integer version;
  //新增字段
  Long roleid;
  String rolename;
  String typename;
  public Account(){
  }
  public Account(Long id,String account,String psw,String position,String phone,String mobile,String mail,Integer state,Integer flag,Integer lockstatus,Integer deletestatus,Integer validstatus,String picurl,String birthday,String name,String card_id,Integer type,String endtime,String lastlogin_time,String lastlogin_ip,String create_time,String create_user,String modify_time,Long staffid,Integer version){
      this.id=id;
      this.account=account;
      this.psw=psw;
      this.position=position;
      this.phone=phone;
      this.mobile=mobile;
      this.mail=mail;
      this.state=state;
      this.flag=flag;
      this.lockstatus=lockstatus;
      this.deletestatus=deletestatus;
      this.validstatus=validstatus;
      this.picurl=picurl;
      this.birthday=birthday;
      this.name=name;
      this.card_id=card_id;
      this.type=type;
      this.endtime=endtime;
      this.lastlogin_time=lastlogin_time;
      this.lastlogin_ip=lastlogin_ip;
      this.create_time=create_time;
      this.create_user=create_user;
      this.modify_time=modify_time;
		this.staffid = staffid;
      this.version=version;
  }
}