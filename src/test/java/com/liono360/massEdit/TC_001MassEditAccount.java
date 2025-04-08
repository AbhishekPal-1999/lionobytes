package com.liono360.massEdit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.MassEditPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_001MassEditAccount extends Baseclass{

	
	@Test
	public void TC001MassEditAccounts() throws InterruptedException, IOException {
		
		//redirectToCRM();
// Dynamic fields:
		
		WebElement LoaderIcon = driver.findElement(By.xpath("//div[@class=\"splash-loader\"]"));
		
		MassEditPage account= new MassEditPage(driver);
		Faker faker = new Faker();
		ExcelDataProvider exceldata=new ExcelDataProvider();
		TryClick(account.clickAccounts());
		
		logger.info("Clicked on Account button");
		TryClick(account.ActionButton());
		
		logger.info("Clicked on Action button");
	
		TryClick(account.MassEdit());
		
		logger.info("Mass edit clicked");
		
		TryClick(account.addRules());
		logger.info("Add rules button clicked");
		
		TryLionoTreeSelect(account.Filter(), account.Search(), "Country");
		logger.info("Country field selected");
		
		SelectDropdown(account.operator(),1);
		logger.info("Operator is selected");
		
		TrySelectDropdown(account.SelectOperatorValue(),"Nepal");
		logger.info("Rule value is added");
		
		TryClick(account.save());
		logger.info("Clicked save button");
		
		TryClick(account.nextButton());
		logger.info("Clicked save button");
		
// Add fields and value------------------------------------
		TrySelectDropdown(account.MassEditField(1),"Account Type(s)");
		TrySelectMultiDropdown(account.SelectMultivalues(1),1,2);
		logger.info("Account types is selected");
		
		TryClick(account.AddFields());
		
		TrySelectDropdown(account.MassEditField(2),"Job Function");
		TrySelectMultiDropdown(account.SelectMultivalues(2),1,2);
		logger.info("Job function is selected");
		
        TryClick(account.AddFields());
        
        TrySelectDropdown(account.MassEditField(3),"Tags");
		TrySelectMultiDropdown(account.SelectMultivalues(3),2,3);
		logger.info("Tags is selected");
		
        TryClick(account.AddFields());
		
		TrySelectDropdown(account.MassEditField(4),"Current Category");
		SelectDropdown(account.SelectSingleValue(1),2);
		logger.info("Business Classification is selected");
		
		 TryClick(account.save());
		 
		 TryClick(account.Yes());
	}
	
}
