<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.SqlMethodsIMplementation"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- saved from url=(0024)http://www.walkerpd.org/ -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Police Department Online</title>
</head><body background="./police1_files/wpdbg.jpg" text="#000000" alink="#FF0000" vlink="#0000FF" link="#0000FF"><center><style type="text/css"> <!-- A {text-decoration: none} --> </style>
<style type="text/css">
 <!--
 A:hover { color: #063164; }
 -->
</style>
<style type="text/css"><!--
    .tab        { font-family: arial; font-size: 10pt; font-weight: bold; text-decoration: none; color: #FFFFFF; }
--></style>

<table width="750" border="0" cellspacing="0" cellpadding="0"><tbody><tr><td colspan="3">
<table width="750" border="0" cellspacing="0" cellpadding="0" bgcolor="#1B3594">
<tbody><tr>
<td align="left" bgcolor="#000000"><img src="./police1_files/left.gif" width="15" height="30"></td>
<th bgcolor="#000000"><a href="home.jsp" class="tab">
<font face="Century Gothic">Main Page</font></a></th>
<td align="right" bgcolor="#000000"><font face="Century Gothic"><img src="./police1_files/right.gif" width="10" height="20"></font></td>
<td bgcolor="#383E58" width="8"></td>
<td align="left"><font face="Century Gothic"><img src="./police1_files/left.gif" width="10" height="20"></font></td>
<th><a class="tab" href="recruitment.jsp"><font face="Century Gothic">Recruitment</font></a></th>
<td align="right"><font face="Century Gothic"><img src="./police1_files/right.gif" width="10" height="20"></font></td>
<td bgcolor="#383E58" width="8"></td>
<td align="left"><font face="Century Gothic"><img src="./police1_files/left.gif" width="10" height="20"></font></td>
<th><a class="tab" href="login.jsp"><font face="Century Gothic">Login</font></a></th>
<td align="right"><font face="Century Gothic"><img src="./police1_files/right.gif" width="10" height="20"></font></td>
<td bgcolor="#383E58" width="8"></td>

<td bgcolor="#383E58" width="8"></td>
<td align="left"><font face="Century Gothic"><img src="./police1_files/left.gif" width="10" height="20"></font></td>
<th><a class="tab" href="contact.jsp"><font face="Century Gothic">Team Impact</font></a></th>
<td align="right"><font face="Century Gothic"><img src="./police1_files/right.gif" width="10" height="20"></font></td>
<td bgcolor="#383E58" width="8"></td>
<td align="left"><font face="Century Gothic"><img src="./police1_files/left.gif" width="10" height="20"></font></td>
<th><a href="compliant.jsp" class="tab"><font face="Century Gothic">Compliant</font></a></th>
<td align="right"><img src="./police1_files/right.gif" width="10" height="20"></td>
</tr></tbody></table></td>
</tr><tr>
<td height="72" bgcolor="#000000"><!-- <center> -->
<table width="700" height="94" align="CENTER" cellpadding="-1" cellspacing="-1">
	<tbody><tr>
		<td><center><img border="0" src="./police1_files/center2.jpg" ></center></td>
		<td align="center"><img border="0" src="./police1_files/side.png" width="115" height="130"></td>
	</tr>
</tbody></table>
  <!-- </center> -->
</td></tr></tbody></table><img src="./police1_files/blank.gif" width="1" height="2" border="0">
    <table background="./police1_files/bg2.gif" border="1" align="CENTER" cellspacing="-1" cellpadding="10" bordercolorlight="#000000" bordercolordark="#000000" width="750">
    <tbody>
    <tr>
<td align="right">&nbsp;
<center>
<h3>The Following Are The Notifications Released</h3>
<s:form action="deleteNotification.action" >  
<table border="1" style="background-color: white;width: 600px;margin-bottom: 500px;">
<tr><th>Select</th><th>POST NAME</th><th>QUALIFICATION</th><th>AGE</th><th>CUT OFF</th><th>START DATE</th><th>END DATE</th></tr>
     
<%ArrayList list=new ArrayList(); 
  SqlMethodsIMplementation iMplementation=SqlMethodsIMplementation.getConnection();
   list=iMplementation.updateNotification();
   System.out.println("******* \t"+list);
  Iterator iterator=list.iterator();
  while(iterator.hasNext())
  {
    String postName=iterator.next().toString().trim();
    String qualification=iterator.next().toString().trim();
    String age=iterator.next().toString().trim();
    String cutOff=iterator.next().toString().trim();
    String startDate=iterator.next().toString().trim();
    String endDate=iterator.next().toString().trim();%>
 
        <tr>
      <td>  <input type="checkbox" name="postName" value="<%=postName%>"> </td> 
      <td>   <%=postName %></td>
      <td>   <%=qualification %></td>
      <td>   <%=age %></td>
      <td>   <%=cutOff %></td>
      <td>   <%=startDate %></td>
      <td>   <%=endDate %></td>
      
      </tr>     
      
        
         <%} %>
       <input type="submit" value="DELETE"></input>
          </table>
          
         </s:form>
  </center>
  </td>

</tr>
</tbody></table>
</center></body></html>