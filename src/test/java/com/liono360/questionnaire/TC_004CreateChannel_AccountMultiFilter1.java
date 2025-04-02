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

public class TC_004CreateChannel_AccountMultiFilter1 extends Baseclass {

	@Test
	public void TC004_CreateChannel_AccountMultiFilter1() throws InterruptedException, IOException, TimeoutException {
	
	//	redirectToCRM();

		QuestionnairePage Q= new QuestionnairePage(driver);

		TryClick(Q.Congigurations());
		logger.info("Clicked configuration");
		
		
		TryClick(Q.CRM());
		logger.info("Clicked crm");
		
		TryClick(Q.Questionnaire());
		logger.info("Clicked questionnare");
		
		Q.WaitUntillPageLoad();
		
		TryClick(Q.clickHamburger());
		logger.info("Clicked hamburger icon");
		
		
		TryClick(Q.Channel());
		logger.info("Clicked channel");
	
		Q.channelName().sendKeys("AutomationChannel"+randomnumber()+"_Account");
		logger.info("channel name added");
		
		String channelNameToCreate= Q.channelName().getAttribute("value");
		
		TryClick(Q.activityType());
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();                                         
		logger.info("Activity Type Added");
		
		
		TryClick(Q.SelectUsers());;
		//Thread.sleep(1000);
		//TryClick(Q.allUsers());
		TryClick(driver.findElement(By.xpath("//div[@aria-checked='false']//div")));                                         
		logger.info("user Added");	
		TryClick(Q.SelectModuleType());
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();                                         
		logger.info("Activity Type Added");
		
		TryClick(Q.SelectTemplate());
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();                                         
		logger.info("template  Added");
		
		


// ADD MULTIPLE FILTERS IN RULE HERE----------------------------------------------------------------------------------

		TryClick(Q.Addrule());;                    
		logger.info("clicked plus button to add rule");

//1.	
		TryClick(Q.AddFilter());                    
		logger.info("clicked plus button to add rule");

		TryClick(Q.selectFilter1());
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Account Type(s)']")).click();
		logger.info("filter added");
		Thread.sleep(500);

		TryClick(Q.chooseMultipleValue());
		
		String AccountType= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
		Thread.sleep(500);
		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
		Thread.sleep(500);	

//2. 	
		TryClick(Q.AddFilter());;                    
		logger.info("clicked plus button to add rule");

		TryClick(Q.selectFilter2());
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Number of Employees']")).click();
		logger.info("filter added");
		Thread.sleep(500);

		TryClick(Q.chooseMultipleValue2());
		
		String NumberOfEmployee= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
		Thread.sleep(500);
		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
		

//3. 	
		TryClick(Q.AddFilter());                    
		logger.info("clicked plus button to add rule");

		TryClick(Q.selectFilter3());
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Account Source']")).click();
		logger.info("filter added");
	
		TryClick(Q.chooseMultipleValue3());
		
		String AccountSource= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
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

		SelectDropdown(Q.chooseSingleValue(),1);
		

		TryClick(Q.setNotes());
		Q.setNotes().sendKeys("this channel is created by automation");
		logger.info("notes added");

		TryClick(Q.Save2());
		logger.info("rules are saved now");

		TryClick(Q.Save());
		logger.info("click save");
		
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
