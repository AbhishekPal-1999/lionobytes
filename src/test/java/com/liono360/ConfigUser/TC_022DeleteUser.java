package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_022DeleteUser extends Baseclass{
	
	@Test
	public void DeleteUserTest () throws InterruptedException {
		
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.User2());
		logger.info("Clicked on User2 button");
		
		
		TryClick(user.ClickD());
		logger.info("Clicked on ClickD button");
		
		
		TryClick(user.Yesb());
		logger.info("Clicked on Yesb button");
		
		
		
		
		
	}

}
