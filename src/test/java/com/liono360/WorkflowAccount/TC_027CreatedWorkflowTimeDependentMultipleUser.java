package com.liono360.WorkflowAccount;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkFlowPage;

public class TC_027CreatedWorkflowTimeDependentMultipleUser extends Baseclass{
	
	String wfname=null;
	@Test
	public void CreatedWorkflowTimeDependentMultipleUser() throws InterruptedException {
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
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p-radiobutton[@name='workflowType']//div[@class='p-radiobutton p-component']"))
			.click();
	Thread.sleep(2000);
	logger.info("Time Based");
//	logger.info("select default channel");
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

	workflow.clickAccountName().click();
	Thread.sleep(2000);
	logger.info("click Select Filter");
	workflow.clickSelectOperator().click();
	Thread.sleep(2000);
	logger.info("click Select operator");

	workflow.clickOperatorOptionIsEqual().click();
	Thread.sleep(2000);
	logger.info("click IsEqual operator");

	workflow.clickValueEnter().click();
	Thread.sleep(2000);
	logger.info("click Value Enter");
	workflow.clickValueEnter().sendKeys("WorkFlowTestAutomationAccountName" + randomnumber());
	Thread.sleep(1000);
	logger.info("fill Value");
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
     for(int i=1;i<=5;i++) {
    	 String user = null;
    	 
    	 if(i==1)user="Ruchika jaiswal";
    	 if(i==2)user="Satyendra Bhardwaj";
    	 if(i==3)user="Nisha ";
    	 if(i==4)user="Sayli ";
    	 if(i==5)user="Sundar  Pichai";
    	 
    	 EmailCreate(user);
    	//CreateTask(user);

     	 
    	 
}
     
     for(int i=75;i<=80;i++) {
    	 CreateTask(i);
     }
     
   
	}

	public void EmailCreate(String user) throws InterruptedException {
		 WorkFlowPage workflow = new WorkFlowPage(driver);
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
	    driver.findElement(By.xpath("//span[text()='"+user+"']")).click();
		logger.info("click on user");
		Thread.sleep(2000);

		workflow.clickSelectuser().click();
		Thread.sleep(2000);
		logger.info("click on select user");
		Thread.sleep(1000);
		workflow.clickSelectTemplate().click();
		Thread.sleep(2000);
		logger.info("click Select template");

		workflow.clickSelectTemplateoption().click();
			Thread.sleep(1000);
		logger.info("click Select template option");

		workflow.clickSubmit().click();
		Thread.sleep(2000);
		logger.info("click saved workflow");
		
		
		/*
		 * jsClick(driver,workflow.clicktaskDescription()); Thread.sleep(5000);
		 * logger.info("click task description");
		 * workflow.clicktaskDescription().sendKeys("Task created successfully"
		 * +randomstring()); Thread.sleep(2000); logger.info("fill task description");
		 */
		
	
	
	
	  }
	 
	public void CreateTask(int assignuser) throws InterruptedException {
		
		 WorkFlowPage workflow = new WorkFlowPage(driver);
		 String acname=workflow.clickValueEnter().getAttribute("value");
			Actions action = new Actions(driver);

			workflow.clickAddAction().click();
			Thread.sleep(2000);
			logger.info("click on Add Action");
			workflow.clickAddTask().click();
			logger.info("click Add task");
			Thread.sleep(1000);



			workflow.clickassigntoselectuser().click();
			Thread.sleep(1000);
			logger.info("click on assign user");
			driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem["+assignuser+"]//li ")).click();
				logger.info("click on user");
				Thread.sleep(2000);

			jsClick(driver,workflow.clicktaskDescription());
				Thread.sleep(2000);
			logger.info("click task description");
			workflow.clicktaskDescription().sendKeys("Task created successfully"+randomstring());
			Thread.sleep(2000);
			logger.info("fill task description");
		
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
    driver.findElement(By.xpath("//span[normalize-space()='Days']")).click();
    logger.info("click days");
	//workflow.clicktriggertime2().click();
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
	
	action.keyDown(Keys.CONTROL).click(workflow.clickAccounts()).keyUp(Keys.CONTROL).perform();
	Thread.sleep(15000);

	 

	ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());

	driver.switchTo().window(tabs1.get(1));
	
	workflow.NewAbtn().click();
	logger.info("Clicked on new button");
	Thread.sleep(7000);
	
	workflow.Firstname().sendKeys("FName" + randomnumber());
	logger.info("First Name Added");
	Thread.sleep(1000);
//	explWaitToClick(account.middlename());
	workflow.middlename().sendKeys("MName" + randomnumber());
	logger.info("Middle Name Added");
	Thread.sleep(1000);
	//explWaitToClick(account.Latname());
	workflow.Latname().sendKeys("LName" + randomnumber());
	logger.info("Last Name Added");
	Thread.sleep(1000);
	workflow.AccountName().click();
	workflow.AccountName().sendKeys(acname);
	logger.info("click Account name");
	Thread.sleep(1000);
	
	workflow.SaveAllDeatilsBtn().click();
	logger.info("click on SaveAllDeatilsBtn button");
	Thread.sleep(7000);
	action.doubleClick(workflow.clickAccountList()).perform();
	Thread.sleep(10000);
	//workflow.clickAccountList().click();
	logger.info("click on Account list");
	Thread.sleep(60000);
	workflow.clickAccountTask().click();
	logger.info("click on Account task");
	Thread.sleep(10000);
	
	workflow.clickAccounttaskclick().click();
	logger.info("click on Account task click");
	Thread.sleep(20000);

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
	workflow.clickGlobalSearch().sendKeys(acname);
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
	workflow.clickGlobalSearch().click();
	workflow.clickGlobalSearch().clear();
	
	Thread.sleep(1000);
	workflow.clickGlobalSearch().click();
	workflow.clickGlobalSearch().sendKeys("WorkflowAssociatedModule586");
	
	mouseActionRightClick(driver, workflow.clickAccountList());
	logger.info("right click account list Mousehover");
	Thread.sleep(5000);
	//Thread.sleep(2000);
	workflow.ClickOnEdit().click();
	logger.info("Clicked on ClickOnEdit button");
	Thread.sleep(6000);

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

	workflow.clickMisc().click(); logger.info("click misc"); 
	Thread.sleep(5000);

	workflow.clickWorkflow().click();
//	workflow.clickWorkflow().clear();
	//workflow.clickWorkflow().click();
	logger.info("click workflow");
	Thread.sleep(8000);
	
	workflow.clickGlobalSearch().sendKeys(wfname);
	logger.info("click search workflow");
	Thread.sleep(7000);
	
	workflow.clickWorklowlist().click();
	logger.info("click workflow list");
	Thread.sleep(5000);
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

	
	}
		
	}

