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

public class TC_001CreateChannel_LeadMultiFilter1 extends Baseclass {

	@Test
	public void TC001_CreateChannel_Lead() throws InterruptedException, IOException, TimeoutException {
	
		//redirectToCRM();

		QuestionnairePage Q= new QuestionnairePage(driver);
		  Actions act = new Actions(driver);
		TryClick(Q.Congigurations());
		logger.info("Clicked configuration");
		
		
		Q.WaitUntillPageLoad();
		
		TryClick(Q.CRM());;
		logger.info("Clicked crm");
		
		
		TryClick(Q.Questionnaire());
		logger.info("Clicked questionnare");
		
	
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
		//Thread.sleep(1000);
		TryClick(Q.SelectModuleType());
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();                                         
		logger.info("Activity Type Added");
		
		TryClick(Q.SelectTemplate());
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();                                         
		logger.info("template  Added");
		
		/*
		 * TryClick(Q.toggle()); logger.info("toggle Added");
		 */
		
		
// ADD MULTIPLE FILTERS IN RULE HERE----------------------------------------------------------------------------------
		
		TryClick(Q.Addrule());                    
		logger.info("clicked plus button to add rule");

//1.	
		TryClick(Q.AddFilter());                    
		logger.info("clicked plus button to add rule");
				 
	    TryClick(Q.selectFilter1());
	  //  Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Lead Type(s)']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    TryClick(Q.chooseMultipleValue());
	    Thread.sleep(2000);
	    String LeadType= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    Thread.sleep(500);	
	    
//2. 	
	   TryClick( Q.AddFilter());                    
		logger.info("clicked plus button to add rule");
	    
	    TryClick(Q.selectFilter2());
	  //  Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Number of Employees']")).click();
	    logger.info("filter added");
	  //  Thread.sleep(500);
	    
	   TryClick( Q.chooseMultipleValue2());;
	   // Thread.sleep(2000);
	    String NumberOfEmployee= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	 //   Thread.sleep(500);	
		
//3. 	
	    TryClick(Q.AddFilter());                  
		logger.info("clicked plus button to add rule");
		
	    TryClick(Q.selectFilter3());
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Lead Source']")).click();
	    logger.info("filter added");
	    Thread.sleep(500);
	    
	    TryClick(Q.chooseMultipleValue3());
	  //  Thread.sleep(2000);
	    String LeadSource= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    Thread.sleep(500);	
	    
//4. 	
	    TryClick(Q.AddFilter());                    
		logger.info("clicked plus button to add rule");
		
	    TryClick(Q.selectFilter4());
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Country']")).click();
	    logger.info("filter added");
	    Thread.sleep(500);
	    
	   SelectDropdown (Q.chooseSingleValue(),1);
	    //Thread.sleep(2000);
	  
		/*
		 * TryClick(driver.findElement(By.xpath("(//li[@role='option'])[1]")));
		 * Thread.sleep(500);
		 */
	    logger.info("Country selected");
		/*
		 * String Country=
		 * (driver.findElement(By.xpath("(//li[@role='option'])[1]")).getText());
		 * Thread.sleep(1000);
		 */
	    logger.info("Country selected getText");
	    TryClick(Q.setNotes());
	    
	   // act.doubleClick(Q.setNotes()).perform();
	    //div[contains(text(),'India')]
	    Q.setNotes().sendKeys("this channel is created by automation");
	    logger.info("notes added");
	    
	    TryClick(Q.Save2());
		logger.info("rules are saved now");
	    
		TryClick(Q.Save());
		logger.info("click save");
		Thread.sleep(3000);

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
