package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;

public class TC_006CreateSubTerritoryWithRequiredFields_Account extends Baseclass {

	@Test
	public void TC_006CreateSubTerritoryWithRequiredField_Account() throws InterruptedException, IOException {
		



// LOGIN TO CRM===============================================================================================

		redirectToCRM();

// ADD NEW ROOT TERRITORY=====================================================================================


		FSMterritoryPage territory= new FSMterritoryPage(driver);
		territory.waitUntilPageLoad();
		territory.clickFSM().click();
		logger.info("Clicked FSM ");
		//Thread.sleep(2000);
		territory.selectTerritory().click();
		logger.info("Territory is selected");
		Thread.sleep(2000);
		territory.waitUntilPageLoad();
		territory.setGlobalSearch().sendKeys("USA-RootTerritory");
		territory.waitUntilPageLoad();

		territory.openCompnyMenu().click();

		territory.AddNewTerritory().click();
		logger.info("Add new territory button clicked ");
		territory.waitUntilPageLoad();
		territory.clickToggleBtn().click();
		territory.clickToggleBtn().click();
		//Thread.sleep(1000);
		logger.info("clicked on toggle button to make active");

		territory.TerritoryName().sendKeys("AccountSubTerritory"+randomnumber());
		logger.info("Sub territory Name added");

		String setTerritoryName=territory.TerritoryName().getAttribute("value");

		territory.selectAssocitedModule().click();
		driver.findElement(By.xpath("//li[@aria-label=\"Account\"]")).click();
		logger.info("Account is added");

	

		territory.SelectPrimaryUser().click();
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("Territory Contact is added");

		
	
		territory.clickSaveTerritory().click();
		logger.info("territory added");

		territory.waitUntilPageLoad();
		territory.setGlobalSearch().clear();
		territory.setGlobalSearch().sendKeys(setTerritoryName);
		territory.waitUntilPageLoad();
		territory.ClickExpandAll().click();
		territory.waitUntilPageLoad();
		
		
// ASSERTION====================================================================================================
		
		
		String territoryNameAfterCreate=territory.ListedSubTerritory().getText();
		System.out.println("provided Territory name to create: "+setTerritoryName);
		System.out.println("Listed Territory name after create: "+territoryNameAfterCreate);
		if (setTerritoryName.equalsIgnoreCase(territoryNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Create territory test passed");
		} 

		else {
			Assert.assertTrue(false);
			captureScreen(driver, "");
			logger.info("create territory test failed");
		}
	}
}
