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

public class TC_017EditQuestions extends Baseclass {

	@Test
	public void TC_017EditQuestionsTest() throws InterruptedException, IOException, TimeoutException {
	
		//redirectToCRM();

		QuestionnairePage Q= new QuestionnairePage(driver);

		TryClick(Q.Congigurations());
		logger.info("Clicked configuration");
	
		
		TryClick(Q.CRM());
		logger.info("Clicked crm");
		
		TryClick(Q.Questionnaire());
		logger.info("Clicked questionnare");
		
		Q.WaitUntillPageLoad();
		
		TryClick(Q.questionsTab());
		logger.info("Clicked questions tab");
		
		jsScroll(driver,Q.EditQuestion());
		
		TryClick(Q.EditQuestion());
		logger.info("Clicked edit icon");
		
		TryClick(Q.setQuestionName());
		Q.setQuestionName().sendKeys("this is edited Question"+randomnumber());
		String QuestionName=Q.setQuestionName().getAttribute("value");
		logger.info("question name edited");
		
		
		TryClick(Q.Save());
		logger.info("click save");
		
		Q.WaitUntillPageLoad();
		jsScroll(driver,driver.findElement(By.xpath("//td[text()='"+QuestionName+"']")));
	    System.out.println("provided question name to create: "+QuestionName);
	 
	    WebElement EditedQuestionString= driver.findElement(By.xpath("//td[text()='"+QuestionName+"']"));
	    if (EditedQuestionString.isDisplayed()) {
	    	Assert.assertTrue(true);
	    	logger.info("edit question test passed");
	    } 
	    else {
	    	Assert.assertTrue(false);
	    	captureScreen(driver, "Add question");
	    	logger.info("edit question test failed");
	    }
	}
}
