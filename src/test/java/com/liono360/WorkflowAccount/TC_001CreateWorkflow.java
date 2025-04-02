package com.liono360.WorkflowAccount;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;

public class TC_001CreateWorkflow extends Baseclass{
	
@Test	
public void TC001CreateAccountWorkflow() throws InterruptedException, IOException {
	

	//redirectToCRM();

	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
	CommonMethods commonMethods= new CommonMethods();
	TryClick( workflow.clickMisc());
	logger.info("Clicked Misc.");


	TryClick( workflow.clickWorkFlow());
	logger.info("Clicked workflow");

//CREATE WORK FLOW ----------------------------------------------------------------------------------------------	    

	TryClick( workflow.clickNew());
	logger.info("Clicked new buuton");
	waitUntilPageLoad();

	workflow.setName().sendKeys("WORKFLOW WF-"+randomnumber()+" Account");
	logger.info("name added");

	String WorkflowNameToCreate= workflow.setName().getAttribute("value");

	TryClick( workflow.selectUsers());
	//driver.findElement(By.xpath("//span[text()='Satyendra Bhardwaj']")).click();
	logger.info("user selected");

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
	

// ADD MANUAL CONDITOON HERE------------------------------------------------------------------------------------

	TryClick( workflow.clickManualCondition());
	logger.info("manual condition clicked");


	TryClick( workflow.clickPlus());
	logger.info("plus button clicked");
	
	
	TryLionoTreeSelect(workflow.Filter(), workflow.Search(), "Country");
	logger.info("Country field selected");
	
	TrySelectDropdown(workflow.operator(),"IsEqualTo");
	logger.info("Operator is selected");
	
	TrySelectDropdown(workflow.SelectOperatorValue(),"USA");
	logger.info("Rule value is added");
	
	
	
	TryClick(workflow.clickSave2());
	logger.info("Clicked save button");
	
	TryClick(workflow.clickPreviewdata());
	logger.info("clicked preview");
	
	TryClick(workflow.clickCancel2());
	logger.info("clicked cancel");
	
//// ADD INSTANT ACTION HERE(TASK)--------------------------------------------------------------------------------------------
//	
//	TrySelectDropdown(workflow.clickAddActions(), "Add Task");
//    logger.info("add actions button clicked ");
// 
//    SelectDropdown(workflow.selectAssignType(),1);
//    logger.info("assign type added");
//    
//    SelectDropdown(workflow.selectTaskUsers(),1);
//    logger.info("user added");
//    SelectDropdown(workflow.selectcatagory(),1);
//    logger.info("catagory added");
//   
//    SelectDropdown(workflow.selectReminderType(),1);
//    logger.info("reminder type added");
//   
//
//    SelectDropdown(workflow.selectReminder(),1);
//    logger.info("reminder added ");
//   
//    SelectDropdown(workflow.selectRepeatType(),1);
//    logger.info("repeatType added ");
//    
//    SelectDropdown(workflow.selectPriority(),1);
//    logger.info("priority added");
//   
//    workflow.setTaskEndDays().clear();
//    workflow.setTaskEndDays().sendKeys("3");
//    logger.info("task end days added");
//   
//    workflow.setDescription().sendKeys("this is instant actions and generated by workflow");
//    logger.info("Description added");
// 
//    TryClick(workflow.AddChecklists());
//    logger.info("clicked add checklists button");
//    
//    workflow.check1().sendKeys("checklist-1");   
//    logger.info("checklist saved");
//    
//    TryClick(workflow.clickSave3());
//    logger.info("checklist saved");
//    
//    TryClick(workflow.clickSave2());
//    logger.info("save button clicked");
    
//ADD INSTANT ACTIONS HERE(EMAIL ALERT)-------------------------------------------------------------------	    
//    
//    SelectDropdown(workflow.clickAddActions(),2);
//    logger.info("add actions button clicked ");
//    
//    SelectDropdown(workflow.selectAssignTypeTimeDependent(),1);
//    logger.info("assign type added ");
//  
//    TryClick( workflow.selectSentTo());
//   
//    SelectDropdown(workflow.SelectTemplate(), 1);
//    logger.info("template selected ");
//
//
//    String path=System.getProperty("user.dir") + "\\TestData\\test1.png";
//    workflow.SetAttachment().sendKeys(path);
//    logger.info("attachment added");
//    Thread.sleep(2000);
//
//    waitUntilPageLoad();
//    TryClick( workflow.clickSave2());
//    logger.info("save button clicked");
//    waitUntilPageLoad();
//    
//   
//    
// ADD INSTANT ACTION HERE(Update Field)----------------------------------------------------------------
       
    TrySelectDropdown(workflow.clickAddActions(), "Update Field");
    logger.info("add actions button clicked ");
    
    TrySelectDropdown(workflow.SelectField(), "Account Type(s)");
    logger.info("Lead Type(s) field selected");
   
    TrySelectMultiDropdown(workflow.selectMultipleField(), 1, 2);
    logger.info("update field added");
    
    TryClick( workflow.clickSave2());
    logger.info("save button clicked");
    
    TryClick( workflow.clickSave1());
    logger.info("save button clicked and workflow created");
    waitUntilPageLoad();
    String WorkflowNameAfterCreate  = workflow.ListedWorkflow().getText();
    
 //SEARCH WORKFLOW AND RUN SCHEDULER -----------------------------------------------------------------------
    workflow.setGlobalSearch().clear();
    workflow.setGlobalSearch().sendKeys(WorkflowNameAfterCreate);
    logger.info("workflow passed to search");
    waitUntilPageLoad();

    System.out.println("workflow name to create: "+WorkflowNameToCreate);
    System.out.println("workflow name after create: "+WorkflowNameAfterCreate);
    
// ASSERTION--------------------------------------------------------------------------------------------------------
    
	   if (WorkflowNameToCreate.equals(WorkflowNameAfterCreate)) {
	    	Assert.assertTrue(true);
	    	logger.info("Add worklow test passed");
	    } 
	    else {
	    	Assert.assertTrue(false);
	    	logger.info("Add workflow test failed");
	    }
    }

}
