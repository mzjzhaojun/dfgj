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
public class HrG_educatoreffectivecustomer implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  Long educatorid;
  Long educatorjobid;
  String educatorname;
  Integer customernumber;
  String createtime;
  Long taskid;
  public HrG_educatoreffectivecustomer(){
  }
  public HrG_educatoreffectivecustomer(Long id,Integer version,Long campusid,Long educatorid,Long educatorjobid,String educatorname,Integer customernumber,String createtime,Long taskid){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.educatorid=educatorid;
      this.educatorjobid=educatorjobid;
      this.educatorname=educatorname;
      this.customernumber=customernumber;
      this.createtime=createtime;
      this.taskid=taskid;
  }
}