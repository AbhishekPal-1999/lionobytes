package com.liono360.cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_011VerifyCountsInStages extends Baseclass {
	
	@Test
	public void TC_011VerifyCountsOfStages() throws InterruptedException, IOException {
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();

		CasesPage cases= new CasesPage(driver);
		cases.clickCases().click();
		logger.info("Clicked on Cases ");
		cases.waitUntilPageLoad();
		
		String AllCasesTxt =driver.findElement(By.xpath("(//span[@class='p-steps-number'])[1]")).getText();
		 int AllCases=Integer.parseInt(AllCasesTxt);
		 int totalCountsOfStages=0;
		for(int i=2;i<=4;i++) {
		String countsInStages =driver.findElement(By.xpath("(//span[@class='p-steps-number'])["+i+"]")).getText();
		 totalCountsOfStages= totalCountsOfStages+Integer.parseInt(countsInStages);
		
	}
		System.out.println("sum of total cases in each stage is: "+totalCountsOfStages);
		System.out.println("exact number of cases is : "+AllCases);
		
		if(AllCases==totalCountsOfStages) {
			Assert.assertTrue(true);
			logger.info("VerifyCountsInStagesTest is passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "VerifyCountsInStagesTest");
			logger.info("VerifyCountsInStages is failed");
	
			}
	}
}
