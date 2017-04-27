package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:19
 */
@Getter
@Setter
public class Customerscoreitems implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long scoreid;
	String subject;
	Long teacherid;
	String teachername;
	Long teacherorgid;
	String teacherorgname;
	String scorechangetype;
	Object paperscore;
	Object realscore;
	Integer graderank;
	Integer classrank;
	String satisficing;
	Integer isstudyhere;
	java.util.Date createtime;

	public Customerscoreitems() {
	}

	public Customerscoreitems(Long id, Integer version, Long scoreid, String subject, Long teacherid, String teachername, Long teacherorgid,
			String teacherorgname, String scorechangetype, Object paperscore, Object realscore, Integer graderank, Integer classrank,
			String satisficing, Integer isstudyhere, java.util.Date createtime) {
		this.id = id;
		this.version = version;
		this.scoreid = scoreid;
		this.subject = subject;
		this.teacherid = teacherid;
		this.teachername = teachername;
		this.teacherorgid = teacherorgid;
		this.teacherorgname = teacherorgname;
		this.scorechangetype = scorechangetype;
		this.paperscore = paperscore;
		this.realscore = realscore;
		this.graderank = graderank;
		this.classrank = classrank;
		this.satisficing = satisficing;
		this.isstudyhere = isstudyhere;
		this.createtime = createtime;
	}
}