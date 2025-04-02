package com.liono360.ConfigUser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_018DeletePermission extends Baseclass{

	@Test
	public void DeletePermissionTest () throws InterruptedException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
		Thread.sleep(2000);
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		Thread.sleep(20000);
		
		Actions action = new Actions(driver);
		ConfigUser user = new ConfigUser(driver);
		
		Thread.sleep(2000);
		user.Clickconfig().click();
		logger.info("Clicked on Clickconfig button");
		
		
		Thread.sleep(2000);
		user.User1().click();
		logger.info("Clicked on User1 button");
		
		
		Thread.sleep(2000);
		user.User2().click();
		logger.info("Clicked on User2 button");
		
		Thread.sleep(10000);
		user.Humbergicon().click();
		logger.info("Clicked on Humbergicon button");
		
		
		Thread.sleep(2000);
		user.AddUser().click();
		logger.info("Clicked on AddUser button");
		
		
		
		
		
		
		Thread.sleep(10000);
		user.Toggleopen().click();
		logger.info("Clicked on Toggleopen button");
		
		explWaitToClick(user.Firstname());
		user.Firstname().sendKeys("Aaaaaa1" + randomnumber());
		logger.info("First Name Added");
		
		
		
		
		explWaitToClick(user.Emailadress());
		user.Emailadress().sendKeys("UserCreate" + randomnumber() + "@lionobytes.com");
		logger.info("Sendkeys on email");
		
		
		
		
		Thread.sleep(2000);
		//explWaitToClick(user.Role());
		user.Role().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[contains(text(),'Sales Rep')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Sales Rep')]")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(2000);
		user.Showmore().click();
		logger.info("Clicked on Showmore button");
		
		
		
    	Thread.sleep(2000);
		//explWaitToClick(user.Department());
		user.JobTypeS().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='User Type']")));
		driver.findElement(By.xpath("//span[text()='User Type']")).click();
		logger.info("select on dropdown");
		
		
		
		

		Thread.sleep(5000);
		user.ChannelPermission().click();
		logger.info("Click on ChannelPermission");
		
		
		Thread.sleep(2000);
		jsScroll(driver, user.ChannelPermission());
		
		
		
		Thread.sleep(5000);
		user.PPlusC().click();
		logger.info("Click on PPlusC");
		
		
		Thread.sleep(2000);
		user.ChannelDrp().click();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(2000);
		user.DrpProfile().click();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("select on dropdown");
		
		Thread.sleep(5000);
		user.Save2().click();
		logger.info("Click on Save2");
		

		Thread.sleep(5000);
		user.Active2permissions().click();
		logger.info("Click on Active2permissions");
		
		
		Thread.sleep(5000);
		user.DeletePer().click();
		logger.info("Click on DeletePer");
		
		Thread.sleep(5000);
		user.Save().click();
		logger.info("Click on Save");
		
		
	}
	
}
