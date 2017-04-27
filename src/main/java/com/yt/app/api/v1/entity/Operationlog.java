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
public class Operationlog implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long resourceid;
  Long correlationid;
  String category;
  Long operatorid;
  String operatorname;
  Long realoperatorid;
  String realoperatorname;
  String requestcontext;
  String subject;
  String schematype;
  String operationtype;
  String searchcontent;
  java.util.Date createtime;
  Long rowuniqueid;
  public Operationlog(){
  }
  public Operationlog(Long id,Integer version,Long resourceid,Long correlationid,String category,Long operatorid,String operatorname,Long realoperatorid,String realoperatorname,String requestcontext,String subject,String schematype,String operationtype,String searchcontent,java.util.Date createtime,Long rowuniqueid){
      this.id=id;
      this.version=version;
      this.resourceid=resourceid;
      this.correlationid=correlationid;
      this.category=category;
      this.operatorid=operatorid;
      this.operatorname=operatorname;
      this.realoperatorid=realoperatorid;
      this.realoperatorname=realoperatorname;
      this.requestcontext=requestcontext;
      this.subject=subject;
      this.schematype=schematype;
      this.operationtype=operationtype;
      this.searchcontent=searchcontent;
      this.createtime=createtime;
      this.rowuniqueid=rowuniqueid;
  }
}