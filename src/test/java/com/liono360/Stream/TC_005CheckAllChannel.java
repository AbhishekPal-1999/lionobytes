package com.liono360.Stream;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.StreamPage;

public class TC_005CheckAllChannel extends Baseclass {
	
	@Test
	public void CheckAllChannelTest () throws InterruptedException {
		
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
	
		StreamPage str = new StreamPage(driver);
		
		
		Thread.sleep(10000);
		str.Stream().click();
		logger.info("Clicked on Stream button");
		
		
		Thread.sleep(5000);
		str.ChannelAll().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[text()='All'])[2]")));
		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
		logger.info("Dropdown ChannelAll");
		
		
		Thread.sleep(5000);
		str.ChannelAll().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[text()='All'])[2]")));
		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
		logger.info("Dropdown ChannelAll");
		
		
		
		Thread.sleep(5000);
		str.ChannelAll().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Marked As Read']")));
		driver.findElement(By.xpath("//span[text()='Marked As Read']")).click();
		logger.info("Dropdown ChannelAll");
		
		
		
		Thread.sleep(5000);
		str.ChannelAll().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Marked As Read']")));
		driver.findElement(By.xpath("//span[text()='Marked As Read']")).click();
		logger.info("Dropdown ChannelAll");
		
		
		Thread.sleep(5000);
		str.ChannelAll().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Marked As Favourite']")));
		driver.findElement(By.xpath("//span[text()='Marked As Favourite']")).click();
		logger.info("Dropdown ChannelAll");
		
		
		Thread.sleep(5000);
		str.ChannelAll().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Pinned Post']")));
		driver.findElement(By.xpath("//span[text()='Pinned Post']")).click();
		logger.info("Dropdown ChannelAll");
		
		
		
	}

}
