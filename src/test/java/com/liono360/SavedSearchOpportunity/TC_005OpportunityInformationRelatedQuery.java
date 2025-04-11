package com.liono360.SavedSearchOpportunity;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitySavedSearchPage;

public class TC_005OpportunityInformationRelatedQuery extends Baseclass{

	
	@Test
	public void TC_005OpportunityInformationRelatedQueryTest () throws InterruptedException {
		Actions action = new Actions(driver);
		OpportunitySavedSearchPage OppSavedSearch = new OpportunitySavedSearchPage(driver);	
		
		
		TryClick(OppSavedSearch.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(OppSavedSearch.SavedSearch());
		logger.info("Clicked on Saved Search");
		
		
		TryClick(OppSavedSearch.New());
		logger.info("Clicked on New");
		
		
		
		explWaitToClick(OppSavedSearch.Name1());
		OppSavedSearch.Name1().sendKeys("A-TopSavedSearch"+randomnumber());
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
		
		
		
		TryClick(OppSavedSearch.Plus());
		logger.info("Sendkeys On Plus");
		
		
		
		TryClick(OppSavedSearch.Filter11());
		logger.info("Sendkeys On Plus");
		
		
		//TryClick(Activity.ActivityInformation());
		//logger.info("Click On Activity Information");
		
		TryClick(OppSavedSearch.ClickOnAccountName());
		logger.info("Click On Account Name");
		
		
		
		SelectDropdown(OppSavedSearch.Operator11(),7);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		
		TryClick(OppSavedSearch.Save22());
		logger.info("Click On Save");
		
	
	//............................2nd parent Rule...............................................//
		
		TryClick(OppSavedSearch.Plus());
		logger.info("Sendkeys On Plus");
		
		
		
		TryClick(OppSavedSearch.Filter11());
		logger.info("Sendkeys On Filter11");
		
		
		//TryClick(Activity.ActivityInformation());
		//logger.info("Click On Activity Information");
		
		TryClick(OppSavedSearch.CreatedBy());
		logger.info("Click On Created By");
		
		
		
		SelectDropdown(OppSavedSearch.Operator11(),3);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		
		TryClick(OppSavedSearch.Save22());
		logger.info("Click On Save");
		
		
		
		
   //............................3rd parent Rule...............................................//
		
		TryClick(OppSavedSearch.Plus());
		logger.info("Sendkeys On Plus");
		
		
		
		TryClick(OppSavedSearch.Filter11());
		logger.info("Sendkeys On Filter11");
		
		
		//TryClick(Activity.ActivityInformation());
		//logger.info("Click On Activity Information");
		
		TryClick(OppSavedSearch.Quality());
		logger.info("Click On Quality");
		
		
		
		SelectDropdown(OppSavedSearch.Operator11(),3);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		
		TryClick(OppSavedSearch.Save22());
		logger.info("Click On Save");
		
		
		
		
		
		
  //............................4th parent Rule...............................................//
		
		TryClick(OppSavedSearch.Plus());
		logger.info("Sendkeys On Plus");
		
		
		
		TryClick(OppSavedSearch.Filter11());
		logger.info("Sendkeys On Filter11");
		
		
		//TryClick(Activity.ActivityInformation());
		//logger.info("Click On Activity Information");
		
		TryClick(OppSavedSearch.Source());
		logger.info("Click On Source");
		
		
		
		SelectDropdown(OppSavedSearch.Operator11(),3);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		
		TryClick(OppSavedSearch.Save22());
		logger.info("Click On Save");
		
		
	//.................................................................................//	

		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		OppSavedSearch.AddNotes().sendKeys("This saved search was created through an automation script.");
		logger.info("Sendkeys On Notes");
		
		
		
		
		TryClick(OppSavedSearch.Preview());
		logger.info("Click On Preview");
		
		
		TryClick(OppSavedSearch.Cancel());
		logger.info("Click On Cancel");
		
		
		
		TryClick(OppSavedSearch.Save11());
		logger.info("Click On Save");	
		
	
		
		
		
		
	}
	
}
