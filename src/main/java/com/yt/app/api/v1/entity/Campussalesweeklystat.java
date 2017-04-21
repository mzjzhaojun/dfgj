package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-20 13:48:22
*/
@Getter
@Setter
public class Campussalesweeklystat implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Integer yearkey;
  Integer quarterkey;
  Integer monthkey;
  Integer weekkey;
  java.util.Date startdayofweek;
  java.util.Date enddayofweek;
  java.util.Date startdayoflastweek;
  java.util.Date enddayoflastweek;
  Long regionid;
  String regionname;
  Long branchid;
  String branchname;
  Long campusid;
  String campusname;
  Object nsataskyear;
  Object nsayear;
  Object nsayearlastyear;
  Object nsataskquarter;
  Object nsaquarter;
  Object nsaquarterlastyear;
  Object nsataskmonth;
  Object nsamonth;
  Object nsamonthlastyear;
  Integer nsntaskyear;
  Integer nsnyear;
  Integer nsnyearlastyear;
  Integer nsntaskquarter;
  Integer nsnquarter;
  Integer nsnquarterlastyear;
  Integer nsntaskmonth;
  Integer nsnmonth;
  Integer nsnmonthlastyear;
  Object nsatasklastweek;
  Object nsalastweek;
  Object nsaplanlastweek;
  Object nsayoylastweek;
  Integer nsntasklastweek;
  Integer nsnlastweek;
  Integer nsnplanlastweek;
  Integer nsnyoylastweek;
  Object nsataskthisweek;
  Object nsayoythisweek;
  Object nsaplanthisweek;
  Integer nsntaskthisweek;
  Integer nsnyoythisweek;
  Integer nsnplanthisweek;
  Integer potentialcustomernumber;
  Integer verifynumberplan;
  Integer signnumberplan;
  Object signamountplan;
  public Campussalesweeklystat(){
  }
  public Campussalesweeklystat(Long id,Integer version,Integer yearkey,Integer quarterkey,Integer monthkey,Integer weekkey,java.util.Date startdayofweek,java.util.Date enddayofweek,java.util.Date startdayoflastweek,java.util.Date enddayoflastweek,Long regionid,String regionname,Long branchid,String branchname,Long campusid,String campusname,Object nsataskyear,Object nsayear,Object nsayearlastyear,Object nsataskquarter,Object nsaquarter,Object nsaquarterlastyear,Object nsataskmonth,Object nsamonth,Object nsamonthlastyear,Integer nsntaskyear,Integer nsnyear,Integer nsnyearlastyear,Integer nsntaskquarter,Integer nsnquarter,Integer nsnquarterlastyear,Integer nsntaskmonth,Integer nsnmonth,Integer nsnmonthlastyear,Object nsatasklastweek,Object nsalastweek,Object nsaplanlastweek,Object nsayoylastweek,Integer nsntasklastweek,Integer nsnlastweek,Integer nsnplanlastweek,Integer nsnyoylastweek,Object nsataskthisweek,Object nsayoythisweek,Object nsaplanthisweek,Integer nsntaskthisweek,Integer nsnyoythisweek,Integer nsnplanthisweek,Integer potentialcustomernumber,Integer verifynumberplan,Integer signnumberplan,Object signamountplan){
      this.id=id;
      this.version=version;
      this.yearkey=yearkey;
      this.quarterkey=quarterkey;
      this.monthkey=monthkey;
      this.weekkey=weekkey;
      this.startdayofweek=startdayofweek;
      this.enddayofweek=enddayofweek;
      this.startdayoflastweek=startdayoflastweek;
      this.enddayoflastweek=enddayoflastweek;
      this.regionid=regionid;
      this.regionname=regionname;
      this.branchid=branchid;
      this.branchname=branchname;
      this.campusid=campusid;
      this.campusname=campusname;
      this.nsataskyear=nsataskyear;
      this.nsayear=nsayear;
      this.nsayearlastyear=nsayearlastyear;
      this.nsataskquarter=nsataskquarter;
      this.nsaquarter=nsaquarter;
      this.nsaquarterlastyear=nsaquarterlastyear;
      this.nsataskmonth=nsataskmonth;
      this.nsamonth=nsamonth;
      this.nsamonthlastyear=nsamonthlastyear;
      this.nsntaskyear=nsntaskyear;
      this.nsnyear=nsnyear;
      this.nsnyearlastyear=nsnyearlastyear;
      this.nsntaskquarter=nsntaskquarter;
      this.nsnquarter=nsnquarter;
      this.nsnquarterlastyear=nsnquarterlastyear;
      this.nsntaskmonth=nsntaskmonth;
      this.nsnmonth=nsnmonth;
      this.nsnmonthlastyear=nsnmonthlastyear;
      this.nsatasklastweek=nsatasklastweek;
      this.nsalastweek=nsalastweek;
      this.nsaplanlastweek=nsaplanlastweek;
      this.nsayoylastweek=nsayoylastweek;
      this.nsntasklastweek=nsntasklastweek;
      this.nsnlastweek=nsnlastweek;
      this.nsnplanlastweek=nsnplanlastweek;
      this.nsnyoylastweek=nsnyoylastweek;
      this.nsataskthisweek=nsataskthisweek;
      this.nsayoythisweek=nsayoythisweek;
      this.nsaplanthisweek=nsaplanthisweek;
      this.nsntaskthisweek=nsntaskthisweek;
      this.nsnyoythisweek=nsnyoythisweek;
      this.nsnplanthisweek=nsnplanthisweek;
      this.potentialcustomernumber=potentialcustomernumber;
      this.verifynumberplan=verifynumberplan;
      this.signnumberplan=signnumberplan;
      this.signamountplan=signamountplan;
  }
}