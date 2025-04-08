package com.liono360.ConfigUser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_024AddAndRemoveUserFromJobType extends Baseclass {

	@Test
	public void AddAndRemoveUserFromJobTypeTest () throws InterruptedException {
		
		//redirectToCRM();
		
		Actions action = new Actions(driver);
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
		
		
		
		TryClick(user.Cjobuser());
		logger.info("Click on Cjobuser");
		
		
		TryClick(user.Fadduser());
		logger.info("Click on Fadduser");
		
		
		TryClick(user.FSelectUser());
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("select on dropdown");
		
		TryClick(user.Save());
		logger.info("Click on Save");	
		
		TryClick(user.Close());
		logger.info("Click on Close");	
		
		
		
		TryClick(user.Cjobuser());
		logger.info("Click on Cjobuser");
		
		TryClick(user.DeleteRoleUser());
		logger.info("Clicked on ClickAuser button");
		
		
		SelectDropdown(user.SelectJType(), 2);
		logger.info("select on dropdown");
		
		
		
		TryClick(user.TransferAndDelete());
		logger.info("Clicked on TransferAndDelete button");
		
		TryClick(user.Close());
		logger.info("Click on Close");	
		
		Thread.sleep(2000);
		jsScroll(driver, user.Filedsc());
		
		
		
	}
	
}
