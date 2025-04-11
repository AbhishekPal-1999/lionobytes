package com.liono360.SavedSearchOpportunity;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitySavedSearchPage;

public class TC_009CustomFieldsReleatedQuery extends Baseclass {

	@Test
	public void TC_009CustomFieldsReleatedQueryTest () throws InterruptedException {
		
		Actions action = new Actions(driver);
		OpportunitySavedSearchPage OppSavedSearch = new OpportunitySavedSearchPage(driver);	
		
		
		TryClick(OppSavedSearch.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(OppSavedSearch.SavedSearch());
		logger.info("Clicked on Saved Search");
		
		
		TryClick(OppSavedSearch.New());
		logger.info("Clicked on New");
		
		
		
		explWaitToClick(OppSavedSearch.Name1());
		OppSavedSearch.Name1().sendKeys("A-CustomFields"+randomnumber());
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

		

		
		TryClick(OppSavedSearch.CheckBox());
		logger.info("Click On CheckBox");
		
		
		
		
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

			

				
				TryClick(OppSavedSearch.Decimal());
				logger.info("Click On Decimal");
				
				
				
				
				SelectDropdown(OppSavedSearch.Operator11(), 5);
				logger.info("Select Dropdown value For Opeartor");
				
				
				
				
				
				explWaitToClick(OppSavedSearch.EnterValue());
				OppSavedSearch.EnterValue().sendKeys("2");
				logger.info("Sendkeys On Decimal Value Fields");
				
				
				
				
				
				

				
				
				TryClick(OppSavedSearch.Save22());
				logger.info("Click On Save");
				
				
					
//.............................3rd parent rule.......................................................................//	
		
				TryClick(OppSavedSearch.Plus());
				logger.info("Sendkeys On Plus");
				
				
				
				TryClick(OppSavedSearch.Filter11());
				logger.info("Sendkeys On Plus");
				
				
				// TryClick(Activity.ActivityInformation());
				// logger.info("Click On Activity Information");

			

				
				TryClick(OppSavedSearch.Number());
				logger.info("Click On Number");
				
				
				
				
				SelectDropdown(OppSavedSearch.Operator11(), 5);
				logger.info("Select Dropdown value For Opeartor");

				
				explWaitToClick(OppSavedSearch.EnterValue());
				OppSavedSearch.EnterValue().sendKeys("10");
				logger.info("Sendkeys On Decimal Value Fields");
				
				
				
				
				
				TryClick(OppSavedSearch.Save22());
				logger.info("Click On Save");
					
		
	////.............................4th parent rule.......................................................................//	
		
				TryClick(OppSavedSearch.Plus());
				logger.info("Sendkeys On Plus");
				
				
				
				TryClick(OppSavedSearch.Filter11());
				logger.info("Sendkeys On Plus");
				
				
				// TryClick(Activity.ActivityInformation());
				// logger.info("Click On Activity Information");

			

				
				TryClick(OppSavedSearch.MultiSelect());
				logger.info("Click On Multiselect custom fields");
				
				
				
				
				SelectDropdown(OppSavedSearch.Operator11(), 3);
				logger.info("Select Dropdown value For Opeartor");

				
				
				TryClick(OppSavedSearch.Save22());
				logger.info("Click On Save");	
		
		
	//...............................................................................................................//	
		
		
				Thread.sleep(2000);
				OppSavedSearch.AddNotes().sendKeys("This saved search was created through an automation script.");
				logger.info("Sendkeys On Notes");
				
				
				
				
				TryClick(OppSavedSearch.Preview());
				logger.info("Click On Preview");
				
				
				TryClick(OppSavedSearch.Cancel());
				logger.info("Click On Cancel");
				
				
				
				TryClick(OppSavedSearch.Save11());
				logger.info("Click On Save");			
				
				
//..............................Result Part.....................................................................//				
				
				
				TryClick(OppSavedSearch.ClickOnCreatedSavedSearch());
				logger.info("Click On Created Saved Search");		
				
				
				
				TryClick(OppSavedSearch.Query());
				logger.info("Click On Query");	
				
				
				TryClick(OppSavedSearch.Result());
				logger.info("Click On Result");	
				
				TryClick(OppSavedSearch.Maximize());
				logger.info("Click On maximize");
		
		
				TryClick(OppSavedSearch.Refresh());
				logger.info("Click On Refresh");
				
				
				TryClick(OppSavedSearch.Setting());
				logger.info("Click On setting");
				
				
				
				TryClick(OppSavedSearch.DecimalEnable());
				logger.info("Click On Decimal Checkbox");
				
				
				TryClick(OppSavedSearch.NumberEnable());
				logger.info("Click On Number Checkbox");
				
				
				
				TryClick(OppSavedSearch.CheckBoxEnable());
				logger.info("Click On enabled Checkbox");
				
				
				TryClick(OppSavedSearch.MultiSelectDropdown());
				logger.info("Click On enabled MultiSelect");
				
				
				
				TryClick(OppSavedSearch.SettingSave());
				logger.info("Click On Column setting save ");
				
		
		
	}
	
	
}
