package com.liono360.SavedSearchActivity;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SavedSearchActivity;

public class TC_005AddActivityInformationReleatedQuery extends Baseclass{

	@Test
	public void AddActivityInformationReleatedQueryTest () throws InterruptedException {
		
		
		Actions action = new Actions(driver);
		SavedSearchActivity Activity = new SavedSearchActivity(driver);	
		
		TryClick(Activity.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(Activity.SavedSearch());
		logger.info("Clicked on Saved Search");
		
		
		TryClick(Activity.New());
		logger.info("Clicked on New");
		
		
		
		explWaitToClick(Activity.Name1());
		Activity.Name1().sendKeys("Information Releated Query"+randomnumber());
		logger.info("Sendkeys On Name");
		
		String SavedSearchNameNameBeforeCreate= Activity.Name1().getAttribute("value");
		
		
		//TrySelectMultiDropdown(Activity.AccPermission(),4, 5);
		//logger.info("Select Dropdown value For Access Permission");
		
		
		
		SelectDropdown(Activity.ModuleA(),2);
		logger.info("Select Dropdown value For Module");
		
		
		
		TryClick(Activity.Plus());
		logger.info("Sendkeys On Plus");
		
		
		
		TryClick(Activity.Filter11());
		logger.info("Sendkeys On Plus");
		
		
		//TryClick(Activity.ActivityInformation());
		//logger.info("Click On Activity Information");
		
		TryClick(Activity.ClickOnType());
		logger.info("Click On Type");
		
		
		
		SelectDropdown(Activity.Operator11(),3);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		
		TryClick(Activity.Save22());
		logger.info("Click On Save");
		
		
  //............................1st parent Rule...............................................//	
		
		TryClick(Activity.Plus1());
		logger.info("Click On Add Parent Rule");
		
		
		
		TryClick(Activity.Filter());
		logger.info("Click On Filter");
		
		
		TryClick(Activity.CreatedBy());
		logger.info("Click On Created By");
		
		
		
		SelectDropdown(Activity.Operator11(),3);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		
		TryClick(Activity.Save22());
		logger.info("Click On Save");
		
		
 //............................2nd parent Rule...............................................//
		TryClick(Activity.Plus1());
		logger.info("Click On Add Parent Rule");
		
		
		
		TryClick(Activity.Filter());
		logger.info("Click On Filter");
		
		
		TryClick(Activity.CreatedDate());
		logger.info("Click On Created Date");
		
		
		
		SelectDropdown(Activity.Operator11(),3);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		
		TryClick(Activity.Save22());
		logger.info("Click On Save");
		
		
		
//..............................3rd Parent Rule...............................................//
		TryClick(Activity.Plus1());
		logger.info("Click On Add Parent Rule");
		
		
		
		TryClick(Activity.Filter());
		logger.info("Click On Filter");
		
		
		TryClick(Activity.LastUpdatedBy());
		logger.info("Click On Last Updated By");
		
		
		
		SelectDropdown(Activity.Operator11(),3);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		
		TryClick(Activity.Save22());
		logger.info("Click On Save");	
		
		
//..............................4th parent Rule...............................................//		
		
		TryClick(Activity.Plus1());
		logger.info("Click On Add Parent Rule");
		
		
		
		TryClick(Activity.Filter());
		logger.info("Click On Filter");
		
		
		TryClick(Activity.LastUpdatedDate());
		logger.info("Click On Last Updated Date");
		
		
		
		SelectDropdown(Activity.Operator11(),3);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		
		TryClick(Activity.Save22());
		logger.info("Click On Save");	
		
//..............................................................................................................//		
		TryClick(Activity.Preview());
		logger.info("Click On Preview");
		
		
		TryClick(Activity.Cancel());
		logger.info("Click On Cancel");
		
		
		
		TryClick(Activity.Save11());
		logger.info("Click On Save");
			
		
		
		
	}
	
	
}
