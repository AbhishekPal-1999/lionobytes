package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_005CopyProfile extends Baseclass{

	@Test
	public void CopyProfileTest () throws InterruptedException, IOException {
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);	
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.ClickProfile());
		logger.info("Clicked on ClickProfile button");
		
		
		TryClick(user.CopyProfile());
		logger.info("Clicked on CopyProfile button");
		
		
		
		Thread.sleep(2000);
		user.ClearProfilename().clear();
		user.ClearProfilename().sendKeys("Copy Profile"+randomnumber());
		logger.info("Clicked on ClearProfilename button");
		
		String CopyProfileNameBeforeCreate= user.Profilename().getAttribute("value");
		
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		
		TryClick(user.clickp1());
		logger.info("Click on clickp1");
		
		
		
		TryClick(user.Cancel1());
		logger.info("Click on Cancel1");
		
		
		TryClick(user.clickp2());
		logger.info("Click on clickp2");
		
		
		TryClick(user.Cancel1());
		logger.info("Click on Cancel1");
		
		
		waitUntilPageLoad();
		String CopyProfileNameAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'Copy Profile')]")).getText();
    	System.out.println("Copy Profile name to create: "+CopyProfileNameBeforeCreate);
		System.out.println("Copy Profile name after create: "+CopyProfileNameAfterCreate);

		if (CopyProfileNameBeforeCreate.equalsIgnoreCase(CopyProfileNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Copy Profile test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Add Profile");
			logger.info("Copy Profile test failed");
		}
	}

	
		
	}


