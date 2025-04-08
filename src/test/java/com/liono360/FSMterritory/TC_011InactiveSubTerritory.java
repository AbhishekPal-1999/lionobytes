package com.liono360.FSMterritory;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;

public class TC_011InactiveSubTerritory extends Baseclass {

	@Test
	public void TC_011InactiveSubTerritoryTest() throws InterruptedException, IOException {
		

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

		territory.EditSubTerritory().click();
		logger.info("edit territory button clicked ");
		territory.waitUntilPageLoad();
		territory.clickToggleBtn().click();
		
		logger.info("clicked on toggle button to make in-active");

		String territoryBeforeInactive=territory.TerritoryName().getAttribute("value");

		territory.clickSaveTerritory().click();
		logger.info("territory added");
		Thread.sleep(500);

		territory.waitUntilPageLoad();
		
		territory.ToggleButoon().click();
		logger.info("clicked toggle button to show in-active territories");
		territory.waitUntilPageLoad();
		
		territory.setGlobalSearch().clear();
		territory.setGlobalSearch().sendKeys(territoryBeforeInactive);
		territory.waitUntilPageLoad();
		territory.ClickExpandAll().click();
		territory.waitUntilPageLoad();
		
//ASSERTION=======================================================================================		
		
		String territoryAfterInactive=territory.ListedSubTerritory().getText();
		System.out.println("Provided Territory name to make In-active: "+territoryBeforeInactive);
		System.out.println("Listed Territory name after making In-active: "+territoryAfterInactive);
		if (territoryBeforeInactive.equalsIgnoreCase(territoryAfterInactive)) {
			Assert.assertTrue(true);
			logger.info("InactiveSubTerritoryTest passed");
		} 

		else {
			Assert.assertTrue(false);
			captureScreen(driver, "");
			logger.info("InactiveSubTerritoryTest Failed");
		}
	}
}
