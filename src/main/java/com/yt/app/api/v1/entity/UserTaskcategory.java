package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:49:04
*/
@Getter
@Setter
public class UserTaskcategory implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String category_name;
  Long user_id;
  Integer inner_sort_id;
  public UserTaskcategory(){
  }
  public UserTaskcategory(Long id,Integer version,String category_name,Long user_id,Integer inner_sort_id){
      this.id=id;
      this.version=version;
      this.category_name=category_name;
      this.user_id=user_id;
      this.inner_sort_id=inner_sort_id;
  }
}