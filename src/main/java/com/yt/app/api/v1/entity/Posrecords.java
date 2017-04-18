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
public class Posrecords implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  String transactiondate;
  String settlementdate;
  String transactiontimevalue;
  String transactiontime;
  String transactiontype;
  Long transactionid;
  String cardnum;
  Long merchantid;
  Long posid;
  Object money;
  String fromtype;
  Integer isusered;
  String createtime;
  String receipttype;
  public Posrecords(){
  }
  public Posrecords(Long id,Integer version,String transactiondate,String settlementdate,String transactiontimevalue,String transactiontime,String transactiontype,Long transactionid,String cardnum,Long merchantid,Long posid,Object money,String fromtype,Integer isusered,String createtime,String receipttype){
      this.id=id;
      this.version=version;
      this.transactiondate=transactiondate;
      this.settlementdate=settlementdate;
      this.transactiontimevalue=transactiontimevalue;
      this.transactiontime=transactiontime;
      this.transactiontype=transactiontype;
      this.transactionid=transactionid;
      this.cardnum=cardnum;
      this.merchantid=merchantid;
      this.posid=posid;
      this.money=money;
      this.fromtype=fromtype;
      this.isusered=isusered;
      this.createtime=createtime;
      this.receipttype=receipttype;
  }
}