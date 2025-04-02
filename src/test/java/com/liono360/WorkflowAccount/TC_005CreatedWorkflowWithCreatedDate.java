package com.liono360.WorkflowAccount;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkFlowPage;

public class TC_005CreatedWorkflowWithCreatedDate extends Baseclass {
	String wfname=null;

	@Test
	public void CreatedWorkflowWithCreatedDate() throws InterruptedException {
		
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

		workflow.clickWorkflowName().sendKeys("WorkFlow" + randomnumber());
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
		Thread.sleep(4000);
		logger.info("select channel");
		driver.findElement(By.xpath("//li[@aria-label='Default Channel']")).click();
		Thread.sleep(2000);
		logger.info("select default channel");
		workflow.clickNext().click();
		Thread.sleep(2000);
		logger.info("click Next");

		workflow.clickManualCondition().click();
		Thread.sleep(2000);
		logger.info("click manual condition");

		workflow.clickAddRule().click();
		Thread.sleep(3000);
		logger.info("click Add Rule");

		workflow.clickSelectFilter().click();
		Thread.sleep(2000);
		logger.info("click Select Filter");

		workflow.clickCreatedDate().click();
		Thread.sleep(2000);
		logger.info("click Select Filter");
		workflow.clickSelectOperator().click();
		Thread.sleep(2000);
		logger.info("click Select operator");

		workflow.clickOperatorOptionIsEqual().click();
		Thread.sleep(2000);
		logger.info("click IsEqual operator");

		workflow.clickselectitem().click();
		Thread.sleep(2000);
		logger.info("click select item");
		workflow.clickSelectandrew().click();
		logger.info("Select andrew");
		String acname=workflow.clickValueEnter().getAttribute("value");

		workflow.clickSubmit().click();
		Thread.sleep(5000);
		logger.info("click on Submit");

		workflow.clickPreviewData().click();
		Thread.sleep(8000);
		logger.info("click on Submit");

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


		workflow.clicktriggertime().click();
		Thread.sleep(2000);
		logger.info("click trigger");

		workflow.clicktime().click();
		Thread.sleep(1000);
		logger.info("click time value");

		workflow.clicktime().sendKeys("1");
		Thread.sleep(1000);
		logger.info("fill time");

		workflow.clicktriggertime2().click();
		Thread.sleep(1000);
		logger.info("click trigger dropdwon");

		driver.findElement(By.xpath("//span[normalize-space()='Minutes']")).click();
		Thread.sleep(1000);
		logger.info("click Minute");

		workflow.clickSubmit().click();
		Thread.sleep(1000);
		logger.info("click saved");

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

		Thread.sleep(5000);





		createAccount(acname);

	}

	public void createAccount(String account) throws InterruptedException {
		WorkFlowPage workflow = new WorkFlowPage(driver);
		workflow.clickAccounts().click();
		logger.info("Clicked on Account button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(12000);
		workflow.NewAbtn().click();
		logger.info("Clicked on new button");

		Thread.sleep(5000);
		workflow.Firstname().click();
		//	Thread.sleep(2000);
		workflow.Firstname().sendKeys("FName" + randomnumber());
		logger.info("First Name Added");
		//	Thread.sleep(2000);

		workflow.Latname().click();
		workflow.Latname().sendKeys("LName" + randomnumber());
		logger.info("Last Name Added");
		//	Thread.sleep(3000);








		workflow.SaveAccountDetails().click();
		logger.info("click on SaveAccountDetails button");
		Thread.sleep(10000);

		workflow.clickAccountList().click();
		logger.info("click on Account list");
		Thread.sleep(120000);
		workflow.clickAccountTask().click();
		logger.info("click on Account task");
		//		Thread.sleep(5000);

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
		logger.info("click workflow list"); 
		Thread.sleep(2000);
		workflow.clickHistory().click();
		Thread.sleep(3000);
		logger.info("click Yes Button");
		workflow.clickAllActionType().click();
		Thread.sleep(2000); 
		logger.info("click All action type");
		workflow.clickButtonemailAlert().click();
		Thread.sleep(4000);
		logger.info("click Email alert");

		workflow.clickRefresh().click();
		Thread.sleep(4000);
		logger.info("click Refresh");

		workflow.clickOverview().click(); 
		Thread.sleep(3000);
		logger.info("click Overview");

		workflow.clickHistory().click(); Thread.sleep(5000);
		logger.info("click  history");
		workflow.clickRefresh().click();
		Thread.sleep(3000); 
		logger.info("click Refresh");
		workflow.clickHistory().click();
		Thread.sleep(120000);
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
		workflow.clickGlobalSearch().sendKeys(account);
		logger.info("click global search");
		Thread.sleep(4000);
		workflow.clickAccountList().click();
		logger.info("click account list");
		Thread.sleep(3000);
		workflow.clickAccountTask().click();
		logger.info("click account list");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div//table[@role='table'])[2]")).click();
		logger.info("click account list");
		Thread.sleep(4000);


	}

}
