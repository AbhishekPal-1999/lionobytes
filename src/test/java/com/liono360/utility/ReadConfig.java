package com.liono360.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig()
	{
		
		
		File src1 = new File("./Configuration/config-Production.properties");

		

		
		 
	 try { FileInputStream fish = new FileInputStream(src1); pro = new Properties();
	  pro.load(fish); } catch (Exception e) { System.out.println("Exception is " +
	  e.getMessage()); } }

		 
	
	

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getOrganizationID() {
		String OrganizationID = pro.getProperty("organizationID");
		return OrganizationID;
	}

	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getBrowser() {
		String browser = pro.getProperty("Browser");
		return browser;
	}

}