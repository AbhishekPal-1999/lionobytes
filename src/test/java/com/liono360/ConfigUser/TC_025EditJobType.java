package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_025EditJobType extends Baseclass {

	@Test
	public void EditJobTypeTest () throws InterruptedException {
		
		//redirectToCRM();
		
		ConfigUser user = new ConfigUser(driver);
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.User2());
		logger.info("Clicked on User2 button");
			
		TryClick(user.Filedsc());
		logger.info("Clicked on Filedsc button");
		
		TryClick(user.Clickjobtype());
		logger.info("Click on Clickjobtype");
		
		
		TryClick(user.EditJtype());
		logger.info("Click on EditJtype");
		
		Thread.sleep(2000);
		user.JobTypeName().clear();
		user.JobTypeName().sendKeys("SaRole1"+randomnumber());
		logger.info("Clicked on JobTypeName button");
		
		
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
	}
}
