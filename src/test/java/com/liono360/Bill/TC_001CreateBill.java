package com.liono360.Bill;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_001CreateBill extends Baseclass{
	@Test
	public void CreateBill() throws InterruptedException {
	//	redirectToCRM();
		waitUntilPageLoad();
		//Thread.sleep(4000);
		ProductPage products = new ProductPage(driver);
		products.waitUntilPageLoad();
		
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		products.waitUntilPageLoad();
		
		TryClick(products.ClickPurchaseDropdown());
		logger.info("Clicked on Purchases Dropdown");
		
		products.waitUntilPageLoad();
		TryClick(products.ClickBill());
		logger.info("Clicked  Bill");
		products.waitUntilPageLoad();
	     
		Thread.sleep(10000);
		products.clickdrpNewBill().click();
		logger.info("Clicked new bill dropdown");
		TryClick(products.clickCreateBill());
		logger.info("click create bill");
		products.waitUntilPageLoad();
		
		
		TryClick(driver.findElement(By.xpath("//p-dropdown[@placeholder='Select Vendor']//div//div[@aria-label='dropdown trigger']")));
		logger.info("click Select vendor");
		
		TryClick(driver.findElement(By.xpath("//input[@autocomplete='off']")));
		logger.info("click search on vendor");
		
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("IBM Global");
		logger.info(" fill data for vendor");
		
		TryClick(driver.findElement(By.xpath("//p-dropdownitem//li")));
		logger.info("click vendor data list");
		waitUntilPageLoad();
		Thread.sleep(500);
		
		TryClick(driver.findElement(By.xpath("//div[@role='dialog']//div//form//div//div//div//div//div//h6//span//i")));
		logger.info("click shipping button");
		
		TryClick(products.drpshippingbtn());
		logger.info(" click shipping address dropdown btn");
		waitUntilPageLoad();
		TryClick(products.clickitemtab());
		logger.info(" click item tab");
		Thread.sleep(3000);
		//TryClick(products.clickPlusaddproductkit());
		jsClick(driver,products.clickPlusaddproductkit());
		logger.info(" click plus button to add product ");
		products.waitUntilPageLoad();
		
		try {
			TryClick(driver.findElement(By.xpath("(//tbody)[4]//tr")));
			//Thread.sleep(1000);
		driver.findElement(By.xpath("((//tbody)[4]//tr)[2]")).click();
			//Thread.sleep(1000);
			//driver.findElement(By.xpath("((//tbody)[4]//tr)[3]")).click();
			//Thread.sleep(1000);
				}
				catch(Exception e) {
				  
				}
			
		
		 TryClick(products.clickAddOption());
		   logger.info("Clicked added to product list");
		  
		 
		   TryClick(products.clickSave());
		   logger.info("Clicked save List");
		   
		   
		   
		
		
	}
}