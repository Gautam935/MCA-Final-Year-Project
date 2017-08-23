package com.fileupload;

import java.util.Date;

import com.dao.SqlMethodsIMplementation;
import com.opensymphony.xwork2.ActionSupport;

public class FileUpload extends ActionSupport
{
	private static final long serialVersionUID = 1L;
	private String name,fathername,age,gender,qualification,path;
	Date dateofbirth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String execute()
	{
		int i=0;
		SqlMethodsIMplementation iMplementation=SqlMethodsIMplementation.getConnection();
		i=iMplementation.fileUpload(this);
		if(i>0)
		{
		return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

}
