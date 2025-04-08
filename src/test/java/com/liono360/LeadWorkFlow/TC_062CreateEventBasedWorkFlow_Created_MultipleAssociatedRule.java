package com.liono360.LeadWorkFlow;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;

public class TC_062CreateEventBasedWorkFlow_Created_MultipleAssociatedRule extends Baseclass {

	@Test
	public void TC_062CreateEventBasedWorkFlow_Created_MultipleAssociatedRuleTest() throws InterruptedException, IOException {
		
		redirectToCRM();
		
		CommonMethods commonMethods= new CommonMethods();

		LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

		workflow.clickMisc().click();
		logger.info("Clicked Misc.");
		Thread.sleep(2000);

		workflow.clickWorkFlow().click();
		logger.info("Clicked workflow");
		Thread.sleep(10000);

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(workflow.clickLeads()).keyUp(Keys.CONTROL).perform();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(4000);
	    
//CREATE WORK FLOW ----------------------------------------------------------------------------------------------	    

		workflow.clickNew().click();
		logger.info("Clicked new button");
		Thread.sleep(10000);
		
		workflow.setName().sendKeys("WorkFlow"+randomnumber()+"WithMultipleAssociatedRule");
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
		
// ADD MANUAL CONDITION AND ASSOCIATED RULE HERE------------------------------------------------------------------------------------
	    
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
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[7]//li")).click();
	    logger.info("operator added");
	    Thread.sleep(500);
	    
	    workflow.ClickAssociatedModule().click();
	    logger.info(" clicked associated module ");
	    Thread.sleep(3000);
	    
	    workflow.selectAssociatedModule().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("module  added");
	    Thread.sleep(500);
	    
	    workflow.SelectTemplate().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("template added added");
	    Thread.sleep(500);
	    
//1.
		    workflow.SelectFilter2().click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//span[text()='Middle Initial']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.selectOperator2().click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		    logger.info("operator added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue2().sendKeys("MiddleName"+randomnumber());
		    logger.info("value added");
		    Thread.sleep(500);
		    String MiddleInitial = workflow.setConditionvalue2().getAttribute("value");
		    
//2.  
		    workflow.AddMoreAssociatedRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(1000);	
		    
		    workflow.SelectFilter3().click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//span[text()='Last Name']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue3().sendKeys("LasName"+randomnumber());
		    logger.info("value added");
		    Thread.sleep(500);
		    String Lastname = workflow.setConditionvalue3().getAttribute("value");


		    
//4.
		    workflow.AddMoreAssociatedRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(1000);	
		    
		    workflow.SelectFilter4().click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//span[text()='Work Email']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue4().sendKeys("workemail"+randomnumber()+"@lionobytes.com");
		    logger.info("value added");
		    Thread.sleep(500);
		    String WorkEmail = workflow.setConditionvalue4().getAttribute("value");
		    
//5.
		    workflow.AddMoreAssociatedRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(1000);	
		    
		    workflow.SelectFilter5().click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//span[text()='Title']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    driver.findElement(By.xpath("(//p-dropdown[@placeholder=\"Select Items\"])[1]")).click();
		    Thread.sleep(500);
		    String title= driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).getText();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		    Thread.sleep(500);
//6. 
		    workflow.AddMoreAssociatedRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(1000);	
		    
		    workflow.SelectFilter6().click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//span[text()='Home Email']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue5().sendKeys("homeemail"+randomnumber()+"@lionobytes.com");
		    logger.info("value added");
		    Thread.sleep(500);
		    String HomeEmail = workflow.setConditionvalue5().getAttribute("value");
		    Thread.sleep(500);

		    
		    workflow.selectMultipleRuleValue().click();
		    Thread.sleep(2000);
		    String jobFunction= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
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
	    
	
	    workflow.setDescription().sendKeys("this instant action is generated by workflow: "+WorkflowNameToCreate);
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
	    
	    
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(400);
	    commonMethods.CreateNewLeadMultipleAssociatedRule(MiddleInitial,Lastname,WorkEmail,title,HomeEmail,jobFunction);	    
	    driver.switchTo().window(tabs.get(0));
	    boolean ActionStatusInHistory=commonMethods.CheckActionStatusInHistory();
	    boolean ActionStatusInCreatedLead=commonMethods.CheckActionStatusforCreatedLeadInCreated();
	    
	    
	    System.out.println("workflow name to create: "+WorkflowNameToCreate);
	    System.out.println("workflow name after create: "+WorkflowNameAfterCreate);
	    System.out.println(ActionStatusInHistory+" "+ActionStatusInCreatedLead);
	    
	    if(WorkflowNameToCreate.equals(WorkflowNameAfterCreate)) {
	    	if(ActionStatusInHistory) {
	    		  logger.info("workflow is created and  actions are also triggered in history");
	    	}
	    	else {logger.info("workflow is created but  actions are not triggered history");}
	    	
	    	if(ActionStatusInCreatedLead) {
	    		  logger.info("workflow is created and actions are also created  for newly created lead ");
	    	}
	    	else {logger.info("workflow is created  but actions are not created  for newly created lead");}
	    	
	   
	    }
	    
        
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

}
