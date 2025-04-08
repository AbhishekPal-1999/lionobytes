package com.liono360.SavedSearchOpportunity;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitySavedSearchPage;

public class TC_006AddStagesReleatedQuery extends Baseclass {

	@Test
	public void TC_006AddStagesReleatedQueryTest () throws InterruptedException {
		
		
		Actions action = new Actions(driver);
		OpportunitySavedSearchPage OppSavedSearch = new OpportunitySavedSearchPage(driver);	
		
		
		TryClick(OppSavedSearch.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(OppSavedSearch.SavedSearch());
		logger.info("Clicked on Saved Search");
		
		
		TryClick(OppSavedSearch.New());
		logger.info("Clicked on New");
		
		
		
		explWaitToClick(OppSavedSearch.Name1());
		OppSavedSearch.Name1().sendKeys("A-Stages Fileds"+randomnumber());
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
		
		
		// TryClick(Activity.ActivityInformation());
		// logger.info("Click On Activity Information");

		TryClick(OppSavedSearch.StageExpand());
		logger.info("Click On Stage Expand arrow");

		
		TryClick(OppSavedSearch.CurrentStage());
		logger.info("Click On Current Stage");
		
		
		
		
		SelectDropdown(OppSavedSearch.Operator11(), 3);
		logger.info("Select Dropdown value For Opeartor");

		
		
		TryClick(OppSavedSearch.Save22());
		logger.info("Click On Save");
		
		
 //.............................2nd parent rule.......................................................................//			
		TryClick(OppSavedSearch.Plus());
		logger.info("Sendkeys On Plus");
		
		
		
		TryClick(OppSavedSearch.Filter11());
		logger.info("Sendkeys On Plus");
		
		
		// TryClick(Activity.ActivityInformation());
		// logger.info("Click On Activity Information");

		//TryClick(OppSavedSearch.StageExpand());
		//logger.info("Click On Stage Expand arrow");

		
		TryClick(OppSavedSearch.PreviousStage());
		logger.info("Click On Previous Stage");
		
		
		
		
		SelectDropdown(OppSavedSearch.Operator11(), 3);
		logger.info("Select Dropdown value For Opeartor");

		
		
		TryClick(OppSavedSearch.Save22());
		logger.info("Click On Save");
		
//.............................3rd parent rule.......................................................................//			
		TryClick(OppSavedSearch.Plus());
		logger.info("Sendkeys On Plus");
		
		
		
		TryClick(OppSavedSearch.Filter11());
		logger.info("Sendkeys On Plus");
		
		
		// TryClick(Activity.ActivityInformation());
		// logger.info("Click On Activity Information");

		//TryClick(OppSavedSearch.StageExpand());
		//logger.info("Click On Stage Expand arrow");

		
		TryClick(OppSavedSearch.StageChangedBy());
		logger.info("Click On Stage Changed By");
		
		
		
		
		SelectDropdown(OppSavedSearch.Operator11(), 3);
		logger.info("Select Dropdown value For Opeartor");

		
		
		TryClick(OppSavedSearch.Save22());
		logger.info("Click On Save");
		
		
//.............................4th parent rule.......................................................................//			
		
		TryClick(OppSavedSearch.Plus());
		logger.info("Sendkeys On Plus");
		
		
		
		TryClick(OppSavedSearch.Filter11());
		logger.info("Sendkeys On Plus");
		
		
		// TryClick(Activity.ActivityInformation());
		// logger.info("Click On Activity Information");

		//TryClick(OppSavedSearch.StageExpand());
		//logger.info("Click On Stage Expand arrow");

		
		TryClick(OppSavedSearch.StageChangedDate());
		logger.info("Click On Stage Changed Date");
		
		
		
		
		SelectDropdown(OppSavedSearch.Operator11(), 2);
		logger.info("Select Dropdown value For Opeartor");

		
		
		SelectDropdown(OppSavedSearch.Value11(), 9);
		logger.info("Select Dropdown for value");
		
		
		
		
		TryClick(OppSavedSearch.Save22());
		logger.info("Click On Save");
		
		
		
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
