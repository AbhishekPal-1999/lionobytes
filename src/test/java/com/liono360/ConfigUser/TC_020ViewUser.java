package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_020ViewUser extends Baseclass{
	
	
	@Test
	public void ViewUserTest() throws InterruptedException {
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.User2());
		logger.info("Clicked on User2 button");
		
		
		TryClick(user.ViewUser());
		logger.info("Clicked on ViewUser button");
		
		
		
		
		
		//TryClick(user.Showmore());
		//logger.info("Clicked on Showmore button");
		
		
		TryClick(user.Cancel1());
		logger.info("Clicked on Cancel1 button");
		
		
		
	}

}
