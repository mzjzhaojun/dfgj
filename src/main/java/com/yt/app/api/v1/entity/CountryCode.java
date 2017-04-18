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
public class CountryCode implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long code;
  String cnname;
  String enname;
  Long abbreviation;
  Integer validstatus;
  Integer sortno;
  public CountryCode(){
  }
  public CountryCode(Long id,Integer version,Long code,String cnname,String enname,Long abbreviation,Integer validstatus,Integer sortno){
      this.id=id;
      this.version=version;
      this.code=code;
      this.cnname=cnname;
      this.enname=enname;
      this.abbreviation=abbreviation;
      this.validstatus=validstatus;
      this.sortno=sortno;
  }
}