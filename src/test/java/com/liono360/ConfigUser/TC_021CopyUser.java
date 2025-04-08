package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_021CopyUser extends Baseclass {

	@Test
	public void CopyUserTest () throws InterruptedException {
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.User2());
		logger.info("Clicked on User2 button");
		
		
		TryClick(user.Copyuser());
		logger.info("Clicked on Copyuser button");
		
		
		Thread.sleep(4000);
		user.CopyuserName().clear();
		user.CopyuserName().sendKeys("Akashraj"+randomnumber());
		logger.info("Clear And Sendkeys On CopyuserName");
		
		
		Thread.sleep(4000);
		user.copyuserEmail().clear();
		user.copyuserEmail().sendKeys("User" + randomnumber() + "@liono.com");
		logger.info("Clear And Sendkeys On copyuserEmail");
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		
		Thread.sleep(2000);
		jsScroll(driver, user.Copyuser());
		
		
		
	}
	

}
