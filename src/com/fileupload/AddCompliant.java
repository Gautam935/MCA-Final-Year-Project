package com.fileupload;

import java.util.ArrayList;

import com.dao.SqlMethodsIMplementation;
import com.opensymphony.xwork2.ActionSupport;

public class AddCompliant extends ActionSupport 
{
	private static final long serialVersionUID = 1L;
	
	private String name,contact,email,compliant;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompliant() {
		return compliant;
	}

	public void setCompliant(String compliant) {
		this.compliant = compliant;
	}
	
	public String execute()
	{
		int i=0;
		SqlMethodsIMplementation iMplementation=SqlMethodsIMplementation.getConnection();
		i=iMplementation.addCompliant(this);
		if(i>0)
		{
		    return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
	
	ArrayList array1=new ArrayList();
	ArrayList array2=new ArrayList();
	ArrayList array3=new ArrayList();
	ArrayList array4=new ArrayList();
	
	public String viewCompliant()
	{
		SqlMethodsIMplementation iMplementation=SqlMethodsIMplementation.getConnection();
		ArrayList list=iMplementation.getCompliant();
		
		for(int i=0;i<list.size();i++)
		{
			array1.add(list.get(i).toString().trim());
			i++;
			array2.add(list.get(i).toString().trim());
			i++;
			array3.add(list.get(i).toString().trim());
			i++;
			array4.add(list.get(i).toString().trim());
			
		}
		
		return SUCCESS;
	}

	public ArrayList getArray1() {
		return array1;
	}

	public void setArray1(ArrayList array1) {
		this.array1 = array1;
	}

	public ArrayList getArray2() {
		return array2;
	}

	public void setArray2(ArrayList array2) {
		this.array2 = array2;
	}

	public ArrayList getArray3() {
		return array3;
	}

	public void setArray3(ArrayList array3) {
		this.array3 = array3;
	}

	public ArrayList getArray4() {
		return array4;
	}

	public void setArray4(ArrayList array4) {
		this.array4 = array4;
	}

}
