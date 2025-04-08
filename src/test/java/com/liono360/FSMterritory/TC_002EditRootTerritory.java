package com.liono360.FSMterritory;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;

public class TC_002EditRootTerritory extends Baseclass{
	

	@Test
	public void TC_002EditRootTerritoryTest() throws InterruptedException, IOException {
		
//LOGIN TO CRM=====================================================================================
		
		
	//	redirectToCRM();

// EDIT ROOT TERRITORY=============================================================================
		
		
		FSMterritoryPage territory= new FSMterritoryPage(driver);
		territory.waitUntilPageLoad();
		territory.clickFSM().click();
		logger.info("Clicked FSM ");
		Thread.sleep(4000);
	   waitUntilPageLoad();
		TryClick(territory.selectTerritory());
		logger.info("Territory is selected");
		TryClick(territory.ClickExpandAll());
		logger.info("clicked Expand all");

		String SearchterritoryName=territory.ListedRootTerritory().getText();
		
		
		territory.setGlobalSearch().clear();
		territory.setGlobalSearch().sendKeys(SearchterritoryName);
		territory.waitUntilPageLoad();
		TryClick(territory.ClickExpandAll());
		logger.info("clicked Expand all");
		
		mouseActionRightClick(driver, territory.ListedRootTerritory());
		logger.info("right clicked on listed territory");
	
		TryClick(territory.clickEdit());
		logger.info("clicked Edit button");
		
		territory.RootTerritoryName().clear();
		//Thread.sleep(7000);
		territory.RootTerritoryName().sendKeys("RootTerritoryEdited"+randomnumber());
		logger.info("territory Name added");
		
		String TerritoryName=territory.RootTerritoryName().getAttribute("value");
		TerritoryName="USA-"+TerritoryName;
		SelectDropdown(territory.TerritoryContact(),2);
		territory.clickSaveTerritory().click();
		logger.info("root territory added");
		
		
// ASSERTION============================================================================================
		TryClick(territory.ClickExpandAll());
		logger.info("clicked expand all");
		territory.setGlobalSearch().clear();
		territory.setGlobalSearch().sendKeys(TerritoryName);
		territory.waitUntilPageLoad();
				
		
		String territoryNameAfterCreate=territory.ListedRootTerritory().getText();
		System.out.println("provided Territory name to create: "+TerritoryName);
		System.out.println("Listed Territory name after create: "+territoryNameAfterCreate);
		if (TerritoryName.equalsIgnoreCase(territoryNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Edit territory test passed");
			} 
		
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "");
			logger.info("Edit territory test failed");
			}

	}
}
