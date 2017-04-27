package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:46
*/
@Getter
@Setter
public class Campuscustomerweeklystat implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Integer yearkey;
  Integer monthkey;
  Integer weekkey;
  java.util.Date startdayofweek;
  java.util.Date enddayofweek;
  Long regionid;
  String regionname;
  Long branchid;
  String branchname;
  Long campusid;
  String campusname;
  Integer availablecustomernumberyear;
  Integer availablecustomernumbermb;
  Object accountvaluemb;
  Object accountmoneymb;
  Object assetsmoneymb;
  Integer newassignnumbertm;
  Integer cfrcnumbertm;
  Integer ssanumbertm;
  Integer othernewavailablenumbertm;
  Integer totalnewavailablenumbertm;
  Integer csssnumbertm;
  Integer cfnrcnumbertm;
  Integer cfrfnumbertm;
  Integer othernoneavailablenumbertm;
  Integer totalnoneavailablenumbertm;
  Integer netavailablechangenumbertm;
  Integer availablecustomernumbercurrent;
  Object accountvaluecurrent;
  Object accountmoneycurrent;
  Object assetsmoneycurrent;
  Integer renewchargenumbertm;
  Object renewratetm;
  Object renewratety;
  Integer csanumbertm;
  Integer ncsnumbertm;
  Integer netcsnumbertm;
  Integer totalcsnumber;
  Integer ssnm1numbercurrent;
  Integer ssm1numbercurrent;
  Object csratecurrent;
  Integer classcustomernumbertm;
  Object classratetm;
  public Campuscustomerweeklystat(){
  }
  public Campuscustomerweeklystat(Long id,Integer version,Integer yearkey,Integer monthkey,Integer weekkey,java.util.Date startdayofweek,java.util.Date enddayofweek,Long regionid,String regionname,Long branchid,String branchname,Long campusid,String campusname,Integer availablecustomernumberyear,Integer availablecustomernumbermb,Object accountvaluemb,Object accountmoneymb,Object assetsmoneymb,Integer newassignnumbertm,Integer cfrcnumbertm,Integer ssanumbertm,Integer othernewavailablenumbertm,Integer totalnewavailablenumbertm,Integer csssnumbertm,Integer cfnrcnumbertm,Integer cfrfnumbertm,Integer othernoneavailablenumbertm,Integer totalnoneavailablenumbertm,Integer netavailablechangenumbertm,Integer availablecustomernumbercurrent,Object accountvaluecurrent,Object accountmoneycurrent,Object assetsmoneycurrent,Integer renewchargenumbertm,Object renewratetm,Object renewratety,Integer csanumbertm,Integer ncsnumbertm,Integer netcsnumbertm,Integer totalcsnumber,Integer ssnm1numbercurrent,Integer ssm1numbercurrent,Object csratecurrent,Integer classcustomernumbertm,Object classratetm){
      this.id=id;
      this.version=version;
      this.yearkey=yearkey;
      this.monthkey=monthkey;
      this.weekkey=weekkey;
      this.startdayofweek=startdayofweek;
      this.enddayofweek=enddayofweek;
      this.regionid=regionid;
      this.regionname=regionname;
      this.branchid=branchid;
      this.branchname=branchname;
      this.campusid=campusid;
      this.campusname=campusname;
      this.availablecustomernumberyear=availablecustomernumberyear;
      this.availablecustomernumbermb=availablecustomernumbermb;
      this.accountvaluemb=accountvaluemb;
      this.accountmoneymb=accountmoneymb;
      this.assetsmoneymb=assetsmoneymb;
      this.newassignnumbertm=newassignnumbertm;
      this.cfrcnumbertm=cfrcnumbertm;
      this.ssanumbertm=ssanumbertm;
      this.othernewavailablenumbertm=othernewavailablenumbertm;
      this.totalnewavailablenumbertm=totalnewavailablenumbertm;
      this.csssnumbertm=csssnumbertm;
      this.cfnrcnumbertm=cfnrcnumbertm;
      this.cfrfnumbertm=cfrfnumbertm;
      this.othernoneavailablenumbertm=othernoneavailablenumbertm;
      this.totalnoneavailablenumbertm=totalnoneavailablenumbertm;
      this.netavailablechangenumbertm=netavailablechangenumbertm;
      this.availablecustomernumbercurrent=availablecustomernumbercurrent;
      this.accountvaluecurrent=accountvaluecurrent;
      this.accountmoneycurrent=accountmoneycurrent;
      this.assetsmoneycurrent=assetsmoneycurrent;
      this.renewchargenumbertm=renewchargenumbertm;
      this.renewratetm=renewratetm;
      this.renewratety=renewratety;
      this.csanumbertm=csanumbertm;
      this.ncsnumbertm=ncsnumbertm;
      this.netcsnumbertm=netcsnumbertm;
      this.totalcsnumber=totalcsnumber;
      this.ssnm1numbercurrent=ssnm1numbercurrent;
      this.ssm1numbercurrent=ssm1numbercurrent;
      this.csratecurrent=csratecurrent;
      this.classcustomernumbertm=classcustomernumbertm;
      this.classratetm=classratetm;
  }
}