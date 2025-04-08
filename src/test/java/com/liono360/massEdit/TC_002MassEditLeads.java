package com.liono360.massEdit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.MassEditPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_002MassEditLeads extends Baseclass{


	@Test
public void TC002MassEditleads() throws InterruptedException, IOException {
		
		//redirectToCRM();
// Dynamic fields:
		
		WebElement LoaderIcon = driver.findElement(By.xpath("//div[@class=\"splash-loader\"]"));
		
		MassEditPage lead = new MassEditPage(driver);
		Faker faker = new Faker();
		ExcelDataProvider exceldata=new ExcelDataProvider();
		TryClick(lead.Leads());
		
		logger.info("Clicked on lead button");
		TryClick(lead.ActionButton());
		
		logger.info("Clicked on Action button");
	
		TryClick(lead.MassEdit());
		
		logger.info("Mass edit clicked");
		
		TryClick(lead.addRules());
		logger.info("Add rules button clicked");
		
		TryLionoTreeSelect(lead.Filter(), lead.Search(), "Country");
		logger.info("Country field selected");
		
		SelectDropdown(lead.operator(),1);
		logger.info("Operator is selected");
		
		TrySelectDropdown(lead.SelectOperatorValue(),"Nepal");
		logger.info("Rule value is added");
		
		TryClick(lead.save());
		logger.info("Clicked save button");
		
		TryClick(lead.nextButton());
		logger.info("Clicked save button");
		
// Add fields and value------------------------------------
		TrySelectDropdown(lead.MassEditField(1),"Lead Type(s)");
		TrySelectMultiDropdown(lead.SelectMultivalues(1),1,2);
		logger.info("lead types is selected");
		
		TryClick(lead.AddFields());
		
		TrySelectDropdown(lead.MassEditField(2),"Job Function");
		TrySelectMultiDropdown(lead.SelectMultivalues(2),1,2);
		logger.info("Job function is selected");
		
        TryClick(lead.AddFields());
        
        TrySelectDropdown(lead.MassEditField(3),"Tags");
		TrySelectMultiDropdown(lead.SelectMultivalues(3),2,3);
		logger.info("Tags is selected");
		
        TryClick(lead.AddFields());
		
		TrySelectDropdown(lead.MassEditField(4),"Current Stage");
		SelectDropdown(lead.SelectSingleValue(1),2);
		logger.info("Stage is selected");
		
		 TryClick(lead.save());
		 
		 TryClick(lead.Yes());
	}
}
