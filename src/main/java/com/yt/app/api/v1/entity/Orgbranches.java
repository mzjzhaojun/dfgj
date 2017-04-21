package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:49
*/
@Getter
@Setter
public class Orgbranches implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long regionid;
  String branchname;
  public Orgbranches(){
  }
  public Orgbranches(Long id,Integer version,Long regionid,String branchname){
      this.id=id;
      this.version=version;
      this.regionid=regionid;
      this.branchname=branchname;
  }
}