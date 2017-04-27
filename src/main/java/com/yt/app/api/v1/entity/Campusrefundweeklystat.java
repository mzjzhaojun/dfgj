package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:18
 */
@Getter
@Setter
public class Campusrefundweeklystat implements Serializable {

	private static final long serialVersionUID = 1L;

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
	Integer availablecustomernumber;
	Object rfataskyear;
	Object rfayear;
	Object rfafinishrateyear;
	Object rfayoyyear;
	Object rfayoyrateyear;
	Integer rfnyear;
	Integer rfnyoyyear;
	Object rfnyoyrateyear;
	Object rfataskquarter;
	Object rfaquarter;
	Object rfafinishratequarter;
	Object rfayoyquarter;
	Object rfayoyratequarter;
	Integer rfnquarter;
	Integer rfnyoyquarter;
	Object rfnyoyratequarter;
	Object rfataskmonth;
	Object rfamonth;
	Object rfafinishratemonth;
	Object rfayoymonth;
	Object rfayoyratemonth;
	Integer rfnmonth;
	Integer rfnyoymonth;
	Object rfnyoyratemonth;
	Object rfatasklastweek;
	Object rfalastweek;
	Object rfahllastweek;
	Object rfanllastweek;
	Object rfaorlastweek;
	Object rfafinishratelastweek;
	Integer rfntasklastweek;
	Integer rfnlastweek;
	Object rfnfinishratelastweek;
	Object rfataskthisweek;
	Object rfaplanthisweek;
	Integer rfntaskthisweek;
	Integer rfnplanthisweek;
	Integer suspendedcustomernumber;
	Integer expectrefundcustomernumber;
	Integer rfnplan;
	Object rfaplan;

	public Campusrefundweeklystat() {
	}

	public Campusrefundweeklystat(Long id, Integer version, Integer yearkey, Integer quarterkey, Integer monthkey, Integer weekkey,
			java.util.Date startdayofweek, java.util.Date enddayofweek, java.util.Date startdayoflastweek, java.util.Date enddayoflastweek,
			Long regionid, String regionname, Long branchid, String branchname, Long campusid, String campusname, Integer availablecustomernumber,
			Object rfataskyear, Object rfayear, Object rfafinishrateyear, Object rfayoyyear, Object rfayoyrateyear, Integer rfnyear,
			Integer rfnyoyyear, Object rfnyoyrateyear, Object rfataskquarter, Object rfaquarter, Object rfafinishratequarter, Object rfayoyquarter,
			Object rfayoyratequarter, Integer rfnquarter, Integer rfnyoyquarter, Object rfnyoyratequarter, Object rfataskmonth, Object rfamonth,
			Object rfafinishratemonth, Object rfayoymonth, Object rfayoyratemonth, Integer rfnmonth, Integer rfnyoymonth, Object rfnyoyratemonth,
			Object rfatasklastweek, Object rfalastweek, Object rfahllastweek, Object rfanllastweek, Object rfaorlastweek,
			Object rfafinishratelastweek, Integer rfntasklastweek, Integer rfnlastweek, Object rfnfinishratelastweek, Object rfataskthisweek,
			Object rfaplanthisweek, Integer rfntaskthisweek, Integer rfnplanthisweek, Integer suspendedcustomernumber,
			Integer expectrefundcustomernumber, Integer rfnplan, Object rfaplan) {
		this.id = id;
		this.version = version;
		this.yearkey = yearkey;
		this.quarterkey = quarterkey;
		this.monthkey = monthkey;
		this.weekkey = weekkey;
		this.startdayofweek = startdayofweek;
		this.enddayofweek = enddayofweek;
		this.startdayoflastweek = startdayoflastweek;
		this.enddayoflastweek = enddayoflastweek;
		this.regionid = regionid;
		this.regionname = regionname;
		this.branchid = branchid;
		this.branchname = branchname;
		this.campusid = campusid;
		this.campusname = campusname;
		this.availablecustomernumber = availablecustomernumber;
		this.rfataskyear = rfataskyear;
		this.rfayear = rfayear;
		this.rfafinishrateyear = rfafinishrateyear;
		this.rfayoyyear = rfayoyyear;
		this.rfayoyrateyear = rfayoyrateyear;
		this.rfnyear = rfnyear;
		this.rfnyoyyear = rfnyoyyear;
		this.rfnyoyrateyear = rfnyoyrateyear;
		this.rfataskquarter = rfataskquarter;
		this.rfaquarter = rfaquarter;
		this.rfafinishratequarter = rfafinishratequarter;
		this.rfayoyquarter = rfayoyquarter;
		this.rfayoyratequarter = rfayoyratequarter;
		this.rfnquarter = rfnquarter;
		this.rfnyoyquarter = rfnyoyquarter;
		this.rfnyoyratequarter = rfnyoyratequarter;
		this.rfataskmonth = rfataskmonth;
		this.rfamonth = rfamonth;
		this.rfafinishratemonth = rfafinishratemonth;
		this.rfayoymonth = rfayoymonth;
		this.rfayoyratemonth = rfayoyratemonth;
		this.rfnmonth = rfnmonth;
		this.rfnyoymonth = rfnyoymonth;
		this.rfnyoyratemonth = rfnyoyratemonth;
		this.rfatasklastweek = rfatasklastweek;
		this.rfalastweek = rfalastweek;
		this.rfahllastweek = rfahllastweek;
		this.rfanllastweek = rfanllastweek;
		this.rfaorlastweek = rfaorlastweek;
		this.rfafinishratelastweek = rfafinishratelastweek;
		this.rfntasklastweek = rfntasklastweek;
		this.rfnlastweek = rfnlastweek;
		this.rfnfinishratelastweek = rfnfinishratelastweek;
		this.rfataskthisweek = rfataskthisweek;
		this.rfaplanthisweek = rfaplanthisweek;
		this.rfntaskthisweek = rfntaskthisweek;
		this.rfnplanthisweek = rfnplanthisweek;
		this.suspendedcustomernumber = suspendedcustomernumber;
		this.expectrefundcustomernumber = expectrefundcustomernumber;
		this.rfnplan = rfnplan;
		this.rfaplan = rfaplan;
	}
}