package com.liono360.questionnaire;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;
import com.liono360.pageObject.QuestionnairePage;

public class TC_008DeleteChannel extends Baseclass {

	@Test
	public void TC_008EditChannelTest() throws InterruptedException, IOException, TimeoutException {
	
		//redirectToCRM();

		QuestionnairePage Q= new QuestionnairePage(driver);

		TryClick(Q.Congigurations());
		logger.info("Clicked configuration");
		
		
		TryClick(Q.CRM());
		logger.info("Clicked crm");
		
		TryClick(Q.Questionnaire());
		logger.info("Clicked questionnare");
		
		Q.WaitUntillPageLoad();
		String channelNameToDelete= Q.listedChannel().getText();
		
		TryClick(Q.Delete());
		logger.info("Clicked delete icon");
		
		TryClick(Q.clickYesButton());
		logger.info("Clicked yes button");
		
		
		String channelNameAfterDelete= Q.listedChannel().getText();
		
		System.out.println("channel name before delete: "+channelNameToDelete);
	    System.out.println("channel name after delete: "+channelNameAfterDelete);
		 if (channelNameToDelete.equalsIgnoreCase(channelNameAfterDelete)) {
		  
		    	Assert.assertTrue(true);
		    	captureScreen(driver, "");
		    	logger.info("delete channel test failed");
		    } 
		    else {
		    	Assert.assertTrue(false);
		    	logger.info("delete channel test passed");
		    }
		
	}
}
