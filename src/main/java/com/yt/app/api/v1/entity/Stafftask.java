package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 15:10:49
 */
@Getter
@Setter
public class Stafftask implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long staffid;
	Long campusid;
	java.util.Date statlocaldate;
	Object consultantmonthlynewchargeamount;
	Object educatordailynewchargeamount;
	Object educatorweeklynewchargeamount;
	Object teacherdailynewchargeamount;
	Object consultantmonthlynewchargenumber;
	Object educatordailynewchargenumber;
	Object educatorweeklynewchargenumber;
	Object teacherdailynewchargenumber;
	Object consultantmonthlyrenewamount;
	Object educatordailyrenewamount;
	Object educatorweeklyrenewamount;
	Object teacherdailyrenewamount;
	Object consultantmonthlyrenewnumber;
	Object educatordailyrenewnumber;
	Object educatorweeklyrenewnumber;
	Object teacherdailyrenewnumber;
	Object consultantmonthlyrefundamount;
	Object educatordailyrefundamount;
	Object educatorweeklyrefundamount;
	Object teacherdailyrefundamount;
	Object consultantmonthlyrefundnumber;
	Object educatordailyrefundnumber;
	Object educatorweeklyrefundnumber;
	Object teacherdailyrefundnumber;
	Object consultantmonthlytotalincome;
	Object educatordailytotalincome;
	Object educatorweeklytotalincome;
	Object teacherdailytotalincome;
	Object consultantmonthlytotalassignedincome;
	Object educatordailytotalassignedincome;
	Object educatorweeklytotalassignedincome;
	Object teacherdailytotalassignedincome;
	Object consultantmonthlyonetooneincome;
	Object educatordailyonetooneincome;
	Object educatorweeklyonetooneincome;
	Object teacherdailyonetooneincome;
	Object consultantmonthlyclassgroupincome;
	Object educatordailyclassgroupincome;
	Object educatorweeklyclassgroupincome;
	Object teacherdailyclassgroupincome;
	Object consultantmonthlyotherincome;
	Object educatordailyotherincome;
	Object educatorweeklyotherincome;
	Object teacherdailyotherincome;
	Object consultantmonthlytotalassignedamount;
	Object educatordailytotalassignedamount;
	Object educatorweeklytotalassignedamount;
	Object teacherdailytotalassignedamount;
	Object consultantmonthlyonetooneassignedamount;
	Object educatordailyonetooneassignedamount;
	Object educatorweeklyonetooneassignedamount;
	Object teacherdailyonetooneassignedamount;
	Object consultantmonthlyclassgroupassignedamount;
	Object educatordailyclassgroupassignedamount;
	Object educatorweeklyclassgroupassignedamount;
	Object teacherdailyclassgroupassignedamount;
	Object consultantmonthlyreactivenumber;
	Object educatordailyreactivenumber;
	Object educatorweeklyreactivenumber;
	Object teacherdailyreactivenumber;

	public Stafftask() {
	}

	public Stafftask(Long id, Integer version, Long staffid, Long campusid, java.util.Date statlocaldate, Object consultantmonthlynewchargeamount,
			Object educatordailynewchargeamount, Object educatorweeklynewchargeamount, Object teacherdailynewchargeamount,
			Object consultantmonthlynewchargenumber, Object educatordailynewchargenumber, Object educatorweeklynewchargenumber,
			Object teacherdailynewchargenumber, Object consultantmonthlyrenewamount, Object educatordailyrenewamount,
			Object educatorweeklyrenewamount, Object teacherdailyrenewamount, Object consultantmonthlyrenewnumber, Object educatordailyrenewnumber,
			Object educatorweeklyrenewnumber, Object teacherdailyrenewnumber, Object consultantmonthlyrefundamount, Object educatordailyrefundamount,
			Object educatorweeklyrefundamount, Object teacherdailyrefundamount, Object consultantmonthlyrefundnumber,
			Object educatordailyrefundnumber, Object educatorweeklyrefundnumber, Object teacherdailyrefundnumber,
			Object consultantmonthlytotalincome, Object educatordailytotalincome, Object educatorweeklytotalincome, Object teacherdailytotalincome,
			Object consultantmonthlytotalassignedincome, Object educatordailytotalassignedincome, Object educatorweeklytotalassignedincome,
			Object teacherdailytotalassignedincome, Object consultantmonthlyonetooneincome, Object educatordailyonetooneincome,
			Object educatorweeklyonetooneincome, Object teacherdailyonetooneincome, Object consultantmonthlyclassgroupincome,
			Object educatordailyclassgroupincome, Object educatorweeklyclassgroupincome, Object teacherdailyclassgroupincome,
			Object consultantmonthlyotherincome, Object educatordailyotherincome, Object educatorweeklyotherincome, Object teacherdailyotherincome,
			Object consultantmonthlytotalassignedamount, Object educatordailytotalassignedamount, Object educatorweeklytotalassignedamount,
			Object teacherdailytotalassignedamount, Object consultantmonthlyonetooneassignedamount, Object educatordailyonetooneassignedamount,
			Object educatorweeklyonetooneassignedamount, Object teacherdailyonetooneassignedamount, Object consultantmonthlyclassgroupassignedamount,
			Object educatordailyclassgroupassignedamount, Object educatorweeklyclassgroupassignedamount, Object teacherdailyclassgroupassignedamount,
			Object consultantmonthlyreactivenumber, Object educatordailyreactivenumber, Object educatorweeklyreactivenumber,
			Object teacherdailyreactivenumber) {
		this.id = id;
		this.version = version;
		this.staffid = staffid;
		this.campusid = campusid;
		this.statlocaldate = statlocaldate;
		this.consultantmonthlynewchargeamount = consultantmonthlynewchargeamount;
		this.educatordailynewchargeamount = educatordailynewchargeamount;
		this.educatorweeklynewchargeamount = educatorweeklynewchargeamount;
		this.teacherdailynewchargeamount = teacherdailynewchargeamount;
		this.consultantmonthlynewchargenumber = consultantmonthlynewchargenumber;
		this.educatordailynewchargenumber = educatordailynewchargenumber;
		this.educatorweeklynewchargenumber = educatorweeklynewchargenumber;
		this.teacherdailynewchargenumber = teacherdailynewchargenumber;
		this.consultantmonthlyrenewamount = consultantmonthlyrenewamount;
		this.educatordailyrenewamount = educatordailyrenewamount;
		this.educatorweeklyrenewamount = educatorweeklyrenewamount;
		this.teacherdailyrenewamount = teacherdailyrenewamount;
		this.consultantmonthlyrenewnumber = consultantmonthlyrenewnumber;
		this.educatordailyrenewnumber = educatordailyrenewnumber;
		this.educatorweeklyrenewnumber = educatorweeklyrenewnumber;
		this.teacherdailyrenewnumber = teacherdailyrenewnumber;
		this.consultantmonthlyrefundamount = consultantmonthlyrefundamount;
		this.educatordailyrefundamount = educatordailyrefundamount;
		this.educatorweeklyrefundamount = educatorweeklyrefundamount;
		this.teacherdailyrefundamount = teacherdailyrefundamount;
		this.consultantmonthlyrefundnumber = consultantmonthlyrefundnumber;
		this.educatordailyrefundnumber = educatordailyrefundnumber;
		this.educatorweeklyrefundnumber = educatorweeklyrefundnumber;
		this.teacherdailyrefundnumber = teacherdailyrefundnumber;
		this.consultantmonthlytotalincome = consultantmonthlytotalincome;
		this.educatordailytotalincome = educatordailytotalincome;
		this.educatorweeklytotalincome = educatorweeklytotalincome;
		this.teacherdailytotalincome = teacherdailytotalincome;
		this.consultantmonthlytotalassignedincome = consultantmonthlytotalassignedincome;
		this.educatordailytotalassignedincome = educatordailytotalassignedincome;
		this.educatorweeklytotalassignedincome = educatorweeklytotalassignedincome;
		this.teacherdailytotalassignedincome = teacherdailytotalassignedincome;
		this.consultantmonthlyonetooneincome = consultantmonthlyonetooneincome;
		this.educatordailyonetooneincome = educatordailyonetooneincome;
		this.educatorweeklyonetooneincome = educatorweeklyonetooneincome;
		this.teacherdailyonetooneincome = teacherdailyonetooneincome;
		this.consultantmonthlyclassgroupincome = consultantmonthlyclassgroupincome;
		this.educatordailyclassgroupincome = educatordailyclassgroupincome;
		this.educatorweeklyclassgroupincome = educatorweeklyclassgroupincome;
		this.teacherdailyclassgroupincome = teacherdailyclassgroupincome;
		this.consultantmonthlyotherincome = consultantmonthlyotherincome;
		this.educatordailyotherincome = educatordailyotherincome;
		this.educatorweeklyotherincome = educatorweeklyotherincome;
		this.teacherdailyotherincome = teacherdailyotherincome;
		this.consultantmonthlytotalassignedamount = consultantmonthlytotalassignedamount;
		this.educatordailytotalassignedamount = educatordailytotalassignedamount;
		this.educatorweeklytotalassignedamount = educatorweeklytotalassignedamount;
		this.teacherdailytotalassignedamount = teacherdailytotalassignedamount;
		this.consultantmonthlyonetooneassignedamount = consultantmonthlyonetooneassignedamount;
		this.educatordailyonetooneassignedamount = educatordailyonetooneassignedamount;
		this.educatorweeklyonetooneassignedamount = educatorweeklyonetooneassignedamount;
		this.teacherdailyonetooneassignedamount = teacherdailyonetooneassignedamount;
		this.consultantmonthlyclassgroupassignedamount = consultantmonthlyclassgroupassignedamount;
		this.educatordailyclassgroupassignedamount = educatordailyclassgroupassignedamount;
		this.educatorweeklyclassgroupassignedamount = educatorweeklyclassgroupassignedamount;
		this.teacherdailyclassgroupassignedamount = teacherdailyclassgroupassignedamount;
		this.consultantmonthlyreactivenumber = consultantmonthlyreactivenumber;
		this.educatordailyreactivenumber = educatordailyreactivenumber;
		this.educatorweeklyreactivenumber = educatorweeklyreactivenumber;
		this.teacherdailyreactivenumber = teacherdailyreactivenumber;
	}
}