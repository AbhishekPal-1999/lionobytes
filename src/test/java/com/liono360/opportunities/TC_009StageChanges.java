package com.liono360.opportunities;


import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.LeadWorkFlow.CommonMethods;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_009StageChanges extends Baseclass{
	
	@Test
	public void StageChangesTest() throws InterruptedException {
		
// LOGIN TO CRM===============================================================================================
		
	    //redirectToCRM();
		
		OpportunitiesPage opp=new OpportunitiesPage(driver);
		
		
		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");

		
		TryClick(opp.AddedOpportunity());
		logger.info("Clicked on listed opportunity");

		//.......................First Stage..........................................//
		TryClick(opp.FirstStage());
	    logger.info("Click On First Stage");
		
	    Thread.sleep(2000);
	    opp.setComment().sendKeys("Investigation Stage Changed" + randomnumber());
	    logger.info("comment added in stage");

	    Thread.sleep(1000);
	    TryClick(opp.clickSave());
	    logger.info("save button clicked");
		
		
	//............................Second Stage..............................................//	
		
	    TryClick(opp.SecondStage());
	    logger.info("Click On Second Stage");
		
	    Thread.sleep(2000);
	    opp.setComment().sendKeys("Negotiation Stage Changed" + randomnumber());
	    logger.info("comment added in stage");

	    TryClick(opp.clickSave());
	    logger.info("save button clicked");
	    
	    
	    
	    
	 //........................Custom Stage ..................................................//   
		
	    TryClick(opp.CustomStage());
	    logger.info("Click On Custom Stage");
		
	    Thread.sleep(2000);
	    opp.setComment().sendKeys("Custom Stage Changed" + randomnumber());
	    logger.info("comment added in stage");

	    TryClick(opp.clickSave());
	    logger.info("save button clicked");
	    
		
		
	//.....................Closed Stage......................................................//
	    
	    TryClick(opp.ClosedStage());
	    logger.info("Click On Closed Stage");
	    
	    
	    SelectDropdown(opp.ClosedStageReason(),1);
	    logger.info("Select Value for Closed Stage Reason");
			
	    
	    TrySelectMultiDropdown(opp.CloseWonReason(),1,2);
		logger.info("Select Value for Closed won Reason");
	    
		
		
		
		Thread.sleep(2000);
		CommonMethods commonMethods= new CommonMethods();
		String enddate=commonMethods.EndDate();
		TryClick(opp.ClosedWonDate());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[1]")).click();
		}
		catch(Exception e) {}
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[2]")).click();	    }
		catch(Exception e) {}
		logger.info("end date added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
	    Thread.sleep(2000);
	    opp.setComment().sendKeys("Closed Stage" + randomnumber());
	    logger.info("comment added in stage");

	    
	    TryClick(opp.clickSave());
	    logger.info("save button clicked"); 
	    
	    
	//.........................................................................................................//    
	    
	    
	    
	   
		/*for (int i = 1; i <= 5; i++) {
		    String xpath = "(//div[@class='step handPointer ng-star-inserted'])[" + i + "]";
		    driver.findElement(By.xpath(xpath)).click();
		    String stageName = driver.findElement(By.xpath(xpath)).getText();
		    logger.info("Clicked on " + stageName);

		    // Thread.sleep(2000);

		    if (i == 5) {
		        opp.selectReason().click();
		        Thread.sleep(500);
		        driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[2]//li")).click();
		        logger.info("close reason added");
		    }*/

		  
		 
		   /* if (i < 5) {
		        String nextXpath = "(//div[@class='step handPointer ng-star-inserted'])[" + (i + 1) + "]";
		        driver.findElement(By.xpath(nextXpath)).click();
		        String nextStageName = driver.findElement(By.xpath(nextXpath)).getText();
		        logger.info("Clicked on next stage: " + nextStageName);
		    }*/
		
	
		}

	}

