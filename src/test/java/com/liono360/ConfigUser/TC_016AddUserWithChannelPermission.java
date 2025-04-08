package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_016AddUserWithChannelPermission extends Baseclass{

	@Test
	public void AddUserWithChannelPermissionTest () throws InterruptedException, IOException {
		
		//redirectToCRM();
		
		Actions action = new Actions(driver);
		ConfigUser user = new ConfigUser(driver);
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.User2());
		logger.info("Clicked on User2 button");
		
		TryClick(user.Humbergicon());
		logger.info("Clicked on Humbergicon button");
		
		
		TryClick(user.AddUser());
		logger.info("Clicked on AddUser button");
		
		TryClick(user.Toggleopen());
		logger.info("Clicked on Toggleopen button");
		
		
		
		explWaitToClick(user.Firstname());
		user.Firstname().sendKeys("Begis" + randomnumber());
		logger.info("First Name Added");
		
		String ChannelPermissionBeforeCreate= user.Firstname().getAttribute("value");
		
		
		explWaitToClick(user.Emailadress());
		user.Emailadress().sendKeys("UserCreate" + randomnumber() + "@lionobytes.com");
		logger.info("Sendkeys on email");
		
		
		
		
		TryClick(user.Role());
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[contains(text(),'CEO')])[1]")));
		driver.findElement(By.xpath("(//span[contains(text(),'CEO')])[1]")).click();
	
		
		//TryClick(user.Showmore());
		//logger.info("Clicked on Showmore button");
		
		
		
		SelectDropdown(user.JobTypeS(),2);
		logger.info("select on dropdown");
		
		SelectDropdown(user.WorkingLocation(),1);
		logger.info("select on dropdown");
		
		TryClick(user.ChannelPermission());
		logger.info("Click on ChannelPermission");
		
		
		Thread.sleep(2000);
		jsScroll(driver, user.ChannelPermission());
		
		
		
		
		
		TryClick(user.PPlusC());
		logger.info("Click on PPlusC");
		
		
	
		
		SelectDropdown(user.ChannelDrp(),1);
		logger.info("select on dropdown");
		
		
		SelectDropdown(user.DrpProfile(),1);
		logger.info("select on dropdown");
	
		
		
		TryClick(user.Save2());
		logger.info("Click on Save2");
		
		
		TryClick(user.Active2permissions());
		logger.info("Click on Active2permissions");
		
		
		
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		String UserChPermissionAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'Begis')]")).getText();
    	System.out.println("User name to create: "+ChannelPermissionBeforeCreate);
		System.out.println("User name after create: "+UserChPermissionAfterCreate);

		if (ChannelPermissionBeforeCreate.equalsIgnoreCase(UserChPermissionAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Add User With Channel Permission test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Add User With Channel Permission");
			logger.info("Add User With Channel Permission  test failed");
		}
	}

	
		
	}


