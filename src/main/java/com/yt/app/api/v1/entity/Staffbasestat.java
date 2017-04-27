package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
* @author zj    default  
* 
* @version v1
* @createdate  2017-04-27 15:10:49
*/
@Getter
@Setter
public class Staffbasestat implements Serializable{

  private static final long serialVersionUID=1L;

  Long id;
  Integer version;
  Long staffid;
  Long campusid;
  java.util.Date statlocaldate;
  Object ftonetooneassignedamount;
  Object ptonetooneassignedamount;
  Object ftonetoonelessondurationvalue;
  Object ptonetoonelessondurationvalue;
  Object ftclassgroupassignedamount;
  Object ptclassgroupassignedamount;
  Object ftclassgrouplessondurationvalue;
  Object ptclassgrouplessondurationvalue;
  Object newchargeamount;
  Object renewamount;
  Object refundamount;
  Object visitnumber;
  Object visitcustomernumber;
  Object meetingnumber;
  Object meetingcustomernumber;
  Object replynumber;
  Object replycustomernumber;
  Object achievementstatistics;
  Object achievementstatisticscustomernumber;
  Object customersatisfaction;
  java.util.Date employmentdate;
  java.util.Date dimissiondate;
  public Staffbasestat(){
  }
  public Staffbasestat(Long id,Integer version,Long staffid,Long campusid,java.util.Date statlocaldate,Object ftonetooneassignedamount,Object ptonetooneassignedamount,Object ftonetoonelessondurationvalue,Object ptonetoonelessondurationvalue,Object ftclassgroupassignedamount,Object ptclassgroupassignedamount,Object ftclassgrouplessondurationvalue,Object ptclassgrouplessondurationvalue,Object newchargeamount,Object renewamount,Object refundamount,Object visitnumber,Object visitcustomernumber,Object meetingnumber,Object meetingcustomernumber,Object replynumber,Object replycustomernumber,Object achievementstatistics,Object achievementstatisticscustomernumber,Object customersatisfaction,java.util.Date employmentdate,java.util.Date dimissiondate){
      this.id=id;
      this.version=version;
      this.staffid=staffid;
      this.campusid=campusid;
      this.statlocaldate=statlocaldate;
      this.ftonetooneassignedamount=ftonetooneassignedamount;
      this.ptonetooneassignedamount=ptonetooneassignedamount;
      this.ftonetoonelessondurationvalue=ftonetoonelessondurationvalue;
      this.ptonetoonelessondurationvalue=ptonetoonelessondurationvalue;
      this.ftclassgroupassignedamount=ftclassgroupassignedamount;
      this.ptclassgroupassignedamount=ptclassgroupassignedamount;
      this.ftclassgrouplessondurationvalue=ftclassgrouplessondurationvalue;
      this.ptclassgrouplessondurationvalue=ptclassgrouplessondurationvalue;
      this.newchargeamount=newchargeamount;
      this.renewamount=renewamount;
      this.refundamount=refundamount;
      this.visitnumber=visitnumber;
      this.visitcustomernumber=visitcustomernumber;
      this.meetingnumber=meetingnumber;
      this.meetingcustomernumber=meetingcustomernumber;
      this.replynumber=replynumber;
      this.replycustomernumber=replycustomernumber;
      this.achievementstatistics=achievementstatistics;
      this.achievementstatisticscustomernumber=achievementstatisticscustomernumber;
      this.customersatisfaction=customersatisfaction;
      this.employmentdate=employmentdate;
      this.dimissiondate=dimissiondate;
  }
}