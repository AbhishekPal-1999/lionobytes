package com.liono360.Stream;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.StreamPage;

public class TC_005CheckAllFiltering extends Baseclass {
	
	@Test
	public void CheckAllChannelTest () throws InterruptedException {
		
		//redirectToCRM();
	
		StreamPage str = new StreamPage(driver);
		
		
		TryClick(str.Stream());
		logger.info("Clicked on Stream button");
		
		
		
		
		Thread.sleep(3000);
		SelectDropdown(str.ChannelAll(),1);
		logger.info("Select Message Filter Option");
		
		
		Thread.sleep(3000);
		SelectDropdown(str.ChannelAll(),2);
		logger.info("Select Message Filter Option");
		
		
		Thread.sleep(3000);
		SelectDropdown(str.ChannelAll(),3);
		logger.info("Select Message Filter Option");
		
		
		Thread.sleep(3000);
		SelectDropdown(str.ChannelAll(),4);
		logger.info("Select Message Filter Option");
		
		
		
		
		
		
	}

}
