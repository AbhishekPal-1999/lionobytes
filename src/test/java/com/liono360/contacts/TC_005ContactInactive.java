package com.liono360.contacts;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ContactsPage;
import com.liono360.pageObject.LoginPage;

public class TC_005ContactInactive extends Baseclass {

	@Test
	public void ContactinactiveTest() throws InterruptedException {
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

		ContactsPage contacts = new ContactsPage(driver);
		
		Thread.sleep(20000);
		contacts.Inactive01().click();
		logger.info("Clicked on contact button");
			
		explWaitToClick(contacts.Clickonbtn());
		mouseActionRightClick(driver, contacts.Clickonbtn());

		Thread.sleep(10000);
		contacts.Inactive04().click();
		logger.info("Clicked on contactinactivebtn button");

		/*
		 * //explWaitToClick(contacts.Inactive05());
		 * 
		 * Thread.sleep(2000); contacts.Inactive05().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.
		 * xpath("//span[text()='This contact is inactive with reason']")));
		 * driver.findElement(By.
		 * xpath("//span[text()='This contact is inactive with reason']")).click();
		 * contacts.Inactive05().click(); logger.info("select on dropdown");
		 * 
		 */

		Thread.sleep(10000);
		contacts.Inactive07().sendKeys("Inactive contact");
		logger.info("comments");

		Thread.sleep(10000);
		contacts.Inactive08().click();
		logger.info("click on save button");
	}
}
