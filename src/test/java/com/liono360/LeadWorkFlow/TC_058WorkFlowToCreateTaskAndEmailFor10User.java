package com.liono360.LeadWorkFlow;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;

public class TC_058WorkFlowToCreateTaskAndEmailFor10User extends Baseclass {

	@Test
	public void TC_058WorkFlowToCreateTaskAndEmailFor10UserTest() throws InterruptedException, IOException {
		
		redirectToCRM();
		
		CommonMethods commonMethods= new CommonMethods();

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

		workflow.setName().sendKeys("WorkFlow"+randomnumber()+"For10User");
		logger.info("name added");

		String WorkflowNameToCreate= workflow.setName().getAttribute("value");

		workflow.selectUsers().click();
		driver.findElement(By.xpath("//span[text()='Satyendra Bhardwaj']")).click();
		logger.info("user selected");

		workflow.SelectModule().click();
		driver.findElement(By.xpath("//span[text()='Lead']")).click();
		logger.info("module selected");
		Thread.sleep(2000);

		workflow.SelectChannel().click();
		driver.findElement(By.xpath("//span[text()='Default Channel']")).click();
		logger.info("user selected");
		Thread.sleep(2000);

		
		String startdate=commonMethods.StartDate();
		String enddate=commonMethods.EndDate();
		
		workflow.selectStartDate().click();
		try {
			driver.findElement(By.xpath("(//span[text()='"+startdate+"'])[1]")).click();
			driver.findElement(By.xpath("(//span[text()='"+startdate+"'])[2]")).click();
		}
		catch(Exception e) {}
		logger.info("start date added");
		Thread.sleep(2000);

		workflow.selectEndDate().click();
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[1]")).click();
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[2]")).click();
		}
		catch(Exception e) {}
		logger.info("end date added");
		//Thread.sleep(2000);

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
	    driver.findElement(By.xpath("//span[text()='Lead Number']")).click();
	    logger.info("filter added");
	    Thread.sleep(500);
	    
	    workflow.selectOperator().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("operator added");
	    Thread.sleep(500);
	    
	    workflow.setConditionvalue().sendKeys("5");
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
	  for(int i=1;i<=10;i++) {
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("add actions button clicked ");
	    Thread.sleep(500);
	    
	    workflow.selectAssignType().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("assign type added");
	    Thread.sleep(500);
	    
	    workflow.selectTaskUsers().click();
	    Thread.sleep(500);
	    String UserName=driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem["+(84-i)+"]//li")).getText();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem["+(84-i)+"]//li")).click();
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
	    
	
	    workflow.setDescription().sendKeys("this task is assigned to----> "+UserName);
	    logger.info("Description added");
	    Thread.sleep(500);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    Thread.sleep(500);
	  }  
	  
// ADD TIME DEPENDENT ACTIONS HERE(EMAIL ALERT)-------------------------------------------------------------------	    
	 
	  for(int i=1;i<=5;i++) { 
	  String userName =null;
	  if(i==1) userName="Satyendra Bhardwaj";
	  if(i==2) userName="Nisha ";
	  if(i==3) userName="Ruchika jaiswal";
	  if(i==4) userName="Sundar  Pichai";
	  if(i==5) userName="Sayli ";
	  createEmailElert(userName);
	 
	  }
	  Thread.sleep(4000);
	  jsScroll(driver, workflow.clickSave1());
	  Thread.sleep(4000);
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
	    
	    commonMethods.CreateLeadForCreated(ruleValue);
	    
	    boolean ActionStatusInHistory=commonMethods.CheckActionStatusInHistory();
	    boolean ActionStatusInCreatedLead=commonMethods.CheckActionStatusforCreatedLeadInCreated();
	   
	    
	    System.out.println("workflow name to create: "+WorkflowNameToCreate);
	    System.out.println("workflow name after create: "+WorkflowNameAfterCreate);
	    System.out.println(ActionStatusInHistory+" "+ActionStatusInCreatedLead);
	    
	    if(WorkflowNameToCreate.equals(WorkflowNameAfterCreate)) {
	    	if(ActionStatusInHistory) {
	    		  logger.info("workflow is created and instant actions are also triggered in history");
	    	}
	    	else {logger.info("workflow is created but instant actions are not triggered history");}
	    	
	    	if(ActionStatusInCreatedLead) {
	    		  logger.info("workflow is created and actions are also created  for newly created lead ");
	    	}
	    	else {logger.info("workflow is created  but actions are not created  for newly created lead");}
	    	
	    }
	    
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(0));
	    
	    workflow.clickOverView().click();
	    logger.info("clicked overview");
	    Thread.sleep(500);
	    
	    workflow.stopScheduler().click();
	    logger.info("clicked stop scheduler");
	    Thread.sleep(500);
	    
	    workflow.clickYes().click();
	    logger.info("clicked yes button");
	    Thread.sleep(3000);

	    
// ASSERTION--------------------------------------------------------------------------------------------------------
	    
	   if (WorkflowNameToCreate.equals(WorkflowNameAfterCreate)&&ActionStatusInHistory&&ActionStatusInCreatedLead) {
	    	Assert.assertTrue(true);
	    	logger.info("Add worklow test passed");
	    } 
	    else {
	    	Assert.assertTrue(false);
	    	captureScreen(driver, "add work flow");
	    	logger.info("Add workflow test failed");
	    }
	    
	}
	
	public void createEmailElert(String user) throws InterruptedException {
		
		LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
		
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
	    driver.findElement(By.xpath("//span[text()='"+user+"']")).click();
	    logger.info("sent to selected ");
	    Thread.sleep(500);
	    
	    workflow.SelectTemplate().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
	    logger.info("template selected ");
	    Thread.sleep(500);
	    
	    
	    workflow.setSubject().clear();
	    workflow.setSubject().sendKeys("this email elert Sent To--->"+user);
	    logger.info("text added in email body selected ");
	    Thread.sleep(500);
	    
	    String path=System.getProperty("user.dir") + "\\TestData\\test1.png";
	    workflow.SetAttachment().sendKeys(path);
	    logger.info("attachment added");
	    Thread.sleep(2000);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    Thread.sleep(8000);
	   
	}
}
