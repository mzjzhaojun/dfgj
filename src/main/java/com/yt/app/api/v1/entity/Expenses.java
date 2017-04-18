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
public class Expenses implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long expenseid;
  String expensetype;
  Object expensevalue;
  Long branchid;
  String branchname;
  String campusids;
  String campusnames;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Expenses(){
  }
  public Expenses(Long id,Integer version,Long expenseid,String expensetype,Object expensevalue,Long branchid,String branchname,String campusids,String campusnames,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.expenseid=expenseid;
      this.expensetype=expensetype;
      this.expensevalue=expensevalue;
      this.branchid=branchid;
      this.branchname=branchname;
      this.campusids=campusids;
      this.campusnames=campusnames;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}