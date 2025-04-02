package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;

public class TC_009EditSubTerritory extends Baseclass {

	@Test
	public void TC_009EditSubTerritoryTest() throws InterruptedException, IOException {
		

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
		territory.clickToggleBtn().click();
		//Thread.sleep(1000);
		logger.info("clicked on toggle button to make active");
		territory.TerritoryName().clear();
		territory.TerritoryName().sendKeys("SubTrritoryEdited"+randomnumber());
		logger.info("Sub territory Name added");

		String setTerritoryName=territory.TerritoryName().getAttribute("value");


		territory.SelectOtherUser().click();
		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[5]//li")).click();
		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[3]//li")).click();
		
		logger.info("Other Contact is added");

		territory.SelectPrimaryUser().click();
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
		
		logger.info("Territory Contact is added");

//		territory.clickPlusIcon().click();
//
//		territory.clickPlusIcon2().click();
		territory.EditRule().click();


		territory.selectMiddleInitial().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
		logger.info("middle Initial is added");
		
		territory.ChooseOperator().click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("operator is selected");

		territory.selectChooseValue().click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[1]//li//div)[2]")).click();
		try {
			driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[4]//li//div)[2]")).click();
			
		}
		catch(Exception e) {

		}
		logger.info("value is added");

	
		territory.setNotes().sendKeys("Rule is edited "+randomnumber());
		logger.info("Notes added");

		
		territory.selectMiddleInitial().click();

		territory.clickSaveRule().click();
		logger.info("rules added");
		
		territory.clickSaveTerritory().click();
		logger.info("territory added");
		Thread.sleep(500);

		territory.waitUntilPageLoad();
		territory.setGlobalSearch().clear();
		territory.setGlobalSearch().sendKeys(setTerritoryName);
		territory.waitUntilPageLoad();
		territory.ClickExpandAll().click();
		territory.waitUntilPageLoad();
		
//ASSERTION=======================================================================================		
		
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
