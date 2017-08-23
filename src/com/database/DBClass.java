/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 
public class DBClass 
{
	static Connection con;
	static  Statement st;
	static ResultSet rs;
	public static  Connection getConnection()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:PoliceOptional");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
}
