/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.criminal;

import com.dao.SqlMethodsIMplementation;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;


public class CriminalRecordsView extends ActionSupport
{
	   ArrayList list;
	ArrayList list1=new ArrayList();
	ArrayList list2=new ArrayList();
	ArrayList list3=new ArrayList();
	ArrayList list4=new ArrayList();
	ArrayList list5=new ArrayList();
	ArrayList list6=new ArrayList();
	ArrayList list7=new ArrayList();
	public ArrayList getList1() {
		return list1;
	}

	public void setList1(ArrayList list1) {
		this.list1 = list1;
	}

	public ArrayList getList2() {
		return list2;
	}

	public void setList2(ArrayList list2) {
		this.list2 = list2;
	}

	public ArrayList getList3() {
		return list3;
	}

	public void setList3(ArrayList list3) {
		this.list3 = list3;
	}

	public ArrayList getList4() {
		return list4;
	}

	public void setList4(ArrayList list4) {
		this.list4 = list4;
	}

	public ArrayList getList5() {
		return list5;
	}

	public void setList5(ArrayList list5) {
		this.list5 = list5;
	}

	public ArrayList getList6() {
		return list6;
	}

	public void setList6(ArrayList list6) {
		this.list6 = list6;
	}

	public ArrayList getList7() {
		return list7;
	}

	public void setList7(ArrayList list7) {
		this.list7 = list7;
	}

	
	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	private static final long serialVersionUID = 1L;
	
	public String execute()
	{
		SqlMethodsIMplementation iMplementation=SqlMethodsIMplementation.getConnection();
		list=iMplementation.getCriminalRecords(this);
		setList(list);
		for(int i=0;i<list.size();i++)
		{
			list1.add(list.get(i).toString().trim());
			i++;
			list2.add(list.get(i).toString().trim());
			i++;
			list3.add(list.get(i).toString().trim());
			i++;
			list4.add(list.get(i).toString().trim());
			i++;
			list5.add(list.get(i).toString().trim());
			i++;
			list6.add(list.get(i).toString().trim());
			i++;
			list7.add(list.get(i).toString().trim());
			
		}
		System.out.println(">>>>>>>>>>>>>><<<,,,,,,,,,,,,,"+list);
		return SUCCESS;
	}

}

