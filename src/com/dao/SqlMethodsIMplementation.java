/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.criminal.AddCriminal;
import com.criminal.CriminalRecordsView;
import com.criminal.ModifyCriminal;
import com.database.DBClass;
import com.fileupload.AddCompliant;
import com.fileupload.FileUpload;

import com.loginregistration.StaffLogin;
import com.loginregistration.StaffRegistration;
import com.notifications.NotificationsView;
import com.notifications.RepresentativesNotification;
import com.notifications.UpdateNotification;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SqlMethodsIMplementation implements SqlMethodsInterface
{
	public Connection con;
	public PreparedStatement ps;
	public ResultSet rs;
	
	public static SqlMethodsIMplementation implementation;
	
	private SqlMethodsIMplementation(){}
	
	public static SqlMethodsIMplementation getConnection()
	{
		if(implementation==null)
		{
			implementation=new SqlMethodsIMplementation();
		}
		
		return implementation;
	}
	
	
	public boolean getStaffLogin(StaffLogin s)
	{
		boolean status=false;
		 try{  
	          
	    	   con=DBClass.getConnection();
	  
	           ps=con.prepareStatement("select * from staffregistration where username='"+s.getName()+"' and password='"+s.getPassword()+"'");  
	           
	           rs=ps.executeQuery();
	           while(rs.next())
	           {
	        	   status=true;
	           }  
	  
	        }
	      catch(Exception e)
	      {
		     e.printStackTrace();
	      }  
		return status;
	}
	
	
	public int staffRegistration(StaffRegistration s)
	{
		 int status=0;  
	      try{  
	          
	    	   con=DBClass.getConnection();
	    	 //java.util.Date date=new java.util.Date();
	          String str=s.getDateofbirth().toString();
	           ps=con.prepareStatement("insert into staffregistration values(?,?,?,?,?,?,?,?,?,?,?,?)");  
	           ps.setString(1,s.getEmployeid());  
	           ps.setString(2,s.getFname());  
	           ps.setString(3,s.getLname());  
	           ps.setString(4,s.getUname());
	           ps.setString(5, s.getPassword());
	           ps.setString(6, s.getQualification());
	           ps.setString(7, s.getDesignation());
	           ps.setString(8, str);
	           ps.setString(9, s.getGender());
	           ps.setString(10,s.getAddress());
	           ps.setString(11,s.getEmail());
	           ps.setString(12,s.getContact());
	            
	          
	           status=ps.executeUpdate();  
	          	  
	        }
	      catch(Exception e)
	      {
		     e.printStackTrace();
	      }  
	    return status;  
	}
	
	
	public int insertNotification(RepresentativesNotification r)
	{
		 int status=0;  
	      try{  
	          
	    	   con=DBClass.getConnection();
	    	 //java.util.Date date=new java.util.Date();
	          String startdate=r.getStartdate().toString();
	          String enddate=r.getEnddate().toString();
	           ps=con.prepareStatement("insert into notifications values(?,?,?,?,?,?)");  
	           ps.setString(1,r.getPostname());  
	           ps.setString(2,r.getQualification());  
	           ps.setString(3,r.getAge());  
	           ps.setString(4,r.getCutoff());
	           ps.setString(5, startdate);
	           ps.setString(6, enddate);
	                     
	          
	           status=ps.executeUpdate();  
	          	  
	        }
	      catch(Exception e)
	      {
		     e.printStackTrace();
	      }  
	    return status;  
	}
	
	
	public int insertCriminalDetails(AddCriminal a)
	{
		int status=0;  
	      try{  
	          
	    	   con=DBClass.getConnection();
	    	 //java.util.Date date=new java.util.Date();
	          String custodydate=a.getCustodydate().toString();
	          
	           ps=con.prepareStatement("insert into criminalsinformation values(?,?,?,?,?,?,?)");  
	           ps.setString(1,a.getFirnumber());  
	           ps.setString(2,a.getCriminalname());  
	           ps.setString(3,a.getFathername());  
	           ps.setString(4,a.getAge());
	           ps.setString(5,a.getGender());
	           ps.setString(6,a.getCrimetype());
	           ps.setString(7,custodydate);
	                     
	          
	           status=ps.executeUpdate();  
	          	  
	        }
	      catch(Exception e)
	      {
		     e.printStackTrace();
	      }  
	    return status;  
	}
	
	public int modifyCriminalDetails(ModifyCriminal m)
	{
		int status=0;
		
		try
		{
			String custodydate=m.getCustodydate().toString();
			con=DBClass.getConnection();
			ps=con.prepareStatement("update criminalsinformation set criminalname='"+m.getCriminalname()+"',fathername='"+m.getFathername()+"',age='"+m.getAge()+"',gender='"+m.getGender()+"',crimetype='"+m.getCrimetype()+"',custodydate='"+custodydate+"' where firnumber='"+m.getFirnumber()+"'");
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public ArrayList getCriminalRecords(CriminalRecordsView c)
	{
		ArrayList list=new ArrayList();
		try
		{
			con=DBClass.getConnection();
			ps=con.prepareStatement("select * from criminalsinformation");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				list.add(rs.getString(1).toString().trim());
				list.add(rs.getString(2).toString().trim());
				list.add(rs.getString(3).toString().trim());
				list.add(rs.getString(4).toString().trim());
				list.add(rs.getString(5).toString().trim());
				list.add(rs.getString(6).toString().trim());
				list.add(rs.getString(7).toString().trim());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	public ArrayList getNotifications(NotificationsView n)
	{
		ArrayList list=new ArrayList();
		try
		{
			con=DBClass.getConnection();
			ps=con.prepareStatement("select * from notifications");
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(rs.getString(1).toString().trim());
				list.add(rs.getString(2).toString().trim());
				list.add(rs.getString(3).toString().trim());
				list.add(rs.getString(4).toString().trim());
				list.add(rs.getString(5).toString().trim());
				list.add(rs.getString(6).toString().trim());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public int fileUpload(FileUpload f)
	{
		int status=0;  
	      try{  
	          
	    	   con=DBClass.getConnection();
	    	 //java.util.Date date=new java.util.Date();
	          String dateofbirth=f.getDateofbirth().toString();
	          
	           ps=con.prepareStatement("insert into fileupload values(?,?,?,?,?,?,?)");  
	           ps.setString(1,f.getName());
	           ps.setString(2,f.getFathername());
	           ps.setString(3,f.getAge());
	           ps.setString(4,f.getGender());
	           ps.setString(5,f.getQualification());
	           ps.setString(6,dateofbirth);
	           ps.setString(7,f.getPath());
	           
	                     
	          
	           status=ps.executeUpdate();  
	          	  
	        }
	      catch(Exception e)
	      {
		     e.printStackTrace();
	      }  
	    return status;  
	}
	
	public int addCompliant(AddCompliant a)
	{
		int status=0;  
	      try{  
	          
	    	   con=DBClass.getConnection();
	    	 //java.util.Date date=new java.util.Date();
	          
	          
	           ps=con.prepareStatement("insert into compliant values(?,?,?,?)");  
	           ps.setString(1,a.getName());
	           ps.setString(2,a.getContact());
	           ps.setString(3,a.getEmail());
	           ps.setString(4,a.getCompliant());
	              
	                     
	          
	           status=ps.executeUpdate();  
	          	  
	        }
	      catch(Exception e)
	      {
		     e.printStackTrace();
	      }  
	    return status;  
	}
	
	
	public ArrayList getCompliant()
	{
		ArrayList list=new ArrayList();
		try
		{
			con=DBClass.getConnection();
			ps=con.prepareStatement("select * from compliant");
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(rs.getString(1).toString().trim());
				list.add(rs.getString(2).toString().trim());
				list.add(rs.getString(3).toString().trim());
				list.add(rs.getString(4).toString().trim());
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	
	public ArrayList updateNotification()
	{
		ArrayList list=new ArrayList();
		try
		{
			con=DBClass.getConnection();
			ps=con.prepareStatement("select * from notifications");
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(rs.getString(1).toString().trim());
				list.add(rs.getString(2).toString().trim());
				list.add(rs.getString(3).toString().trim());
				list.add(rs.getString(4).toString().trim());
				list.add(rs.getString(5).toString().trim());
				list.add(rs.getString(6).toString().trim());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("the list values are \t"+list);
		return list;
	}

	public int deleteNotification(UpdateNotification u)
	{
		
		
		int j=0;
		try
			{
			java.sql.Statement st =(java.sql.Statement) DBClass.getConnection().createStatement();
			 String[] s=u.getCheckBoxDeletedValues();
 			for (int i = 0; i <s.length; i++) 
				{
				String d =s[i] .toString().trim();
				System.out.println(s[i]);
				System.out.println("delete from notifications where postname='"+d+"'");
				j=((java.sql.Statement) st).executeUpdate("delete from notifications where postname='"+d+"'");
			     }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return j;
	
		
	}
}

