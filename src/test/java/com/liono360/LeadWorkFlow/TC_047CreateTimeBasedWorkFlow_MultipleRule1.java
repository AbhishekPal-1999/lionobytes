package com.liono360.LeadWorkFlow;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;

public class TC_047CreateTimeBasedWorkFlow_MultipleRule1 extends Baseclass {

	@Test
	public void TC_047CreateTimeBasedWorkFlow_MultipleRule1Test() throws InterruptedException, IOException, TimeoutException {
		
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
		
		workflow.setName().sendKeys("WorkFlow"+randomnumber()+"WithMultipleRule");
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
		
		workflow.clickTimeBased().click();
		logger.info("time based button clicked");
	    Thread.sleep(500);
	    
	    workflow.setTimeBasedValue().clear();
	    workflow.setTimeBasedValue().sendKeys("30");
		logger.info("time added for time based workflow");
	    Thread.sleep(500);
	    
	    workflow.selectBaseTime().click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[6]//li")).click();
		logger.info("time unit added for time based workflow");
	    Thread.sleep(500);
		
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
		
				for(int i=1;i<=5;i++) {
			    	workflow.clickManualCondition().click();
			 	    logger.info("manual condition "+i+" added");
			 	    Thread.sleep(1000);
			    }
				
		//ADD FILTERS IN MANUAL CONDITION 1--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
				
				workflow.PlusButton1().click();
				logger.info("plus button clicked");
				Thread.sleep(2000);	
		//1.	   
			    
			    workflow.SelectFilter().click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//span[text()='Lead Name']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectOperator().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
			    logger.info("operator added");
			    Thread.sleep(500);
			    
			    workflow.setConditionvalue().sendKeys("Lionobytes Lead"+randomnumber()+"Pvt. Ltd.");
			    logger.info("value added");
			    Thread.sleep(500);
			    String leadname = workflow.setConditionvalue().getAttribute("value");
			    
		//2.  
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter2().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Lead Number']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.setConditionvalue2().sendKeys(randomnumber());
			    logger.info("value added");
			    Thread.sleep(500);
			    String leadNumber = workflow.setConditionvalue2().getAttribute("value");
			    System.out.println(leadname + leadNumber);
		//3.
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter3().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Lead Email']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.setConditionvalue3().sendKeys("lead"+randomnumber()+"@lionobytes.com");
			    logger.info("value added");
			    Thread.sleep(500);
			    String LeadEmail = workflow.setConditionvalue3().getAttribute("value");
			    
		//4.
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter4().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Lead Phone']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.setConditionvalue4().sendKeys("991877564"+randomnumber());
			    logger.info("value added");
			    Thread.sleep(500);
			    String leadPhone = workflow.setConditionvalue4().getAttribute("value");
			    
		//5.  
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter5().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Lead Source']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			   
			    workflow.selectOperator5().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
			    logger.info("operator added");
			    Thread.sleep(500);
			    
			    workflow.clickSave2().click();
			    logger.info("save button clicked");
			    Thread.sleep(500);
			  
		//ADD FILTERS IN MANUAL CONDITION 2--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	    

			    workflow.PlusButton2().click();
			    logger.info("plus button clicked");
			    Thread.sleep(2000);	
			    
		//1.
			    
			    workflow.SelectFilter().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Lead Type(s)']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectMultipleRuleValue().click();
			    Thread.sleep(2000);
			    String LeadType= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
			    Thread.sleep(500);
			    
		//2. 
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter2().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Lead Source']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectMultipleRuleValue2().click();
			    Thread.sleep(2000);
			    String leadSource= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
			    Thread.sleep(500);

		//3 	 
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter3().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Number of Employees']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectMultipleRuleValue3().click();
			    Thread.sleep(2000);
			    String NumberofEmployees= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
			    Thread.sleep(500);
			    
		//4.    
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter4().click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//span[text()='Lead Name']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectOperator4().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[5]//li")).click();
			    logger.info("operator added");
			    Thread.sleep(500);
			    
			    workflow.setConditionvalue().sendKeys("Lionobytes Lead");
			    logger.info("value added");
			    Thread.sleep(500);
			    
			    workflow.clickSave2().click();
			    logger.info("save button clicked");
			    Thread.sleep(500);
			    
		//ADD FILTERS IN MANUAL CONDITION 3--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	    
			    
			    workflow.PlusButton3().click();
			    logger.info("plus button clicked");
			    Thread.sleep(2000);	
		//1.	    
			   
			    workflow.SelectFilter().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Stage']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectMultipleRuleValue().click();
			    Thread.sleep(2000);
			    String Stage= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
			    Thread.sleep(500);
			    
		//2.
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter2().click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//span[text()='Time  zone']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectMultipleRuleValue2().click();
			    Thread.sleep(2000);
			    String Timezone= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
			    Thread.sleep(500);
			    
			    workflow.clickSave2().click();
			    logger.info("save button clicked");
			    Thread.sleep(500);
			    
		//ADD FILTERS IN MANUAL CONDITION 4--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	    
			    
			    workflow.PlusButton4().click();
			    logger.info("plus button clicked");
			    Thread.sleep(2000);	
		//1.	
			   
			    workflow.SelectFilter().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Estimated Annual Revenue']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectMultipleRuleValue().click();
			    Thread.sleep(2000);
			    String EstimatedAnnualRevenue= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
			    Thread.sleep(500);
			    
		//2.
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter2().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Industry']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectMultipleRuleValue2().click();
			    Thread.sleep(2000);
			    String Industry= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
			    Thread.sleep(500);
			    
		//3.
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter3().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Lead Email']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectOperator3().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[7]//li")).click();
			    logger.info("operator added");
			    Thread.sleep(500);
			    
			    workflow.clickSave2().click();
			    logger.info("save button clicked");
			    Thread.sleep(500);
			    
		//ADD FILTERS IN MANUAL CONDITION 5--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	    
			    
			    workflow.PlusButton5().click();
			    logger.info("plus button clicked");
			    Thread.sleep(2000);		    
		//1.
			    workflow.SelectFilter().click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//span[text()='Lead Name']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectOperator().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
			    logger.info("operator added");
			    Thread.sleep(500);
			    
			    workflow.setConditionvalue().sendKeys("Liono");
			    logger.info("value added");
			    Thread.sleep(500);
			 
			    
		//2.  
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter2().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Lead Number']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.setConditionvalue2().sendKeys(leadNumber);
			    logger.info("value added");
			    Thread.sleep(500);
			   

		//3. 	 
			    workflow.AddMoreRule().click();
			    logger.info("plus button clicked");
			    Thread.sleep(1000);	
			    
			    workflow.SelectFilter3().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//span[text()='Number of Employees']")).click();
			    logger.info("filter added");
			    Thread.sleep(500);
			    
			    workflow.selectOperator3().click();
			    Thread.sleep(500);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
			    logger.info("operator added");
			    Thread.sleep(500);
			    
			    
			    workflow.selectMultipleRuleValue().click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[2]//li")).click();
			    Thread.sleep(500);
			    
			  
			    driver.findElement(By.xpath("//span[text()='Associated Module Rule']")).click();
			    driver.findElement(By.xpath("//span[text()='Lead Module Rule']")).click();
			    
			    
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
	    
	    workflow.clickPreviewdata().click();
	    logger.info("preview button clicked");
	    Thread.sleep(8000);
	    
	    workflow.clickCancel2().click();
	    logger.info("cancel button clicked");
	    Thread.sleep(1000);
	    
// CREATE A LEAD ACCORDING TO THIS RULE-----------------------------------------------------------
	    
	    driver.switchTo().window(tabs.get(1));
	    commonMethods.CreateLeadForMultipleRule(leadname,leadNumber, LeadEmail,leadPhone,LeadType,leadSource,NumberofEmployees,Stage,Timezone,EstimatedAnnualRevenue,Industry);
	    
	    workflow.clickPreviewdata().click();
	    logger.info("preview button clicked");
	    Thread.sleep(8000);
	    String existingLeads = null;
	    try {
			 existingLeads= workflow.listedLeadsInPreview().getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Thread.sleep(2000);
	    
	    workflow.clickCancel2().click();
	    logger.info("cancel button clicked");
	    Thread.sleep(15000);
	    
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
	    
	    
	    commonMethods.EditLead(existingLeads);
	    
		driver.switchTo().window(tabs.get(2));
	    commonMethods.CreateNewLeadForMultipleRule(leadname,leadNumber, LeadEmail,leadPhone,LeadType,leadSource,NumberofEmployees,Stage,Timezone,EstimatedAnnualRevenue,Industry);
	    
	    boolean ActionStatusInHistory=commonMethods.CheckActionStatusInHistory();
	    boolean ActionStatusInCreatedLead=commonMethods.CheckActionStatusInCreatedLead();
	    boolean ActionStatusInExistingLead=commonMethods.CheckActionStatusInExistingLead();
	    
	    System.out.println("workflow name to create: "+WorkflowNameToCreate);
	    System.out.println("workflow name after create: "+WorkflowNameAfterCreate);
	    System.out.println(ActionStatusInHistory+" "+ActionStatusInCreatedLead+" "+ActionStatusInExistingLead);
	    
	    if(WorkflowNameToCreate.equals(WorkflowNameAfterCreate)) {
	    	if(ActionStatusInHistory) {
	    		  logger.info("workflow is created and  actions are also triggered in history");
	    	}
	    	else {logger.info("workflow is created but  actions are not triggered history");}
	    	
	    	if(ActionStatusInCreatedLead) {
	    		  logger.info("workflow is created and actions are also created  for newly created lead ");
	    	}
	    	else {logger.info("workflow is created  but actions are not created  for newly created lead");}
	    	
	    	if(ActionStatusInExistingLead) {
	    		  logger.info("workflow is created and actions are also created  for existing  lead ");
	    	}
	    	else {logger.info("workflow is created  but actions are not created  for existing lead");}
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
	    
	   if (WorkflowNameToCreate.equals(WorkflowNameAfterCreate)&&ActionStatusInHistory&&ActionStatusInExistingLead&&ActionStatusInCreatedLead) {
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
