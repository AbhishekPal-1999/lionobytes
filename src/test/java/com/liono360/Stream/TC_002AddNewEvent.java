package com.liono360.Stream;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.StreamPage;

public class TC_002AddNewEvent extends Baseclass {

	
	@Test
	public void AddNewEventTest () throws InterruptedException {
		

		//redirectToCRM();
	
		StreamPage str = new StreamPage(driver);
		
		TryClick(str.Stream());
		logger.info("Clicked on Stream button");
			
		
		
		SelectDropdown(str.DropdownOption(),1);
		logger.info("Select Message Filter Option");
		
		
		
		TryClick(str.New());
		logger.info("Clicked on New button");
		
		
		waitUntilPageLoad();
		TryClick(str.Event());
		logger.info("Clicked on Event btn");
		
		
		

		
		str.EventTitle().sendKeys("Test Event");
		logger.info("Sendkeys on EventTitle");
		
		
		


		
		//TryClick(str.StartDate());
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='26']")));
		//driver.findElement(By.xpath("//span[text()='26']")).click();
		//logger.info("select on dropdown");
		
		
		
		
	    //TryClick(str.EndDate());
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='27']")));
		//driver.findElement(By.xpath("//span[text()='27']")).click();
		//logger.info("select on dropdown");
		
		
		
		//TryClick(str.AllDay());
		//logger.info("Clicked on AllDay btn");
		
		
		SelectDropdown(str.Repeat(),1);
	    logger.info("select on Dropdown Repeat");
		
		
		
		
	
		TryClick(str.Reminder());
		explWaitToClick(driver.findElement(By.xpath("(//span[text()='30 minutes'])[2]")));
		driver.findElement(By.xpath("(//span[text()='30 minutes'])[2]")).click();
		logger.info("select on dropdown");
		
		
		
		
		explWaitToClick(str.Location());
		str.Location().sendKeys("Delhi");
		logger.info("Sendkeys on Location");
		
		
		
		
		//TryClick(str.Monday());
		//logger.info("Clicked on Monday btn");
		
		
		
		//TryClick(str.Tuesday());
		//logger.info("Clicked on Tuesday btn");
		
		
		
		
		
		
		
		
		
		explWaitToClick(str.Description());
		str.Description().sendKeys("Test Automation Event");
		logger.info("Sendkeys on Description");
		
		
		
		
		
		TrySelectMultiDropdown(str.ShareWith(),1,2);
		logger.info("select on dropdown");
		
		
		TryClick(str.CreateNewEvent());


		
		
		TryClick(str.Save());
		logger.info("Clicked on Save btn");
		
		//..................Favorite,Read,Pin.............................................................//	
		
		
		
		
		        TryClick(str.StarFavourite());
				logger.info("Clicked on StarFavourite button");
				
				
				
				
			
				TryClick(str.Read());
				logger.info("Clicked on Read button");
				
				
			
				TryClick(str.Pin());
				logger.info("Clicked on Pin button");
				
				
			
				//TryClick(str.Line());
				//logger.info("Clicked on Line button");
			
				
				//...................Edit...............................//
				
				
	
				//TryClick(str.Edit());
				//logger.info("Clicked on Edit button");
				
				
				
				//str.EventTitle2().clear();
				//explWaitToClick(str.EventTitle2());
				//str.EventTitle2().sendKeys("Test Automation Event");
				//logger.info("edited");
				
				
			
	
				//TryClick(str.Save());
				//logger.info("Clicked on Post button");
				
				
			//........................Delete...................................//	
				
				
				
		
				TryClick(str.Line());
				logger.info("Clicked on Line button");
				
				
			
				TryClick(str.Delete());
				logger.info("Clicked on Delete button");
				
			
				TryClick(str.Yes());
				logger.info("Clicked on Yes button");
				
				
				
				
		
	}

}
