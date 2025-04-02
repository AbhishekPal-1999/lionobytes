package com.liono360.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;
import com.liono360.pageObject.LoginPage;

public class TC_009StageChangeOfCases extends Baseclass {
 
	@Test
	public void TC_009StageChangeOFCases() throws InterruptedException  {
	
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();

		CasesPage cases= new CasesPage(driver);
		Actions act = new Actions(driver);
		
		
		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");
		
		
		waitUntilPageLoad();
		TryClick(cases.addedCase());
		logger.info("clicked on added case");
		
		
		TryClick(cases.clickAssignedBtn());
		logger.info("clicked on assigned");
		
		
		
		waitUntilPageLoad();
		explWaitToClick(cases.setComments());
		cases.setComments().sendKeys("Qualified"+randomnumber());
		logger.info("comments are added");
		
		
		
		TryClick(cases.clickNotifyClient());
		TryClick(cases.clickSave());
		
		
		waitUntilPageLoad();
		TryClick(cases.clickInProgressBtn());
		logger.info("clicked on In-progress");
		
		
		waitUntilPageLoad();
		explWaitToClick(cases.setComments());
		cases.setComments().sendKeys("Qualified"+randomnumber());
		logger.info("comments are added");
		
		TryClick(cases.clickNotifyClient());
		TryClick(cases.clickSave());
		
		
		
		waitUntilPageLoad();
		act.doubleClick(cases.clickClosedBtn()).perform();
		logger.info("clicked on closed");
		cases.waitUntilPageLoad();
		
		cases.setComments().sendKeys("Qualified");
		logger.info("comments are added");
		
		
		
		cases.clickNotifyClient().click();
		cases.clickSave().click();
		cases.waitUntilPageLoad();
	}
}
