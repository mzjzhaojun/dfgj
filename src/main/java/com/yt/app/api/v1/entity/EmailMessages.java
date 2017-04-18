package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:01
*/
@Getter
@Setter
public class EmailMessages implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long message_id;
  String body;
  String body_encoding;
  String headers_encoding;
  String is_body_html;
  Integer priority;
  String subject;
  String subject_encoding;
  Integer status;
  String status_text;
  String sent_time;
  public EmailMessages(){
  }
  public EmailMessages(Long id,Integer version,Long message_id,String body,String body_encoding,String headers_encoding,String is_body_html,Integer priority,String subject,String subject_encoding,Integer status,String status_text,String sent_time){
      this.id=id;
      this.version=version;
      this.message_id=message_id;
      this.body=body;
      this.body_encoding=body_encoding;
      this.headers_encoding=headers_encoding;
      this.is_body_html=is_body_html;
      this.priority=priority;
      this.subject=subject;
      this.subject_encoding=subject_encoding;
      this.status=status;
      this.status_text=status_text;
      this.sent_time=sent_time;
  }
}