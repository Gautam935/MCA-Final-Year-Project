/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.criminal.AddCriminal;
import com.criminal.CriminalRecordsView;
import com.criminal.ModifyCriminal;
import com.fileupload.AddCompliant;
import com.fileupload.FileUpload;

import com.loginregistration.StaffLogin;
import com.loginregistration.StaffRegistration;
import com.notifications.NotificationsView;
import com.notifications.RepresentativesNotification;
import java.util.ArrayList;


public interface SqlMethodsInterface
{
	public boolean getStaffLogin(StaffLogin s);
	
	public int staffRegistration(StaffRegistration s);

	public int insertNotification(RepresentativesNotification r);
	
	public int insertCriminalDetails(AddCriminal a);
	
	public int modifyCriminalDetails(ModifyCriminal m);
	
	public ArrayList getCriminalRecords(CriminalRecordsView c);
	
	public ArrayList getNotifications(NotificationsView n);
	
	public int fileUpload(FileUpload f);
	
	public int addCompliant(AddCompliant a);
	
	public ArrayList getCompliant();

}
