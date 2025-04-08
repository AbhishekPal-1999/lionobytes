package com.liono360.RMACredtit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.RMAPage;

public class TC_001CreateRMACredit extends Baseclass{
	@Test
	public void CreateRMA() throws InterruptedException {
		redirectToCRM();

		Actions action = new Actions(driver);
		RMAPage rma = new RMAPage(driver);
		
		TryClick(rma.clickInventory());
		logger.info("Clicked on inventory button");
	
		
		TryClick(rma.clickSales());
		logger.info("Clicked on sales to load the list");
	
		
		TryClick(rma.clickCustomerReturn());
		logger.info("Clicked on Customer Return");
		rma.waitUntilPageLoad();
		TryClick(rma.clickAddNewSales());
		logger.info("Clicked on add new RMA button");
		TryClick(rma.setSearchAccount());
		rma.setSearchAccount().sendKeys("SalesOrder Account");
		TryClick(rma.clickSelectLocation());
		logger.info("Clicked on Select Location");
		TryClick(driver.findElement(By.xpath("//p-dropdownitem//li[@role='option']")));
		
	}

}
