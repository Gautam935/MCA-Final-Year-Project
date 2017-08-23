/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.notifications;

import com.dao.SqlMethodsIMplementation;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

 
public class UpdateNotification extends ActionSupport implements ServletRequestAware
{

	private static final long serialVersionUID = 1L;
    HttpServletRequest request;
    String[] checkBoxDeletedValues;
	
	public String[] getCheckBoxDeletedValues() 
	{
	return checkBoxDeletedValues;
    }

public void setCheckBoxDeletedValues(String[] checkBoxDeletedValues) {
	this.checkBoxDeletedValues = checkBoxDeletedValues;
}

	public String execute()
	{
		int i=0;
		setCheckBoxDeletedValues(request.getParameterValues("postName"));
		SqlMethodsIMplementation iMplementation=SqlMethodsIMplementation.getConnection();
		i=iMplementation.deleteNotification(this);
		if(i>0)
		{
		return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

	
	public void setServletRequest(HttpServletRequest request) {
		
		this.request=request;
	}
	

}

