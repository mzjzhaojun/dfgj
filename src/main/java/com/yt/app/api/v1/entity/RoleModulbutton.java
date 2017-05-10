package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version 1.1
*/
@Getter
@Setter
public class RoleModulbutton implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Long role_id;
  Long modul_id;
  Long button_id;
  Integer version;
  public RoleModulbutton(){
  }
  public RoleModulbutton(Long id,Long role_id,Long modul_id,Long button_id){
      this.id=id;
      this.role_id=role_id;
      this.modul_id=modul_id;
      this.button_id=button_id;
  }
}