/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.notifications;

import com.dao.SqlMethodsIMplementation;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;

/**
 *
 * @author spiro10-java
 */
public class RepresentativesNotification extends ActionSupport
{
	
	private static final long serialVersionUID = 1L;
	private String postname,qualification,age,cutoff;
	Date startdate,enddate;
	public String getPostname() {
		return postname;
	}
	public void setPostname(String postname) {
		this.postname = postname;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCutoff() {
		return cutoff;
	}
	public void setCutoff(String cutoff) {
		this.cutoff = cutoff;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String execute()
	{
		SqlMethodsIMplementation iMplementation=SqlMethodsIMplementation.getConnection();
		int i=iMplementation.insertNotification(this);
		return SUCCESS;
	}

}

