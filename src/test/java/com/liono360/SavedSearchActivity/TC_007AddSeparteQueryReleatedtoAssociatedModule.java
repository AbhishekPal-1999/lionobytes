package com.liono360.SavedSearchActivity;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.SavedSearchActivity;

public class TC_007AddSeparteQueryReleatedtoAssociatedModule extends Baseclass{

	@Test
	public void AddSeparteQueryReleatedtoAssociatedModuleTest () throws InterruptedException {
		
		Actions action = new Actions(driver);
		SavedSearchActivity Activity = new SavedSearchActivity(driver);

		TryClick(Activity.MiscBtn());
		logger.info("Clicked on Misc.");

		TryClick(Activity.SavedSearch());
		logger.info("Clicked on Saved Search");

		TryClick(Activity.New());
		logger.info("Clicked on New");

		explWaitToClick(Activity.Name1());
		Activity.Name1().sendKeys("Associated Module Releated Query" + randomnumber());
		logger.info("Sendkeys On Name");

		String SavedSearchNameNameBeforeCreate = Activity.Name1().getAttribute("value");

		// TrySelectMultiDropdown(Activity.AccPermission(),4, 5);
		// logger.info("Select Dropdown value For Access Permission");

		SelectDropdown(Activity.ModuleA(), 2);
		logger.info("Select Dropdown value For Module");

		TryClick(Activity.Plus());
		logger.info("Sendkeys On Plus");

		TryClick(Activity.Filter11());
		logger.info("Sendkeys On Plus");

		// TryClick(Activity.ActivityInformation());
		// logger.info("Click On Activity Information");

		TryClick(Activity.ClickOnType());
		logger.info("Click On Type");

		SelectDropdown(Activity.Operator11(), 3);
		logger.info("Select Dropdown value For Opeartor");

		TryClick(Activity.Save22());
		logger.info("Click On Save");

		// ............................1st parent Rule...............................................//

		TryClick(Activity.Plus1());
		logger.info("Click On Add Parent Rule");

		TryClick(Activity.Filter());
		logger.info("Click On Filter");

		TryClick(Activity.CreatedBy());
		logger.info("Click On Created By");

		SelectDropdown(Activity.Operator11(), 3);
		logger.info("Select Dropdown value For Opeartor");

		TryClick(Activity.Save22());
		logger.info("Click On Save");

		// ......................Association Module Query...............................................//

		TryClick(Activity.Plus1());
		logger.info("Click On Add Parent Rule");
		
		TryClick(Activity.Filter());
		logger.info("Click On Filter");
		

		TryClick(Activity.AssociationInformation());
		logger.info("Click On Association Information");

		TryClick(Activity.AssociationModule());
		logger.info("Click On Association Module");
		
		
		SelectDropdown(Activity.Operator11(), 1);
		logger.info("Select Dropdown value For Opeartor");
		
		
		
		SelectDropdown(Activity.ValueAssociationModule(), 3);
		logger.info("Select Dropdown value For Association Module");
		
		
		TryClick(Activity.Save22());
		logger.info("Click On Save");

		TryClick(Activity.Preview());
		logger.info("Click On Preview");

		TryClick(Activity.Cancel());
		logger.info("Click On Cancel");

		TryClick(Activity.Save11());
		logger.info("Click On Save");	
		
		
		
	}

}
