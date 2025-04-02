package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_002CreateProfileWithPermission extends Baseclass {

	@Test
	public void CreateProfileTest () throws InterruptedException, IOException {
		
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
		user.Profilename().sendKeys("Steven"+randomnumber());
		logger.info("Clicked on ClickProfile2 button");
		
		
		String ProfileNameBeforeCreate= user.Profilename().getAttribute("value");
		
	//	SelectDropdown(user.ProfileDrp(),1);
	//	logger.info("select on dropdown for Profile Clone From");
	
		
		
		
		explWaitToClick(user.Description());
		user.Description().sendKeys("profile Created Successfully With Permission");
		logger.info("Clicked on ClickProfile2 button");
		
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		
		
		
		Thread.sleep(1000);
		TryClick(user.ClickProfilePermission());
		logger.info("Click on Profile Permission");
		
		
		Thread.sleep(1000);
		TryClick(user.CRMExpand());
		logger.info("Click on ClickCRMIcon");
		
		Thread.sleep(1000);
		TryClick(user.ClickViewCheckbox());
		logger.info("Click on Viewpremission");
		
		
		Thread.sleep(1000);
		TryClick(user.ClickEditCheckbox());
		logger.info("Click on Editpremission");
		
		
		
		TryClick(user.ProfileReports());
		logger.info("Click on ProfileReports");
		
		
		
		//TryClick(user.ProfileReports());
		//logger.info("Click on ProfileReports");
		
		
		TryClick(user.ClickAccountReport());
		logger.info("Click on ClickAccountReport");
		
		
		TryClick(user.ClickViewReport());
		logger.info("Click on ClickViewReport");
		
		
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
		
		
		waitUntilPageLoad();
		String ProfileNameAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'Steven')]")).getText();
    	System.out.println("Profile name to create: "+ProfileNameBeforeCreate);
		System.out.println("Profile name after create: "+ProfileNameAfterCreate);

		if (ProfileNameBeforeCreate.equalsIgnoreCase(ProfileNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Add Profile test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Add Profile With Permission");
			logger.info("Add Profile test failed");
		}
	}


}
	

