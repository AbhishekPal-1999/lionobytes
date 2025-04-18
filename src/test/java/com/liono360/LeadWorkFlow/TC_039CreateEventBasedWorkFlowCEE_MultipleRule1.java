package com.liono360.LeadWorkFlow;

import java.io.IOException;
import java.time.Duration;
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
import com.liono360.pageObject.LoginPage;

public class TC_039CreateEventBasedWorkFlowCEE_MultipleRule1 extends Baseclass {

	@Test
	public void TC_039CreateEventBasedWorkFlowCEE_MultipleRule1Test() throws InterruptedException, IOException, TimeoutException {
		
	    driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
	   
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		
		
		CommonMethods commonMethods= new CommonMethods();

		LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
		workflow.waitUntilPageLoad();
		
		workflow.clickMisc().click();
		logger.info("Clicked Misc.");
		

		workflow.clickWorkFlow().click();
		logger.info("Clicked workflow");
		workflow.waitUntilPageLoad();
		

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(workflow.clickLeads()).keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).click(workflow.clickLeads()).keyUp(Keys.CONTROL).perform();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		//Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		//Thread.sleep(4000);
	    
//CREATE WORK FLOW ----------------------------------------------------------------------------------------------	    

		workflow.clickNew().click();
		logger.info("Clicked new button");
		workflow.waitUntilPageLoad();
				
		workflow.setName().sendKeys("WorkFlow"+randomnumber()+"WithMultipleRule");
		logger.info("name added");

		String WorkflowNameToCreate= workflow.setName().getAttribute("value");

		workflow.selectUsers().click();
		//driver.findElement(By.xpath("//span[text()='Satyendra Bhardwaj']")).click();
		logger.info("user selected");

		workflow.SelectModule().click();
		driver.findElement(By.xpath("//span[text()='Lead']")).click();
		logger.info("module selected");
		workflow.waitUntilPageLoad();

		workflow.SelectChannel().click();
		driver.findElement(By.xpath("//span[text()='Default Channel']")).click();
		logger.info("user selected");
		workflow.waitUntilPageLoad();
		
		workflow.createdAndEveryTimeEdited().click();
		logger.info("created And EveryTime Edited clicked");
	  
		
		String startdate=commonMethods.StartDate();
		String enddate=commonMethods.EndDate();
		
		workflow.selectStartDate().click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		try {
			driver.findElement(By.xpath("(//span[text()='"+startdate+"'])[1]")).click();

		}catch(Exception e) {}
		try {
			driver.findElement(By.xpath("(//span[text()='"+startdate+"'])[2]")).click();}
		catch(Exception e) {}
		logger.info("start date added");


		workflow.selectEndDate().click();
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[1]")).click();
		}
		catch(Exception e) {}
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[2]")).click();	    }
		catch(Exception e) {}
		logger.info("end date added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		workflow.clickNext().click();
		logger.info("next button clicked");
		//Thread.sleep(2000);
		
// ADD MANUAL CONDITOON HERE------------------------------------------------------------------------------------
		
		for(int i=1;i<=5;i++) {
	    	workflow.clickManualCondition().click();
	 	    logger.info("manual condition "+i+" added");
	 	    //Thread.sleep(1000);
	    }
		
		

//ADD FILTERS IN MANUAL CONDITION 1--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
		
	

		workflow.PlusButton1().click();
		logger.info("plus button clicked");
		//Thread.sleep(2000);	
//1.	   
	    
	    workflow.SelectFilter().click();
	    Thread.sleep(2000);	
	    commonMethods.openAllTreeDropdown();
	    
//	    workflow.drpLeadDetails().click();
//	    Thread.sleep(500);
//	    workflow.drpAddressDetails().click();
	    Thread.sleep(500);
	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Lead Name']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectOperator().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("operator added");
	    //Thread.sleep(500);
	    
	    workflow.setConditionvalue().sendKeys("Lionobytes Lead"+randomnumber()+"Pvt. Ltd.");
	    logger.info("value added");
	    //Thread.sleep(500);
	    String leadname = workflow.setConditionvalue().getAttribute("value");
	    
//2.  
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter2().click();
	    Thread.sleep(2000);	
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Lead Number']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.setConditionvalue2().sendKeys(randomnumber());
	    logger.info("value added");
	    //Thread.sleep(500);
	    String leadNumber = workflow.setConditionvalue2().getAttribute("value");
	    System.out.println(leadname + leadNumber);
//3.
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter3().click();
	    commonMethods.openAllTreeDropdown();
	   // workflow.drpLeadEmail().click();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Lead Email']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.setConditionvalue3().sendKeys("lead"+randomnumber()+"@lionobytes.com");
	    logger.info("value added");
	    //Thread.sleep(500);
	    String LeadEmail = workflow.setConditionvalue3().getAttribute("value");
	    
//4.
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter4().click();
	    commonMethods.openAllTreeDropdown();
	    Thread.sleep(500);
	  
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("(//span[text()='Lead Phone'])[2]")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.setConditionvalue4().sendKeys("991877564"+randomnumber());
	    logger.info("value added");
	    //Thread.sleep(500);
	    String leadPhone = workflow.setConditionvalue4().getAttribute("value");
	    
//5.  
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter5().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Lead Source']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	   
	    workflow.selectOperator5().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("operator added");
	    //Thread.sleep(500);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    //Thread.sleep(500);
	  
//ADD FILTERS IN MANUAL CONDITION 2--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	    

	    workflow.PlusButton2().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(2000);	
	    
//1.
	    
	    workflow.SelectFilter().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Lead Type(s)']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectMultipleRuleValue().click();
	    //Thread.sleep(2000);
	    String LeadType= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    //Thread.sleep(500);
	    
//2. 
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter2().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Lead Source']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectMultipleRuleValue2().click();
	    //Thread.sleep(2000);
	    String leadSource= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    //Thread.sleep(500);

//3 	 
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter3().click();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Number of Employees']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectMultipleRuleValue3().click();
	    //Thread.sleep(2000);
	    String NumberofEmployees= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    //Thread.sleep(500);
	    
//4.    
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter4().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Lead Name']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectOperator4().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[5]//li")).click();
	    logger.info("operator added");
	    //Thread.sleep(500);
	    
	    workflow.setConditionvalue().sendKeys("Lionobytes Lead");
	    logger.info("value added");
	    //Thread.sleep(500);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    //Thread.sleep(500);
	    
//ADD FILTERS IN MANUAL CONDITION 3--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	    
	    
	    workflow.PlusButton3().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(2000);	
//1.	    
	   
	    workflow.SelectFilter().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Stage']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectMultipleRuleValue().click();
	    //Thread.sleep(2000);
	    String Stage= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    //Thread.sleep(500);
	    
//2.
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter2().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Time  zone']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectMultipleRuleValue2().click();
	    //Thread.sleep(2000);
	    String Timezone= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    //Thread.sleep(500);
	    Actions act = new Actions(driver);
		act.doubleClick(workflow.HeaderLeadModule()).perform();
		
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    //Thread.sleep(500);
	    
//ADD FILTERS IN MANUAL CONDITION 4--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	    
	    
	    workflow.PlusButton4().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(2000);	
//1.	
	   
	    workflow.SelectFilter().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Estimated Annual Revenue']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectMultipleRuleValue().click();
	    //Thread.sleep(2000);
	    String EstimatedAnnualRevenue= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    //Thread.sleep(500);
	    
//2.
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter2().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Industry']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectMultipleRuleValue2().click();
	    //Thread.sleep(2000);
	    String Industry= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	    //Thread.sleep(500);
	    
//3.
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter3().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Lead Email']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectOperator3().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[7]//li")).click();
	    logger.info("operator added");
	    //Thread.sleep(500);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    //Thread.sleep(500);
	    
//ADD FILTERS IN MANUAL CONDITION 5--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	    
	    
	    workflow.PlusButton5().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(2000);		    
//1.
	    workflow.SelectFilter().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Lead Name']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectOperator().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("operator added");
	    //Thread.sleep(500);
	    
	    workflow.setConditionvalue().sendKeys("Liono");
	    logger.info("value added");
	    //Thread.sleep(500);
	 
	    
//2.  
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter2().click();
	    commonMethods.openAllTreeDropdown();
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Lead Number']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.setConditionvalue2().sendKeys(leadNumber);
	    logger.info("value added");
	    //Thread.sleep(500);
	   

//3. 	 
	    workflow.AddMoreRule().click();
	    logger.info("plus button clicked");
	    //Thread.sleep(1000);	
	    
	    workflow.SelectFilter3().click();
	    commonMethods.openAllTreeDropdown();
	   //Thread.sleep(500);
	    driver.findElement(By.xpath("//span[text()='Number of Employees']")).click();
	    logger.info("filter added");
	    //Thread.sleep(500);
	    
	    workflow.selectOperator3().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
	    logger.info("operator added");
	    //Thread.sleep(500);
	    
	    
	    workflow.selectMultipleRuleValue().click();
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[2]//li")).click();
	    //Thread.sleep(500);
	    
	  
	    driver.findElement(By.xpath("//span[text()='Associated Module Rule']")).click();
	    driver.findElement(By.xpath("//span[text()='Lead Module Rule']")).click();
	    
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    //Thread.sleep(500);

	    
// ADD INSTANT ACTION HERE(TASK)--------------------------------------------------------------------------------------------
	    
	    int i=1;
	    while(i<=5) {
	    	commonMethods.CreatTask(WorkflowNameToCreate,i);
	    	
// ADD INSTANT ACTIONS HERE(EMAIL ALERT)-------------------------------------------------------------------	    	
	    	
	    	commonMethods.CreateEmail(WorkflowNameToCreate, i);
	    }
	    
	    
	    workflow.clickPreviewdata2().click();
	    logger.info("preview button clicked");
	    workflow.waitUntilPageLoad();
	    
	    workflow.clickCancel2().click();
	    logger.info("cancel button clicked");
	    
	   
// CREATE A LEAD ACCORDING TO THIS RULE-----------------------------------------------------------
	    
	   
	    driver.switchTo().window(tabs.get(1));
	    commonMethods.CreateLeadForMultipleRule(leadname,leadNumber, LeadEmail,leadPhone,LeadType,leadSource,NumberofEmployees,Stage,Timezone,EstimatedAnnualRevenue,Industry);
	    
	    workflow.clickPreviewdata2().click();
	    
	    logger.info("preview button clicked");
	    workflow.waitUntilPageLoad();
	    String existingLeads = null;
	    try {
			 existingLeads= workflow.listedLeadsInPreview().getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
	   // //Thread.sleep(2000);
	    
	    workflow.clickCancel2().click();
	    logger.info("cancel button clicked");
	    workflow.waitUntilPageLoad();
	    
	    workflow.clickSave1().click();
	    logger.info("save button clicked and workflow created");
	    workflow.waitUntilPageLoad();
	    
	    String WorkflowNameAfterCreate  = workflow.ListedWorkflow().getText();
	    
//SEARCH CREATED WORKFLOW AND RUN SCHEDULER -----------------------------------------------------------------------
	    
	    workflow.setGlobalSearch().sendKeys(WorkflowNameAfterCreate);
	    logger.info("workflow passed to search");
	    
	    workflow.waitUntilPageLoad();
	    
	    workflow.ListedWorkflow().click();
	    logger.info("clicked on listed workflow ");
	    //Thread.sleep(5000);

	    workflow.clickRunScheduler().click();
	    logger.info("clicked run scheduler");
	    //Thread.sleep(1000);
	    
	    workflow.clickYes().click();
	    logger.info("clicked yes button");
	    workflow.waitUntilPageLoad();
	    
	 
	
// VERIFY THAT WORKFLOW CREATED AND WORKING FINE OR NOT---------------------------------------------------
	    
	    
	    commonMethods.EditLead(existingLeads);
	    
		driver.switchTo().window(tabs.get(2));
	    commonMethods.CreateNewLeadForMultipleRule(leadname,leadNumber, LeadEmail,leadPhone,LeadType,leadSource,NumberofEmployees,Stage,Timezone,EstimatedAnnualRevenue,Industry);
	    
	    boolean ActionStatusInHistory=commonMethods.CheckMultipleActionStatusInHistory();
	    boolean ActionStatusInCreatedLead=commonMethods.CheckMultipleActionStatusInCreatedLead();
	    boolean ActionStatusInExistingLead=commonMethods.CheckMultipleActionStatusInExistingLead();
	    
	    System.out.println("workflow name to create: "+WorkflowNameToCreate);
	    System.out.println("workflow name after create: "+WorkflowNameAfterCreate);
	    System.out.println(ActionStatusInHistory+" "+ActionStatusInCreatedLead+" "+ActionStatusInExistingLead);
	    
	    if(WorkflowNameToCreate.equals(WorkflowNameAfterCreate)) {
	    	if(ActionStatusInHistory) {
	    		  logger.info("workflow is created and instant actions are also triggered in history");
	    	}
	    	else {logger.info("workflow is created but instant actions are not triggered history");}
	    	
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
	    workflow.waitUntilPageLoad();
	    
	    workflow.stopScheduler().click();
	    logger.info("clicked stop scheduler");
	    //Thread.sleep(500);
	    
	    workflow.clickYes().click();
	    logger.info("clicked yes button");
	    //Thread.sleep(3000);

	    
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
