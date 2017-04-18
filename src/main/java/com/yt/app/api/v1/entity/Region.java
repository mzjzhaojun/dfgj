package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2016-11-04 15:40:04
*/
@Getter
@Setter
public class Region implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Long parent_id;
  String region_path;
  Integer region_grade;
  String name;
  Integer version;
  //添加属性
  @JsonProperty("pId") 
  String pId; 
  List<Region> listregion;
  public Region(){
  }
  public Region(Long id,Long parent_id,String region_path,Integer region_grade,String name,Integer version){
      this.id=id;
      this.parent_id=parent_id;
      this.region_path=region_path;
      this.region_grade=region_grade;
      this.name=name;
      this.version=version;
  }
}