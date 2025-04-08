package com.liono360.Product.KitItem;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ProductPage;
import com.liono360.utility.RetryAnalyzer;

public class TC_001CreateKitItem extends Baseclass {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void CreateKitItem() throws InterruptedException {

		waitUntilPageLoad();
		handleGeoLocation();

		ProductPage products = new ProductPage(driver);
		TryClick(products.clickInventory());
		logger.info("Clicked on inventory button");
		TryClick(products.clickProduct());
		logger.info("Clicked on product to load the list");
		TryClick(products.ClickKitItem());
		waitUntilPageLoad();
		logger.info("Click Kit item to show list");

		TryClick(products.clickAddNewProduct());
		logger.info("Clicked on add new product button");
		waitUntilPageLoad();

		products.setItemNo().sendKeys("Kititem" + randomnumber());

		String addedProduct = products.setItemNo().getDomProperty("value");

		logger.info("Added Kit item no.");

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

		products.clickkititemdescription().sendKeys("Kit item description " + randomstring() + randomnumber());
		logger.info("send data description field");

		TryClick(products.clicklength());
		logger.info("click length");

		products.clicklength().sendKeys("19");
		logger.info("fill length");

		TryClick(products.clickWidth());

		logger.info("click width");

		products.clickWidth().sendKeys("6");
		logger.info("fill width");

		TryClick(products.clickHeight());
		logger.info("click height");

		products.clickHeight().sendKeys("17");
		logger.info("fill height");

		SelectDropdown(products.clickUnit(), 1);
		logger.info("click unit");

		products.clickWeight().sendKeys("67");
		logger.info("fill weight");

		products.clickBarcode().sendKeys("Kit789" + randomnumber());
		logger.info("fill barcode no");

		scrollIntoView(products.clickAddNewUOM());

		products.clickAddNewUOM().click();
		logger.info("clicked to add second Unit of measure");

		SelectDropdown(products.selectSecondUOM(), 1);
		logger.info("Selected 2nd UOM");

		products.clickBarcode2().sendKeys("Kit239" + randomnumber());
		logger.info("fill barcode no for second Unit of measure");

		products.clickkitsellprice().clear();
		products.clickkitsellprice().sendKeys("3" + randomnumber());
		logger.info("Fill Kit Sell price");

		scrollIntoView(products.clickAddProductToKit());

		jsClick(driver, products.clickAddProductToKit());
		logger.info("Click Plus button for add new products for KIt");
		waitUntilPageLoad();

		try {
			driver.findElement(By.xpath("((//table)[3]//tr[2])")).click();
			// Thread.sleep(1000);
			driver.findElement(By.xpath("((//table)[3]//tr[3])")).click();
			// Thread.sleep(1000);
			driver.findElement(By.xpath("((//table)[3]//tr[4])")).click();
			// Thread.sleep(1000);
			logger.info("Added Prodcut to kit ");
		} catch (Exception e) {

		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@aria-label='dropdown trigger'])[8]")).click();
		logger.info("Click Dropdown kit different product add");

		TryClick(driver.findElement(By.xpath("//li[@aria-label='Service']")));
		logger.info("Click Dropdown kit add service");

		try {
			driver.findElement(By.xpath("((//table)[3]//tr[2])")).click();
			// Thread.sleep(1000);
			driver.findElement(By.xpath("((//table)[3]//tr[3])")).click();

		} catch (Exception e) {

		}

		driver.findElement(By.xpath("(//div[@aria-label='dropdown trigger'])[8]")).click();
		logger.info("Click Dropdown kit different product add");

		TryClick(driver.findElement(By.xpath("//li[@aria-label='Non Inventory Item']")));
		logger.info("Click Dropdown kit add non inventory");

		try {
			driver.findElement(By.xpath("((//table)[3]//tr[2])")).click();
			driver.findElement(By.xpath("((//table)[3]//tr[3])")).click();

		} catch (Exception e) {

		}

		TryClick(products.clickAddOption());

		logger.info("Click Add button ");

		TryClick(driver.findElement(By.xpath("(//span[text()='Finance'])[2]")));

		logger.info("Click Finance tab");

		TryClick(products.clickSelectClass());
		TryClick(products.clickdrpchoicecategory());
		logger.info("Fill class ");
		TryClick(products.clickSave());

		logger.info("Clicked on save");
		waitUntilPageLoad();

		products.setSearch().sendKeys(addedProduct);
		String listedKit = products.listedProductIs().getText();

		if (addedProduct.equalsIgnoreCase(listedKit)) {
			Assert.assertTrue(true);
			logger.info("Create Kit test passed");
		}

		else {
			Assert.assertTrue(false);
			logger.info("create Kit test failed");
		}

		products.setSearch().clear();
		refreshWindow();

	}

}
