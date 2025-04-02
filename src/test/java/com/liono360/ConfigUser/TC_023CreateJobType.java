package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_023CreateJobType extends Baseclass {

	@Test
	public void CreateJobTypeTest() throws InterruptedException, IOException {

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

		TryClick(user.Humbergicon());
		logger.info("Clicked on Humbergicon button");

		TryClick(user.FiledData());
		logger.info("Clicked on FiledData button");

		SelectDropdown(user.SelectFiledType(),7);
		logger.info("select on dropdown");

		explWaitToClick(user.JobTypeName());
		user.JobTypeName().sendKeys("GService" + randomnumber());
		logger.info("sendkeys on JobTypeName");

		
		String JobTypeNameBeforeCreate= user.JobTypeName().getAttribute("value");
		
		TryClick(user.Save());
		logger.info("Click on Save");

		TryClick(user.Clickjobtype());
		logger.info("Click on Clickjobtype");

		
		  //Thread.sleep(2000); jsScroll(driver, user.Clickjobtype());
		  
		  
		 // Thread.sleep(2000); jsScroll(driver, user.ScrollUsertype());
		 

		TryClick(user.ScrollFiance());
		logger.info("Click on ScrollFiance");

		Thread.sleep(2000);
		jsScroll(driver, user.ScrollFiance());
		
		
		waitUntilPageLoad();
		String UserNameAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'GService')]")).getText();
    	System.out.println("Job Type to create: "+JobTypeNameBeforeCreate);
		System.out.println("Job Type after create: "+UserNameAfterCreate);

		if (JobTypeNameBeforeCreate.equalsIgnoreCase(UserNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Create Job Type test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Add Job Type");
			logger.info("Create Job Type test Failed");
		}
	}
	
}


