package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;

public class TC_017CreateLeadTerritoryWithParentTerritory extends Baseclass{

	@Test
	public void TC_017CreateLeadsTerritoryWithParentTerritory() throws InterruptedException, IOException {
	
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

		// GO TO TERRITORY PAGE================================================

		FSMterritoryPage territory= new FSMterritoryPage(driver);
		territory.waitUntilPageLoad();
		territory.clickFSM().click();
		logger.info("Clicked FSM ");

		territory.selectTerritory().click();
		logger.info("Territory is selected");
		territory.waitUntilPageLoad();		

		territory.clickNewButton().click();
		logger.info("Clicked new button ");
		territory.waitUntilPageLoad();

		territory.clickToggleBtn().click();
		//Thread.sleep(1000);
		logger.info("clicked on toggle button to make active");

		territory.setTerritoryName().sendKeys("ParrentTerritory"+randomnumber());
		logger.info("territory Name added");
		//Thread.sleep(1000);

		String setTerritoryName=territory.setTerritoryName().getAttribute("value");
		territory.selectTerritoryContact().click();
		explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("Territory Contact is added");

		//Thread.sleep(3000);
		territory.selectOtherContacts().click();
		//Thread.sleep(4000);
		explWaitToClick(driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[1]//li//div)[2]")));
		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[3]//li")).click();
		logger.info("Other Contact is added");
		//Thread.sleep(3000);
		territory.selectAssocitedModule().click();
		explWaitToClick(driver.findElement(By.xpath("//li[@aria-label=\"Lead\"]")));
		driver.findElement(By.xpath("//li[@aria-label=\"Lead\"]")).click();
		logger.info("Account is added");

		territory.waitUntilPageLoad();
		territory.selectTemplate().click();
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Default Channel_template']")));
		driver.findElement(By.xpath("//span[text()='Default Channel_template']")).click();
		logger.info("Template is added");

		territory.waitUntilPageLoad();
		territory.selectCountry().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//li[@aria-label=\"India\"]")));
		driver.findElement(By.xpath("//li[@aria-label=\"India\"]")).click();
		logger.info("Country is added");

		Thread.sleep(1000);
		territory.SelectParentTerritory().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//ul)[6]//p-treenode[2]")));
		driver.findElement(By.xpath("(//ul)[6]//p-treenode[2]")).click();
		logger.info("parent territory added");

		//Thread.sleep(2000);
		territory.clickPlusIcon().click();
		Thread.sleep(500);
		territory.clickPlusIcon2().click();
		Thread.sleep(500);

		territory.selectMiddleInitial().click();
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Lead Type(s)']")));
		driver.findElement(By.xpath("//span[text()='Lead Type(s)']")).click();
		logger.info("middle Initial is added");

		territory.selectChooseValue().click();
		Thread.sleep(500);
		explWaitToClick(driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[1]//li//div)[2]")));
		driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[1]//li//div)[2]")).click();
		try {
			driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[2]//li//div)[2]")).click();
			driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[3]//li//div)[2]")).click();
		}
		catch(Exception e) {

		}
		logger.info("value is added");

		//Thread.sleep(5000);
		territory.setNotes().sendKeys("This is auto generated rule "+randomnumber());
		logger.info("Notes added");

		//Thread.sleep(2000);	
		territory.selectMiddleInitial().click();
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Lead Type(s)']")));
		driver.findElement(By.xpath("//span[text()='Lead Type(s)']")).click();
		//Thread.sleep(5000);
		territory.clickSaveRule().click();
		logger.info("rules added");
		//Thread.sleep(5000);
		territory.clickSaveTerritory().click();
		logger.info("territory added");
		territory.waitUntilPageLoad();

		// Assertion
		//territory.clickUSA().click();
		territory.setGlobalSearch().sendKeys(setTerritoryName);
		territory.waitUntilPageLoad();
		String territoryNameAfterCreate=driver.findElement(By.xpath("//tbody//tr[1]//td[1]")).getText();
		System.out.println("provided Territory name to create: "+setTerritoryName);
		System.out.println("Listed Territory name after create: "+territoryNameAfterCreate);
		if (setTerritoryName.equalsIgnoreCase(territoryNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Create territory test passed");
		} 

		else {
			Assert.assertTrue(false);
			captureScreen(driver, "addCase");
			logger.info("create territory test failed");
		}
	}
}
