package com.liono360.Product.KitItem;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;

public class TC_001CreateKitItem extends Baseclass{
	@Test
	public void CreateKitItem() throws InterruptedException {
	//	redirectToCRM();
		waitUntilPageLoad();
		Thread.sleep(4000);
		ProductPage products = new ProductPage(driver);
		
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		waitUntilPageLoad();
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		waitUntilPageLoad();
		Thread.sleep(2000);
		
		TryClick(products.selectDRopdownProduct());
		logger.info("select dropdown product channel");
		waitUntilPageLoad();
		TryClick(products.ClickKitItem());
		waitUntilPageLoad();
		logger.info("Click Kit item");
		TryClick(products.clickAddNewProduct());
		logger.info("Clicked on add new product button");
		waitUntilPageLoad();

		products.setItemNo().sendKeys("item"+ randomnumber());

		String addedProduct = products.setItemNo().getAttribute("value");

		logger.info("Added product item no.");
		
		TryClick(products.selectVariant());
		logger.info("Click on variant");
		driver.findElement(By.xpath("(//li[@role='option'])[2]")).click();
		logger.info("Click on variant dropdown");

		TryClick(products.selectCategory());
		logger.info("click category");
		TryClick(products.clickdrpchoicecategory());
		logger.info("Click on dropsdown category");
		TryClick(products.clickkititemdescription());
		logger.info("Click on item description");
         products.clickkititemdescription().sendKeys("Kit item description "+randomstring()+randomnumber());
         logger.info("send data description field");
     	TryClick(products.clicklength());

	
		logger.info("click length");
		//	Thread.sleep(1000);
		products.clicklength().sendKeys("19");
		logger.info("fill length");
		//Thread.sleep(1000);
		TryClick(products.clickWidth());
		//	Thread.sleep(1000);
		
		logger.info("click width");
		//	Thread.sleep(1000);
		products.clickWidth().sendKeys("6");
		logger.info("fill width");
		//	Thread.sleep(1000);
		TryClick(products.clickHeight());
		//Thread.sleep(1000);
		
		logger.info("click height");
		//	Thread.sleep(1000);
		products.clickHeight().sendKeys("17");
		logger.info("fill height");
		SelectDropdown(products.clickUnit(),1);
		logger.info("click unit");
		
		TryClick(products.clickWeight());
		//	Thread.sleep(1000);
		
		logger.info("click weight");
		//	Thread.sleep(1000);
		products.clickWeight().sendKeys("67");
		logger.info("fill weight");
		TryClick(driver.findElement(By.xpath("//p-dropdown[@formcontrolname='wUnitofMeasuremetId']//div//div[@aria-label='dropdown trigger']")));
		logger.info("click weight UOM");
		
		driver.findElement(By.xpath("//p-dropdownitem//li[@role='option']")).click();
		TryClick(products.clickUOM2());
		logger.info("click UOM");

		//	Thread.sleep(1000);
		TryClick(driver.findElement(By.xpath("(//li[@aria-label='Each'])[1]")));
		TryClick(products.clickBarcode());
		logger.info("click Barcode");
		//	Thread.sleep(1000);
		products.clickBarcode().sendKeys("Product789"+randomnumber());
		logger.info("fill barcode no");
		
		TryClick(products.clickkitsellprice());
		logger.info("Click Kit Sell price");
		products.clickkitsellprice().clear();
		products.clickkitsellprice().sendKeys("3"+randomnumber());
		logger.info("Fill Kit Sell price");
	  
	 //   jsScroll(driver,driver.findElement(By.xpath("//th[normalize-space()='ItemNo']")));
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[@role=\"presentation\"][3]//span//i")).click();
		//products.clickPlusaddproductkit().click();
		logger.info("Click Plus button for add new products for KIt");
		waitUntilPageLoad();
		Thread.sleep(2000);
		
		try {
			driver.findElement(By.xpath("((//table)[3]//tr[2])")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("((//table)[3]//tr[3])")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("((//table)[3]//tr[4])")).click();
			//Thread.sleep(1000);
			logger.info("Fill data ");
				}
				catch(Exception e) {
				  
				}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@aria-label='dropdown trigger'])[8]")).click();
		logger.info("Click Dropdown kit different product add");
		
		TryClick(driver.findElement(By.xpath("//li[@aria-label='Service']")));
		logger.info("Click Dropdown kit add service");
		
		
		try {
			driver.findElement(By.xpath("((//table)[3]//tr[2])")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("((//table)[3]//tr[3])")).click();
		
			
		}
		catch(Exception e) {
		  
		}
		
		driver.findElement(By.xpath("(//div[@aria-label='dropdown trigger'])[8]")).click();
		logger.info("Click Dropdown kit different product add");
		
		TryClick(driver.findElement(By.xpath("//li[@aria-label='Non Inventory Item']")));
		logger.info("Click Dropdown kit add non inventory");
		
		try {
			driver.findElement(By.xpath("((//table)[3]//tr[2])")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("((//table)[3]//tr[3])")).click();
		
			
		}
		catch(Exception e) {
		  
		}
		
		TryClick(products.clickAddOption());
		
		logger.info("Click Add button ");
		
		TryClick(driver.findElement(By.xpath("(//span[text()='Finance'])[2]")));
		
		logger.info("Click Finance tab");
		
		TryClick(products.clickSelectClass());
		TryClick(products.clickdrpchoicecategory());
		logger.info("Fill class ");
		TryClick(products.clickSave());

		//Thread.sleep(10000);
		logger.info("Clicked on save");
		waitUntilPageLoad();

		
	}

}
