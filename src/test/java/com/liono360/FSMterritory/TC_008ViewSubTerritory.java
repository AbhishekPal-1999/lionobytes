package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;

public class TC_008ViewSubTerritory extends Baseclass {

	@Test
	public void TC_008ViewSubTerritoryTest() throws InterruptedException, IOException {
		

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
		Thread.sleep(1000);
		
		mouseActionRightClick(driver, territory.ListedSubTerritory());
		logger.info("Right clicked on listed territory");
		Thread.sleep(500);
		territory.clickView().click();
		logger.info("clicked on view option");

		
// ASSERTION====================================================================================================		
		
		territory.waitUntilPageLoad();
		if(territory.ViewHeader().isDisplayed())
		{ 

			Assert.assertTrue(true);
			logger.info("View territory test passed");
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver, "View Territory");
			logger.info("view territory test failed");
		}
		territory.clickCancel().click();
		logger.info("clicked on cancel");
		//Thread.sleep(4000);
		}
}
