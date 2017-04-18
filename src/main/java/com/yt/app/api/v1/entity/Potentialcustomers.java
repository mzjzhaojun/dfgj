package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-17 17:44:02
*/
@Getter
@Setter
public class Potentialcustomers implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long orgid;
  String orgname;
  String orgtype;
  Long campusid;
  String campusname;
  Long customerid;
  String customercode;
  String customername;
  String customerlevel;
  String invalidreason;
  String customerstatus;
  Integer isoneparent;
  String describes;
  String birthday;
  String gender;
  String email;
  String idtype;
  String idnumber;
  String viptype;
  String viplevel;
  String entrancegrade;
  String grade;
  String schoolyear;
  String subjecttype;
  String studenttype;
  String contacttype;
  String sourcemaintype;
  String sourcesubtype;
  String sourcesystem;
  Long referralstaffid;
  String referralstaffname;
  Long referralstaffjobid;
  String referralstaffjobname;
  String referralstaffoacode;
  Long referralcustomerid;
  String referralcustomercode;
  String referralcustomername;
  String purchaseintention;
  Long schoolid;
  String schoolname;
  Integer isstudyagain;
  String followtime;
  String followstage;
  Integer followedcount;
  String nextfollowtime;
  Long creatorid;
  String creatorname;
  Long creatorjobid;
  String creatorjobname;
  String creatorjobtype;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  Long tenantcode;
  String versionstarttime;
  String versionendtime;
  public Potentialcustomers(){
  }
  public Potentialcustomers(Long id,Integer version,Long orgid,String orgname,String orgtype,Long campusid,String campusname,Long customerid,String customercode,String customername,String customerlevel,String invalidreason,String customerstatus,Integer isoneparent,String describes,String birthday,String gender,String email,String idtype,String idnumber,String viptype,String viplevel,String entrancegrade,String grade,String schoolyear,String subjecttype,String studenttype,String contacttype,String sourcemaintype,String sourcesubtype,String sourcesystem,Long referralstaffid,String referralstaffname,Long referralstaffjobid,String referralstaffjobname,String referralstaffoacode,Long referralcustomerid,String referralcustomercode,String referralcustomername,String purchaseintention,Long schoolid,String schoolname,Integer isstudyagain,String followtime,String followstage,Integer followedcount,String nextfollowtime,Long creatorid,String creatorname,Long creatorjobid,String creatorjobname,String creatorjobtype,String createtime,Long modifierid,String modifiername,String modifytime,Long tenantcode,String versionstarttime,String versionendtime){
      this.id=id;
      this.version=version;
      this.orgid=orgid;
      this.orgname=orgname;
      this.orgtype=orgtype;
      this.campusid=campusid;
      this.campusname=campusname;
      this.customerid=customerid;
      this.customercode=customercode;
      this.customername=customername;
      this.customerlevel=customerlevel;
      this.invalidreason=invalidreason;
      this.customerstatus=customerstatus;
      this.isoneparent=isoneparent;
      this.describes=describes;
      this.birthday=birthday;
      this.gender=gender;
      this.email=email;
      this.idtype=idtype;
      this.idnumber=idnumber;
      this.viptype=viptype;
      this.viplevel=viplevel;
      this.entrancegrade=entrancegrade;
      this.grade=grade;
      this.schoolyear=schoolyear;
      this.subjecttype=subjecttype;
      this.studenttype=studenttype;
      this.contacttype=contacttype;
      this.sourcemaintype=sourcemaintype;
      this.sourcesubtype=sourcesubtype;
      this.sourcesystem=sourcesystem;
      this.referralstaffid=referralstaffid;
      this.referralstaffname=referralstaffname;
      this.referralstaffjobid=referralstaffjobid;
      this.referralstaffjobname=referralstaffjobname;
      this.referralstaffoacode=referralstaffoacode;
      this.referralcustomerid=referralcustomerid;
      this.referralcustomercode=referralcustomercode;
      this.referralcustomername=referralcustomername;
      this.purchaseintention=purchaseintention;
      this.schoolid=schoolid;
      this.schoolname=schoolname;
      this.isstudyagain=isstudyagain;
      this.followtime=followtime;
      this.followstage=followstage;
      this.followedcount=followedcount;
      this.nextfollowtime=nextfollowtime;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.creatorjobid=creatorjobid;
      this.creatorjobname=creatorjobname;
      this.creatorjobtype=creatorjobtype;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
      this.tenantcode=tenantcode;
      this.versionstarttime=versionstarttime;
      this.versionendtime=versionendtime;
  }
}