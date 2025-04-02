package com.liono360.ConfigUser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_015AddUserwithDefaultPermission extends Baseclass{

	
	@Test
	public void AddUserTest () throws InterruptedException, IOException {
		
		//redirectToCRM();
		
		
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
		user.Firstname().sendKeys("Bhristopher" + randomnumber());
		logger.info("First Name Added");
		
		
		
		
		explWaitToClick(user.middlename());
		user.middlename().sendKeys("Robinette" + randomnumber());
		logger.info("Middle Name Added");
		
		explWaitToClick(user.Lastname());
		user.Lastname().sendKeys("Biden Jr" + randomnumber());
		logger.info("Last Name Added");
		
		
		
		explWaitToClick(user.Emailadress());
		user.Emailadress().sendKeys("Userliono7" + randomnumber() + "@lionobytes.com");
		logger.info("Sendkeys on email");
		
		
		//String DefaultNameBeforeCreate= user.Emailadress().getAttribute("value");
		
		
		explWaitToClick(user.Phone());
		user.Phone().sendKeys("9075628" + randomnumber());
		logger.info("Phone Added");
		
		
		
		
		
		
		TryClick(user.Role());
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[contains(text(),'CEO')])[1]")));
		driver.findElement(By.xpath("(//span[contains(text(),'CEO')])[1]")).click();
		


		
		
		SelectDropdown(user.Gender(),2);
		logger.info("select on dropdown");
	
		
		
		SelectDropdown(user.Jobtype(),2);
		logger.info("select on dropdown");
		
		
		
		
		//TryClick(user.Showmore());
		//logger.info("Clicked on Showmore button");
		
	
		
		explWaitToClick(user.SocialProfile());
		user.SocialProfile().sendKeys("www.Fb.com");
		logger.info("Sendkeys on SocialProfile ");
		
		
		
	
		SelectDropdown(user.Department(),4);
		logger.info("select on dropdown");
	
		
		
	
		TryClick(user.DOB());
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='1']")));
		driver.findElement(By.xpath("//span[text()='1']")).click();
		logger.info("select on dropdown");
		
		
	//	jsScroll(driver, user.DOB());
		
		
	
		//TrySelectMultiDropdown(user.SpoekanLanug(), 3, 4);
		//logger.info("select on Multi Select Dropdown");
		
		
		
		
		
		
		
		TryClick(user.StartDate());
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='1']")));
		driver.findElement(By.xpath("//span[text()='1']")).click();
		logger.info("select on dropdown");
		
		

		
		SelectDropdown(user.MaritalStatus(),2);
		logger.info("select on dropdown");
	
		
		SelectDropdown(user.Degree(),1);
		logger.info("select on dropdown");
	
		
		SelectDropdown(user.AnnualIncome(),4);
		logger.info("select on dropdown");
	
	
		SelectDropdown(user.FiledOfStudy(),4);
		logger.info("select on dropdown");
	
		

		
		explWaitToClick(user.Seniority());
		user.Seniority().sendKeys("123");
		logger.info("Sendkeys on Seniority");
		
		
		
		SelectDropdown(user.WorkingLocation(),1);
		logger.info("select on dropdown");
		
	
		//.....................Home Address.....................................................//
		
		
		Actions action = new Actions(driver);
		
		explWaitToClick(user.StreetAddress1());
		user.StreetAddress1().sendKeys("C Block, Phase 2, Industrial Area, Sector 62, Noida, Uttar Pradesh 201309");
		Thread.sleep(4000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("Sendkeys on StreetAddress1");
		
		
		explWaitToClick(user.StreetAddress2());
		user.StreetAddress2().sendKeys("Plot No. 526, Shakti Khand 4, Indirapuram, Ghaziabad, Uttar Pradesh 201014");
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("Sendkeys on StreetAddress2");
	
		
		
		
		
		//SelectDropdown(user.Country(),4);
		//logger.info("select on dropdown");
	
		
		
		
		//SelectDropdown(user.State(),4);
		//logger.info("select on dropdown");
		
		
		
		//SelectDropdown(user.City(),4);
		//logger.info("select on dropdown");
		
		
	
		//explWaitToClick(user.Zipcode());
		//user.Zipcode().sendKeys("201014");
		//logger.info("Sendkeys on Zipcode");
		
		//jsScroll(driver, user.Zipcode());
		
		//..............................Permission...................................................//
		
		TryClick(user.ClickPermission());
		logger.info("Click on Permission");
		
		
		
		TryClick(user.Plusicon());
		logger.info("Click on Plus");
		
		
		
		SelectDropdown(user.ChannelName(),1);
		logger.info("select on dropdown Channel Name");
		
		
		SelectDropdown(user.ProfileName(),1);
		logger.info("select on dropdown Profile Name");
		
		
		TryClick(user.Save2());
		logger.info("Click on Save");
		
		//..........................................//.................................................//
		
		
		TryClick(user.Other());
		logger.info("Click on Other");
		
		
	

		SelectDropdown(user.TimeZone(),4);
		logger.info("select on dropdown");
		
		
	
	
	//	user.WorkingHstarttime().click();
	//	Thread.sleep(2000);
	//	explWaitToClick(driver.findElement(By.xpath("//span[text()='1']")));
	//	driver.findElement(By.xpath("//span[text()='1']")).click();
	//	logger.info("select on dropdown");
	
		
		
		
	//	user.WorkingHEndtime().click();
	//	Thread.sleep(2000);
	//	explWaitToClick(driver.findElement(By.xpath("//span[text()='1']")));
	//	driver.findElement(By.xpath("//span[text()='4']")).click();
	//	logger.info("select on dropdown");
		
		
		
		TryClick(user.Save());
		logger.info("Click on Save");
		
	
		Thread.sleep(2000);
		String emailBeforeCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'Userliono7')]"))
				.getText();
		String emailAfterCreate = driver.findElement(By.xpath("//td[contains(normalize-space(), 'Userliono7')]"))
				.getText();

		System.out.println("Email before create: " + emailBeforeCreate);
		System.out.println("Email after create: " + emailAfterCreate);

		if (emailBeforeCreate.equalsIgnoreCase(emailAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Email before and after creation matches.");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "EmailMismatch");
			logger.info("Email before and after creation do not match.");
		}
	}
}