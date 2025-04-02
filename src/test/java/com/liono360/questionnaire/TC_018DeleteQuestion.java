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

public class TC_018DeleteQuestion extends Baseclass {

	@Test
	public void TC_018DeleteQuestionTest() throws InterruptedException, IOException, TimeoutException {
	
	//	redirectToCRM();

		QuestionnairePage Q= new QuestionnairePage(driver);

		TryClick(Q.Congigurations());
		logger.info("Clicked configuration");
		
		
		TryClick(Q.CRM());
		logger.info("Clicked crm");
		
		TryClick(Q.Questionnaire());
		logger.info("Clicked questionnare");
		
		Q.WaitUntillPageLoad();
		
		
		TryClick(Q.questionsTab());
		
		jsScroll(driver,Q.DeleteQuestion());
		
		Q.WaitUntillPageLoad();
		String QuestionToDelete= Q.ListedLastQuestion().getText();
		logger.info("Clicked questions tab");
		
		Q.WaitUntillPageLoad();
		TryClick(Q.DeleteQuestion());
		logger.info("Clicked delete icon");
		
		TryClick(Q.clickYesButton());
		logger.info("Clicked yes button");
		
		String QuestionAfterDelete= Q.ListedLastQuestion().getText();
		
		System.out.println("Listed last Question before delete: "+QuestionToDelete);
	    System.out.println("Listed last Question after delete: "+QuestionAfterDelete);
		 if (QuestionToDelete.equalsIgnoreCase(QuestionAfterDelete)) {
		  
		    	Assert.assertTrue(false);
		    	captureScreen(driver, "");
		    	logger.info("delete question test failed");
		    } 
		    else {
		    	Assert.assertTrue(true);
		    	logger.info("delete question test passed");
		    }
		
	}
}
