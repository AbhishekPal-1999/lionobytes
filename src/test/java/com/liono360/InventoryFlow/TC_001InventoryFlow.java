package com.liono360.InventoryFlow;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.InventoryFlow;

      public class TC_001InventoryFlow extends Baseclass{
	
	  @Test
      public void InventoryFlowTest() throws InterruptedException {
	  redirectToCRM();
	
	
	   InventoryFlow  inventoryflow=new InventoryFlow(driver);
	   
	   inventoryflow.clickInventory().click();
	   logger.info("Clicked on inventory button");
		Thread.sleep(2000);
	
	
}
}
