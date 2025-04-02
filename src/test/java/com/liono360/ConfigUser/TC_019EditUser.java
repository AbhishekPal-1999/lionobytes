package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_019EditUser extends Baseclass {
	
	@Test
	public void EditUserTest () throws InterruptedException, IOException {
		
		//redirectToCRM();

		ConfigUser user = new ConfigUser(driver);

		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");

		TryClick(user.User1());
		logger.info("Clicked on User1 button");

		TryClick(user.User2());
		logger.info("Clicked on User2 button");

		TryClick(user.ClickP());
		logger.info("Clicked on ClickP button");

		explWaitToClick(user.Emailadress());
		user.Emailadress().clear();
		user.Emailadress().sendKeys("EditUser" + randomnumber() + "@lionobytes.com");
		logger.info("Sendkeys on email");

		String EditEmailBeforeCreate = user.Emailadress().getAttribute("value");

		TryClick(user.Save());
		logger.info("Click on Save");

	
		waitUntilPageLoad();
		Thread.sleep(1000);
		String EditUserEmailAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'EditUser')]")).getText();
		System.out.println("Edit Email to create: " + EditEmailBeforeCreate);
		System.out.println("Edit Email after create: " + EditUserEmailAfterCreate);

		if (EditEmailBeforeCreate.equalsIgnoreCase(EditUserEmailAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Edit User test passed");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "Edit User");
			logger.info("Edit User test failed");
		}
	}

}
