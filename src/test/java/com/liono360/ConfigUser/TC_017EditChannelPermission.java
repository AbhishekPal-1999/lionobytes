package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_017EditChannelPermission extends Baseclass {

	@Test
	public void EditPermissionTest () throws InterruptedException, IOException {
		
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
		user.Firstname().sendKeys("EditJon" + randomnumber());
		logger.info("First Name Added");
		
		
		String ChannelPerNameBeforeCreate= user.Firstname().getAttribute("value");
		
		
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
		
		
		
		
		TryClick(user.Editper());
		logger.info("Click on Editper");
		
		
		
		
		SelectDropdown(user.ChannelDrp(),1);
		logger.info("select on dropdown");
		
		

		TryClick(user.Save2());
		logger.info("Click on Save2");
		
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		String UserNameAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'EditJon')]")).getText();
    	System.out.println("Edit Channel to create: "+ChannelPerNameBeforeCreate);
		System.out.println("Edit Channel name after create: "+UserNameAfterCreate);

		if (ChannelPerNameBeforeCreate.equalsIgnoreCase(UserNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Edit Channel test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Add User With Required Filed");
			logger.info("Edit Channel test failed");
		}
	}

	
		
	}


