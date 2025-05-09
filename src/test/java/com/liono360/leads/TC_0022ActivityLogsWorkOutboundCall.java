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

public class TC_0022ActivityLogsWorkOutboundCall extends Baseclass{
	
	@Test
	public void TC0011_ActivityLogsPhobeInboundCall() throws InterruptedException, IOException {
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
			   

// Activity Works Inbounds Call====================================================================================================		
		TryClick(leads.Activity_Lead());
		logger.info("clicked on Activity");
		
		TryClick(leads.Add_Logs());
		logger.info("clicked on Add log button");
		
		TryClick(leads.Log_Types());
		Thread.sleep(1000);
		TryClick(leads.Works());
		logger.info("Works Log type Selected");
		
		
		Thread.sleep(2000);
		TryClick(leads.SubTypes());
		TryClick(leads.Outbound());
		logger.info("Outbound Call is Selected");
		
		
		leads.Add_Comments().sendKeys("This comment represent the Works");
		logger.info("Comment is added under Works log type");
		
		TryClick(leads.clickSave());
		logger.info("Clicked on Save button");

// Edit Works Inbounds Call========================================================================================================

		waitUntilPageLoad();
		Thread.sleep(1000);
				
		TryClick(leads.Click_Activity());
		logger.info("Clicked on Activity Record");
				
		TryClick(leads.Edit_Bttn());
		logger.info("Clicked on Edit button");
				
		leads.Add_Comments().clear();
		leads.Add_Comments().sendKeys("This comment represent the Updated Works");
		logger.info("Comment is Updated under Works log type");
				
		leads.Edit_Add_Comments().sendKeys("This comment represent the new comment while edit Works");
		logger.info("New Comment is added under for Works");
				
		TryClick(leads.SaveAllDetails());
		logger.info("Clicked on Save button");

//Delete Works Inbounds Call============================================================================================
		
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
