package com.liono360.leads;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;

public class TC_007CheckConvertLead extends Baseclass{
	
	
	@Test
	public void CheckConvertLeadTest () throws InterruptedException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
		Thread.sleep(2000);
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		Thread.sleep(20000);

		LeadPage leads = new LeadPage(driver);
		
		Thread.sleep(2000);
		leads.clickLead().click();
		logger.info("Clicked on Lead Tab");
		
		Thread.sleep(20000);
		/*
		 * leads.LedsDrp().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath(
		 * "//span[text()='Akash_Automation']")));
		 * driver.findElement(By.xpath("//span[text()='Akash_Automation']")).click();
		 * logger.info("select on dropdown");
		 */
		Thread.sleep(5000);
		leads.addedLead().click();
		logger.info("Clicked addedLeadTab");
		
		Thread.sleep(5000);
		leads.NewOverview().click();
		logger.info("Clicked NewOverview");
		
		//Thread.sleep(2000);
		//leads.NewOverviewIcon().click();
		//logger.info("Clicked NewOverviewIcon");
		
	//	Thread.sleep(2000);
		//leads.NewOverviewEdit().click();
		//logger.info("Clicked NewOverviewEdit");
		
		Thread.sleep(2000);
		leads.CommentsNewOverview().sendKeys("Qualified");
		logger.info("sendKeys on CommentsNewOverview");
		
		Thread.sleep(2000);
		leads.SaveCommentsNewOverview().click();
		logger.info("Clicked SaveCommentsNewOverview");
		
		
		Thread.sleep(20000);
		leads.WorkingvpnotContacted().click();
		logger.info("Clicked WorkingvpnotContacted");
		
		
		Thread.sleep(2000);
		leads.CommentsWorkingvpnotcontacted().sendKeys("Qualified");
		logger.info("sendKeys on CommentsWorkingvpnotcontacted");
		
		

		Thread.sleep(2000);
		leads.SaveCommentsWorkingvpnotcontacted().click();
		logger.info("Clicked SaveCommentsWorkingvpnotcontacted");
		
		
		
		Thread.sleep(20000);
		leads.WorkingContacted().click();
		logger.info("Clicked WorkingContacted");
		
		
		
		Thread.sleep(2000);
		leads.CommentsWorkingContacted().sendKeys("Qualified");
		logger.info("sendKeys on CommentsWorkingContacted");
		
		
		Thread.sleep(2000);
		leads.SaveWorkingContacted().click();
		logger.info("Clicked SaveWorkingContacted");
		
		
		
		Thread.sleep(20000);
		leads.Closed().click();
		logger.info("Clicked on Closed");
		
		Thread.sleep(2000);
		leads.ClosedStage().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Qualified']")));
		driver.findElement(By.xpath("//span[text()='Qualified']")).click();
		logger.info("select on dropdown");
		
		
		Thread.sleep(2000);
		leads.QualiefiedReason().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Qualified Reason One']")));
		driver.findElement(By.xpath("//span[text()='Qualified Reason One']")).click();
		leads.QualiefiedReason().click();
		logger.info("select on dropdown");
		
		
		Thread.sleep(2000);
		leads.CommentsClosed().sendKeys("test Qualified");
		logger.info("sendKeys on commentsClosed");
		
		
		Thread.sleep(2000);
		leads.SavecommentsClosed().click();
		logger.info("Clicked SavecommentsClosed");
		
		Thread.sleep(20000);
		leads.ConvertIcon().click();
		logger.info("Clicked ConvertIcon");
		
		
		Thread.sleep(2000);
		leads.ConverleadToaccount().click();
		logger.info("Clicked ConverleadToaccount");
		
		Thread.sleep(5000);
		leads.SaveConverleadToaccount().click();
		logger.info("Clicked SaveConverleadToaccount");
		
	}

}
