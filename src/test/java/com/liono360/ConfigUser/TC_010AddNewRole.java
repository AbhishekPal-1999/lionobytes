package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_010AddNewRole extends Baseclass {

	@Test
	public void AddNewRoleTest () throws InterruptedException {
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);	
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.RoleHc());
		logger.info("Clicked on RoleHc button");
		
		
		
		TryClick(user.Kiwitechc());
		logger.info("Clicked on Kiwitechc button");
		
	
		
		
		TryClick(user.AddRoleU());
		logger.info("Clicked on AddRoleU button");
		
		
		
		explWaitToClick(user.NewRoleName());
		user.NewRoleName().sendKeys("Abbott"+randomnumber());
		logger.info("Sendkeys on NewRoleName");
		
		
		TryClick(user.Save());
		logger.info("Click on Save");	
		
		
		//TryClick(user.Kiwitechc());
		//logger.info("Clicked on Kiwitechc button");
		
		
		

		//TryClick(user.ClicksalesRep());
		//logger.info("Clicked on ClicksalesRep button");
		
		
	//	Thread.sleep(2000);
	//	jsScroll(driver, user.ClicksalesRep());
		
		
		
		//TryClick(user.Collapseall());
		//logger.info("Clicked on Collapseall button");	
		
		
		
		
		
	}
	
	
	
}
