package com.liono360.Stream;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.StreamPage;

public class TC_005CheckAllFiltering extends Baseclass {
	
	@Test
	public void CheckAllChannelTest () throws InterruptedException {
		
		//redirectToCRM();
	
		StreamPage str = new StreamPage(driver);
		
		
		TryClick(str.Stream());
		logger.info("Clicked on Stream button");
		
		explWaitToClick(str.ChannelAll());
		SelectDropdown(str.ChannelAll(),1);
		logger.info("Selected Message Filter Option");
		
		
		explWaitToClick(str.ChannelAll());
		SelectDropdown(str.ChannelAll(),2);
		logger.info("Selected Event Filter Option");
		
		
		explWaitToClick(str.ChannelAll());
		SelectDropdown(str.ChannelAll(),3);
		logger.info("Selected Appreciation Filter Option");
		
		
		explWaitToClick(str.ChannelAll());
		SelectDropdown(str.ChannelAll(),4);
		logger.info("Selected Announcement Filter Option");
		
		
		
		
		
		
	}

}
