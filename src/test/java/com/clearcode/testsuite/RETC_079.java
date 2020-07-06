package com.clearcode.testsuite;

import org.testng.annotations.Test;

import com.clearcode.po.AddNewUser;
import com.clearcode.po.FeaturePage;
import com.clearcode.po.HomePage;
import com.clearcode.po.UsersLink;

import dataProvider.LoginData;

public class RETC_079 extends TestSetup{

	@Test
	(dataProvider="AddNewFeature",dataProviderClass=LoginData.class)
	public void AddNwFeature(String user, String pwd, String tagname, String tagslug, String pfeature, String descr, String descr1, String passpwd, String role, String error) throws InterruptedException {
		wdu.type(HomePage.username_ip, user);
		wdu.type(HomePage.pwd_ip, pwd);
		wdu.click(HomePage.login_btn);
		wdu.click(UsersLink.properties);
		wdu.click(UsersLink.features);
//		wdu.type(FeaturePage.tag_name, tagname);
//		wdu.type(FeaturePage.tag_slug, tagslug);
//		wdu.selectByValue(FeaturePage.parent_feature, pfeature);
//		wdu.type(FeaturePage.desc, descr);
//		wdu.click(FeaturePage.nw_feature_btn);
		wdu.refresh();
		wdu.tableFetch();
		
	}
	
	

}
