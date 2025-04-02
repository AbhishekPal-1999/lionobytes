package com.liono360.WorkflowAccount;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;
import com.liono360.pageObject.LeadPage;
import com.liono360.pageObject.LeadWorkFlowPage;
import com.liono360.pageObject.LoginPage;

public class TC_003EditWorkFlow extends Baseclass {

	@Test
	public void TC003EditWorkFlow() throws InterruptedException, IOException {
		

		//redirectToCRM();

		LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
		CommonMethods commonMethods= new CommonMethods();
		TryClick( workflow.clickMisc());
		logger.info("Clicked Misc.");


		TryClick( workflow.clickWorkFlow());
		logger.info("Clicked workflow");
	    waitUntilPageLoad();
	    
		mouseActionRightClick(driver, workflow.ListedLeads());
		logger.info("right clicked on added workflow");
		Thread.sleep(2000);
		workflow.btnEdit().click();
		logger.info("clicked on edit option");
		TryClick( workflow.selectUsers());
		logger.info("user selected");
		Thread.sleep(1000);
		workflow.setName().clear();
		Thread.sleep(1000);
		workflow.setName().sendKeys("WORKFLOW WFE-"+randomnumber()+" Account");
		logger.info("name added");

		String WorkflowNameToEdit= workflow.setName().getAttribute("value");

		TrySelectDropdown( workflow.SelectModule(),"Account");
		logger.info("module selected");
		workflow.waitUntilPageLoad();

		TrySelectDropdown( workflow.SelectChannel(),"Default Channel");
		logger.info("user selected");
		workflow.waitUntilPageLoad();

		TryClick( workflow.clickTimeBased());
		logger.info("clicked on time based");



		String enddate=commonMethods.EndDate();
		TryClick( workflow.selectStartDate());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[1]")).click();
		}
		catch(Exception e) {}
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[2]")).click();	    }
		catch(Exception e) {}
		logger.info("end date added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		TryClick( workflow.clickNext());
		logger.info("next button clicked");
		
        TryClick( workflow.clickSave1());
	    logger.info("save button clicked and workflow created");
	    
	    
	 //SEARCH WORKFLOW AND RUN SCHEDULER -----------------------------------------------------------------------
	    waitUntilPageLoad();
	    Thread.sleep(1000);
	    workflow.setGlobalSearch().clear();
	    Thread.sleep(1000);
	    workflow.setGlobalSearch().sendKeys(WorkflowNameToEdit);
	    Thread.sleep(1000);
	    logger.info("workflow passed to search");
	    waitUntilPageLoad();
	    
	    String WorkflowNameAfterEdit  = workflow.ListedWorkflow().getText();
	    System.out.println("workflow name to edit: "+WorkflowNameToEdit);
	    System.out.println("workflow name after edit: "+WorkflowNameAfterEdit);
	    
	// ASSERTION--------------------------------------------------------------------------------------------------------
	    
		   if (WorkflowNameToEdit.equals(WorkflowNameAfterEdit)) {
		    	Assert.assertTrue(true);
		    	logger.info("Edit worklow test passed");
		    } 
		    else {
		    	Assert.assertTrue(false);
		    	logger.info("Edit workflow test failed");
		    }
	    }
	
}
