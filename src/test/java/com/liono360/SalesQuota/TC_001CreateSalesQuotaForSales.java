package com.liono360.SalesQuota;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SalesQuotaPage;

public class TC_001CreateSalesQuotaForSales extends Baseclass {

	@Test
	public void TC_001CreateSalesQuotaTest() throws InterruptedException, IOException {
		
		
		Actions action = new Actions(driver);
		
		SalesQuotaPage SQ =new SalesQuotaPage(driver);
		

		waitUntilPageLoad();
		waitUntilPageLoad();
		TryClick(SQ.SalesQuotaModule());
		logger.info("Clicked on Sales Quota Module");
		
		
		
		SelectDropdown(SQ.AccountChannel(),1);
		logger.info("Select Account Channel For Sales Quota");
		
		
		
		TryClick(SQ.New());
		logger.info("Clicked on New");
		
		
		
		SQ.QuotaName().sendKeys("SQ-Sales" + randomnumber());
		logger.info("Sales Quota Name Added");
		
		
		String name = SQ.QuotaName().getAttribute("value");
		logger.info("Sales Quota Name is "+name);
		
		
		
		
		SelectDropdown(SQ.QuotaType(),1);
		logger.info("Select Quota Type");
		
		SelectDropdown(SQ.QuotaBy(),1);
		logger.info("Select Quota By");
		
	     Thread.sleep(2000);
		SelectDropdown(SQ.QuotaFor(),1);
		logger.info("Select Quota For");
		
		
		SQ.Quotaamount().clear();
		Thread.sleep(1000);
		SQ.Quotaamount().sendKeys("50" + randomnumber());
		logger.info("Quota Amount Added");
		
		TryClick(SQ.NextS());
		logger.info("Clicked on Next");
		
		TryClick(SQ.ClickYear());
		logger.info("Clicked on Year");
		
		
		TryClick(SQ.year());
		logger.info("Selected on Year");
		
		
		
		SelectDropdown(SQ.TargetPeriod(),3);
		logger.info("Select Target Period");
		
		
		SelectDropdown(SQ.Statingmonth(),6);
		logger.info("Select sarting month");
		
		
		
		TryClick(SQ.Undistrubute());
		logger.info("Clicked On Undistrubute");
		
		
		TryClick(SQ.Distrubute());
		logger.info("clicked On Distrubute");
		
		
		TryClick(SQ.Next());
		logger.info("clicked On Next");
		
		
		
		//TryClick(SQ.ByTerritory());
		//logger.info("Selected check By territory");
		
		
		TryLionoTreeSelect(SQ.Selectterritory(),SQ.SearchTR(),"USA");
		TryClick(SQ.SelectT());
		logger.info("Select Territory");
		
		
		//TryLionoTreeSelect(SQ.SelectRolehirechey(),SQ.SearchTR(),"CEO");
		//logger.info("Select Role");
		
		TryClick(SQ.SelectAction());
		logger.info("clicked On Plus Action Button");
		
		TryClick(SQ.SelectCheckbox());
		logger.info("clicked On First Checkbox");
		
		
		SQ.AddAmount().sendKeys("55" + randomnumber());
		logger.info("Amount Added");
		
		
		TryClick(SQ.Save());
		logger.info("clicked On Save Button");
		
		
		TryClick(SQ.User());
		logger.info("clicked On Split User Pop up");
		
		TryClick(SQ.Saveall());
		logger.info("clicked On Save All");
		
	
		Thread.sleep(1000);
		waitUntilPageLoad();
		String name1 = SQ.AfterQuotaName().getText();
		System.out.println(name);
		System.out.println(name1);
		
		
		
		Thread.sleep(1000);
		if(name.equals(name1)) {
			Assert.assertTrue(true);
			logger.info("Sales Quota is created Successfully");
		}else {
			Assert.assertTrue(false);
			captureScreen(driver, "add Sales Quota");
			logger.info("Sales Quota is not created Successfully");
		}

	}

}
