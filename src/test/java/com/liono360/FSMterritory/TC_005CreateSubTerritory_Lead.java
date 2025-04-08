package com.liono360.FSMterritory;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;

public class TC_005CreateSubTerritory_Lead extends Baseclass {

	@Test
	public void TC_005CreateSubTerritory_LeadTest() throws InterruptedException, IOException {
		

// LOGIN TO CRM===============================================================================================
		
		redirectToCRM();

// ADD NEW ROOT TERRITORY=====================================================================================


		FSMterritoryPage territory= new FSMterritoryPage(driver);
		//territory.waitUntilPageLoad();
		jsClick(driver,territory.clickFSM());
		//jsClick(driver,territory.clickFSM());
		logger.info("Clicked FSM ");
	
		jsClick(driver,territory.selectTerritory());
		logger.info("Territory is selected");
		Thread.sleep(2000);
		//jsClick(driver,territory.waitUntilPageLoad();
	    territory.setGlobalSearch().sendKeys("USA-RootTerritory");
		//jsClick(driver,territory.waitUntilPageLoad();
	    
		jsClick(driver,territory.openCompnyMenu());
		
        
		jsClick(driver,territory.AddNewTerritory());
		logger.info("Add new territory button clicked ");
		//jsClick(driver,territory.waitUntilPageLoad();
		jsClick(driver,territory.clickToggleBtn());
		jsClick(driver,territory.clickToggleBtn());
		//Thread.sleep(1000);
		logger.info("clicked on toggle button to make active");

	    territory.TerritoryName().sendKeys("LeadSubTerritory"+randomnumber());
		logger.info("Sub territory Name added");

		String setTerritoryName=territory.TerritoryName().getAttribute("value");
		
	    territory.selectAssocitedModule().click();
		//Thread.sleep(3000);
		jsClick(driver,Select("Lead"));
		//driver.findElement(By.xpath("//li[@aria-label=\"Lead\"]")).click();
		logger.info("Lead is added");
		Thread.sleep(1000);
		//explWaitToClick(driver, territory.SelectOtherUser());
	    territory.SelectOtherUser().click();
		//Thread.sleep(3000);
		jsClick(driver,ClickMultipleDropdownValue(1));
		//driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
		jsClick(driver,ClickMultipleDropdownValue(3));
		jsClick(driver,ClickMultipleDropdownValue(4));
		logger.info("Other Contact is added");
		
		Thread.sleep(1000);
		territory.SelectPrimaryUser().click();
		//Thread.sleep(1000);
		jsClick(driver,ClickDropdownValue(1));
		logger.info("Territory Contact is added");

		//territory.clickPlusIcon();
		jsClick(driver,territory.clickPlusIcon());
		jsClick(driver,territory.clickPlusIcon2());
		//territory.clickPlusIcon2();

		Thread.sleep(1000);
		//explWaitToClick(driver, territory.selectMiddleInitial());
		territory.selectMiddleInitial().click();
		jsClick(driver,Select("Lead Type(s)"));
		//jsClick(driver,driver.findElement(By.xpath("//span[text()='Lead Type(s)']")));
		//driver.findElement(By.xpath("//span[text()='Lead Type(s)']")).click();
		logger.info("middle Initial is added");
		Thread.sleep(500);
		territory.selectChooseValue().click();
		//Thread.sleep(500);
		//driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[1]//li//div)[2]")).click();
		jsClick(driver,ClickMultipleDropdownValue(1));
		try {
			jsClick(driver,ClickMultipleDropdownValue(2));
			jsClick(driver,ClickMultipleDropdownValue(3));
			}
		catch(Exception e) {

		}
		logger.info("value is added");

	
		territory.setNotes().sendKeys("This is auto generated rule "+randomnumber());
		logger.info("Notes added");

		
		//territory.selectMiddleInitial().click();
		jsClick(driver,territory.selectMiddleInitial());
		//territory.clickSaveRule().click();
		jsClick(driver,territory.clickSaveRule());
		logger.info("rules added");
		
		//territory.clickSaveTerritory().click();
	    jsClick(driver,territory.clickSaveTerritory());
		logger.info("territory added");

		waitUntilPageLoad();
		territory.setGlobalSearch().clear();
		territory.setGlobalSearch().sendKeys(setTerritoryName);
	    waitUntilPageLoad();
		//territory.ClickExpandAll().click();
		jsClick(driver,territory.ClickExpandAll());
		waitUntilPageLoad();
		
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
