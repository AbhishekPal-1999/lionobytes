package com.liono360.questionnaire;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.QuestionnairePage;

public class TC_007EditChannel extends Baseclass {

	@Test
	public void TC_007EditChannelTest() throws InterruptedException, IOException, TimeoutException {
	
		//redirectToCRM();

		QuestionnairePage Q= new QuestionnairePage(driver);

		TryClick(Q.Congigurations());
		logger.info("Clicked configuration");
	//	Thread.sleep(12000);
		
		TryClick(Q.CRM());
		logger.info("Clicked crm");
		
		TryClick(Q.Questionnaire());
		logger.info("Clicked questionnare");
		
		Q.WaitUntillPageLoad();
		
		TryClick(Q.edit());
		logger.info("Clicked edit icon");
		
		Q.channelName().clear();
		Q.channelName().sendKeys("EditedChhanel"+randomnumber());
		logger.info("channel name edited ");
		
		String EditedChannelName= Q.channelName().getAttribute("value");
		
		TryClick(Q.activityType());
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();                                         
		logger.info("Activity Type Added");
		/*
		 * Q.SelectUsers().click(); // Q.allUsers().click();
		 * driver.findElement(By.xpath("//span[text()='Mary ']")).click();
		 * logger.info("user Added");
		 */
	
		
		
		TryClick(Q.Save());
		logger.info("click save");
		
		int time=100;
		boolean status = false;
		String channelNameAfterEdit=null;
		while(time<=12000) {
			WebElement channel = driver.findElement(By.xpath("//td[text()='"+EditedChannelName+"']"));
			if(channel.isDisplayed()) {
				status=true;
				channelNameAfterEdit=channel.getText();
				break;
			}
			Thread.sleep(1000);
			time=time+1000;
		
		}
		
		System.out.println("channel name to create: "+EditedChannelName);
	    System.out.println("channel name after create: "+channelNameAfterEdit);
		 if (status) {
		    	Assert.assertTrue(true);
		    	logger.info("Edit channel test passed");
		    } 
		    else {
		    	Assert.assertTrue(false);
		    	captureScreen(driver, "add work flow");
		    	logger.info("Edit channel test failed");
		    }
		
	}
}
