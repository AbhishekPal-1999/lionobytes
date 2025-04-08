package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_027CreateUserVisibilityGroup extends Baseclass{

	@Test
	public void CreateUserVisibilityTest () throws InterruptedException {
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.ClickUV());
		logger.info("Clicked on ClickUV button");
		
		
		
		TryClick(user.Humbergicon());
		logger.info("Clicked on Humbergicon button");
		
		
		
		
		TryClick(user.AddGroupUV());
		logger.info("Clicked on AddGroupUV button");
		
		
		TryClick(user.Vtoggle());
		logger.info("Clicked on Vtoggle button");
		
		
		
		
		user.NameUV().sendKeys("UserGroup8"+ randomnumber());
		logger.info("Sendkeyson NameUV");
		
	
		user.DescUV().sendKeys("group added");
		logger.info("Sendkeyson DescUV");
		
	
		
		TryClick(user.Save());
		logger.info("Click on Save Button");
		
	
		
	}
	
	
}
