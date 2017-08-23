/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loginregistration;

import com.dao.SqlMethodsIMplementation;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;

/**
 *
 * @author spiro10-java
 */
public class StaffRegistration extends ActionSupport
{
	private String employeid,fname,lname,uname,password,qualification,designation,gender,address,email,contact;
	
	private Date dateofbirth;

	public String getEmployeid() {
		return employeid;
	}

	public void setEmployeid(String employeid) {
		this.employeid = employeid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}



	private static final long serialVersionUID = 1L;
	
	public String execute()
	{
		SqlMethodsIMplementation iMplementation=SqlMethodsIMplementation.getConnection();
		int i=iMplementation.staffRegistration(this);
		if(i>0)
		{
		return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
	
	public void validate()
	{  
        if (getEmployeid().length() == 0) 
        {  
            addFieldError("employeid", getText("EmployeId.required"));  
        }
        
        if (getFname().length() == 0) 
        {  
            addFieldError("fname", getText("Fname.required"));  
        }
        if (getLname().length() == 0) 
        {  
            addFieldError("lname", getText("Lname.required"));  
        }
        if (getUname().length() == 0) 
        {  
            addFieldError("uname", getText("Username.required"));  
        }
        if (getPassword().length() == 0) 
        {  
            addFieldError("password", getText("password.required"));  
        }
        if (getQualification().length() == 0) 
        {  
            addFieldError("qualification", getText("qualification.required"));  
        }
        if (getDesignation().length() == 0) 
        {  
            addFieldError("designation", getText("designation.required"));  
        }
        if (getGender().length() == 0) 
        {  
            addFieldError("gender", getText("gender.required"));  
        }
        if (getAddress().length() == 0) 
        {  
            addFieldError("address", getText("address.required"));  
        }
        if (getEmail().length() == 0) 
        {  
            addFieldError("email", getText("email.required"));  
        }
        if (getContact().length() == 0) 
        {  
            addFieldError("contact", getText("contact.required"));  
        }
        
    } 
	

}
