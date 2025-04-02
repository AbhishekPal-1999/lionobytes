package com.liono360.vendor;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.VendorPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_004DeleteVendor extends Baseclass{
	@Test
	public void DeleteVendor() throws Exception {
	//redirectToCRM();
	
	VendorPage vendor = new VendorPage(driver);
	ExcelDataProvider exceldata=new ExcelDataProvider();
	   TryClick(vendor.clickInventory());
	  logger.info("Clicked on Inventory");
	 
	  
	 TryClick( vendor.clickPurchase());
	  logger.info("Clicked on Purchase");
	
	  vendor.waitUntilPageLoad();
		/*
		 * TryClick(vendor.PurchaseDrpdown()); logger.info("click drp down");
		 */
	
	  
	  TryClick(vendor.clickVendors());
	  logger.info("click vendor");
	  vendor.waitUntilPageLoad();
		 mouseActionRightClick(driver, vendor.Listedvendor());
		  logger.info("Right click on vendor");
		 Thread.sleep(4000);
		  vendor.waitUntilPageLoad();
		  vendor.clickondeletebtn().click();
		  logger.info(" click on delete vendor");
		 
		  vendor.clickOnYesbtn().click();
		  logger.info(" click yes ");
		  
	}
}
