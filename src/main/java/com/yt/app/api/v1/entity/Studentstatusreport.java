package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:58
*/
@Getter
@Setter
public class Studentstatusreport implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long snapshotid;
  String regionid;
  String regionshortname;
  String branchid;
  String branchshortname;
  String campusid;
  String campusshortname;
  Integer campusage;
  Integer earlyisreg;
  Integer earlyhasnomoney;
  Integer earlyhasmoney;
  Integer earlyisavailable;
  Integer earlyclasssuspended;
  Integer earlyactive;
  Integer earlyschoolsuspended;
  Integer earlygraduated;
  Integer curnewsign;
  Integer currenewsign;
  Integer graduatedrenewsign;
  Integer schoolsuspendedrenewsign;
  Integer classsuspendedrenewsign;
  Integer activerenewsign;
  Integer classfinishedrenewsign;
  Integer newsignrenewsign;
  Integer curassigned;
  Integer graduateassigned;
  Integer schoolsuspendedassigned;
  Integer classsuspendedassigned;
  Integer activeassigned;
  Integer classfinishedassigned;
  Integer newsignassigned;
  Integer curtransferedin;
  Integer curtransferedout;
  Integer curtransferschooltransferedin;
  Integer curtransferschooltransferedout;
  Integer curclassfinished;
  Integer refundclassfinished;
  Integer assignedclassfinished;
  Integer transferedoutclassfinished;
  Integer newsignclassfinished;
  Integer currefund;
  Integer earlyhasmoneyrefund;
  Integer activerefund;
  Integer classsuspendedrefund;
  Integer schoolsuspendedrefund;
  Integer graduaterefund;
  Integer earlyhasnomoneyrefund;
  Integer newavailable;
  Integer notregactive;
  Integer graduateactive;
  Integer schoolsuspendedactive;
  Integer classfinishedactive;
  Integer thismonthactive;
  Integer endisreg;
  Integer endhasmoney;
  Integer endhasnomoney;
  Integer endisavailable;
  Integer endclasssuspended;
  Integer newclasssuspended;
  Integer endactive;
  Integer endgraduate;
  Integer newgraduate;
  Integer schoolsuspendedgraduate;
  Integer classsuspendedgraduate;
  Integer activegraduate;
  Integer classfinishedrenewsigngraduate;
  Integer endschoolsuspended;
  Integer newschoolsuspended;
  Integer exitavailable;
  Integer availablegraduate;
  Integer classsuspendedschoolsuspended;
  Integer classsuspendedclassfinished;
  Integer activeclassfinished;
  public Studentstatusreport(){
  }
  public Studentstatusreport(Long id,Integer version,Long snapshotid,String regionid,String regionshortname,String branchid,String branchshortname,String campusid,String campusshortname,Integer campusage,Integer earlyisreg,Integer earlyhasnomoney,Integer earlyhasmoney,Integer earlyisavailable,Integer earlyclasssuspended,Integer earlyactive,Integer earlyschoolsuspended,Integer earlygraduated,Integer curnewsign,Integer currenewsign,Integer graduatedrenewsign,Integer schoolsuspendedrenewsign,Integer classsuspendedrenewsign,Integer activerenewsign,Integer classfinishedrenewsign,Integer newsignrenewsign,Integer curassigned,Integer graduateassigned,Integer schoolsuspendedassigned,Integer classsuspendedassigned,Integer activeassigned,Integer classfinishedassigned,Integer newsignassigned,Integer curtransferedin,Integer curtransferedout,Integer curtransferschooltransferedin,Integer curtransferschooltransferedout,Integer curclassfinished,Integer refundclassfinished,Integer assignedclassfinished,Integer transferedoutclassfinished,Integer newsignclassfinished,Integer currefund,Integer earlyhasmoneyrefund,Integer activerefund,Integer classsuspendedrefund,Integer schoolsuspendedrefund,Integer graduaterefund,Integer earlyhasnomoneyrefund,Integer newavailable,Integer notregactive,Integer graduateactive,Integer schoolsuspendedactive,Integer classfinishedactive,Integer thismonthactive,Integer endisreg,Integer endhasmoney,Integer endhasnomoney,Integer endisavailable,Integer endclasssuspended,Integer newclasssuspended,Integer endactive,Integer endgraduate,Integer newgraduate,Integer schoolsuspendedgraduate,Integer classsuspendedgraduate,Integer activegraduate,Integer classfinishedrenewsigngraduate,Integer endschoolsuspended,Integer newschoolsuspended,Integer exitavailable,Integer availablegraduate,Integer classsuspendedschoolsuspended,Integer classsuspendedclassfinished,Integer activeclassfinished){
      this.id=id;
      this.version=version;
      this.snapshotid=snapshotid;
      this.regionid=regionid;
      this.regionshortname=regionshortname;
      this.branchid=branchid;
      this.branchshortname=branchshortname;
      this.campusid=campusid;
      this.campusshortname=campusshortname;
      this.campusage=campusage;
      this.earlyisreg=earlyisreg;
      this.earlyhasnomoney=earlyhasnomoney;
      this.earlyhasmoney=earlyhasmoney;
      this.earlyisavailable=earlyisavailable;
      this.earlyclasssuspended=earlyclasssuspended;
      this.earlyactive=earlyactive;
      this.earlyschoolsuspended=earlyschoolsuspended;
      this.earlygraduated=earlygraduated;
      this.curnewsign=curnewsign;
      this.currenewsign=currenewsign;
      this.graduatedrenewsign=graduatedrenewsign;
      this.schoolsuspendedrenewsign=schoolsuspendedrenewsign;
      this.classsuspendedrenewsign=classsuspendedrenewsign;
      this.activerenewsign=activerenewsign;
      this.classfinishedrenewsign=classfinishedrenewsign;
      this.newsignrenewsign=newsignrenewsign;
      this.curassigned=curassigned;
      this.graduateassigned=graduateassigned;
      this.schoolsuspendedassigned=schoolsuspendedassigned;
      this.classsuspendedassigned=classsuspendedassigned;
      this.activeassigned=activeassigned;
      this.classfinishedassigned=classfinishedassigned;
      this.newsignassigned=newsignassigned;
      this.curtransferedin=curtransferedin;
      this.curtransferedout=curtransferedout;
      this.curtransferschooltransferedin=curtransferschooltransferedin;
      this.curtransferschooltransferedout=curtransferschooltransferedout;
      this.curclassfinished=curclassfinished;
      this.refundclassfinished=refundclassfinished;
      this.assignedclassfinished=assignedclassfinished;
      this.transferedoutclassfinished=transferedoutclassfinished;
      this.newsignclassfinished=newsignclassfinished;
      this.currefund=currefund;
      this.earlyhasmoneyrefund=earlyhasmoneyrefund;
      this.activerefund=activerefund;
      this.classsuspendedrefund=classsuspendedrefund;
      this.schoolsuspendedrefund=schoolsuspendedrefund;
      this.graduaterefund=graduaterefund;
      this.earlyhasnomoneyrefund=earlyhasnomoneyrefund;
      this.newavailable=newavailable;
      this.notregactive=notregactive;
      this.graduateactive=graduateactive;
      this.schoolsuspendedactive=schoolsuspendedactive;
      this.classfinishedactive=classfinishedactive;
      this.thismonthactive=thismonthactive;
      this.endisreg=endisreg;
      this.endhasmoney=endhasmoney;
      this.endhasnomoney=endhasnomoney;
      this.endisavailable=endisavailable;
      this.endclasssuspended=endclasssuspended;
      this.newclasssuspended=newclasssuspended;
      this.endactive=endactive;
      this.endgraduate=endgraduate;
      this.newgraduate=newgraduate;
      this.schoolsuspendedgraduate=schoolsuspendedgraduate;
      this.classsuspendedgraduate=classsuspendedgraduate;
      this.activegraduate=activegraduate;
      this.classfinishedrenewsigngraduate=classfinishedrenewsigngraduate;
      this.endschoolsuspended=endschoolsuspended;
      this.newschoolsuspended=newschoolsuspended;
      this.exitavailable=exitavailable;
      this.availablegraduate=availablegraduate;
      this.classsuspendedschoolsuspended=classsuspendedschoolsuspended;
      this.classsuspendedclassfinished=classsuspendedclassfinished;
      this.activeclassfinished=activeclassfinished;
  }
}