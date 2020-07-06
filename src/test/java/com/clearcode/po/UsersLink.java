package com.clearcode.po;

import org.openqa.selenium.By;

public class UsersLink {
	public static By user_link = By.id("menu-users");
	public static By add_new = By.xpath("//*[@id=\"wpbody-content\"]/div[3]/a");
	
	public static By properties = By.xpath("//*[@id=\"menu-posts-property\"]/a/div[3]");
	public static By features = By.xpath("//*[@id=\"menu-posts-property\"]/ul/li[4]/a");
}
