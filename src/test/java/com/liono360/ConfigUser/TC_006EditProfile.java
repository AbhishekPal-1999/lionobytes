package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_006EditProfile extends Baseclass{

	@Test
	public void EditProfileTest () throws InterruptedException, IOException {
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);	
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on configuration button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.ClickProfile());
		logger.info("Clicked on ClickProfile button");
		
		TryClick(user.EP());
		logger.info("Clicked on EP button");
		
		Thread.sleep(2000);
		user.CEP().clear();
		user.CEP().sendKeys("Busniess Module"+randomnumber());
		logger.info("Edit Profile Name");
		
		String EditProfileNameBeforeCreate= user.Profilename().getAttribute("value");
		
		Thread.sleep(2000);
		user.PD().clear();
		user.PD().sendKeys("Profile Name Changed"+randomnumber());
		logger.info("Clicked on NewOne button");
		
		
		
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		waitUntilPageLoad();
		String EditProfileNameAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'Busniess Module')]")).getText();
    	System.out.println("Edit Profile name to create: "+EditProfileNameBeforeCreate);
		System.out.println("Edit Profile name after create: "+EditProfileNameAfterCreate);

		if (EditProfileNameBeforeCreate.equalsIgnoreCase(EditProfileNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Edit Profile test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Edit Profile");
			logger.info("Edit Profile test failed");
		}
	}

	
		
	}


