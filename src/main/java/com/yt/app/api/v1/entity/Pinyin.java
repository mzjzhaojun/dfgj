package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:52
*/
@Getter
@Setter
public class Pinyin implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String pinyin;
  String hz;
  Integer weight;
  public Pinyin(){
  }
  public Pinyin(Long id,Integer version,String pinyin,String hz,Integer weight){
      this.id=id;
      this.version=version;
      this.pinyin=pinyin;
      this.hz=hz;
      this.weight=weight;
  }
}