package com.liono360.LeadWorkFlow;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;

public class TC_002CreateWorkFlowWithLeadNameRule extends Baseclass{

	@Test
	public void TC_002CreateWorkFlowWithLeadNameRuleTest() throws InterruptedException, IOException {
		
        redirectToCRM();
		
        LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
		
        workflow.clickMisc().click();
        logger.info("Clicked Misc.");
		Thread.sleep(2000);
		
		workflow.clickWorkFlow().click();
		logger.info("Clicked workflow");
	    Thread.sleep(10000);
      
	    workflow.clickNew().click();
	    logger.info("Clicked new buuton");
	    Thread.sleep(10000);
	    
//CREATE WORK FLOW ----------------------------------------------------------------------------------------------	    
	    
	    workflow.setName().sendKeys("WorkFlow"+randomnumber()+"onLeadNameRule");
	    logger.info("name added");
	    
	    String WorkflowNameToCreate= workflow.setName().getAttribute("value");
	    
	    workflow.selectUsers().click();
	    //driver.findElement(By.xpath("//span[text()='Satyendra Bhardwaj']")).click();
	    logger.info("user selected");
	    
	    workflow.SelectModule().click();
	    driver.findElement(By.xpath("//span[text()='Lead']")).click();
	    logger.info("module selected");
	    Thread.sleep(2000);
	    
	    workflow.SelectChannel().click();
	    driver.findElement(By.xpath("//span[text()='Default Channel']")).click();
	    logger.info("user selected");
	    Thread.sleep(2000);
	    
	    workflow.selectStartDate().click();
	    try {
	    driver.findElement(By.xpath("(//span[text()='29'])[2]")).click();
	    driver.findElement(By.xpath("(//span[text()='29'])[1]")).click();
	    }
	    catch(Exception e) {}
	    logger.info("start date added");
	    Thread.sleep(2000);
	    
	    workflow.selectEndDate().click();
	    try {
	    driver.findElement(By.xpath("(//span[text()='30'])[2]")).click();
	    driver.findElement(By.xpath("(//span[text()='30'])[1]")).click();
	    }
	    catch(Exception e) {}
	    logger.info("end date added");
	    Thread.sleep(2000);
	    
	    workflow.clickNext().click();
	    logger.info("next button clicked");
	    Thread.sleep(2000);
	    
// ADD MANUAL CONDITOON HERE------------------------------------------------------------------------------------
	    
	    workflow.clickManualCondition().click();
	    logger.info("manual condition clicked");
	    Thread.sleep(4000);
	    
	    workflow.clickPlus().click();
	    logger.info("plus button clicked");
	    Thread.sleep(4000);
	    
	    workflow.SelectFilter().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Lead Name']")).click();
	    logger.info("filter added");
	    Thread.sleep(500);
	    
	    workflow.selectOperator().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("operator added");
	    Thread.sleep(500);
	    
//	    workflow.selectRuleValue().click();
//	    Thread.sleep(500);
//	    driver.findElement(By.xpath("//span[text()='Congo']")).click();
//	    logger.info("operator added");
//	    Thread.sleep(500);
	    
	    workflow.setConditionvalue().sendKeys(randomnumber());
	    logger.info("value added");
	    Thread.sleep(500);
	    String ruleValue= workflow.setConditionvalue().getAttribute("value");
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    Thread.sleep(500);
	    
// ADD TRIGER TIME ---------------------------------------------------------------------------------------------
	    
	    workflow.clickTrigger().click();
	    logger.info("trigger button clicked");
	    Thread.sleep(4000);
	    
	    workflow.setValue().sendKeys("30");
	    logger.info("trigger value adeded ");
	    Thread.sleep(500);
	    
	    workflow.selectDays().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[6]//li")).click();
	    logger.info("trigger unit adeded ");
	    Thread.sleep(500);
	    
	    workflow.selectAfter().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("trigger status adeded ");
	    Thread.sleep(500);
	    
	    workflow.selectExecutaionDate().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("trigger execution date adeded ");
	    Thread.sleep(500);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    Thread.sleep(500);
	    
// ADD INSTANT ACTION HERE(TASK)--------------------------------------------------------------------------------------------
	    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("add actions button clicked ");
	    Thread.sleep(500);
	    
	    workflow.selectAssignType().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("assign type added");
	    Thread.sleep(500);
	    
	    workflow.selectTaskUsers().click();
	    driver.findElement(By.xpath("//div[text()='Satyendra Bhardwaj']")).click();
	    logger.info("user added");
	    Thread.sleep(500);
	    
	    workflow.selectcatagory().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("catagory added ");
	    Thread.sleep(500);
	    
	    workflow.selectReminderType().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("reminder type added");
	    Thread.sleep(500);
	    
	    workflow.selectReminder().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("reminder added ");
	    Thread.sleep(500);
	    
	    workflow.selectRepeatType().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("repeatType added ");
	    Thread.sleep(500);
	    
	    workflow.selectPriority().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("priority added");
	    Thread.sleep(500);
	    
	    workflow.setTaskEndDays().clear();
	    workflow.setTaskEndDays().sendKeys("3");
	    logger.info("task end days added");
	    Thread.sleep(500);
	    
	
	    workflow.setDescription().sendKeys("this is instant actions and generated by workflow");
	    logger.info("Description added");
	    Thread.sleep(500);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    Thread.sleep(500);
	    
// ADD TIME DEPENDENT ACTIONS HERE(EMAIL ALERT)-------------------------------------------------------------------	    
	    
	    workflow.TimeDependentActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
	    logger.info("add actions button clicked ");
	    Thread.sleep(500);
	    
	    workflow.selectAssignTypeTimeDependent().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("assign type added ");
	    Thread.sleep(500);
	    
	    workflow.selectSentTo().click();
	    driver.findElement(By.xpath("//p-treenode//button")).click();
	    driver.findElement(By.xpath("(//p-treenode//button)[4]")).click();
	    driver.findElement(By.xpath("//span[text()='Satyendra Bhardwaj']")).click();
	    logger.info("sent to selected ");
	    Thread.sleep(500);
	    
	    workflow.SelectTemplate().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
	    logger.info("template selected ");
	    Thread.sleep(500);
	    
	    workflow.setEmailBody().sendKeys("this is automotion generated ermail for testing purpose");
	    logger.info("text added in email body selected ");
	    Thread.sleep(500);
	    
	    String path=System.getProperty("user.dir") + "\\TestData\\test1.png";
	    workflow.SetAttachment().sendKeys(path);
	    logger.info("attachment added");
	    Thread.sleep(2000);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    Thread.sleep(8000);
	    
	    workflow.clickSave1().click();
	    logger.info("save button clicked and workflow created");
	    Thread.sleep(15000);
	    String WorkflowNameAfterCreate  = workflow.ListedWorkflow().getText();

//SEARCH CREATED WORKFLOW AND RUN SCHEDULER -----------------------------------------------------------------------
	    
	    workflow.setGlobalSearch().sendKeys(WorkflowNameAfterCreate);
	    logger.info("workflow passed to search");
	    Thread.sleep(15000);
	    
	    workflow.ListedWorkflow().click();
	    logger.info("clicked on listed workflow ");
	    Thread.sleep(5000);

	    workflow.clickRunScheduler().click();
	    logger.info("clicked run scheduler");
	    Thread.sleep(500);
	    
	    workflow.clickYes().click();
	    logger.info("clicked yes button");
	    Thread.sleep(10000);
	    
	 
	    
// VERIFY THAT WORKFLOW CREATED AND WORKING FINE OR NOT---------------------------------------------------
	    
	    boolean taskCreated=  CreateLead(ruleValue);
	    
	    boolean CheckInstantActionStatus= CheckInstantActionStatus(WorkflowNameToCreate);
	    
	    boolean CheckTimeDependentActionStatus= CheckTimeDependentActionStatus();
	    
	    System.out.println("workflow name to create: "+WorkflowNameToCreate);
	    System.out.println("workflow name after create: "+WorkflowNameAfterCreate);
	    
	    workflow.clickOverView().click();
	    logger.info("clicked overview");
	    Thread.sleep(500);
	    
	    workflow.stopScheduler().click();
	    logger.info("clicked stop scheduler");
	    Thread.sleep(500);
	    
	    workflow.clickYes().click();
	    logger.info("clicked yes button");
	    Thread.sleep(3000);

	    if(WorkflowNameToCreate.equals(WorkflowNameAfterCreate)) {
	    	if(taskCreated&&CheckInstantActionStatus) {
	    		  logger.info("workflow is created and instant actions are also triggered");
	    	}
	    	else {logger.info("workflow is created but instant actions are not triggered");}
	    	
	    	if(CheckTimeDependentActionStatus) {
	    		  logger.info("workflow is created and time dependent actions are also triggered");
	    	}
	    	else {logger.info("workflow is created but time dependent actions are not triggered");}
	    }
	    
// ASSERTION--------------------------------------------------------------------------------------------------------
	    
	   if (WorkflowNameToCreate.equals(WorkflowNameAfterCreate)&&taskCreated&&CheckInstantActionStatus&&CheckTimeDependentActionStatus) {
	    	Assert.assertTrue(true);
	    	logger.info("Add worklow test passed");
	    } 
	    else {
	    	Assert.assertTrue(false);
	    	captureScreen(driver, "add work flow");
	    	logger.info("Add workflow test failed");
	    }
	    
	}
	
	
// METHOD TO CREATE NEW LEAD--------------------------------------------------------------------------------------	
	
     public boolean CreateLead(String ruleValue )throws InterruptedException {
		   
    	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
    	 
    	workflow.clickLeads().click();
 	    logger.info("clicked lead");
 	    Thread.sleep(10000); 
 	    
 	    workflow.clickNew().click();
	    logger.info("Clicked new buuton");
	    Thread.sleep(8000);
	    
	    workflow.setFirstname().sendKeys("MyWorkFlowLead"+randomnumber());
	    logger.info("first name added");
	    Thread.sleep(500);
	    
	    String LeadName=  workflow.setFirstname().getAttribute("value");
	    
	    workflow.setLeadName().sendKeys(ruleValue);
	    logger.info("lead name added");
	    Thread.sleep(3000);
	    
	    workflow.clickSave1().click();
	    logger.info("save button clicked ");
	    Thread.sleep(25000);
	    
	    workflow.setGlobalSearch().sendKeys(LeadName);
	    logger.info("lead name passed to global search ");
	    Thread.sleep(12000);
	    
	    workflow.ListedLeads().click();
	    logger.info("clicked on listed leads");
	    Thread.sleep(10000);
	    
	    workflow.clickTask().click();
	    logger.info("clicked on task");
	    Thread.sleep(10000);
	    
	    
	    for(int i=1;i<=12;i++) {
	    	workflow.clickRefresh().click();
		    logger.info("clicked on refresh");
		    Thread.sleep(10000);
	    try{
	    if( workflow.ListedTtask().isDisplayed()) {
	    	
	    	return true;
	    	
	    }}
	    catch(Exception e) {}}
    	return false; 
	}
     
 
//CHECK EXECUTION STATUS IN WORKFLOW HISTORY----------------------------------------------------------------------
     
     public boolean CheckInstantActionStatus(String WorkflowNameToCreate) throws InterruptedException {
    	 
    	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

    	 workflow.clickMisc().click();
    	 logger.info("Clicked Misc.");
    	 Thread.sleep(2000);

    	 workflow.clickWorkFlow().click();
    	 logger.info("Clicked workflow");
    	 Thread.sleep(10000);

    	 workflow.setGlobalSearch().sendKeys(WorkflowNameToCreate);
    	 logger.info("workflow passed to search");
    	 Thread.sleep(15000);

    	 workflow.ListedWorkflow().click();
    	 logger.info("clicked on listed workflow");
    	 Thread.sleep(5000);
    	 
    	 workflow.clickHistory().click();
    	 logger.info("clicked on history");
    	 Thread.sleep(5000);
    	 
    	 workflow.SelectActionTypeFilter().click();
    	 driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
    	 logger.info("action type filter added");
    	 Thread.sleep(500);

    	 workflow.SelectfilterStatus().click();
    	 driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
    	 logger.info("status filter added");
    	 Thread.sleep(2000);
    	 
    	 try{
    		    if( workflow.executedEvent().isDisplayed()) {
    		    	return true;
    		    }}
    		    catch(Exception e) {}
    	    	return false; 
    		}
	
     
     public boolean CheckTimeDependentActionStatus() throws InterruptedException {
    	 
    	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver); 
    	 
    	 workflow.RefreshWorkflow().click();
    	 logger.info("clicked refresh button");
    	 Thread.sleep(2000);

    	 
    	 workflow.SelectActionTypeFilter().click();
    	 driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
    	 logger.info("action type filter added");
    	 Thread.sleep(500);

    	 workflow.SelectfilterStatus().click();
    	 driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
    	 logger.info("status filter added");
    	 Thread.sleep(2000);
    	 
    	 workflow.RefreshWorkflow().click();
    	 logger.info("clicked refresh button");
    	 Thread.sleep(2000);
    	 
    	 try{
    		    if( workflow.executedEvent().isDisplayed()) {
    		    	return true;
    		    }}
    		    catch(Exception e) {}
    	    	return false; 
    		}
    	 
     
}
