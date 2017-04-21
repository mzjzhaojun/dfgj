package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:57
*/
@Getter
@Setter
public class Staffs implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String oacode;
  Long staffcode;
  String staffname;
  String displayname;
  String mail;
  Long mp;
  Long wp;
  Long extension;
  String address;
  String idtype;
  String idnumber;
  String gender;
  String isfulltime;
  String privateemail;
  java.util.Date employmentdate;
  java.util.Date dimissiondate;
  String status;
  String bistatus;
  public Staffs(){
  }
  public Staffs(Long id,Integer version,String oacode,Long staffcode,String staffname,String displayname,String mail,Long mp,Long wp,Long extension,String address,String idtype,String idnumber,String gender,String isfulltime,String privateemail,java.util.Date employmentdate,java.util.Date dimissiondate,String status,String bistatus){
      this.id=id;
      this.version=version;
      this.oacode=oacode;
      this.staffcode=staffcode;
      this.staffname=staffname;
      this.displayname=displayname;
      this.mail=mail;
      this.mp=mp;
      this.wp=wp;
      this.extension=extension;
      this.address=address;
      this.idtype=idtype;
      this.idnumber=idnumber;
      this.gender=gender;
      this.isfulltime=isfulltime;
      this.privateemail=privateemail;
      this.employmentdate=employmentdate;
      this.dimissiondate=dimissiondate;
      this.status=status;
      this.bistatus=bistatus;
  }
}