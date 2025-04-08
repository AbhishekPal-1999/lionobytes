package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_032DeleteVisibilityGroup extends Baseclass {

	@Test
	public void DeleteVisibilityGroupTest () throws InterruptedException {
		
		//redirectToCRM();
		
		ConfigUser user = new ConfigUser(driver);
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.ClickUV());
		logger.info("Clicked on ClickUV button");

		TryClick(user.Delete2user());
		logger.info("Clicked on Delete2user button");

		TryClick(user.Yesb());
		logger.info("Clicked on Yesb button");
		
		
		
		
	}
}
