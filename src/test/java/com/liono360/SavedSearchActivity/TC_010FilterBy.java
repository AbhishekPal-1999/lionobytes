package com.liono360.SavedSearchActivity;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SavedSearchActivity;

public class TC_010FilterBy extends Baseclass{

	@Test
	public void TC_010FilterByTest () throws InterruptedException {
		
		Actions action = new Actions(driver);
		SavedSearchActivity Activity = new SavedSearchActivity(driver);	
		
		TryClick(Activity.MiscBtn());
		logger.info("Clicked on Misc.");
		
		
		TryClick(Activity.SavedSearch());
		logger.info("Clicked on Saved Search");
		
		
		TryClick(Activity.New());
		logger.info("Clicked on New");
		
		
		
		explWaitToClick(Activity.Name1());
		Activity.Name1().sendKeys("Filter By"+randomnumber());
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
		
		
		TryClick(Activity.Preview());
		logger.info("Click On Preview");
		
		
		TryClick(Activity.Cancel());
		logger.info("Click On Cancel");
		
		
		
		TryClick(Activity.Save11());
		logger.info("Click On Save");
		
		
		
		TryClick(Activity.ClickOnSavedSearch());
		logger.info("Clicked on created Saved Search");	
		
		
		
		
		
	}
	  

}
