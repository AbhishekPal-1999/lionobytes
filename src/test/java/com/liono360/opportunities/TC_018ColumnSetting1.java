package com.liono360.opportunities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_018ColumnSetting1 extends Baseclass{

	@Test
	public void TC_018ColumnSettingTest() throws InterruptedException {

		OpportunitiesPage opp = new OpportunitiesPage(driver);
		Actions action = new Actions(driver);
		
		

		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");
		
		
		TryClick(opp.Setting());
		logger.info("Clicked on Setting");
		
		
		
		TryClick(opp.AccNameCheckboc());
		logger.info("Selected on Accountame Checkbox");
		
		
		TryClick(opp.ContactName());
		logger.info("Selected on Contact Name Checkbox");
		
		
		
		TryClick(opp.ContactEmail());
		logger.info("Selected on Contact Email Checkbox");
		
		
		TryClick(opp.ContactPhone());
		logger.info("Selected on Contact Phone Checkbox");
		
		
		TryClick(opp.Owner());
		logger.info("Selected on Owner Checkbox");
		
		
		TryClick(opp.Quality());
		logger.info("Selected on Quality Checkbox");
		
		
		TryClick(opp.Source());
		logger.info("Selected on Source Checkbox");
		
		
		
		TryClick(opp.CreatedBy());
		logger.info("Selected on CreatedBy Checkbox");
		
		
		TryClick(opp.LastUpdatedBy());
		logger.info("Selected on LastUpdatedBy Checkbox");
		
		
		TryClick(opp.LastUpdatedDate());
		logger.info("Selected on LastUpdatedDate Checkbox");
		
		
		opp.SearchFeilds().sendKeys("Rep Confidence");
		logger.info("Sendkeys On SearchFeilds");
		
		

		TryClick(opp.SaveColumnSetting());
		logger.info("Click On Save");
		
		
		
	}

}
