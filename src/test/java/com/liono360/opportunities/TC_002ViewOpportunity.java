package com.liono360.opportunities;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_002ViewOpportunity extends Baseclass{
	
@Test
public void ViewOpportunityTest() throws InterruptedException, IOException {
	
// LOGIN TO CRM===============================================================================================
	
    //redirectToCRM();

	OpportunitiesPage opp=new OpportunitiesPage(driver);
	
	waitUntilPageLoad();
	Thread.sleep(10000);

	TryClick(opp.clickOpportunity());
	logger.info("Clicked on opportunities");
	

	waitUntilPageLoad();
	 Thread.sleep(2000);
	 
	mouseActionRightClick(driver, opp.AddedOpportunity());
	logger.info("right clicked on added opportunity");
	
	
	Thread.sleep(1000);
	TryClick(opp.clickViewOpportuity());
	logger.info("clicked on view option");
	
	
	TryClick(opp.clickCancel());
	logger.info("clicked on cancel");
	
	
	
	
  } 


}
