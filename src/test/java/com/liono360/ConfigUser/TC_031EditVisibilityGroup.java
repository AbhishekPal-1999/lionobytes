package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_031EditVisibilityGroup extends Baseclass {

	
	@Test
	public void EditVisibilityGroupTest () throws InterruptedException {
		//redirectToCRM();
		
		ConfigUser user = new ConfigUser(driver);
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.ClickUV());
		logger.info("Clicked on ClickUV button");

		
		
		TryClick(user.Edit2user());
		logger.info("Clicked on Edit2user button");
		
        Thread.sleep(1000);
		user.RemoveName().clear();
		Thread.sleep(1000);
		user.RemoveName().sendKeys("PROD"+randomnumber());
		logger.info("Sendkeys on RemoveName");

		TryClick(user.Save());
		logger.info("Click on Save");

	}
	
}
