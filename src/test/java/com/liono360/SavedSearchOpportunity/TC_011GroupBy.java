package com.liono360.SavedSearchOpportunity;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitySavedSearchPage;

public class TC_011GroupBy extends Baseclass{

	@Test
	public void TC_010GroupByTest () throws InterruptedException {
		
		Actions action = new Actions(driver);
		OpportunitySavedSearchPage OppSavedSearch = new OpportunitySavedSearchPage(driver);	
		
		
		TryClick(OppSavedSearch.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(OppSavedSearch.SavedSearch());
		logger.info("Clicked on Saved Search");
		
		
		TryClick(OppSavedSearch.New());
		logger.info("Clicked on New");
		
		
		
		explWaitToClick(OppSavedSearch.Name1());
		OppSavedSearch.Name1().sendKeys("Group By"+randomnumber());
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
		
		
		
		TryClick(OppSavedSearch.ColumnSetting());
		logger.info("Clicked on Setting button");

		Thread.sleep(1000);
		TryClick(OppSavedSearch.ItemTotalC());
		logger.info("Clicked on item total button");

		
		
		TryClick(OppSavedSearch.ColumnSettingSave());
		logger.info("Clicked on Column Setting Save button");	
		
		
	//...........................Group By...........................................................//	
		Thread.sleep(1000);
		TryClick(OppSavedSearch.GroupBy());
		logger.info("Click On Group By");
		
		
		SelectDropdown(OppSavedSearch.SelectGroupByFileds(), 1);
		logger.info("Select Dropdown value For Group By Fileds");
		
		
		
		SelectDropdown(OppSavedSearch.SubGroupfileds(), 1);
		logger.info("Select Dropdown value For Sub By Fileds");
		
		
		Thread.sleep(1000);
		TrySelectMultiDropdown(OppSavedSearch.SummaryFileds(),1,2);
		logger.info("Select Value for Summary Fileds");
		
		
		
		//SelectDropdown(OppSavedSearch.SummaryValue(), 1);
		//logger.info("Select Dropdown value For Summary");
		
		
		
		TryClick(OppSavedSearch.SaveGroup());
		logger.info("Click On Group By");
		
		
	//.............................Assertion................................................//	
		
		String Opportunityid=OppSavedSearch.OppID().getText();
	
		String OpportunityName=OppSavedSearch.OppName().getText();
	
		if (OppSavedSearch.OppID().isDisplayed() && OppSavedSearch.OppName().isDisplayed()) {
		    System.out.println("Both GroupBy & Sub Group By are displayed & Apply.");
		} else {
		    System.out.println("Both GroupBy & Sub Group By are  not displayed & Apply.");
		}
	}
}

