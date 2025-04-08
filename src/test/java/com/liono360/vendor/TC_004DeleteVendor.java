package com.liono360.vendor;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.VendorPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_004DeleteVendor extends Baseclass {
	@Test
	public void DeleteVendor() throws Exception {
		// redirectToCRM();

		VendorPage vendor = new VendorPage(driver);
//		TryClick(vendor.clickInventory());
//		logger.info("Clicked on Inventory");
//
//		TryClick(vendor.clickPurchase());
//		logger.info("Clicked on Purchase");
//
//		waitUntilPageLoad();
//
//		TryClick(vendor.clickVendors());
//		logger.info("click vendor");
		for(int i=0; i<=1; i++) {
		waitUntilPageLoad();
		Thread.sleep(2000);
		}
		String listedVendorToDelete = vendor.Listedvendor().getText();
		
		mouseActionRightClick(driver, vendor.Listedvendor());
		logger.info("Right click on vendor");

		waitUntilPageLoad();
		vendor.clickondeletebtn().click();
		logger.info(" click on delete vendor");

		vendor.clickOnYesbtn().click();
		logger.info(" click yes ");
		
		for(int i=0; i<=1; i++) {
		waitUntilPageLoad();
		Thread.sleep(2000);
		}
		explWaitToClick(vendor.Listedvendor());
		
		String listedVendorAfterDelete = vendor.Listedvendor().getText();
		
		if (!listedVendorToDelete.equalsIgnoreCase(listedVendorAfterDelete)) {
			Assert.assertTrue(true);
			logger.info("Vendor delete test cases passed");
		}
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "DeleteVendor");
			logger.info("Delete Vendor test failed");
			
		}
		
		

	}
}
