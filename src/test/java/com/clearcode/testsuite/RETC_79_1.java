package com.clearcode.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.AddNewUser;
import com.clearcode.po.HomePage;
import com.clearcode.po.UsersLink;

import dataProvider.LoginData;

public class RETC_79_1 extends TestSetup{

	@Test(enabled=false,priority=1,dataProvider="SearchPatient",dataProviderClass=LoginData.class)
	public void createPatient(String[] data) throws InterruptedException {
//		wdu.type(HomePage.username_ip, data[0]);
//		wdu.type(HomePage.pwd_ip, data[1]);
//		wdu.click(HomePage.login_btn);
//		wdu.click(UsersLink.user_link);
//		wdu.mouseOver(MenuBar.patient_menu);
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, data[2]);
//		wdu.type(PatientPage.fname_ip, data[3]);
//		wdu.type(PatientPage.lname_ip, data[4]);
		
	}
	
	@Test(dataProvider="CreateUser",dataProviderClass=LoginData.class)
	public void searchPatient(String user, String pwd, String usr, String email, String fname, String lname, String website, String passpwd, String role, String error) throws InterruptedException {
		wdu.type(HomePage.username_ip, user);
		wdu.type(HomePage.pwd_ip, pwd);
		wdu.click(HomePage.login_btn);
		wdu.click(UsersLink.user_link);
		wdu.click(UsersLink.add_new);
		wdu.type(AddNewUser.userlogin, usr);
		wdu.type(AddNewUser.email, email);
		wdu.type(AddNewUser.f_name, fname);
		wdu.type(AddNewUser.l_name, lname);
		wdu.type(AddNewUser.web_site, website);
		wdu.click(AddNewUser.show_pwd);
		wdu.type(AddNewUser.pass_pwd, passpwd);
		wdu.selectByValue(AddNewUser.role_select, role);
		wdu.click(AddNewUser.add_new_usr);
		wdu.assertText(AddNewUser.error, error);	
	}
	
}
