package com.liono360.vendor;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.VendorPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_003ViewVendor extends Baseclass{
	@Test
	public void ViewVendor() throws InterruptedException, IOException {
		//  redirectToCRM();
			
		  VendorPage vendor = new VendorPage(driver);
			ExcelDataProvider exceldata=new ExcelDataProvider();
			   TryClick(vendor.clickInventory());
			  logger.info("Clicked on Inventory");
			 
			  
			 TryClick( vendor.clickPurchase());
			  logger.info("Clicked on Purchase");
			waitUntilPageLoad();
			  
				/*
				 * TryClick(vendor.PurchaseDrpdown()); logger.info("click drp down");
				 */
			
			  
			  TryClick(vendor.clickVendors());
			  logger.info("click vendor");
			 Thread.sleep(10000);
			  waitUntilPageLoad();
				 mouseActionRightClick(driver, vendor.Listedvendor());
				  logger.info("Right click on vendor");
				
				  
				  vendor.clickViewVendor().click();
				  logger.info("click on View vendor");
				
				  
				  
				TryClick(vendor.clickCancel());
				logger.info("click Cancel");
				
				
	}

}
