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
public class Campusrenewweeklystat implements Serializable {

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
	Object rataskyear;
	Object rayear;
	Object rafinishrateyear;
	Object rayoyyear;
	Object rayoyrateyear;
	Integer rnyear;
	Integer rnyoyyear;
	Object rnyoyrateyear;
	Object rataskquarter;
	Object raquarter;
	Object rafinishratequarter;
	Object rayoyquarter;
	Object rayoyratequarter;
	Integer rnquarter;
	Integer rnyoyquarter;
	Object rnyoyratequarter;
	Object rataskmonth;
	Object ramonth;
	Object rafinishratemonth;
	Object rayoymonth;
	Object rayoyratemonth;
	Integer rnmonth;
	Integer rnyoymonth;
	Object rnyoyratemonth;
	Object ratasklastweek;
	Object ralastweek;
	Object rafinishratelastweek;
	Object raplanlastweek;
	Object raplandifflastweek;
	Object rayoylastweek;
	Object rayoyratelastweek;
	Integer rntasklastweek;
	Integer rnlastweek;
	Object rnfinishratelastweek;
	Integer rnplanlastweek;
	Integer rnplandifflastweek;
	Integer rnyoylastweek;
	Object rnyoyratelastweek;
	Object rataskthisweek;
	Object rayoythisweek;
	Object raplanthisweek;
	Object raplandiffthisweek;
	Integer rntaskthisweek;
	Integer rnyoythisweek;
	Integer rnplanthisweek;
	Integer rnplandiffthisweek;
	Integer cfnrcustomernumber;
	Integer customernumberav2000;
	Integer rnplan;
	Object raplan;

	public Campusrenewweeklystat() {
	}

	public Campusrenewweeklystat(Long id, Integer version, Integer yearkey, Integer quarterkey, Integer monthkey, Integer weekkey,
			java.util.Date startdayofweek, java.util.Date enddayofweek, java.util.Date startdayoflastweek, java.util.Date enddayoflastweek,
			Long regionid, String regionname, Long branchid, String branchname, Long campusid, String campusname, Integer availablecustomernumber,
			Object rataskyear, Object rayear, Object rafinishrateyear, Object rayoyyear, Object rayoyrateyear, Integer rnyear, Integer rnyoyyear,
			Object rnyoyrateyear, Object rataskquarter, Object raquarter, Object rafinishratequarter, Object rayoyquarter, Object rayoyratequarter,
			Integer rnquarter, Integer rnyoyquarter, Object rnyoyratequarter, Object rataskmonth, Object ramonth, Object rafinishratemonth,
			Object rayoymonth, Object rayoyratemonth, Integer rnmonth, Integer rnyoymonth, Object rnyoyratemonth, Object ratasklastweek,
			Object ralastweek, Object rafinishratelastweek, Object raplanlastweek, Object raplandifflastweek, Object rayoylastweek,
			Object rayoyratelastweek, Integer rntasklastweek, Integer rnlastweek, Object rnfinishratelastweek, Integer rnplanlastweek,
			Integer rnplandifflastweek, Integer rnyoylastweek, Object rnyoyratelastweek, Object rataskthisweek, Object rayoythisweek,
			Object raplanthisweek, Object raplandiffthisweek, Integer rntaskthisweek, Integer rnyoythisweek, Integer rnplanthisweek,
			Integer rnplandiffthisweek, Integer cfnrcustomernumber, Integer customernumberav2000, Integer rnplan, Object raplan) {
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
		this.rataskyear = rataskyear;
		this.rayear = rayear;
		this.rafinishrateyear = rafinishrateyear;
		this.rayoyyear = rayoyyear;
		this.rayoyrateyear = rayoyrateyear;
		this.rnyear = rnyear;
		this.rnyoyyear = rnyoyyear;
		this.rnyoyrateyear = rnyoyrateyear;
		this.rataskquarter = rataskquarter;
		this.raquarter = raquarter;
		this.rafinishratequarter = rafinishratequarter;
		this.rayoyquarter = rayoyquarter;
		this.rayoyratequarter = rayoyratequarter;
		this.rnquarter = rnquarter;
		this.rnyoyquarter = rnyoyquarter;
		this.rnyoyratequarter = rnyoyratequarter;
		this.rataskmonth = rataskmonth;
		this.ramonth = ramonth;
		this.rafinishratemonth = rafinishratemonth;
		this.rayoymonth = rayoymonth;
		this.rayoyratemonth = rayoyratemonth;
		this.rnmonth = rnmonth;
		this.rnyoymonth = rnyoymonth;
		this.rnyoyratemonth = rnyoyratemonth;
		this.ratasklastweek = ratasklastweek;
		this.ralastweek = ralastweek;
		this.rafinishratelastweek = rafinishratelastweek;
		this.raplanlastweek = raplanlastweek;
		this.raplandifflastweek = raplandifflastweek;
		this.rayoylastweek = rayoylastweek;
		this.rayoyratelastweek = rayoyratelastweek;
		this.rntasklastweek = rntasklastweek;
		this.rnlastweek = rnlastweek;
		this.rnfinishratelastweek = rnfinishratelastweek;
		this.rnplanlastweek = rnplanlastweek;
		this.rnplandifflastweek = rnplandifflastweek;
		this.rnyoylastweek = rnyoylastweek;
		this.rnyoyratelastweek = rnyoyratelastweek;
		this.rataskthisweek = rataskthisweek;
		this.rayoythisweek = rayoythisweek;
		this.raplanthisweek = raplanthisweek;
		this.raplandiffthisweek = raplandiffthisweek;
		this.rntaskthisweek = rntaskthisweek;
		this.rnyoythisweek = rnyoythisweek;
		this.rnplanthisweek = rnplanthisweek;
		this.rnplandiffthisweek = rnplandiffthisweek;
		this.cfnrcustomernumber = cfnrcustomernumber;
		this.customernumberav2000 = customernumberav2000;
		this.rnplan = rnplan;
		this.raplan = raplan;
	}
}