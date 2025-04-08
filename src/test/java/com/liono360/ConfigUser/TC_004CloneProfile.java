package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_004CloneProfile extends Baseclass {

	
	@Test
	public void CloneProfileTest () throws InterruptedException, IOException {
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);	
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Click configuration button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User button");
		
		
		TryClick(user.ClickProfile());
		logger.info("Clicked on Click Profile button");
		
		TryClick(user.Humbergicon());
		logger.info("Clicked on Humbergicon button");
		
		
		
		TryClick(user.ClickProfile2());
		logger.info("Clicked on ClickProfile2 button");
		
		
		explWaitToClick(user.Profilename());
		user.Profilename().sendKeys("Maxi Clone"+randomnumber());
		logger.info("Sendkeys on Profile Name");
		
		String CloneProfileNameBeforeCreate= user.Profilename().getAttribute("value");
		
		Actions action = new Actions(driver);
		
		
		SelectDropdown(user.ProfileDrp(),2);
		logger.info("select on dropdown for Profile");
		
		
		explWaitToClick(user.Description());
		user.Description().sendKeys("clone profile"+randomnumber());
		logger.info("Description Added");
		
		
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
		String CloneProfileNameAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'Maxi Clone')]")).getText();
    	System.out.println("Clone Profile name to create: "+CloneProfileNameBeforeCreate);
		System.out.println("Clone Profile name after create: "+CloneProfileNameAfterCreate);

		if (CloneProfileNameBeforeCreate.equalsIgnoreCase(CloneProfileNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Clone Profile test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Clone Profile");
			logger.info("Clone Profile test failed");
		}
	}

	
		
	}


