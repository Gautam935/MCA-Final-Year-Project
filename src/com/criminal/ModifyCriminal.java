/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.criminal;

import com.dao.SqlMethodsIMplementation;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;


public class ModifyCriminal extends ActionSupport 
{

	private static final long serialVersionUID = 1L;
	private String firnumber,criminalname,fathername,age,gender,crimetype;
	Date custodydate;
	public String getFirnumber() {
		return firnumber;
	}
	public void setFirnumber(String firnumber) {
		this.firnumber = firnumber;
	}
	public String getCriminalname() {
		return criminalname;
	}
	public void setCriminalname(String criminalname) {
		this.criminalname = criminalname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCrimetype() {
		return crimetype;
	}
	public void setCrimetype(String crimetype) {
		this.crimetype = crimetype;
	}
	
	public Date getCustodydate() {
		return custodydate;
	}
	public void setCustodydate(Date custodydate) {
		this.custodydate = custodydate;
	}
	public String execute()
	{
		int status=0;
		SqlMethodsIMplementation iMplementation=SqlMethodsIMplementation.getConnection();
		 status=iMplementation.modifyCriminalDetails(this);
		if(status>0)
		{
		 return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

}