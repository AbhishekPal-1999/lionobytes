package com.liono360.questionnaire;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;
import com.liono360.pageObject.QuestionnairePage;

public class TC_002CreateChannel_LeadMultiFilter2 extends Baseclass {

	@Test
	public void TC002_CreateChannel_LeadMultiFilter2() throws InterruptedException, IOException, TimeoutException {
	
		//redirectToCRM();

		QuestionnairePage Q= new QuestionnairePage(driver);

		TryClick(Q.Congigurations());
		logger.info("Clicked configuration");
		//Thread.sleep(12000);
		
		TryClick(Q.CRM());
		logger.info("Clicked crm");
		
		TryClick(Q.Questionnaire());
		logger.info("Clicked questionnare");
		
		Q.WaitUntillPageLoad();
		
		TryClick(Q.clickHamburger());
		logger.info("Clicked hamburger icon");
		
		
		TryClick(Q.Channel());
		logger.info("Clicked channel");
		
		
		Q.channelName().sendKeys("AutomationChannel"+randomnumber()+"_Lead");
		logger.info("channel name added");
		
		String channelNameToCreate= Q.channelName().getAttribute("value");
		
		TryClick(Q.activityType());
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();                                         
		logger.info("Activity Type Added");
		
		TryClick(Q.SelectUsers());;
		//Thread.sleep(1000);
		//TryClick(Q.allUsers());
		TryClick(driver.findElement(By.xpath("//div[@aria-checked='false']//div")));                                         
		logger.info("user Added");		
		TryClick(Q.SelectModuleType());
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();                                         
		logger.info("Activity Type Added");
		
		TryClick(Q.SelectTemplate());
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();                                         
		logger.info("template  Added");
		/*
		 * Q.toggle().click(); logger.info("toggle Added");
		 * 
		 */
// ADD MULTIPLE FILTERS IN RULE HERE----------------------------------------------------------------------------------
		
		TryClick(Q.Addrule());                    
		logger.info("clicked plus button to add rule");

//1.	
		TryClick(Q.AddFilter());                    
		logger.info("clicked plus button to add rule");
				 
	    TryClick(Q.selectFilter1());
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Estimated Annual Revenue']")).click();
	    logger.info("filter added");
	    Thread.sleep(500);
	    
	   TryClick( Q.chooseMultipleValue());
	  //  Thread.sleep(2000);
	    String EstimatedAnnualRevenue= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    Thread.sleep(500);	
	    
//2. 	
	    TryClick(Q.AddFilter());                    
		logger.info("clicked plus button to add rule");
	    
	    TryClick(Q.selectFilter2());
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Ownership Type']")).click();
	    logger.info("filter added");
	    Thread.sleep(500);
	    
	    TryClick(Q.chooseMultipleValue2());
	  //  Thread.sleep(2000);
	    String OwnershipType= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    Thread.sleep(500);	
		
//3. 	
	    TryClick(Q.AddFilter());                    
		logger.info("clicked plus button to add rule");
		
	    TryClick(Q.selectFilter3());
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Stage']")).click();
	    logger.info("filter added");
	    Thread.sleep(500);
	    
	    TryClick(Q.chooseMultipleValue3());
	    Thread.sleep(2000);
	    String Stage= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    Thread.sleep(500);	
	    
//4. 	
	    TryClick(Q.AddFilter());                    
		logger.info("clicked plus button to add rule");
		
	    TryClick(Q.selectFilter4());
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Industry']")).click();
	    logger.info("filter added");
	    Thread.sleep(500);
	    
	    TryClick(Q.chooseMultipleValue4());
	   // Thread.sleep(2000);
	    String Industry= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    //Thread.sleep(500);	
	    Q.setNotes().click();
	 
	    
	    Q.setNotes().sendKeys("this channel is created by automation");
	    logger.info("notes added");
	    
	    TryClick(Q.Save2());
		logger.info("rules are saved now");
	    
		TryClick(Q.Save());
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
