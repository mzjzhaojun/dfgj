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
public class Orderitems implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long orderid;
  Integer sortno;
  Long itemid;
  String itemno;
  Long productid;
  String productcode;
  String productname;
  String productunit;
  String productunitname;
  Long productcampusid;
  String productcampusname;
  String grade;
  String gradename;
  String subject;
  Long subjectname;
  String catalog;
  String catalogname;
  String category;
  String categoryname;
  String categorytype;
  String categorytypename;
  String courselevel;
  String courselevelname;
  Integer lessoncount;
  String lessonduration;
  Object lessondurationvalue;
  String periodduration;
  Object perioddurationvalue;
  Object periodsoflesson;
  Object orderprice;
  Object orderamount;
  Long presentid;
  Object presentquato;
  Object presentamount;
  Object tunlandrate;
  Object specialrate;
  String discounttype;
  Object discountrate;
  Object realprice;
  Object realamount;
  Object promotionquota;
  String expirationdate;
  Long joinedclassid;
  Long relatedassetid;
  String relatedassetcode;
  String confirmstartdate;
  String confirmenddate;
  String confirmmode;
  Integer confirmstaging;
  public Orderitems(){
  }
  public Orderitems(Long id,Integer version,Long orderid,Integer sortno,Long itemid,String itemno,Long productid,String productcode,String productname,String productunit,String productunitname,Long productcampusid,String productcampusname,String grade,String gradename,String subject,Long subjectname,String catalog,String catalogname,String category,String categoryname,String categorytype,String categorytypename,String courselevel,String courselevelname,Integer lessoncount,String lessonduration,Object lessondurationvalue,String periodduration,Object perioddurationvalue,Object periodsoflesson,Object orderprice,Object orderamount,Long presentid,Object presentquato,Object presentamount,Object tunlandrate,Object specialrate,String discounttype,Object discountrate,Object realprice,Object realamount,Object promotionquota,String expirationdate,Long joinedclassid,Long relatedassetid,String relatedassetcode,String confirmstartdate,String confirmenddate,String confirmmode,Integer confirmstaging){
      this.id=id;
      this.version=version;
      this.orderid=orderid;
      this.sortno=sortno;
      this.itemid=itemid;
      this.itemno=itemno;
      this.productid=productid;
      this.productcode=productcode;
      this.productname=productname;
      this.productunit=productunit;
      this.productunitname=productunitname;
      this.productcampusid=productcampusid;
      this.productcampusname=productcampusname;
      this.grade=grade;
      this.gradename=gradename;
      this.subject=subject;
      this.subjectname=subjectname;
      this.catalog=catalog;
      this.catalogname=catalogname;
      this.category=category;
      this.categoryname=categoryname;
      this.categorytype=categorytype;
      this.categorytypename=categorytypename;
      this.courselevel=courselevel;
      this.courselevelname=courselevelname;
      this.lessoncount=lessoncount;
      this.lessonduration=lessonduration;
      this.lessondurationvalue=lessondurationvalue;
      this.periodduration=periodduration;
      this.perioddurationvalue=perioddurationvalue;
      this.periodsoflesson=periodsoflesson;
      this.orderprice=orderprice;
      this.orderamount=orderamount;
      this.presentid=presentid;
      this.presentquato=presentquato;
      this.presentamount=presentamount;
      this.tunlandrate=tunlandrate;
      this.specialrate=specialrate;
      this.discounttype=discounttype;
      this.discountrate=discountrate;
      this.realprice=realprice;
      this.realamount=realamount;
      this.promotionquota=promotionquota;
      this.expirationdate=expirationdate;
      this.joinedclassid=joinedclassid;
      this.relatedassetid=relatedassetid;
      this.relatedassetcode=relatedassetcode;
      this.confirmstartdate=confirmstartdate;
      this.confirmenddate=confirmenddate;
      this.confirmmode=confirmmode;
      this.confirmstaging=confirmstaging;
  }
}