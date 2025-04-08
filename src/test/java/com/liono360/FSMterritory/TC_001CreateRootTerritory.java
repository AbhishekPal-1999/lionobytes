package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;

public class TC_001CreateRootTerritory extends Baseclass{
	

	@Test
	public void TC_001CreateRootTerritoryTest() throws InterruptedException, IOException {
		
// LOGIN TO CRM===============================================================================================
		

		//redirectToCRM();

// ADD NEW ROOT TERRITORY=====================================================================================
		
		
		FSMterritoryPage territory= new FSMterritoryPage(driver);
		territory.waitUntilPageLoad();
		TryClick(territory.clickFSM());
		//territory.clickFSM().click();
		logger.info("Clicked FSM ");
		waitUntilPageLoad();
		jsClick(driver,territory.selectTerritory());
		//territory.selectTerritory().click();
		logger.info("Territory is selected");
		
		territory.waitUntilPageLoad();
		TryClick(territory.clickRootTerritory());
		
		//territory.clickRootTerritory().click();
		logger.info("Clicked root territory button ");
		territory.waitUntilPageLoad();
		jsClick(driver,territory.clickActiveInactiveSlider());
		jsClick(driver,territory.clickActiveInactiveSlider());
//		territory.clickActiveInactiveSlider().click();
//		territory.clickActiveInactiveSlider().click();
		//Thread.sleep(1000);
		logger.info("clicked on toggle button to make active");
		jsClick(driver,territory.clickRootTerritory());
		Thread.sleep(3000);
	    waitUntilPageLoad();
		territory.SelectRootCountry().click();
		waitUntilPageLoad();
		jsClick(driver,driver.findElement(By.xpath("//span[text()='USA']")));
		//driver.findElement(By.xpath("//span[text()='USA']")).click();
		
		logger.info("Root country added ");
		Thread.sleep(1000);
		territory.RootTerritoryName().sendKeys("RootTerritory"+randomnumber());
		logger.info("Territory Name added");
		//Thread.sleep(1000);
		
		String setTerritoryName=territory.RootTerritoryName().getAttribute("value");
		setTerritoryName="USA-"+setTerritoryName;
		//territory.clickSaveTerritory().click();
		logger.info("territory added");
		
// ASSERTION==========================================================================================
		
		SelectDropdown(territory.TerritoryContact(),1);
		TryClick(territory.ClickSave());
		logger.info("territory save successfully");
		territory.waitUntilPageLoad();
		
		TryClick(territory.ClickExpandAll()); 
		logger.info("Click Expand All button");
		
          territory.setGlobalSearch().sendKeys(setTerritoryName);
         logger.info("search Territoryname in search bar");
		Thread.sleep(500);
         String territoryNameAfterCreate=territory.ListedRootTerritory().getText();
         String territoryNameAfterCreate2=territory.ListedRootTerritory1().getText();
         String territoryNameAfterCreate3=territory.ListedRootTerritory2().getText();
		System.out.println("provided Root Territory name to create: "+setTerritoryName);
		System.out.println("provided Root Territory child name to create: "+territoryNameAfterCreate2);
		System.out.println("Listed Root Territory name after create: "+territoryNameAfterCreate);
		System.out.println("Listed Root Territory child name after create: "+territoryNameAfterCreate3);
		
		if (setTerritoryName.equalsIgnoreCase(territoryNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Create Root territory test passed");
			} 
		
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "");
			logger.info("Create Root territory test failed");
			}

	}
}
