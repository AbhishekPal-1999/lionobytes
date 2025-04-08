package com.liono360accountsFilter;

import java.io.IOException;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FilterPage;
import com.liono360.utility.ExcelDataProvider;

public class TC001_CreateFilter extends Baseclass{
	
	@Test
	public void TC001CreateFilter() throws IOException, InterruptedException
	{

		FilterPage filter = new FilterPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		TryClick(filter.Accounts());
		logger.info("Clicked on Lead ");

		TryClick(filter.clickFilterIcon());
		logger.info("Clicked on filter ");
		

		TryClick(filter.Reset());
		logger.info("Clicked on reset filter ");
		
		TryClick(filter.clickFilterIcon());
		logger.info("Clicked on filter ");
		
		waitUntilPageLoad();

	    TrySelectDropdown(filter.Filter(1),"Country");
	    logger.info("Filter field added is selected");
		SelectDropdown(filter.Operator(1),1);
		logger.info("Operator is selected");
		
		TryMultiDropdowntxt(filter.SelectMultivalues(1),"USA");
		logger.info("Rule value is added");

		TryClick(filter.Apply());
		logger.info("Apply button clicked");
		
		
	}
}
