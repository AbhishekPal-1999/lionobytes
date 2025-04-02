package com.liono360.WorkflowAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;

import java.util.List;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkFlowPage;

public class TC_015CreatedWorkfloweveryTimeEditedAccountNo extends Baseclass {
	String wfname=null;
	

	@Test
	public void CreatedWorkfloweveryTimeEditedAccountNo() throws Exception {
		redirectToCRM();

		WorkFlowPage workflow = new WorkFlowPage(driver);
		Actions action = new Actions(driver);
		Thread.sleep(10000);

		workflow.clickMisc().click();
		Thread.sleep(4000);
		logger.info("click Misc");

		workflow.clickWorkflow().click();
		Thread.sleep(4000);
		logger.info("click Workflow");

		workflow.clickNew().click();
		Thread.sleep(5000);
		logger.info("click New");

		workflow.clickWorkflowName().click();
		Thread.sleep(2000);
		logger.info("click Workflow name");

		workflow.clickWorkflowName().sendKeys("WorkFlow1994" + randomnumber());
		Thread.sleep(2000);
		logger.info("fill Workflow name");
           wfname=workflow.clickWorkflowName().getAttribute("value");
		workflow.clickSelectModule().click();
		Thread.sleep(2000);
		logger.info("select Workflow module");

		driver.findElement(By.xpath("//li[@aria-label='Account']")).click();
		Thread.sleep(3000);
		logger.info("select Workflow module account");
		driver.findElement(By.xpath("//span[normalize-space()='Select Channel']")).click();
		Thread.sleep(2000);
		logger.info("select channel");
		driver.findElement(By.xpath("//li[@aria-label='Default Channel']")).click();
		logger.info("select default channel");
		workflow.clickCreatedEveryTimeEdited().click();
		Thread.sleep(2000);
		logger.info(" click Every time Edited");
		
		workflow.clickNext().click();
		Thread.sleep(2000);
		logger.info("click Next");
		
		workflow.clickSavedSearchCondition().click();
		Thread.sleep(2000);
		logger.info("click Saved Search condition");
		
		workflow.clickAddRule().click();
		Thread.sleep(2000);
		logger.info("click add rule");
		
		workflow.clickSelectsaveSearch().click();
		Thread.sleep(2000);
		logger.info("click select saved search rule");
		
		driver.findElement(By.xpath("//div[normalize-space()='SavedAutomation1']")).click();
		Thread.sleep(2000);
		logger.info("click created saved search exist");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(1000);
		logger.info("click save saved search");
		workflow.clickPreviewData().click();
		Thread.sleep(8000);
		logger.info("click on Submit");
       String auto=  (driver.findElement(By.xpath("//td[normalize-space()='Autocomplete']"))).getText();
         Thread.sleep(2000);
 		logger.info("click on auto complete");

		workflow.clickCancel().click();
		Thread.sleep(2000);
		logger.info("click on cancel");
		workflow.clickAddAction().click();
		Thread.sleep(2000);
		logger.info("click on Add Action");

		workflow.clickEmailAlert().click();
		Thread.sleep(2000);
		logger.info("click on Email Alert");

		workflow.clickSelectuser().click();
		Thread.sleep(2000);
		logger.info("click on select user");

		workflow.clickuserhirerachy().click();
		logger.info("click on select user hirarchy");
		Thread.sleep(2000);

		workflow.clickSelectUserOption().click();
		Thread.sleep(2000);
		logger.info("click on select user");
        driver.findElement(By.xpath("//div[@aria-label='Ruchika jaiswal']")).click();
    	logger.info("click on user");
		Thread.sleep(2000);

		workflow.clickSelectuser().click();
		Thread.sleep(2000);
		logger.info("click on select user");
		workflow.clickSelectTemplate().click();
		Thread.sleep(2000);
		logger.info("click Select template");

		workflow.clickSelectTemplateoption().click();
		Thread.sleep(2000);
		logger.info("click Select template option");

		workflow.clickSubmit().click();
		Thread.sleep(2000);
		logger.info("click saved workflow");

		workflow.clickAddAction().click();
		Thread.sleep(2000);
		logger.info("click on Add Action");
		workflow.clickAddTask().click();
		Thread.sleep(2000);
		logger.info("click on Add Task");
		workflow.clickassigntoselectuser().click();
		Thread.sleep(2000);
		logger.info("click on assign user");
		driver.findElement(By.xpath("(//p-multiselectitem/li)[34]")).click();
		Thread.sleep(2000);
		logger.info("click list of user");

		jsClick(driver,workflow.clicktaskDescription());
		Thread.sleep(5000);
		logger.info("click task description");
		workflow.clicktaskDescription().sendKeys("Task created successfully"+randomstring());
		Thread.sleep(2000);
		logger.info("fill task description");
		jsClick(driver, workflow.clickchecklist());
		Thread.sleep(3000);
		logger.info("click checklist");

		workflow.clickchecklistfill().click();
		Thread.sleep(2000);
		logger.info("click checklist fill");
		workflow.clickchecklistfill().sendKeys("checklist"+randomstring());
		Thread.sleep(1000);
		logger.info("checklist fill");

		driver.findElement(By.xpath("(//button[@label='Save'])[3]")).click();
		Thread.sleep(5000);
		logger.info("click saved");

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(1000);
		logger.info("click saved task");


		/*
		 * workflow.clicktriggertime().click(); Thread.sleep(2000);
		 * logger.info("click trigger");
		 * 
		 * workflow.clicktime().click(); Thread.sleep(1000);
		 * logger.info("click time value");
		 * 
		 * workflow.clicktime().sendKeys("1"); Thread.sleep(1000);
		 * logger.info("fill time");
		 * 
		 * workflow.clicktriggertime2().click(); Thread.sleep(1000);
		 * logger.info("click trigger dropdwon");
		 * 
		 * driver.findElement(By.xpath("//span[normalize-space()='Minutes']")).click();
		 * Thread.sleep(1000); logger.info("click Minute");
		 * 
		 * workflow.clickSubmit().click(); Thread.sleep(1000);
		 * logger.info("click saved");
		 */
		workflow.clickSave().click();
		Thread.sleep(6000);
		logger.info("click saved");

		workflow.clickWorklowlist().click();
		Thread.sleep(7000);
		logger.info("click workflow");

		workflow.clickRunSchduler().click();
		Thread.sleep(4000);
		logger.info("click Run schduler");

		workflow.clickOnYes().click();
		Thread.sleep(3000);
		logger.info("click Yes Button");
		// Open the button link in a new tab

		action.keyDown(Keys.CONTROL).click(workflow.clickAccounts()).keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).click(workflow.clickAccounts()).keyUp(Keys.CONTROL).perform();
		Thread.sleep(12000);

		 

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		workflow.clickGlobalSearch().click();
		logger.info("click global search");
		Thread.sleep(5000);
		workflow.clickGlobalSearch().sendKeys(auto);
		logger.info("fill global search");
		Thread.sleep(7000);
		
		workflow.clickAccountList().click();
		Thread.sleep(7000);

		mouseActionRightClick(driver, workflow.clickAccountList());
		logger.info("right click account list Mousehover");
		Thread.sleep(5000);
		//Thread.sleep(2000);
		workflow.ClickOnEdit().click();
		logger.info("Clicked on ClickOnEdit button");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		logger.info("Clicked on submit button button");
		Thread.sleep(10000);
		//action.doubleClick(driver,workflow.clickAccountList());
		action.doubleClick(workflow.clickAccountList()).perform();
		//workflow.clickAccountList().click();
		logger.info("click on Account list");
		Thread.sleep(25000);
		workflow.clickAccountTask().click();
		logger.info("click on Account task");
		Thread.sleep(5000);
		
		workflow.clickAccounttaskclick().click();
		logger.info("click on Account task click");
		Thread.sleep(5000);

		workflow.clickMisc().click(); logger.info("click misc"); Thread.sleep(5000);

		workflow.clickWorkflow().click();
		logger.info("click workflow");
		Thread.sleep(5000);



		driver.switchTo().window(tabs.get(2));
		
		workflow.NewAbtn().click();
		logger.info("Clicked on new button");

		Thread.sleep(5000);
		workflow.Firstname().click();
		Thread.sleep(2000);
		workflow.Firstname().sendKeys("FName" + randomnumber());
		logger.info("First Name Added");
		Thread.sleep(2000);

		workflow.Latname().click();
		workflow.Latname().sendKeys("LName" + randomnumber());
		logger.info("Last Name Added");
		Thread.sleep(3000);

		workflow.AccountName().click();
		workflow.AccountName().sendKeys("AccountNameSaved");
		logger.info("sendkeys on accountname");
	       String AcNewName=workflow.AccountName().getAttribute("value");

		Thread.sleep(4000);
		workflow.accountNumber().sendKeys("87885" + randomnumber());
		logger.info("Sendkeys on accountNumber");
		driver.findElement(By.xpath("(//input[@type='text'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[27]")).sendKeys("123"+randomnumber());
		Thread.sleep(1000);
		
		workflow.SaveAccountDetails().click();
		logger.info("click on SaveAccountDetails button");
		Thread.sleep(10000);

		workflow.clickAccountList().click();
		logger.info("click on Account list");
		Thread.sleep(25000);
		workflow.clickAccountTask().click();
		logger.info("click on Account task");
		Thread.sleep(5000);
		
		workflow.clickAccounttaskclick().click();
		logger.info("click on Account task click");
		Thread.sleep(5000);
		
		workflow.clickMisc().click(); logger.info("click misc"); Thread.sleep(5000);

		workflow.clickWorkflow().click();
		logger.info("click workflow");
		Thread.sleep(5000);
		workflow.clickGlobalSearch().click();
		logger.info("click global search");
		Thread.sleep(5000);
		workflow.clickGlobalSearch().sendKeys(wfname);
		logger.info("fill global search");
		Thread.sleep(5000);
		workflow.clickWorklowlist().click();
		logger.info("click workflow list"); Thread.sleep(2000);
		workflow.clickHistory().click(); Thread.sleep(2000);
		logger.info("click Yes Button"); workflow.clickAllActionType().click();
		Thread.sleep(2000); logger.info("click All action type");
		workflow.clickButtonemailAlert().click(); Thread.sleep(4000);
		logger.info("click Email alert");

		workflow.clickRefresh().click(); Thread.sleep(4000);
		logger.info("click Refresh");

		workflow.clickOverview().click(); Thread.sleep(3000);
		logger.info("click Overview");

		workflow.clickHistory().click(); Thread.sleep(5000);
		logger.info("click  history");
		workflow.clickRefresh().click();
		Thread.sleep(3000); 
		logger.info("click Refresh");
		workflow.clickHistory().click(); Thread.sleep(240000);
		logger.info("click  history");
		
		
		
		workflow.clickAllExecutionStatus().click();
		Thread.sleep(3000); logger.info("click all execution status");

		workflow.clickExecuted().click();
		Thread.sleep(3000); logger.info("click Executed");
		workflow.clickAllActionType().click();
		Thread.sleep(2000); logger.info("click All action type");
		workflow.clickButtonemailAlert().click(); Thread.sleep(4000);
		logger.info("click Email alert");
		driver.findElement(By.xpath("//p-table//th[text()=' Trigger Time ']//parent::tr//parent::thead//following-sibling::tbody//tr[1]//td[2]")).click();
		Thread.sleep(3000); logger.info("click Executed list");
		workflow.clickclose().click();
		Thread.sleep(3000); logger.info("click close");
		workflow.clickAccounts().click(); Thread.sleep(3000);
		logger.info("click account");
		workflow.clickGlobalSearch().sendKeys(AcNewName);
		logger.info("click global search");
		Thread.sleep(6000);
		workflow.clickAccountList().click();
		logger.info("click account list");
		Thread.sleep(5000);
		workflow.clickAccountTask().click();
		logger.info("click account list");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div//table[@role='table'])[2]")).click();
		logger.info("click account list");
		Thread.sleep(5000);



	}

}
