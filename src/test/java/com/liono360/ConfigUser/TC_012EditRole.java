package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_012EditRole extends Baseclass{

	@Test
	public void EditRoleTest () throws InterruptedException {
		
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
			
		
		TryClick(user.ER());
		logger.info("Clicked on ER button");
		
		
		
        Thread.sleep(2000);
		user.RoleName1().clear();
		user.RoleName1().sendKeys("SaRole1"+randomnumber());
		logger.info("Clicked on RoleName1 button");
		
		
		
		//SelectDropdown(user.ReportedTo(),1);
		//logger.info("Select Value for Dropdown");
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		
		//TryClick(user.Clickexpandall());
		//logger.info("Clicked on Clickexpandall button");
	
		
		
		//Thread.sleep(2000);
		//jsScroll(driver, user.Clickexpandall());
		

		//TryClick(user.CEOexpand());
		//logger.info("Clicked on CEOexpand button");
		
		
		//Thread.sleep(2000);
		//jsScroll(driver, user.CEOexpand());
		
		
		
		
		
	}
	
}
