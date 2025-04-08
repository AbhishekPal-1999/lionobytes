package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;

public class TC_018EditParentTerritory extends Baseclass {

	@Test
	public void TC_018EditParentTerritoryName() throws IOException, InterruptedException {
		
// LOGIN TO CRM=======================================================

		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
		lp.clickSubmit();
		logger.info("Clicked on submit button");

// GO TO TERRITORY PAGE======================================================

		FSMterritoryPage territory= new FSMterritoryPage(driver);
		territory.waitUntilPageLoad();
		territory.clickFSM().click();
		logger.info("Clicked FSM ");

		territory.selectTerritory().click();
		logger.info("Territory is selected");
		territory.waitUntilPageLoad();		
		
		
		territory.clickIndia().click();
		territory.waitUntilPageLoad();	
		mouseActionRightClick(driver, territory.getTerritoryName());
		logger.info("right clicked on listed territory");
		Thread.sleep(500);
		territory.clickEdit().click();
		logger.info("clicked Edit button");
		territory.waitUntilPageLoad();	
		territory.setTerritoryName().clear();
		//Thread.sleep(7000);
		territory.setTerritoryName().sendKeys("EditedParentTerritory"+randomnumber());
		logger.info("territory Name added");
		//Thread.sleep(1000);
		
		String setTerritoryName=territory.setTerritoryName().getAttribute("value");
    	territory.selectTerritoryContact().click();
		explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
		logger.info("Territory Contact is added");
		
		//Thread.sleep(3000);
		territory.selectOtherContacts().click();
		//Thread.sleep(4000);
		explWaitToClick(driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[2]//li//div)[2]")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[2]//li")).click();
		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[3]//li")).click();
		logger.info("Other Contact is added");
		//Thread.sleep(3000);
		
		
		//Thread.sleep(2000);
		territory.selectCountry().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//li[@aria-label='USA']")));
		driver.findElement(By.xpath("//li[@aria-label='USA']")).click();
		logger.info("Country is added");
		
		//Thread.sleep(2000);
		territory.SelectParentTerritory().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//ul)[6]//p-treenode[2]")));
		driver.findElement(By.xpath("(//ul)[6]//p-treenode[2]")).click();
		logger.info("parent territory added");
		//Thread.sleep(2000);
		
		territory.clickSaveTerritory().click();
		logger.info("territory edited");
		territory.waitUntilPageLoad();	
		
		territory.setGlobalSearch().sendKeys(setTerritoryName);
		territory.waitUntilPageLoad();	
		String territoryNameAfterEdit=driver.findElement(By.xpath("//tbody//tr[1]//td[1]")).getText();
		System.out.println("provided Territory name to create: "+setTerritoryName);
		System.out.println("Listed Territory name after create: "+territoryNameAfterEdit);
		if (setTerritoryName.equalsIgnoreCase(territoryNameAfterEdit)) {
			Assert.assertTrue(true);
			logger.info("edit parent territory test passed");
			} 
		
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "addCase");
			logger.info("edit parent territory test failed");
			}
	}
}
