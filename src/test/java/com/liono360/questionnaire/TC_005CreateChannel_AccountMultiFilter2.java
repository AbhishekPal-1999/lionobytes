package com.liono360.questionnaire;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.QuestionnairePage;

public class TC_005CreateChannel_AccountMultiFilter2 extends Baseclass {

	@Test
	public void TC005_CreateChannel_AccountMultiFilter2() throws InterruptedException, IOException, TimeoutException {
	
	//	redirectToCRM();

		QuestionnairePage Q= new QuestionnairePage(driver);

		Q.Congigurations().click();
		logger.info("Clicked configuration");
		Thread.sleep(12000);
		
		Q.CRM().click();
		logger.info("Clicked crm");
		
		Q.Questionnaire().click();
		logger.info("Clicked questionnare");
		
		Q.WaitUntillPageLoad();
		
		Thread.sleep(4000);
		Q.clickHamburger().click();
		logger.info("Clicked hamburger icon");
		
		Thread.sleep(4000);
		Q.Channel().click();
		logger.info("Clicked channel");
		Thread.sleep(5000);
		
		Q.channelName().sendKeys("AutomationChannel"+randomnumber()+"_Account");
		logger.info("channel name added");
		
		String channelNameToCreate= Q.channelName().getAttribute("value");
		
		Q.activityType().click();
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();                                         
		logger.info("Activity Type Added");
		
	
		TryClick(Q.SelectUsers());;
		//Thread.sleep(1000);
		//TryClick(Q.allUsers());
		TryClick(driver.findElement(By.xpath("//div[@aria-checked='false']//div")));                                         
		logger.info("user Added");		
		Q.SelectModuleType().click();
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();                                         
		logger.info("Activity Type Added");
		
		Q.SelectTemplate().click();
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();                                         
		logger.info("template  Added");
		
		Q.toggle().click();
		logger.info("toggle Added");
		
		
// ADD MULTIPLE FILTERS IN RULE HERE----------------------------------------------------------------------------------
		
		Q.Addrule().click();                    
		logger.info("clicked plus button to add rule");

//1.	
		Q.AddFilter().click();                    
		logger.info("clicked plus button to add rule");
				 
	    Q.selectFilter1().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Estimated Annual Revenue']")).click();
	    logger.info("filter added");
	    Thread.sleep(500);
	    
	    Q.chooseMultipleValue().click();
	    Thread.sleep(2000);
	    String EstimatedAnnualRevenue= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    Thread.sleep(500);	
	    
//2. 	
	    Q.AddFilter().click();                    
		logger.info("clicked plus button to add rule");
	    
	    Q.selectFilter2().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Ownership Type']")).click();
	    logger.info("filter added");
	    Q.WaitUntillPageLoad();
	    Thread.sleep(500);
	    
	    Q.chooseMultipleValue2().click();
	    Thread.sleep(2000);
	    String OwnershipType= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    Thread.sleep(500);	
		
	    
//3. 	
	    Q.AddFilter().click();                    
		logger.info("clicked plus button to add rule");
		
	    Q.selectFilter3().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Industry']")).click();
	    logger.info("filter added");
	    Thread.sleep(500);
	    
	    Q.chooseMultipleValue3().click();
	    Thread.sleep(2000);
	    String Industry= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    Thread.sleep(500);	
	    
	    Actions act = new Actions(driver);
	    act.doubleClick(Q.setNotes()).perform();
	    
	    Q.setNotes().sendKeys("this channel is created by automation");
	    logger.info("notes added");
	    
	    Q.Save2().click();
		logger.info("rules are saved now");
	    
		Q.Save().click();
		logger.info("click save");
		

// CHECK HERE CHANNEL IS CRAETED OR NOT--------------------------------------------------------------------	
		
		int time=100;
		boolean status = false;
		String channelNameAfterCreate=null;
		while(time<=12000) {
			WebElement channel = driver.findElement(By.xpath("//td[text()='"+channelNameToCreate+"']"));
			if(channel.isDisplayed()) {
				status=true;
				channelNameAfterCreate=channel.getText();
				break;
			}
			Thread.sleep(1000);
			time=time+1000;
		
		}
		
		System.out.println("channel name to create: "+channelNameToCreate);
	    System.out.println("channel name after create: "+channelNameAfterCreate);
		 if (status) {
		    	Assert.assertTrue(true);
		    	logger.info("Add channel test passed");
		    } 
		    else {
		    	Assert.assertTrue(false);
		    	captureScreen(driver, "add work flow");
		    	logger.info("Add channel test failed");
		    }
		
	}
}
