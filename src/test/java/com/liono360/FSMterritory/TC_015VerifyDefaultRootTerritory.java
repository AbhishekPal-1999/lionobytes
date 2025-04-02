package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;
import java.util.Random;
public class TC_015VerifyDefaultRootTerritory extends Baseclass{
	

	@Test
	public void TC_015VerifyDefaultRootTerritoryTest() throws InterruptedException, IOException {
		
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
		territory.clickRootTerritory().click();
		logger.info("Clicked root territory button ");
		territory.waitUntilPageLoad();
		
		territory.clickActiveInactiveSlider().click();
		territory.clickActiveInactiveSlider().click();
		//Thread.sleep(1000);
		logger.info("clicked on toggle button to make active");
		
		int RandomNumber= RandomNumber();
		
		territory.SelectRootCountry().click();
		Thread.sleep(500);
		String Country=driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem["+RandomNumber+"]//li")).getText();
		
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem["+RandomNumber+"]//li")).click();   
		logger.info("Root country added ");
		Thread.sleep(1000);
		
		String setTerritoryName=Country+"-"+Country;
		
		territory.clickSaveTerritory().click();
		logger.info("territory added");
		
// ASSERTION==========================================================================================
		
		territory.setGlobalSearch().sendKeys(setTerritoryName);
		territory.waitUntilPageLoad();
		territory.ClickExpandAll().click();
		territory.waitUntilPageLoad();
		
		String territoryNameAfterCreate=territory.ListedRootTerritory().getText();
		System.out.println("provided Root Territory name to create: "+setTerritoryName);
		System.out.println("Listed Root Territory name after create: "+territoryNameAfterCreate);
		if (setTerritoryName.equalsIgnoreCase(territoryNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Create Root territory test passed");
			} 
		
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "");
			logger.info("Create Root territory test failed");
			}
		
		mouseActionRightClick(driver, territory.ListedRootTerritory());
		logger.info("Right clicked on listed territory");
		Thread.sleep(500);
		
		territory.clickDelete().click();
		logger.info("clicked delete");
		//Thread.sleep(2000);
		territory.clickYes().click();
		logger.info("clicked Yes");
		//Thread.sleep(20000);
		territory.waitUntilPageLoad();

	}
	
	
// METHOD TO CREATE RANDOM NUMBER==========================================================
	
	
	    public int RandomNumber() {
	        // Create a Random object
	        Random random = new Random();

	        // Generate a random number within the range of 1 to 240
	        int randomNumber = random.nextInt(240) + 1;

	       return randomNumber;
	    
	}
	
}
