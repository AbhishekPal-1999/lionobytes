package com.liono360.SavedSearchOpportunity;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitySavedSearchPage;

public class TC_012OrderBy extends Baseclass {

	@Test
	public void TC_012OrderByTest () throws InterruptedException {
		
		
		Actions action = new Actions(driver);
		OpportunitySavedSearchPage OppSavedSearch = new OpportunitySavedSearchPage(driver);	
		
		
		TryClick(OppSavedSearch.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(OppSavedSearch.SavedSearch());
		logger.info("Clicked on Saved Search");
		
		
		TryClick(OppSavedSearch.New());
		logger.info("Clicked on New");
		
		
		
		explWaitToClick(OppSavedSearch.Name1());
		OppSavedSearch.Name1().sendKeys("Order By"+randomnumber());
		logger.info("Sendkeys On Name");
		
		String SavedSearchNameNameBeforeCreate= OppSavedSearch.Name1().getAttribute("value");
		
		
		//TrySelectMultiDropdown(Activity.AccPermission(),4, 5);
		//logger.info("Select Dropdown value For Access Permission");
		
		
		
		SelectDropdown(OppSavedSearch.Module(),7);
		logger.info("Select Dropdown value For Module");
		
		
		SelectDropdown(OppSavedSearch.Channel1(),1);
		logger.info("Select Dropdown value For opportunity Channel");
		
		
		SelectDropdown(OppSavedSearch.Channel2(),1);
		logger.info("Select Dropdown value For Account Channel");
		
		
		
//.............................1st parent rule.......................................................................//	
		
		TryClick(OppSavedSearch.Plus());
		logger.info("Sendkeys On Plus");
		
		
		
		TryClick(OppSavedSearch.Filter11());
		logger.info("Sendkeys On Plus");
		
		
		TryClick(OppSavedSearch.CreatedBy());
		logger.info("Click On Created By");
		
		
		
		SelectDropdown(OppSavedSearch.Operator11(), 3);
		logger.info("Select Dropdown value For Opeartor");

		
		
		TryClick(OppSavedSearch.Save22());
		logger.info("Click On Save");
		
	//...............................................................................................//	
		
		TryClick(OppSavedSearch.Save11());
		logger.info("Click On Save");			
		
					
		
		
		TryClick(OppSavedSearch.ClickOnCreatedSavedSearch());
		logger.info("Click On Created Saved Search");		
		
		
		
		TryClick(OppSavedSearch.Result());
		logger.info("Click On Result");
		
		
		
	//..................................................................................................................//
		
		
		TryClick(OppSavedSearch.OrderBy());
		logger.info("Click On Order By");
		
		
		
		SelectDropdown(OppSavedSearch.OrderByFiled(), 2);
		logger.info("Select Dropdown value For Order By Filed");
		
		
		SelectDropdown(OppSavedSearch.AssccDecc(), 1);
		logger.info("Select Dropdown value For Ascending Deceending Order By Filed");
		
		
		Thread.sleep(2000);
		OppSavedSearch.TopNumberOfRecords().sendKeys("5");
		
		
		TryClick(OppSavedSearch.SaveOrderBy());
		logger.info("Click On save Order By");
		
		
		
	}

}
