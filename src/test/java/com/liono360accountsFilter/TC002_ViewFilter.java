package com.liono360accountsFilter;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FilterPage;
import com.liono360.utility.ExcelDataProvider;

public class TC002_ViewFilter extends Baseclass{
	
	@Test
	public void TC002ViewFilter() throws IOException, InterruptedException
	{

		FilterPage filter = new FilterPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		TryClick(filter.Accounts());
		logger.info("Clicked on Lead ");

		TryClick(filter.clickFilterIcon());
		logger.info("Clicked on filter ");
		
		
	}
}
