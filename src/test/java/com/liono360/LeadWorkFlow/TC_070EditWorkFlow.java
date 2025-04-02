package com.liono360.LeadWorkFlow;

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

public class TC_070EditWorkFlow extends Baseclass {

	@Test
	public void TC_070EditWorkFlowTest() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
		Thread.sleep(2000);
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		Thread.sleep(20000);
		
		
		LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

		workflow.clickMisc().click();
		logger.info("Clicked Misc.");
		Thread.sleep(2000);

		workflow.clickWorkFlow().click();
		logger.info("Clicked workflow");
		Thread.sleep(10000);
		
		
		mouseActionRightClick(driver, workflow.ListedLeads());
		logger.info("right clicked on added workflow");
		Thread.sleep(2000);
		workflow.btnEdit().click();
		logger.info("clicked on edit option");
		Thread.sleep(10000);



// EDIT WORK FLOW ----------------------------------------------------------------------------------------------	    
		workflow.setName().clear();
		workflow.setName().sendKeys("EditedWorkFlow"+randomnumber());
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

		workflow.craetedAndEditedCriteria().click();
		logger.info("created And EveryTime Edited meets till criteria clicked");
		Thread.sleep(2000);
		CommonMethods commonMethods= new CommonMethods();

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

		workflow.setConditionvalue().sendKeys("3");
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
		
		workflow.setGlobalSearch().sendKeys(WorkflowNameToCreate);
	    logger.info("workflow passed to search");
	    Thread.sleep(15000);
	    
	    workflow.ListedWorkflow().click();
	    logger.info("clicked on listed workflow ");
	    Thread.sleep(5000);
		String WorkflowNameAfterCreate  = workflow.ListedWorkflow().getText();


		if(WorkflowNameToCreate.equals(WorkflowNameAfterCreate))
		{ 
			Thread.sleep(4000);
			Assert.assertTrue(true);
			logger.info("edit workflow Case test passed");
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver, "View Case");
			logger.info("edit workflow Case test failed");
		}

	}
	
	
}
