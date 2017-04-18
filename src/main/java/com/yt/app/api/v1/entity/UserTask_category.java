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
public class UserTask_category implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long category_guid;
  String category_name;
  Long user_id;
  Integer inner_sort_id;
  public UserTask_category(){
  }
  public UserTask_category(Long id,Integer version,Long category_guid,String category_name,Long user_id,Integer inner_sort_id){
      this.id=id;
      this.version=version;
      this.category_guid=category_guid;
      this.category_name=category_name;
      this.user_id=user_id;
      this.inner_sort_id=inner_sort_id;
  }
}