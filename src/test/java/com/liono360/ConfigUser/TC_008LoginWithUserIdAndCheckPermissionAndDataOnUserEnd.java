package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_008LoginWithUserIdAndCheckPermissionAndDataOnUserEnd extends Baseclass{

	@Test
	public void LoginWithUserIdAndCheckPermissionAndDataOnUserEndTest () throws InterruptedException {
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);	
		
		Thread.sleep(2000);
		user.Clickconfig().click();
		logger.info("Clicked on Clickconfig button");
		
		
		Thread.sleep(2000);
		user.User1().click();
		logger.info("Clicked on User1 button");
		
		
		Thread.sleep(2000);
		user.ClickProfile().click();
		logger.info("Clicked on ClickProfile button");
		
		
		
		Thread.sleep(2000);
		user.ScrollDownAdmin().click();
		logger.info("Clicked on ScrollDownAdmin button");
		
		
		jsScroll(driver, user.ScrollDownAdmin());	
		logger.info("Scroll down");
		
		
		Thread.sleep(2000);
		user.AdminPer().click();
		logger.info("Clicked on AdminPer button");
		
	//	Thread.sleep(5000);
	//	user.CRMpremission().click();
	//	logger.info("Click on CRMpremission");
		
		Thread.sleep(5000);
		user.CRMExpand().click();
		logger.info("Click on ClickCRMIcon");
		
		
		
		Thread.sleep(5000);
		user.ClickViewCheckbox().click();
		logger.info("Click on Viewpremission");
		
		
		Thread.sleep(5000);
		user.CreatePremission().click();
		logger.info("Click on CreatePremission");
		
		
		Thread.sleep(5000);
		user.ClickEditCheckbox().click();
		logger.info("Click on Editpremission");
		
		
		
		Thread.sleep(5000);
		user.Save().click();
		logger.info("Click on Save");
		
		
		
		Thread.sleep(6000);
		user.GoToProfile().click();
		logger.info("Click on GoToProfile");
		
		
		
		Thread.sleep(6000);
		user.GoToLogout().click();
		logger.info("Click on GoToLogout");
		
		
		
		Thread.sleep(6000);
		user.UsernameMarkzu().sendKeys("zuckerberg@kiwitech.org");
		logger.info("sendkeys on UsernameMarkzu");
		
		
		Thread.sleep(6000);
		user.PassMarkzu().sendKeys("Nexgen999");
		logger.info("sendkeys on PassMarkzu");
		
		
		
		Thread.sleep(6000);
		user.SignInMarkzu().click();
		logger.info("Click on SignInMarkzu");
		
		
		Thread.sleep(10000);
		user.LeadC().click();
		logger.info("Click on LeadC");
		
		
		
		Thread.sleep(10000);
		mouseActionRightClick(driver, user.RightClick());
		logger.info("rigt clicked on lead first");
		
		
		Thread.sleep(10000);
		user.AccountC().click();
		logger.info("Click on AccountC");
		
		
		Thread.sleep(10000);
		mouseActionRightClick(driver, user.RightClick1());
		logger.info("rigt clicked on Account first");
		
		
		
		
		//....................................................//
		
		
		
		Thread.sleep(2000);
		user.Clickconfig().click();
		logger.info("Clicked on Clickconfig button");
		
		
		Thread.sleep(2000);
		user.User1().click();
		logger.info("Clicked on User1 button");
		
		
		Thread.sleep(2000);
		user.ClickProfile().click();
		logger.info("Clicked on ClickProfile button");
		
		
		
		Thread.sleep(2000);
		user.ScrollDownAdmin().click();
		logger.info("Clicked on ScrollDownAdmin button");
		
		
		jsScroll(driver, user.ScrollDownAdmin());	
		logger.info("Scroll down");
		
		
		Thread.sleep(2000);
		user.AdminPer().click();
		logger.info("Clicked on AdminPer button");
		
	
		
		Thread.sleep(5000);
		user.CRMExpand().click();
		logger.info("Click on ClickCRMIcon");
		
		
		
		Thread.sleep(5000);
		user.Mark1().click();
		logger.info("Click on Mark1");
		
		
		Thread.sleep(5000);
		user.Mark2().click();
		logger.info("Click on Mark2");
		
		
		Thread.sleep(5000);
		user.Mark3().click();
		logger.info("Click on Mark3");
		
		
		Thread.sleep(5000);
		user.Save().click();
		logger.info("Click on Save");
		
		
		
		Thread.sleep(6000);
		user.GoToProfile().click();
		logger.info("Click on GoToProfile");
		
		
		
		Thread.sleep(6000);
		user.GoToLogout().click();
		logger.info("Click on GoToLogout");
		
		
		
		Thread.sleep(6000);
		user.UsernameMarkzu().sendKeys("zuckerberg@kiwitech.org");
		logger.info("sendkeys on UsernameMarkzu");
		
		
		Thread.sleep(6000);
		user.PassMarkzu().sendKeys("Nexgen999");
		logger.info("sendkeys on PassMarkzu");
		
		
		
		Thread.sleep(6000);
		user.SignInMarkzu().click();
		logger.info("Click on SignInMarkzu");
		
		Thread.sleep(10000);
		user.LeadC().click();
		logger.info("Click on LeadC");
		
		
		
		Thread.sleep(10000);
		mouseActionRightClick(driver, user.RightClick());
		logger.info("rigt clicked on lead first");
		
		
		Thread.sleep(10000);
		user.AccountC().click();
		logger.info("Click on AccountC");
		
		
		Thread.sleep(10000);
		mouseActionRightClick(driver, user.RightClick1());
		logger.info("rigt clicked on Account first");
		
		
		
	}
}