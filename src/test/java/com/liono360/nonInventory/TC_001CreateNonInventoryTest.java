package com.liono360.nonInventory;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.NonInventoryPage;

public class TC_001CreateNonInventoryTest extends Baseclass {
	
	
	@Test
	public void CreateNonInventorywithRequiredfieldTest() throws InterruptedException {
		redirectToCRM();
		
		NonInventoryPage products = new NonInventoryPage(driver);
		products.clickInventory().click();
		logger.info("Clicked on inventory button");
		Thread.sleep(2000);
		products.clickProduct().click();
		logger.info("Clicked on product to load the list");
		Thread.sleep(15000);
		products.clickAddNewProduct().click();
		logger.info("Clicked on add new product button");
		products.setItemNo().sendKeys("item"+ randomnumber());
	}
	
	

}
