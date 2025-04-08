package com.liono360.opportunities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_013CountsOpportunityTest extends Baseclass {
	
	@Test
	public void CountsOpportunityTest() throws InterruptedException, IOException {
	
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();

		OpportunitiesPage opp=new OpportunitiesPage(driver);
		opp.waitUntilPageLoad();
		opp.clickOpportunity().click();
		logger.info("Clicked on opportunities");
		opp.waitUntilPageLoad();
			
			String AllStagesTxt =driver.findElement(By.xpath("(//span[@class='p-steps-number'])[1]")).getText();
			int AllOpportunity=Integer.parseInt(AllStagesTxt);
			int totalCountsInStages=0;
			for(int i=2;i<=6;i++) {
			String countsInStages =driver.findElement(By.xpath("(//span[@class='p-steps-number'])["+i+"]")).getText();
			totalCountsInStages= totalCountsInStages+Integer.parseInt(countsInStages);
			
		}
			System.out.println("sum of total opportunites in each stage is: "+totalCountsInStages);
			System.out.println("exact number of opportunites is : "+AllOpportunity);
			
			if(AllOpportunity==totalCountsInStages) {
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
