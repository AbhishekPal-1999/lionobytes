package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_018DeleteChannelPermission extends Baseclass{

	@Test
	public void DeletePermissionTest () throws InterruptedException, IOException {
		
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
		user.Firstname().sendKeys("DChannel" + randomnumber());
		logger.info("First Name Added");
		
		
		
		explWaitToClick(user.Emailadress());
		user.Emailadress().sendKeys("Permission" + randomnumber() + "@lionobytes.com");
		logger.info("Sendkeys on email");
		
		String DChannelPerEmailBeforeCreate= user.Emailadress().getAttribute("value");
		
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
		

	
		user.ChannelPermission().click();
		logger.info("Click on ChannelPermission");
		
		
		Thread.sleep(2000);
		jsScroll(driver, user.ChannelPermission());
		
		
		
		TryClick(user.PPlusC());
		logger.info("Click on PPlusC");
		
		
		
		SelectDropdown(user.ChannelDrp(),1);
		logger.info("select on dropdown");
	
		
		SelectDropdown(user.DrpProfile(),2);
		logger.info("select on dropdown");
		
		
		TryClick(user.Save2());
		logger.info("Click on Save2");
		

		//TryClick(user.Active2permissions());
		//logger.info("Click on Active2permissions");
		
		
		TryClick(user.DeletePer());
		logger.info("Click on DeletePer");
		
	
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		String DperNameAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'Permission')]")).getText();
    	System.out.println("Edit Channel to create: "+DChannelPerEmailBeforeCreate);
		System.out.println("Edit Channel name after create: "+DperNameAfterCreate);

		if (DChannelPerEmailBeforeCreate.equalsIgnoreCase(DperNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Edit Channel permission test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Edit Channel Permission");
			logger.info("Delete Channel permission test failed");
		}
	}

	
		
	}


