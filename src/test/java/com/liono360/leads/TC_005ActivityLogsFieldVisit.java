package com.liono360.leads;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_005ActivityLogsFieldVisit extends Baseclass{
	
	@Test
	public void TC002_ViewLead() throws InterruptedException, IOException {
		//redirectToCRM();

		LeadPage leads = new LeadPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();
		
		waitUntilPageLoad();
		Thread.sleep(2000);
		
		TryClick(leads.clickLead());
		logger.info("Clicked on Lead ");

		waitUntilPageLoad();
		Thread.sleep(5000);
		
		TryClick(leads.listedLeads());
		logger.info("clicked on view option");
		
	   

// Activity Field Visit====================================================================================================		
		TryClick(leads.Activity_Lead());
		logger.info("clicked on Activity");
		
		TryClick(leads.Add_Logs());
		logger.info("clicked on Add log button");
		
		TryClick(leads.Log_Types());
		Thread.sleep(1000);
		TryClick(leads.Select_Field_Visit());
		logger.info("Field Visit Log type Selected");
		
		leads.Add_Comments().sendKeys("This comment represent the Fild Visit");
		logger.info("Comment is added under field visit log type");
		
		TryClick(leads.clickSave());
		logger.info("Clicked on Save button");

// Edit Field Visit========================================================================================================

		waitUntilPageLoad();
		Thread.sleep(1000);
				
		TryClick(leads.Click_Activity());
		logger.info("Clicked on Activity Record");
				
		TryClick(leads.Edit_Bttn());
		logger.info("Clicked on Edit button");
				
		leads.Add_Comments().clear();
		leads.Add_Comments().sendKeys("This comment represent the Updated Field Visit");
		logger.info("Comment is Updated under Field Visit log type");
				
		leads.Edit_Add_Comments().sendKeys("This comment represent the new comment while edit Field Visit");
		logger.info("New Comment is added under Note log for Field Visit");
				
		TryClick(leads.SaveAllDetails());
		logger.info("Clicked on Save button");

//Delete Field Visit============================================================================================
		waitUntilPageLoad();
		Thread.sleep(1000);
				
		TryClick(leads.Click_Activity());
		logger.info("Clicked on Activity Record");
				
		TryClick(leads.DeleteLog());
		logger.info("Clicked on Delete button");
				
		TryClick(leads.btnYes());
		logger.info("Clicked on yes button to delete the log");
						
		
	}
	

}
