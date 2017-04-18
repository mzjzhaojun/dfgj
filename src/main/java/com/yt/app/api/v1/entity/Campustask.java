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
public class Campustask implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long campusid;
  String statlocaldate;
  Object campusmonthlynewchargeamount;
  Object campusdailynewchargeamount;
  Object campusmonthlynewchargenumber;
  Object campusdailynewchargenumber;
  Object campusmonthlyrenewamount;
  Object campusdailyrenewamount;
  Object campusmonthlyrenewnumber;
  Object campusdailyrenewnumber;
  Object campusmonthlyrefundamount;
  Object campusdailyrefundamount;
  Object campusmonthlyrefundnumber;
  Object campusdailyrefundnumber;
  Object campusmonthlytotalincome;
  Object campusdailytotalincome;
  Object campusmonthlytotalassignedincome;
  Object campusdailytotalassignedincome;
  Object campusmonthlyonetooneincome;
  Object campusdailyonetooneincome;
  Object campusmonthlyclassgroupincome;
  Object campusdailyclassgroupincome;
  Object campusmonthlyotherincome;
  Object campusdailyotherincome;
  Object campusmonthlytotalassignedamount;
  Object campusdailytotalassignedamount;
  Object campusmonthlyonetooneassignedamount;
  Object campusdailyonetooneassignedamount;
  Object campusmonthlyclassgroupassignedamount;
  Object campusdailyclassgroupassignedamount;
  Object campusmonthlyreactivenumber;
  Object campusdailyreactivenumber;
  public Campustask(){
  }
  public Campustask(Long id,Integer version,Long campusid,String statlocaldate,Object campusmonthlynewchargeamount,Object campusdailynewchargeamount,Object campusmonthlynewchargenumber,Object campusdailynewchargenumber,Object campusmonthlyrenewamount,Object campusdailyrenewamount,Object campusmonthlyrenewnumber,Object campusdailyrenewnumber,Object campusmonthlyrefundamount,Object campusdailyrefundamount,Object campusmonthlyrefundnumber,Object campusdailyrefundnumber,Object campusmonthlytotalincome,Object campusdailytotalincome,Object campusmonthlytotalassignedincome,Object campusdailytotalassignedincome,Object campusmonthlyonetooneincome,Object campusdailyonetooneincome,Object campusmonthlyclassgroupincome,Object campusdailyclassgroupincome,Object campusmonthlyotherincome,Object campusdailyotherincome,Object campusmonthlytotalassignedamount,Object campusdailytotalassignedamount,Object campusmonthlyonetooneassignedamount,Object campusdailyonetooneassignedamount,Object campusmonthlyclassgroupassignedamount,Object campusdailyclassgroupassignedamount,Object campusmonthlyreactivenumber,Object campusdailyreactivenumber){
      this.id=id;
      this.version=version;
      this.campusid=campusid;
      this.statlocaldate=statlocaldate;
      this.campusmonthlynewchargeamount=campusmonthlynewchargeamount;
      this.campusdailynewchargeamount=campusdailynewchargeamount;
      this.campusmonthlynewchargenumber=campusmonthlynewchargenumber;
      this.campusdailynewchargenumber=campusdailynewchargenumber;
      this.campusmonthlyrenewamount=campusmonthlyrenewamount;
      this.campusdailyrenewamount=campusdailyrenewamount;
      this.campusmonthlyrenewnumber=campusmonthlyrenewnumber;
      this.campusdailyrenewnumber=campusdailyrenewnumber;
      this.campusmonthlyrefundamount=campusmonthlyrefundamount;
      this.campusdailyrefundamount=campusdailyrefundamount;
      this.campusmonthlyrefundnumber=campusmonthlyrefundnumber;
      this.campusdailyrefundnumber=campusdailyrefundnumber;
      this.campusmonthlytotalincome=campusmonthlytotalincome;
      this.campusdailytotalincome=campusdailytotalincome;
      this.campusmonthlytotalassignedincome=campusmonthlytotalassignedincome;
      this.campusdailytotalassignedincome=campusdailytotalassignedincome;
      this.campusmonthlyonetooneincome=campusmonthlyonetooneincome;
      this.campusdailyonetooneincome=campusdailyonetooneincome;
      this.campusmonthlyclassgroupincome=campusmonthlyclassgroupincome;
      this.campusdailyclassgroupincome=campusdailyclassgroupincome;
      this.campusmonthlyotherincome=campusmonthlyotherincome;
      this.campusdailyotherincome=campusdailyotherincome;
      this.campusmonthlytotalassignedamount=campusmonthlytotalassignedamount;
      this.campusdailytotalassignedamount=campusdailytotalassignedamount;
      this.campusmonthlyonetooneassignedamount=campusmonthlyonetooneassignedamount;
      this.campusdailyonetooneassignedamount=campusdailyonetooneassignedamount;
      this.campusmonthlyclassgroupassignedamount=campusmonthlyclassgroupassignedamount;
      this.campusdailyclassgroupassignedamount=campusdailyclassgroupassignedamount;
      this.campusmonthlyreactivenumber=campusmonthlyreactivenumber;
      this.campusdailyreactivenumber=campusdailyreactivenumber;
  }
}