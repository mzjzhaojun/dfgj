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
public class Orgstaffjobs implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  Long branchid;
  Long campusid;
  Long staffid;
  String staffname;
  Long staffjobid;
  String staffjobtype;
  public Orgstaffjobs(){
  }
  public Orgstaffjobs(Long id,Integer version,Long regionid,Long branchid,Long campusid,Long staffid,String staffname,Long staffjobid,String staffjobtype){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchid=branchid;
      this.campusid=campusid;
      this.staffid=staffid;
      this.staffname=staffname;
      this.staffjobid=staffjobid;
      this.staffjobtype=staffjobtype;
  }
}