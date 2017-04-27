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
public class Campusincomeweeklystat implements Serializable {

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
	java.util.Date startdayofnextweek;
	java.util.Date enddayofnextweek;
	Long regionid;
	String regionname;
	Long branchid;
	String branchname;
	Long campusid;
	String campusname;
	Integer availablecustomernumber;
	Object incometaskyear;
	Object onetooneincomeyear;
	Object classgroupincomeyear;
	Object otherincomeyear;
	Object totalincomeyearlastyear;
	Object incometaskquarter;
	Object onetooneincomequarter;
	Object classgroupincomequarter;
	Object otherincomequarter;
	Object totalincomequarterlastyear;
	Object incometaskmonth;
	Object onetooneincomemonth;
	Object classgroupincomemonth;
	Object otherincomemonth;
	Object totalincomemonthlastyear;
	Object incometasklastweek;
	Object onetooneincomelastweek;
	Object classgroupincomelastweek;
	Object otherincomelastweek;
	Object totalassignmoneylastweek;
	Object totalincomelastweeklastyear;
	Object incometaskthisweek;
	Object incomethisweeklastyear;
	Integer assignnumberthisweek;
	Object assignamountthisweek;
	Object assignmoneythisweek;
	Integer nonassignnumberthisweek;
	Object totalavailableordermoneythisweek;
	Object expectassignamountthisweek;
	Object expectincomethisweek;
	Object incometasknextweek;
	Object incomenextweeklastyear;
	Integer assignnumbernextweek;
	Object assignamountnextweek;
	Object assignmoneynextweek;
	Integer nonassignnumbernextweek;
	Object totalavailableordermoneynextweek;
	Object expectassignamountnextweek;
	Object expectincomenextweek;
	Object remainassignmoneythismonth;
	Object totalassignmoneythismonth;
	Object incometaskthismonth;
	Object incomeplannextmonth;
	Object incometasknextmonth;
	Object incomeplanmonthafternextmonth;
	Object incometaskmonthafternextmonth;

	public Campusincomeweeklystat() {
	}

	public Campusincomeweeklystat(Long id, Integer version, Integer yearkey, Integer quarterkey, Integer monthkey, Integer weekkey,
			java.util.Date startdayofweek, java.util.Date enddayofweek, java.util.Date startdayoflastweek, java.util.Date enddayoflastweek,
			java.util.Date startdayofnextweek, java.util.Date enddayofnextweek, Long regionid, String regionname, Long branchid, String branchname,
			Long campusid, String campusname, Integer availablecustomernumber, Object incometaskyear, Object onetooneincomeyear,
			Object classgroupincomeyear, Object otherincomeyear, Object totalincomeyearlastyear, Object incometaskquarter,
			Object onetooneincomequarter, Object classgroupincomequarter, Object otherincomequarter, Object totalincomequarterlastyear,
			Object incometaskmonth, Object onetooneincomemonth, Object classgroupincomemonth, Object otherincomemonth,
			Object totalincomemonthlastyear, Object incometasklastweek, Object onetooneincomelastweek, Object classgroupincomelastweek,
			Object otherincomelastweek, Object totalassignmoneylastweek, Object totalincomelastweeklastyear, Object incometaskthisweek,
			Object incomethisweeklastyear, Integer assignnumberthisweek, Object assignamountthisweek, Object assignmoneythisweek,
			Integer nonassignnumberthisweek, Object totalavailableordermoneythisweek, Object expectassignamountthisweek, Object expectincomethisweek,
			Object incometasknextweek, Object incomenextweeklastyear, Integer assignnumbernextweek, Object assignamountnextweek,
			Object assignmoneynextweek, Integer nonassignnumbernextweek, Object totalavailableordermoneynextweek, Object expectassignamountnextweek,
			Object expectincomenextweek, Object remainassignmoneythismonth, Object totalassignmoneythismonth, Object incometaskthismonth,
			Object incomeplannextmonth, Object incometasknextmonth, Object incomeplanmonthafternextmonth, Object incometaskmonthafternextmonth) {
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
		this.startdayofnextweek = startdayofnextweek;
		this.enddayofnextweek = enddayofnextweek;
		this.regionid = regionid;
		this.regionname = regionname;
		this.branchid = branchid;
		this.branchname = branchname;
		this.campusid = campusid;
		this.campusname = campusname;
		this.availablecustomernumber = availablecustomernumber;
		this.incometaskyear = incometaskyear;
		this.onetooneincomeyear = onetooneincomeyear;
		this.classgroupincomeyear = classgroupincomeyear;
		this.otherincomeyear = otherincomeyear;
		this.totalincomeyearlastyear = totalincomeyearlastyear;
		this.incometaskquarter = incometaskquarter;
		this.onetooneincomequarter = onetooneincomequarter;
		this.classgroupincomequarter = classgroupincomequarter;
		this.otherincomequarter = otherincomequarter;
		this.totalincomequarterlastyear = totalincomequarterlastyear;
		this.incometaskmonth = incometaskmonth;
		this.onetooneincomemonth = onetooneincomemonth;
		this.classgroupincomemonth = classgroupincomemonth;
		this.otherincomemonth = otherincomemonth;
		this.totalincomemonthlastyear = totalincomemonthlastyear;
		this.incometasklastweek = incometasklastweek;
		this.onetooneincomelastweek = onetooneincomelastweek;
		this.classgroupincomelastweek = classgroupincomelastweek;
		this.otherincomelastweek = otherincomelastweek;
		this.totalassignmoneylastweek = totalassignmoneylastweek;
		this.totalincomelastweeklastyear = totalincomelastweeklastyear;
		this.incometaskthisweek = incometaskthisweek;
		this.incomethisweeklastyear = incomethisweeklastyear;
		this.assignnumberthisweek = assignnumberthisweek;
		this.assignamountthisweek = assignamountthisweek;
		this.assignmoneythisweek = assignmoneythisweek;
		this.nonassignnumberthisweek = nonassignnumberthisweek;
		this.totalavailableordermoneythisweek = totalavailableordermoneythisweek;
		this.expectassignamountthisweek = expectassignamountthisweek;
		this.expectincomethisweek = expectincomethisweek;
		this.incometasknextweek = incometasknextweek;
		this.incomenextweeklastyear = incomenextweeklastyear;
		this.assignnumbernextweek = assignnumbernextweek;
		this.assignamountnextweek = assignamountnextweek;
		this.assignmoneynextweek = assignmoneynextweek;
		this.nonassignnumbernextweek = nonassignnumbernextweek;
		this.totalavailableordermoneynextweek = totalavailableordermoneynextweek;
		this.expectassignamountnextweek = expectassignamountnextweek;
		this.expectincomenextweek = expectincomenextweek;
		this.remainassignmoneythismonth = remainassignmoneythismonth;
		this.totalassignmoneythismonth = totalassignmoneythismonth;
		this.incometaskthismonth = incometaskthismonth;
		this.incomeplannextmonth = incomeplannextmonth;
		this.incometasknextmonth = incometasknextmonth;
		this.incomeplanmonthafternextmonth = incomeplanmonthafternextmonth;
		this.incometaskmonthafternextmonth = incometaskmonthafternextmonth;
	}
}