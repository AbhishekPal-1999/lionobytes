package com.liono360.ConfigUser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_029AddUserInLead extends Baseclass{

	@Test
	public void AddLeadTest () throws InterruptedException {
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.ClickUV());
		logger.info("Clicked on ClickUV button");
		
		
		TryClick(user.TestUserClick());
		logger.info("Click on TestUserClick");
			
		
		
		
		
		
		TryClick(user.LeadTestUserClick());
		logger.info("Click on LeadTestUserClick");
		
		
		SelectDropdown(user.ChannelSelect(),1);
		logger.info("Default Chaneel Selected");

		TryClick(user.SelectAllLeads());
		logger.info("Click on SelectAllLeads");

		TryClick(user.Save());
		logger.info("Click on Save");
		
		
		
		
		

		/*
		 * TryClick(user.LeadTestUserClick());
		 * logger.info("Click on LeadTestUserClick");
		 * 
		 * TryClick(user.UnselectAllLeads()); logger.info("Click on UnselectAllLeads");
		 * 
		 * user.ChannelSelect().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.
		 * xpath("(//span[text()='Default Channel'])[2]")));
		 * driver.findElement(By.xpath("(//span[text()='Default Channel'])[2]")).click()
		 * ; logger.info("select on dropdown");
		 * 
		 * TryClick(user.CNext()); logger.info("Click on CNext");
		 * 
		 * TryClick(user.L1()); logger.info("Click on L1");
		 * 
		 * TryClick(user.L2()); logger.info("Click on L2");
		 * 
		 * TryClick(user.Save()); logger.info("Click on Save");
		 * 
		 * TryClick(user.HumbergLead()); logger.info("Click on HumbergLead");
		 */

	}
}
