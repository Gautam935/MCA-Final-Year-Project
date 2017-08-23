/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loginregistration;

import com.dao.SqlMethodsIMplementation;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author spiro10-java
 */
public class StaffLogin extends ActionSupport 
{
	private String name,password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private static final long serialVersionUID = 1L;
	
	public String execute()
	{
		boolean status=false;
		SqlMethodsIMplementation implementation=SqlMethodsIMplementation.getConnection();
		  status=implementation.getStaffLogin(this);
		  
		  if(status==true)
		  {
		     return SUCCESS;
		  }
		  else
		  {
			  return ERROR;
		  }
	}
	
	public void validate() {  
        if (getName().length() == 0) 
        {  
            addFieldError("name", getText("UserName.required"));  
        }
        
        if (getPassword().length() == 0) 
        {  
            addFieldError("password", getText("password.required"));  
        }  
    }  

}
