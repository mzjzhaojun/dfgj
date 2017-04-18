package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:00
*/
@Getter
@Setter
public class Classlessonitems implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long lessonid;
  Integer sortno;
  Long assignid;
  String assigntime;
  String assignstatus;
  Object assignprice;
  String confirmtime;
  String confirmstatus;
  Object confirmprice;
  Long assetid;
  String assetcode;
  Long customerid;
  String customercode;
  String customername;
  Long customergrade;
  String customergradename;
  Long customercampusid;
  String customercampusname;
  Integer isjoinclass;
  Integer isoutercampus;
  Long consultantid;
  String consultantname;
  Long consultantjobid;
  Long educatorid;
  String educatorname;
  Long educatorjobid;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Classlessonitems(){
  }
  public Classlessonitems(Long id,Integer version,Long lessonid,Integer sortno,Long assignid,String assigntime,String assignstatus,Object assignprice,String confirmtime,String confirmstatus,Object confirmprice,Long assetid,String assetcode,Long customerid,String customercode,String customername,Long customergrade,String customergradename,Long customercampusid,String customercampusname,Integer isjoinclass,Integer isoutercampus,Long consultantid,String consultantname,Long consultantjobid,Long educatorid,String educatorname,Long educatorjobid,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.lessonid=lessonid;
      this.sortno=sortno;
      this.assignid=assignid;
      this.assigntime=assigntime;
      this.assignstatus=assignstatus;
      this.assignprice=assignprice;
      this.confirmtime=confirmtime;
      this.confirmstatus=confirmstatus;
      this.confirmprice=confirmprice;
      this.assetid=assetid;
      this.assetcode=assetcode;
      this.customerid=customerid;
      this.customercode=customercode;
      this.customername=customername;
      this.customergrade=customergrade;
      this.customergradename=customergradename;
      this.customercampusid=customercampusid;
      this.customercampusname=customercampusname;
      this.isjoinclass=isjoinclass;
      this.isoutercampus=isoutercampus;
      this.consultantid=consultantid;
      this.consultantname=consultantname;
      this.consultantjobid=consultantjobid;
      this.educatorid=educatorid;
      this.educatorname=educatorname;
      this.educatorjobid=educatorjobid;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}