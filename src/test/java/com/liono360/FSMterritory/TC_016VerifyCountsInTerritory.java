package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;

public class TC_016VerifyCountsInTerritory extends Baseclass {

	@Test
	public void TC_016VerifyCountsInTerritoryTest() throws InterruptedException, IOException {
		

// LOGIN TO CRM===============================================================================================
		
		redirectToCRM();

// ADD NEW ROOT TERRITORY=====================================================================================


		FSMterritoryPage territory= new FSMterritoryPage(driver);
		territory.waitUntilPageLoad();
		territory.clickFSM().click();
		logger.info("Clicked FSM ");
	
		territory.selectTerritory().click();
		logger.info("Territory is selected");
		Thread.sleep(2000);
		territory.waitUntilPageLoad();
		territory.setGlobalSearch().sendKeys("Sub");
		territory.waitUntilPageLoad();

		territory.ClickExpandAll().click();
		territory.waitUntilPageLoad();
		

		String ListedCounts=territory.ListedCounts().getText();
		territory.ListedCounts().click();
		logger.info("Clicked on sub territory");
		territory.waitUntilPageLoad();
		String Counts=territory.Counts().getText();
		
		territory.waitUntilPageLoad();
	
		
//ASSERTION=======================================================================================		
		
		String territoryNameAfterCreate=territory.Counts().getText();
		System.out.println("Listed counts is: "+ListedCounts);
		System.out.println("Counts in overview: "+Counts);
		if (ListedCounts.equalsIgnoreCase(Counts)) {
			Assert.assertTrue(true);
			logger.info("count test passed");
		} 

		else {
			Assert.assertTrue(false);
			captureScreen(driver, "");
			logger.info("count  test failed");
		}
	}
}
