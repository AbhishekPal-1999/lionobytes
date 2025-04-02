package com.liono360.questionnaire;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.QuestionnairePage;

public class TC_015RatingTypeQuestion extends Baseclass  {

	@Test
	public void TC_015RatingTypeQuestionTest() throws InterruptedException, IOException, TimeoutException {
		
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
		
		
		
		TryClick(Q.clickHamburger());
		logger.info("Clicked hamburger icon");
		
		
		TryClick(Q.Question());
		logger.info("Clicked question to add new");
		
	    Q.setQuestionName().sendKeys("Ratingfor this Question"+randomnumber());
	    String QuestionName=Q.setQuestionName().getAttribute("value");
	    logger.info("question name added");
	    
	    TryClick(Q.selectAnswerType());
	    driver.findElement(By.xpath("//span[text()='Rating']")).click();                            
	    logger.info("answer type added");
	    
	   
		
		TryClick(Q.Save());;
		Q.WaitUntillPageLoad();
		jsScroll(driver,driver.findElement(By.xpath("//td[text()='"+QuestionName+"']")));
	    System.out.println("provided question name to create: "+QuestionName);
	 
	   WebElement createdQuestionString= driver.findElement(By.xpath("//td[text()='"+QuestionName+"']"));
		 if (createdQuestionString.isDisplayed()) {
		    	Assert.assertTrue(true);
		    	logger.info("Add question test passed");
		    } 
		    else {
		    	Assert.assertTrue(false);
		    	captureScreen(driver, "Add question");
		    	logger.info("Add question test failed");
		    }
	    
	}
	
	
}
