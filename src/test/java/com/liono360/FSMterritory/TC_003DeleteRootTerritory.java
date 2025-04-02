package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;

public class TC_003DeleteRootTerritory extends Baseclass{
	

	@Test
	public void TC_003DeleteRootTerritoryTest() throws InterruptedException, IOException {
		
//LOGIN TO CRM=====================================================================================
		
	//	redirectToCRM();

// DELETE ROOT TERRITORY===========================================================================
		
		
		FSMterritoryPage territory= new FSMterritoryPage(driver);
		territory.waitUntilPageLoad();
		TryClick(territory.clickFSM());
		logger.info("Clicked FSM ");
		Thread.sleep(2000);
		waitUntilPageLoad();
		TryClick(territory.selectTerritory());
		logger.info("Territory is selected");
		TryClick(territory.ClickExpandAll());
		String territoryNameBeforeDelete=territory.ListedRootTerritory().getText();
		String SearchterritoryName=territory.ListedRootTerritory().getText();
		territory.setGlobalSearch().clear();
		territory.setGlobalSearch().sendKeys(SearchterritoryName);
		
		
		
		logger.info("clicked expand all");
		
		mouseActionRightClick(driver, territory.ListedRootTerritory3());
		logger.info("Right clicked on listed territory");
	
		
		territory.clickDelete().click();
		logger.info("clicked delete");
		//Thread.sleep(2000);
		territory.clickYes().click();
		logger.info("clicked Yes");
		//Thread.sleep(20000);
		
		
		
// ASSERTION==========================================================================================
		
		/*
		 * territory.setGlobalSearch().clear();
		 * territory.setGlobalSearch().sendKeys(SearchterritoryName);
		 */
		territory.waitUntilPageLoad();
		TryClick(territory.ClickExpandAll());
		mouseActionRightClick(driver, territory.ListedRootTerritory3());
		logger.info("Right clicked on listed territory");
	
		
		territory.clickDelete().click();
		logger.info("clicked delete");
		//Thread.sleep(2000);
		territory.clickYes().click();
		logger.info("clicked Yes");
		TryClick(territory.ClickExpandAll());
		mouseActionRightClick(driver, territory.ListedRootTerritory());
		logger.info("Right clicked on listed territory");
	
		
		territory.clickDelete().click();
		logger.info("clicked delete");
		//Thread.sleep(2000);
		territory.clickYes().click();
		logger.info("clicked Yes");
		
		
		territory.waitUntilPageLoad();
		
		
		
		String territoryNameAfterDelete=territory.ListedRootTerritory().getText();
		System.out.println("Listed Territory name before delete: "+territoryNameBeforeDelete);
		System.out.println("Listed Territory name after delete: "+territoryNameAfterDelete);
		if (territoryNameBeforeDelete.equalsIgnoreCase(territoryNameAfterDelete)) {
			Assert.assertTrue(true);
			captureScreen(driver, "addCase");
			logger.info("delete case test failed");
			} 
		
		else {
			Assert.assertTrue(false);
			logger.info("delete case test passed");
		}

	}
}
