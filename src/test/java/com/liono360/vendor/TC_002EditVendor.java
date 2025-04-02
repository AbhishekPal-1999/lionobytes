package com.liono360.vendor;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.VendorPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_002EditVendor extends Baseclass{
	@Test
	public void EditVendor() throws InterruptedException, IOException {
		// redirectToCRM();
			
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
				
				  
				  TryClick(vendor.clickEditVendor());
				  logger.info("click Edit vendor");
				
				  TryClick(vendor.clickVendorName());
				  logger.info("click vendor name ");
				  
				  vendor.clickVendorName().clear();
				  logger.info("clear vendor name ");
				
				  vendor.clickVendorName().sendKeys("VendorEditConsultancy"+randomnumber());
				  logger.info("fill vendor name ");
				  
				  String setclickVendorName= vendor.clickVendorName().getAttribute("value");
				  TryClick(vendor.clickaccountNumber());
				  logger.info("click account number ");
				 
				  vendor.clickaccountNumber().clear();
				  logger.info("clear account number ");
				  
				  vendor.clickaccountNumber().sendKeys("896542"+randomnumber());
				  
				  
				  TryClick(vendor.clickemailaddress());
				  logger.info("click email address ");
				
				  vendor.clickemailaddress().clear();
				  logger.info("clear email address ");
				 
				  vendor.clickemailaddress().sendKeys("vendor12"+randomnumber()+"@gmail.com");
				
				  TryClick(vendor.clickPhoneNumber());
				  logger.info("click phone number ");
				  
				  vendor.clickPhoneNumber().clear();
				  logger.info("clear phone number ");
				 
				  vendor.clickPhoneNumber().sendKeys("+12906322"+randomnumber());
				 
				  
				  TryClick(vendor.clickTimeZoneClose());
				  logger.info("select Time zone ");
				  
				 SelectDropdown(vendor.clickselectTimeZone(),1);
				 logger.info("select  edited Time zone ");
				  
					/*
					 * vendor.clickselectTimeZone().clear(); logger.info("select Time zone clear");
					 * Thread.sleep(1000);
					 */
				
				
				
				  
				  TryClick(vendor.clickcurrencyclose());
				  logger.info("selected currency close ");
				  SelectDropdown(vendor.clickSelectCurrency(),1);
					 logger.info("select  edited  select currency ");
					  
				  
				
				
				  
				 
				  
				  driver.findElement(By.xpath("//span[normalize-space()='Show More']")).click();
				  logger.info("click show more ");
				 
				  
				  vendor.clickDoingBusinessas().click();
				  logger.info("click doing business");
				
				  vendor.clickDoingBusinessas().clear();
				  logger.info("click doing business clear");
				
				  vendor.clickDoingBusinessas().sendKeys("DBA12"+randomnumber());
				  logger.info("fill doing business value");
				  
				  
				  vendor.clickTaxId().click();
				  logger.info("click tax id");
				 
				  vendor.clickTaxId().clear();
				  logger.info("click tax id");
				  
				  vendor.clickTaxId().sendKeys("78"+randomnumber());
				  logger.info("click tax id");
				
				  TryClick(vendor.clickcloseemployee());
				  logger.info("click select  close employee");
				  SelectDropdown(vendor.clickSelectEmployee(),1);
				 
				  
				  logger.info("fill no.of  employee");
				 
				  
				  
				  TryClick(vendor.clickcloserevenue());
				  logger.info("select close revenue");
				  SelectDropdown(vendor.clickSelectrevenue(),1);
				
				  logger.info("fill revenue");
				
				  
				  vendor.clickcloseownership().click();
				  logger.info("select ownership");
				
				  SelectDropdown(vendor.clickSelectOwnership(),1);
				 
				  logger.info("click ownership value");
				 
				  
				  vendor.clickFoundedYear().click();
				  logger.info("click founded year");
				  
				  vendor.clickFoundedYear().clear();
				  logger.info("click founded year");
				  vendor.clickFoundedYear().sendKeys("2000");
			
				  
				
				  
				  
				  vendor.clickSiccode().click();
				  logger.info("click SIC CODE");
				  vendor.clickSiccode().clear();
				  logger.info("click SIC CODE clear");
				  vendor.clickSiccode().sendKeys("RY7"+randomnumber());
				  logger.info("fill SIC CODE");
				 
				  
				  vendor.clicknaicsCode().click();
				  logger.info("click NAISC CODE");
				  vendor.clicknaicsCode().clear();
				  logger.info("click NAISC CODE");
				  vendor.clicknaicsCode().sendKeys("RY7"+randomnumber());
				  logger.info("fill SIC CODE");
				
				  
				 
				  
				  vendor.clickFname().click();
				  logger.info("click first name");  
				  vendor.clickFname().clear();
				  logger.info("click first name");
				  
				  vendor.clickFname().sendKeys("FName"+randomnumber());
				  logger.info("Fill first name");
				 
				  
				  vendor.clicklname().click();
				  logger.info("click Last name");
				  vendor.clicklname().clear();
				  logger.info("click Last name");
				  vendor.clicklname().sendKeys("lName"+randomnumber());
				  logger.info("Fill Last name");
				  
				  
				  vendor.clickemail().click();
				  logger.info("click  email");
				  vendor.clickemail().clear();
				  logger.info("click  email clear");
				
				  vendor.clickemail().sendKeys("fname"+randomnumber()+"@gmail.com");
				  logger.info("Fill email");
				  
				  
				  vendor.clickphone().click();
				  logger.info("click phone");
				  vendor.clickphone().clear();
				  logger.info("click phone");
				 
				  vendor.clickphone().sendKeys("9837678"+randomnumber());
				  logger.info("Fill phone number");
				  
				  vendor.clicksocialProfile().click();
				  logger.info("click social profile");
				  vendor.clicksocialProfile().clear();
				  logger.info("click social profile");
				  
				  vendor.clicksocialProfile().sendKeys("fname"+randomnumber()+"@linkedln.com");
				  logger.info("fill social profile");
				  
				  
					
				
				
					
					  vendor.clicksave1().click(); logger.info("click save"); 
					  
					  
					  vendor.Search().sendKeys(setclickVendorName);
					  
					  vendor.waitUntilPageLoad();
						//Thread.sleep(6000);
						String Vendornameaftercreate=vendor.Listedvendor().getText();
						System.out.println("provided vendor name to create: "+setclickVendorName);
						System.out.println("Listed vendor name after create: "+Vendornameaftercreate);
						if (setclickVendorName.equalsIgnoreCase(Vendornameaftercreate)) {
							Assert.assertTrue(true);
							logger.info("edit vendor test passed");
						} 

						else {
							Assert.assertTrue(false);
							logger.info("Edit vendor test failed");
						}
					}
					 
	

}
