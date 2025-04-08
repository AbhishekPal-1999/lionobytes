package com.liono360.FSMterritory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;

public class TC_014VerifyGlobalSearchInDataLists extends Baseclass {

	@Test
   public void TC_014VerifyGlobalSearchInDataList() throws InterruptedException, IOException {

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

		territory.setTerritoryName().sendKeys("Territory_"+randomnumber());
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
		explWaitToClick(driver.findElement(By.xpath("//li[@aria-label=\"Account\"]")));
		driver.findElement(By.xpath("//li[@aria-label=\"Account\"]")).click();
		logger.info("Account is added");

		territory.waitUntilPageLoad();	
		territory.selectTemplate().click();
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Default Channel_template']")));
		driver.findElement(By.xpath("//span[text()='Default Channel_template']")).click();
		logger.info("Template is added");

		//Thread.sleep(2000);
		territory.selectCountry().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//li[@aria-label=\"India\"]")));
		driver.findElement(By.xpath("//li[@aria-label=\"India\"]")).click();
		logger.info("Country is added");

		//Thread.sleep(2000);
		territory.ClickbtnMannualy().click();
		Thread.sleep(500);
		logger.info("clicked manually button");

		Thread.sleep(500);
		territory.clickPlusIcon().click();
		Thread.sleep(500);

		String UseNameToSearch=driver.findElement(By.xpath("(//tbody)[2]//tr[3]//td[1]")).getText();

		territory.clickGlobalSearchInDataLists().sendKeys(UseNameToSearch);
		territory.waitUntilPageLoad();	
		String ListedUserAfterSearch=territory.listedUserName().getText();
		System.out.println("provided user name to search: "+UseNameToSearch);
		System.out.println("Listed user name after search: "+ListedUserAfterSearch);
		if (UseNameToSearch.equalsIgnoreCase(ListedUserAfterSearch)) {
			Assert.assertTrue(true);
			logger.info("search  test passed");
		} 

		else {
			Assert.assertTrue(false);
			captureScreen(driver, "search test case");
			logger.info("search test failed");
		}
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Cancel'])[1]")).click();
		// Thread.sleep(3000);
		territory.clickCancel().click();
		logger.info("clicked on cancel");
		//Thread.sleep(4000);

	}
}
