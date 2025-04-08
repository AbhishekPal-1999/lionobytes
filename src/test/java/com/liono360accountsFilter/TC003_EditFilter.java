package com.liono360accountsFilter;

import java.io.IOException;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FilterPage;
import com.liono360.utility.ExcelDataProvider;

public class TC003_EditFilter extends Baseclass{
	
	@Test
	public void TC003EditFilter() throws IOException, InterruptedException
	{

		FilterPage filter = new FilterPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		TryClick(filter.Accounts());
		logger.info("Clicked on Lead ");

		TryClick(filter.clickFilterIcon());
		logger.info("Clicked on filter ");
		
		waitUntilPageLoad();

	    TrySelectDropdown(filter.Filter(1),"Country");
	    logger.info("Filter field added is selected");
		SelectDropdown(filter.Operator(1),4);
		logger.info("Operator is selected");
	
		TryClick(filter.Apply());
		logger.info("Apply button clicked");
		
		
	}
}
