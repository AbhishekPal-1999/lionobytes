package com.liono360.cases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_012VerifyFilterFuntionality extends Baseclass{

	@Test
	public void TC_012VerifyFilterFuntionalityTest() throws InterruptedException, IOException {
		
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();

		CasesPage cases= new CasesPage(driver);
		cases.clickCases().click();
		logger.info("Clicked on Cases ");
		cases.waitUntilPageLoad();
		
// Columns setting
				
		int p=1;
		int flag=0;
		String checkSetting=null;
		while(p<8) {
		try {	
		checkSetting=driver.findElement(By.xpath("//thead[@class='p-datatable-thead']//tr//th["+p+"]")).getText();
		System.out.println("headers of the columns is: "+checkSetting);
		}
		catch(Exception e){
			System.out.println(e);
		}
		if(checkSetting.equals("Created By")) {
			
			flag=1;
		   break;
		   }
		p=p+1;
		}
		
		if(flag==0) {
			
			
			cases.ClickSettingBtn().click();
			logger.info("clicked on setting button");
			Thread.sleep(2000);
			try {
				String FindLastColumn=driver.findElement(By.xpath("//thead[@class='p-datatable-thead']//tr//th[7]")).getText();
				driver.findElement(By.xpath("//*[contains(text(),'"+FindLastColumn+"')]/preceding-sibling::p-checkbox//div[2]")).click();
				logger.info(FindLastColumn+" column is Deselected");
				Thread.sleep(2000);
			}
			catch(Exception e){
				System.out.println(e);
			}
			
			
			cases.clickCreatedBy().click();
			logger.info("clicked on Created By button");
			Thread.sleep(1000);
			cases.clickSaveSetting().click();
			logger.info("clicked on save setting");
			cases.waitUntilPageLoad();
			logger.info("Created By column add successfully");
			}
		
		cases.selectFilterCase().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[contains(text(),'Created by me')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Created by me')]")).click();
		logger.info("filter is selected");
		cases.waitUntilPageLoad();
		
		jsScroll(driver, cases.selectEntriesLimit());
		cases.selectEntriesLimit().click();
		Thread.sleep(6000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='100']")));
		driver.findElement(By.xpath("//span[text()='100']")).click();
		logger.info("entries limit is selected");
		cases.waitUntilPageLoad();
		jsScroll(driver, cases.setGloabalSearch());
		String totalCases =driver.findElement(By.xpath("(//span[@class='p-steps-number'])[1]")).getText();
		 int num=Integer.parseInt(totalCases);
		
		List<String> list1=new ArrayList<String>(); 
		int loggerValue=0;
		int coloumnNoOfCreatedBy=0;
		for( int j=1; j<=7;j++) {
			try {
				String headers=driver.findElement(By.xpath("//thead[@class='p-datatable-thead']//tr//th["+j+"]")).getText();
				//System.out.println(headers);
				if(headers.equals("Created By")) {
					coloumnNoOfCreatedBy=j;
				//	System.out.println(coloumnNoOfCreatedBy);
					break;
				}
				}
				catch(Exception e) {
				  
				}
		}
		for(int i=1;i<=num;i++) {
			String CreatedBy =driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+coloumnNoOfCreatedBy+"]/p[1]")).getText();
			list1.add(CreatedBy);
		}
			
		  for(String k:list1) {
			System.out.println(k);
			if (k.equals("Mark ")) 
				loggerValue=1;
			}
		  System.out.println("Toatal element in the List is: "+list1.size());
		  
	// assertion
		  if(loggerValue==1) {
				Assert.assertTrue(true);
				logger.info("filter test passed");
			} 
			else {
				Assert.assertTrue(false);
				captureScreen(driver, "FilterCase");
				logger.info("filter test failed");
				
				}
			}
		}

