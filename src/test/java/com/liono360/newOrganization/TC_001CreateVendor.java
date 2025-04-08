package com.liono360.newOrganization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.VendorPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_001CreateVendor extends Baseclass {
	@Test

	public void CreateVendorTest() throws InterruptedException, IOException {

		// redirectToCRM();

		VendorPage vendor = new VendorPage(driver);
		ExcelDataProvider exceldata = new ExcelDataProvider();
		TryClick(vendor.clickInventory());
		logger.info("Clicked on Inventory");
		waitUntilPageLoad();

		TryClick(vendor.clickPurchase());
		logger.info("Clicked on Purchase");
		waitUntilPageLoad();

		/*
		 * TryClick(vendor.PurchaseDrpdown()); logger.info("click drp down");
		 */

		TryClick(vendor.clickVendors());
		logger.info("click vendor");
		waitUntilPageLoad();
		Thread.sleep(1000);

		TryClick(vendor.clickNew());
		logger.info("click New ");
		waitUntilPageLoad();

		TryClick(vendor.clickVendorName());
		logger.info("click vendor name ");

		vendor.clickVendorName().sendKeys("Vendor Consultancy" + randomnumber());
		logger.info("fill vendor name ");
		String setclickVendorName = vendor.clickVendorName().getDomProperty("value");

		vendor.clickVendorType().click();
		logger.info("click vendor select type ");
		// Thread.sleep(1000);

		vendor.clickselectvendortype().click();
		logger.info("click vendor ");
		Thread.sleep(1000);

		// Thread.sleep(1000);
		/* TrySelectMultiDropdown(vendor.clickselectvendorType(),1,2); */
		logger.info("click vendor type ");
		// Thread.sleep(1000);
		TryClick(vendor.clickaccountNumber());
		logger.info("click account number ");
		vendor.clickaccountNumber().sendKeys("896542" + randomnumber());

		TryClick(vendor.clickemailaddress());
		logger.info("click email address ");
		vendor.clickemailaddress().sendKeys("vendor12" + randomnumber() + "@gmail.com");

		TryClick(vendor.clickPhoneNumber());
		logger.info("click phone number ");
		vendor.clickPhoneNumber().sendKeys("+12906322" + randomnumber());

		TryClick(vendor.clickselectTimeZone());
		logger.info("select Time zone ");

		ClickDropdownValue(1).click();
		logger.info("click New delhi time zone ");

		/*
		 * TryClick(vendor.clickSelectCurrency()); logger.info("select currency ");
		 */

		SelectDropdown(vendor.clickSelectCurrency(), 1);
		logger.info("select currency name ");

		driver.findElement(By.xpath("//span[normalize-space()='Show More']")).click();
		logger.info("click show more ");

		TryClick(vendor.clickDoingBusinessas());
		logger.info("click doing business");

		vendor.clickDoingBusinessas().sendKeys("DBA12" + randomnumber());
		logger.info("fill doing business value");

		TryClick(vendor.clickTaxId());
		logger.info("click tax id");

		vendor.clickTaxId().sendKeys("78" + randomnumber());
		logger.info("click tax id");

		SelectDropdown(vendor.clickSelectEmployee(), 1);

		logger.info("fill no.of  employee");

		SelectDropdown(vendor.clickSelectrevenue(), 1);

		logger.info("fill revenue");

		SelectDropdown(vendor.clickSelectOwnership(), 1);

		logger.info("fill revenue");

		TryClick(vendor.clickFoundedYear());
		logger.info("click founded year");
		vendor.clickFoundedYear().sendKeys("2000");

		SelectDropdown(vendor.clickSelectIndustry(), 1);

		logger.info("fill revenue");

		TryClick(vendor.clickSiccode());
		logger.info("click SIC CODE");

		vendor.clickSiccode().sendKeys("RY7" + randomnumber());
		logger.info("fill SIC CODE");

		TryClick(vendor.clicknaicsCode());
		logger.info("click NAISC CODE");

		vendor.clicknaicsCode().sendKeys("78" + randomnumber());

		SelectDropdown(vendor.clickSelectTitle(), 1);

		logger.info("click Select Title ");

		TryClick(vendor.clickFname());
		logger.info("click first name");
		vendor.clickFname().sendKeys("FName" + randomnumber());
		logger.info("Fill first name");

		TryClick(vendor.clicklname());
		logger.info("click Last name");

		vendor.clicklname().sendKeys("lName" + randomnumber());
		logger.info("Fill Last name");

		TryClick(vendor.clickemail());
		logger.info("click  email");

		vendor.clickemail().sendKeys("fname" + randomnumber() + "@gmail.com");
		logger.info("Fill email");

		TryClick(vendor.clickphone());
		logger.info("click phone");

		vendor.clickphone().sendKeys("9837678" + randomnumber());
		logger.info("Fill phone number");

		TryClick(vendor.clicksocialProfile());
		logger.info("click social profile");

		vendor.clicksocialProfile().sendKeys("fname" + randomnumber() + "@linkedln.com");
		logger.info("fill social profile");

		SelectDropdown(vendor.clickSelectGender(), 1);
		logger.info("click select gender");
		ClickDropdownValue(1).click();
		logger.info("select gender");

		scrollIntoView(vendor.clickDOB());

//		TryClick(vendor.clickDOB());
//		logger.info("click DOB");
//
//		TryClick(vendor.clickDobYear());
//		logger.info("click DOB year");
//
//		TryClick(vendor.clickleft1year());
//		logger.info("click left 1 year");
//		TryClick(vendor.clickleft1year());
//		logger.info("click left 2 year");
//
//		TryClick(vendor.clickleft1year());
//		
//		logger.info("click left 3 year");
//
//		TryClick(vendor.clickyeardate());
//		logger.info("click year and fill");
//
//		TryClick(vendor.clickmonthdate());
//		logger.info("click month");
//
//		TryClick(vendor.clickdate());
//		logger.info("click date");

		TryClick(vendor.clickLanguage());

		logger.info("click language");
		scrollIntoView(vendor.clicklanguageselection());

		TryClick(vendor.clicklanguageselection());
		logger.info("Selected English language ");

		TryClick(vendor.clickJobFunction());

		logger.info("click job function selection");

		TryClick(vendor.clickselectjobfunction());
		logger.info("click job function 1 selection");

		TryClick(vendor.clickJobFunction());

		TryClick(vendor.clickAddress());

		logger.info("click address");

		SelectDropdown(vendor.clickaddresstype(), 1);

		logger.info("click address type");

		ClickDropdownValue(1).click();

		/*
		 * TryClick(vendor.clicklocation()); logger.info("click location");
		 */

		Actions action = new Actions(driver);
		vendor.StreetAdress1().sendKeys(exceldata.StreetAddress());
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		TryClick(vendor.clickSave2());
		logger.info("click save2");

		TryClick(vendor.clicksave1());
		logger.info("click save");

		for (int i = 0; i <= 1; i++) {

			waitUntilPageLoad();
			Thread.sleep(1000);

		}

		jsScroll(driver, vendor.Listedvendor());

		vendor.Search().sendKeys(setclickVendorName);
		
		waitUntilPageLoad();
		explWaitToClick(vendor.Listedvendor());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String Vendornameaftercreate = (String) js.executeScript("return arguments[0].innerText;",
				vendor.Listedvendor());

		System.out.println("provided vendor name to create: " + setclickVendorName);
		System.out.println("Listed vendor name after create: " + Vendornameaftercreate);
		if (setclickVendorName.equalsIgnoreCase(Vendornameaftercreate)) {
			Assert.assertTrue(true);
			logger.info("Create vendor test passed");
		}

		else {
			Assert.assertTrue(false);
			logger.info("create vendor test failed");
		}
		refreshWindow();
	}
}
