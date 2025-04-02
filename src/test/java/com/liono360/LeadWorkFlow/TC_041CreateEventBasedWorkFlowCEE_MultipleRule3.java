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

public class TC_041CreateEventBasedWorkFlowCEE_MultipleRule3 extends Baseclass {

	@Test
	public void TC_041CreateEventBasedWorkFlowCEE_MultipleRule3Test() throws InterruptedException, IOException, TimeoutException {
		
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
		
		workflow.createdAndEveryTimeEdited().click();
		logger.info("created And EveryTime Edited clicked");
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
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='Linkedin']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.selectOperator().click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		    logger.info("operator added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue().sendKeys("https://www.linkedin.com/login"+randomnumber());
		    logger.info("value added");
		    Thread.sleep(500);
		    String linkedin = workflow.setConditionvalue().getAttribute("value");
		    
//2.  
		    workflow.AddMoreRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(1000);	
		    
		    workflow.SelectFilter2().click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//span[text()='Instagram']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue2().sendKeys("https://www.instagram.com/"+randomnumber());
		    logger.info("value added");
		    Thread.sleep(500);
		    String instagram = workflow.setConditionvalue2().getAttribute("value");

//3.
		    workflow.AddMoreRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(1000);	
		    
		    workflow.SelectFilter3().click();
		    Thread.sleep(500);
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='NAICS Code']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue3().sendKeys("NAICS"+randomnumber());
		    logger.info("value added");
		    Thread.sleep(500);
		    String naics = workflow.setConditionvalue3().getAttribute("value");
		    
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
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='Notes']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue().sendKeys("this notes"+randomnumber()+ " about workflow");
		    logger.info("value added");
		    Thread.sleep(500);
		    String notes = workflow.setConditionvalue().getAttribute("value");
		    
//2.
		    workflow.AddMoreRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(1000);	
		    
		    workflow.SelectFilter2().click();
		    Thread.sleep(500);
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='CreatedDate']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.selectOperator2().click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
		    logger.info("operator added");
		    Thread.sleep(500);
		    
		    driver.findElement(By.xpath("(//p-dropdown[@placeholder=\"Select Value\"])[1]")).click();
		    Thread.sleep(500);
		    String CreatedDate= driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).getText();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
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
		    Thread.sleep(2000);
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='Street Address 1']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue().sendKeys("Sector 62");
		    logger.info("value added");
		    Thread.sleep(500);
		    String StreetAddress1 = workflow.setConditionvalue().getAttribute("value");
		    Thread.sleep(500);
//2	 
		    workflow.AddMoreRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(1000);	
		    
		    workflow.SelectFilter2().click();
		    Thread.sleep(500);
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='Street Address 2']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue2().sendKeys("street number "+randomnumber());
		    logger.info("value added");
		    Thread.sleep(500);
		    String StreetAddress2 = workflow.setConditionvalue2().getAttribute("value");
		    Thread.sleep(500);
		    
//3.
		    workflow.AddMoreRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(1000);	
		    
		    workflow.SelectFilter3().click();
		    Thread.sleep(500);
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='Zip/Postal Code']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.setConditionvalue3().sendKeys("110010");
		    logger.info("value added");
		    Thread.sleep(500);
		    String zip = workflow.setConditionvalue3().getAttribute("value");
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
		    Thread.sleep(2000);
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='CreatedBy']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.selectMultipleRuleValue().click();
		    Thread.sleep(500);
		    String createdBy= driver.findElement(By.xpath("//span[text()='Andrew ']")).getText();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//span[text()='Andrew ']")).click();
		    Thread.sleep(2000);
		    

		    
//2.  
		    workflow.AddMoreRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(3000);	
		    
		    workflow.SelectFilter2().click();
		    Thread.sleep(2000);
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='UpdatedBy']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.selectMultipleRuleValue2().click();
		    Thread.sleep(500);
		    String updatedBy= driver.findElement(By.xpath("//span[text()='Andrew ']")).getText();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//span[text()='Andrew ']")).click();
		    Thread.sleep(2000);  
		    
		    workflow.clickSave2().click();
		    logger.info("save button clicked");
		    Thread.sleep(500);
		    
//ADD FILTERS IN MANUAL CONDITION 5--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
			
		    workflow.PlusButton5().click();
		    logger.info("plus button clicked");
		    Thread.sleep(2000);	
//1.
		    
		    workflow.SelectFilter().click();
		    Thread.sleep(2000);
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='UpdatedDate']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.selectOperator().click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
		    logger.info("operator added");
		    Thread.sleep(500);
		    
		    driver.findElement(By.xpath("(//p-dropdown[@placeholder='Select Value'])[1]")).click();
		    Thread.sleep(500);
		    String updatedDate= driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).getText();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		    Thread.sleep(500);	
		    
//2. 
		    workflow.AddMoreRule().click();
		    logger.info("plus button clicked");
		    Thread.sleep(1000);	
		    
		    workflow.SelectFilter2().click();
		    Thread.sleep(500);
		    commonMethods.openAllTreeDropdown();
		    driver.findElement(By.xpath("//span[text()='Lead Source']")).click();
		    logger.info("filter added");
		    Thread.sleep(500);
		    
		    workflow.selectOperator2().click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
		    logger.info("operator added");
		    Thread.sleep(500);
		    
		    workflow.clickSave2().click();
		    logger.info("save button clicked");
		    Thread.sleep(500);
		    
	    
	    
// ADD INSTANT ACTION HERE(TASK)--------------------------------------------------------------------------------------------
		    
		    int i=1;
		    while(i<=5) {
		    	commonMethods.CreatTask(WorkflowNameToCreate,i);
		    	i=i+2;
		    }
		    
// ADD INSTANT ACTIONS HERE(EMAIL ALERT)-------------------------------------------------------------------	    
		
		    int k=2;
		    while(k<=5) {
		    	commonMethods.CreateEmail(WorkflowNameToCreate, k);
		    	k=k+2;
		    }
		    
		    workflow.clickPreviewdata2().click();
		    logger.info("preview button clicked");
		    Thread.sleep(5000);
		    
		    workflow.clickCancel2().click();
		    logger.info("cancel button clicked");
		    Thread.sleep(2000);
		    
// CREATE A LEAD ACCORDING TO THIS RULE-----------------------------------------------------------
	    
	    driver.switchTo().window(tabs.get(1));
	    Thread.sleep(4000);
	    commonMethods.CreateLeadForMultipleRule3(linkedin,instagram,naics,notes,StreetAddress1,StreetAddress2,zip);	    	    
	    workflow.clickPreviewdata2().click();
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
	    Thread.sleep(1000);
	    
	    workflow.clickYes().click();
	    logger.info("clicked yes button");
	    Thread.sleep(10000);
	    
	 
	
// VERIFY THAT WORKFLOW CREATED AND WORKING FINE OR NOT---------------------------------------------------
	    
	    
	    commonMethods.EditLead(existingLeads);
	    
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(4000);
	   commonMethods.CreateNewLeadForMultipleRule3(linkedin,instagram,naics,notes,StreetAddress1,StreetAddress2,zip);	    	    
	    boolean ActionStatusInHistory=commonMethods.CheckActionStatusInHistory();
	    boolean ActionStatusInCreatedLead=commonMethods.CheckActionStatusInCreatedLead();
	    boolean ActionStatusInExistingLead=commonMethods.CheckActionStatusInExistingLead();
	    
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
