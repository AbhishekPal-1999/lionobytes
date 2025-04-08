package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_001CreateProfileWithRequiredFilds extends Baseclass{

	@Test
	public void CreateProfileWithRequiredFildsTest () throws InterruptedException, IOException {
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);	
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.ClickProfile());
		logger.info("Clicked on ClickProfile button");
		
		TryClick(user.Humbergicon());
		logger.info("Clicked on Humbergicon button");
		
		TryClick(user.ClickProfile2());
		logger.info("Clicked on ClickProfile2 button");
		
		
		explWaitToClick(user.Profilename());
		user.Profilename().sendKeys("PROFILE Corp"+randomnumber());
		logger.info("Clicked on ClickProfile2 button");
		
		String ProfileNameBeforeCreate= user.Profilename().getAttribute("value");
	
		
		explWaitToClick(user.Description());
		user.Description().sendKeys("New Profile"+randomnumber());
		logger.info("Add Description");
		
		
		
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		
		waitUntilPageLoad();
		String ProfileNameAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'PROFILE Corp')]")).getText();
    	System.out.println("Profile name to create: "+ProfileNameBeforeCreate);
		System.out.println("Profile name after create: "+ProfileNameAfterCreate);

		if (ProfileNameBeforeCreate.equalsIgnoreCase(ProfileNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Add Profile test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Add Profile With Required Filed");
			logger.info("Add Profile test failed");
		}
	}

	
		
	}


