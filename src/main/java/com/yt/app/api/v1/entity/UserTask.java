package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:03
*/
@Getter
@Setter
public class UserTask implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long task_guid;
  String application_name;
  String program_name;
  Integer task_level;
  String task_title;
  Long resource_id;
  Long process_id;
  Long activity_id;
  String url;
  String data;
  Integer emergency;
  String purpose;
  String status;
  String task_start_time;
  String expire_time;
  Long source_id;
  String source_name;
  Long send_to_user;
  String send_to_user_name;
  String read_time;
  Long category_guid;
  Integer top_flag;
  String draft_department_name;
  String deliver_time;
  Long draft_user_id;
  String draft_user_name;
  Integer operation_type;
  String operation_name;
  String from_transition_key;
  String from_transition_name;
  Long from_activity_id;
  String from_activity_key;
  String to_activity_key;
  public UserTask(){
  }
  public UserTask(Long id,Integer version,Long task_guid,String application_name,String program_name,Integer task_level,String task_title,Long resource_id,Long process_id,Long activity_id,String url,String data,Integer emergency,String purpose,String status,String task_start_time,String expire_time,Long source_id,String source_name,Long send_to_user,String send_to_user_name,String read_time,Long category_guid,Integer top_flag,String draft_department_name,String deliver_time,Long draft_user_id,String draft_user_name,Integer operation_type,String operation_name,String from_transition_key,String from_transition_name,Long from_activity_id,String from_activity_key,String to_activity_key){
      this.id=id;
      this.version=version;
      this.task_guid=task_guid;
      this.application_name=application_name;
      this.program_name=program_name;
      this.task_level=task_level;
      this.task_title=task_title;
      this.resource_id=resource_id;
      this.process_id=process_id;
      this.activity_id=activity_id;
      this.url=url;
      this.data=data;
      this.emergency=emergency;
      this.purpose=purpose;
      this.status=status;
      this.task_start_time=task_start_time;
      this.expire_time=expire_time;
      this.source_id=source_id;
      this.source_name=source_name;
      this.send_to_user=send_to_user;
      this.send_to_user_name=send_to_user_name;
      this.read_time=read_time;
      this.category_guid=category_guid;
      this.top_flag=top_flag;
      this.draft_department_name=draft_department_name;
      this.deliver_time=deliver_time;
      this.draft_user_id=draft_user_id;
      this.draft_user_name=draft_user_name;
      this.operation_type=operation_type;
      this.operation_name=operation_name;
      this.from_transition_key=from_transition_key;
      this.from_transition_name=from_transition_name;
      this.from_activity_id=from_activity_id;
      this.from_activity_key=from_activity_key;
      this.to_activity_key=to_activity_key;
  }
}