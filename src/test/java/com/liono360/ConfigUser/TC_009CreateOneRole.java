package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_009CreateOneRole extends Baseclass {

	
	
	@Test
	public void CreateOneRoleTest () throws InterruptedException {
		
		//redirectToCRM();
		
		ConfigUser user = new ConfigUser(driver);	
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on configuration button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.RoleHc());
		logger.info("Clicked on RoleHc button");
		
		
		
		TryClick(user.Humbergicon());
		logger.info("Clicked on Humbergicon button");
		
		
		TryClick(user.RoleHc1());
		logger.info("Clicked on RoleHc1 button");	
		
		

		explWaitToClick(user.RoleName());
		user.RoleName().sendKeys("Richard"+randomnumber());
		logger.info("Clicked on RoleName button");
		
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		
		//TryClick(user.Clickexpandall());
		//logger.info("Clicked on Clickexpandall button");
		
		
		
		//jsScroll(driver, user.Clickexpandall());
		
	
		
		//TryClick(user.Collapseall());
		//logger.info("Clicked on Collapseall button");	
		
	
	
	}
}
