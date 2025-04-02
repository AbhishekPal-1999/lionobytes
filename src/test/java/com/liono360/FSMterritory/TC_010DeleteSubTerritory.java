package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;

public class TC_010DeleteSubTerritory extends Baseclass {

	@Test
	public void TC_010DeleteSubTerritoryTest() throws InterruptedException, IOException {
		

// LOGIN TO CRM===============================================================================================
		
		redirectToCRM();

//=======================================================================


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
		
		String territoryNameBeforeDelete=territory.ListedSubTerritory().getText();
		
		territory.DeleteSubTerritory().click();
		logger.info("delete territory button clicked ");
		Thread.sleep(1000);
		territory.clickYes().click();
		logger.info("clicked Yes");
		//Thread.sleep(20000);
		territory.waitUntilPageLoad();
		
// Assertion=========================================================================================
		
		territory.waitUntilPageLoad();
		territory.setGlobalSearch().clear();
		territory.setGlobalSearch().sendKeys("Sub");
		territory.waitUntilPageLoad();

		territory.ClickExpandAll().click();
		Thread.sleep(1000);
		
		String territoryNameAfterDelete=territory.ListedSubTerritory().getText();
		System.out.println("Listed Territory name before delete: "+territoryNameBeforeDelete);
		System.out.println("Listed Territory name after delete: "+territoryNameAfterDelete);
		if (territoryNameBeforeDelete.equalsIgnoreCase(territoryNameAfterDelete)) {
			Assert.assertTrue(false);
			captureScreen(driver, "addCase");
			logger.info("delete case test failed");
			} 
		
		else {
			Assert.assertTrue(true);
			logger.info("delete case test passed");
		}
			}
}
