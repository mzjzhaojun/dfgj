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
public class Products implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long rdorgid;
  String rdorgname;
  Long productid;
  String productcode;
  String productname;
  String productmemo;
  String productstatus;
  String productversion;
  Object productprice;
  Object productcost;
  String productunit;
  Object targetprice;
  String targetpricememo;
  String catalog;
  String subject;
  String grade;
  String year;
  String season;
  String startdate;
  String enddate;
  Long partnerid;
  Object partnerratio;
  String partnername;
  Integer specialallowed;
  Integer tunlandallowed;
  Integer presentallowed;
  Integer promotionallowed;
  Object promotionquota;
  String confirmstartdate;
  String confirmenddate;
  String confirmmode;
  Integer confirmstaging;
  Long submitterid;
  String submittername;
  Long submitterjobid;
  String submitterjobname;
  String submittime;
  Long approverid;
  String approvername;
  Long approverjobid;
  String approverjobname;
  String approvetime;
  Long creatorid;
  String creatorname;
  String createtime;
  Long modifierid;
  String modifiername;
  String modifytime;
  public Products(){
  }
  public Products(Long id,Integer version,Long rdorgid,String rdorgname,Long productid,String productcode,String productname,String productmemo,String productstatus,String productversion,Object productprice,Object productcost,String productunit,Object targetprice,String targetpricememo,String catalog,String subject,String grade,String year,String season,String startdate,String enddate,Long partnerid,Object partnerratio,String partnername,Integer specialallowed,Integer tunlandallowed,Integer presentallowed,Integer promotionallowed,Object promotionquota,String confirmstartdate,String confirmenddate,String confirmmode,Integer confirmstaging,Long submitterid,String submittername,Long submitterjobid,String submitterjobname,String submittime,Long approverid,String approvername,Long approverjobid,String approverjobname,String approvetime,Long creatorid,String creatorname,String createtime,Long modifierid,String modifiername,String modifytime){
      this.id=id;
      this.version=version;
      this.rdorgid=rdorgid;
      this.rdorgname=rdorgname;
      this.productid=productid;
      this.productcode=productcode;
      this.productname=productname;
      this.productmemo=productmemo;
      this.productstatus=productstatus;
      this.productversion=productversion;
      this.productprice=productprice;
      this.productcost=productcost;
      this.productunit=productunit;
      this.targetprice=targetprice;
      this.targetpricememo=targetpricememo;
      this.catalog=catalog;
      this.subject=subject;
      this.grade=grade;
      this.year=year;
      this.season=season;
      this.startdate=startdate;
      this.enddate=enddate;
      this.partnerid=partnerid;
      this.partnerratio=partnerratio;
      this.partnername=partnername;
      this.specialallowed=specialallowed;
      this.tunlandallowed=tunlandallowed;
      this.presentallowed=presentallowed;
      this.promotionallowed=promotionallowed;
      this.promotionquota=promotionquota;
      this.confirmstartdate=confirmstartdate;
      this.confirmenddate=confirmenddate;
      this.confirmmode=confirmmode;
      this.confirmstaging=confirmstaging;
      this.submitterid=submitterid;
      this.submittername=submittername;
      this.submitterjobid=submitterjobid;
      this.submitterjobname=submitterjobname;
      this.submittime=submittime;
      this.approverid=approverid;
      this.approvername=approvername;
      this.approverjobid=approverjobid;
      this.approverjobname=approverjobname;
      this.approvetime=approvetime;
      this.creatorid=creatorid;
      this.creatorname=creatorname;
      this.createtime=createtime;
      this.modifierid=modifierid;
      this.modifiername=modifiername;
      this.modifytime=modifytime;
  }
}