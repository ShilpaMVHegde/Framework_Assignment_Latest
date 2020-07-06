package com.clearcode.po;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddNewUser {
	public static By userlogin = By.id("user_login");
	public static By email = By.id("email");
	public static By f_name = By.id("first_name");
	public static By l_name = By.id("last_name");
	public static By web_site = By.id("url");
	public static By show_pwd = By.xpath("//*[@id=\"createuser\"]/table/tbody/tr[6]/td/button");
	public static By pass_pwd = By.id("pass1-text");
	public static By role_select = By.id("role");
	public static By add_new_usr = By.id("createusersub");	
	public static By error = By.xpath("//*[@id=\"wpbody-content\"]/div[3]/div[2]/p/strong");
}
