package com.liono360.FSMterritory;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;

public class TC_015VerifySettingInDataLists extends Baseclass{
	
	@Test
	public void TC_015VerifySettingInDataList() throws InterruptedException {
		
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
		
		//Thread.sleep(7000);
		territory.selectTemplate().click();
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Default Channel_template']")));
		driver.findElement(By.xpath("//span[text()='Default Channel_template']")).click();
		logger.info("Template is added");
		
		//Thread.sleep(2000);
		territory.selectCountry().click();
		//Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//li[@aria-label='USA']")));
		driver.findElement(By.xpath("//li[@aria-label='USA']")).click();
		logger.info("Country is added");
		
		Thread.sleep(1000);
		territory.ClickbtnMannualy().click();
		//Thread.sleep(1000);
		logger.info("clicked manually button");
		
		Thread.sleep(500);
		territory.clickPlusIcon().click();
		
		territory.waitUntilPageLoad();
		territory.clickSetting().click();
		logger.info("clicked setting button");
		territory.waitUntilPageLoad();		
		
		try {
		driver.findElement(By.xpath("(//p-checkbox//span)[3]//parent::div")).click();
		driver.findElement(By.xpath("(//p-checkbox//span)[4]//parent::div")).click();
		}
		catch(Exception e) {}
		logger.info("clicked plus button");
		
		territory.clickSaveSetting().click();
		logger.info("clicked save setting button");
		territory.waitUntilPageLoad();		
		
		driver.findElement(By.xpath("(//span[text()='Cancel'])[1]")).click();
		   //Thread.sleep(3000);
		   territory.clickCancel().click();
			logger.info("clicked on cancel");
			//Thread.sleep(4000);
	}
	

}
