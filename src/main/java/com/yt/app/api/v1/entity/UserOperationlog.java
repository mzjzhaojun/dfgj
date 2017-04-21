package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:03
*/
@Getter
@Setter
public class UserOperationlog implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String resource_id;
  String subject;
  String application_name;
  String program_name;
  Long process_id;
  Long activity_id;
  String activity_name;
  Long operator_id;
  String operator_name;
  Long top_dept_id;
  String top_dept_name;
  Long real_user_id;
  String real_user_name;
  java.util.Date operate_datetime;
  String operate_name;
  Integer operate_type;
  String operate_description;
  String http_context;
  Long correlation_id;
  public UserOperationlog(){
  }
  public UserOperationlog(Long id,Integer version,String resource_id,String subject,String application_name,String program_name,Long process_id,Long activity_id,String activity_name,Long operator_id,String operator_name,Long top_dept_id,String top_dept_name,Long real_user_id,String real_user_name,java.util.Date operate_datetime,String operate_name,Integer operate_type,String operate_description,String http_context,Long correlation_id){
      this.id=id;
      this.version=version;
      this.resource_id=resource_id;
      this.subject=subject;
      this.application_name=application_name;
      this.program_name=program_name;
      this.process_id=process_id;
      this.activity_id=activity_id;
      this.activity_name=activity_name;
      this.operator_id=operator_id;
      this.operator_name=operator_name;
      this.top_dept_id=top_dept_id;
      this.top_dept_name=top_dept_name;
      this.real_user_id=real_user_id;
      this.real_user_name=real_user_name;
      this.operate_datetime=operate_datetime;
      this.operate_name=operate_name;
      this.operate_type=operate_type;
      this.operate_description=operate_description;
      this.http_context=http_context;
      this.correlation_id=correlation_id;
  }
}