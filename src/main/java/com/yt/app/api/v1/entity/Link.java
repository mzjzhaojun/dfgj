package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
* @author ssh 
* 
* @version v1
* @createdate  2016-10-14 10:17:35
*/
@Getter
@Setter
public class Link implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  String name;
  String rel;
  String href;
  Integer version;
  @JsonProperty("pId") 
  Long pId;
  boolean open;
  boolean checked;
  boolean chkDisabled;
  public Link(){
  }
  public Link(Long id,String name,String rel,String href,Integer version){
      this.id=id;
      this.name=name;
      this.rel=rel;
      this.href=href;
      this.version=version;
  }
}