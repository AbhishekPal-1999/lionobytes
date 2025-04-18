package com.liono360accountsFilter;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FilterPage;
import com.liono360.utility.ExcelDataProvider;

public class TC004_ResetFilter extends Baseclass{
	
	@Test
	public void TC004ResetFilter() throws IOException, InterruptedException
	{

		FilterPage filter = new FilterPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		TryClick(filter.Accounts());
		logger.info("Clicked on Lead ");

		TryClick(filter.clickFilterIcon());
		logger.info("Clicked on filter ");
		
		TryClick(filter.Reset());
		logger.info("Clicked on reset filter ");
		
	}
}
