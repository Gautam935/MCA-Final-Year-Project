/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.notifications;

import com.dao.SqlMethodsIMplementation;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author spiro10-java
 */
public class NotificationsView extends ActionSupport

{
	   ArrayList list;
	ArrayList arrayList1=new ArrayList();
	ArrayList arrayList2=new ArrayList();
	ArrayList arrayList3=new ArrayList();
	ArrayList arrayList4=new ArrayList();
	ArrayList arrayList5=new ArrayList();
	ArrayList arrayList6=new ArrayList();
	
	public ArrayList getArrayList1() {
		return arrayList1;
	}

	public void setArrayList1(ArrayList arrayList1) {
		this.arrayList1 = arrayList1;
	}

	public ArrayList getArrayList2() {
		return arrayList2;
	}

	public void setArrayList2(ArrayList arrayList2) {
		this.arrayList2 = arrayList2;
	}

	public ArrayList getArrayList3() {
		return arrayList3;
	}

	public void setArrayList3(ArrayList arrayList3) {
		this.arrayList3 = arrayList3;
	}

	public ArrayList getArrayList4() {
		return arrayList4;
	}

	public void setArrayList4(ArrayList arrayList4) {
		this.arrayList4 = arrayList4;
	}

	public ArrayList getArrayList5() {
		return arrayList5;
	}

	public void setArrayList5(ArrayList arrayList5) {
		this.arrayList5 = arrayList5;
	}

	public ArrayList getArrayList6() {
		return arrayList6;
	}

	public void setArrayList6(ArrayList arrayList6) {
		this.arrayList6 = arrayList6;
	}

	private static final long serialVersionUID = 1L;
	
	public String execute()
	{
		SqlMethodsIMplementation iMplementation=SqlMethodsIMplementation.getConnection();
		 list=iMplementation.getNotifications(this);
		 for(int i=0;i<list.size();i++)
		 {
			 arrayList1.add(list.get(i).toString().trim());
			 i++;
			 arrayList2.add(list.get(i).toString().trim());
			 i++;
			 arrayList3.add(list.get(i).toString().trim());
			 i++;
			 arrayList4.add(list.get(i).toString().trim());
			 i++;
			 arrayList5.add(list.get(i).toString().trim());
			 i++;
			 arrayList6.add(list.get(i).toString().trim());
			 
		 }
		return SUCCESS;
	}

}
