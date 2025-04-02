package com.liono360.WorkflowAccount;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkFlowPage;

public class TC_012TimeBasedWorkflowMultipleRule extends Baseclass{
	String wfname=null;

	@Test
	public void TimeBasedWorkflowMultipleRule() throws Exception {
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
		Thread.sleep(4000);
		logger.info("select channel");
		driver.findElement(By.xpath("//li[@aria-label='Default Channel']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p-radiobutton[@name='workflowType']//div[@class='p-radiobutton p-component']")).click();
		Thread.sleep(2000);
		logger.info("Time Based");
		logger.info("select default channel");
		workflow.clickNext().click();
		//Thread.sleep(2000);
		logger.info("click Next");

		workflow.clickManualCondition().click();
		//Thread.sleep(2000);
		logger.info("click manual condition");

		workflow.clickAddRule().click();
		//Thread.sleep(3000);
		logger.info("click Add Rule");
		Thread.sleep(1000);
		workflow.clickSelectFilter().click();
		logger.info("click select filter");
		workflow.clickAccountEmail().click();
		logger.info("click Account Email");

		workflow.clickValueEnter().click();
		
		workflow.clickValueEnter().sendKeys("Automation"+randomnumber()+"@Gmail.com");
		
		String AccountEmail=workflow.clickValueEnter().getAttribute("value");
		logger.info("Fill Account Email");
		workflow.clickAddRuleManual().click();
		Thread.sleep(1000);
		workflow.clickSelectRuleFilter2().click();
		logger.info("click select filter");
		workflow.clickAccountName().click();
		logger.info("click Account name");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[2]")).click();
		logger.info("click value enter");
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[2]")).sendKeys("WorkflowMultiple"+randomnumber());
		String AccountName=		(driver.findElement(By.xpath("(//input[@placeholder='Enter'])[2]"))).getAttribute("value");
		workflow.clickAddRuleManual().click();
		logger.info("click Add Rule Manual");
		workflow.clickSelectRuleFilter3().click();
		logger.info(" select rule filter 3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@aria-label='Account No.']//div[@tooltipposition='top']//span")).click();


		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[3]")).click();

		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[3]")).sendKeys("6789"+randomnumber());

		logger.info(" fil account Number ");
        String AccountNumber=(driver.findElement(By.xpath("(//input[@placeholder='Enter'])[3]"))).getAttribute("value");
		workflow.clickAddRuleManual().click();
		logger.info("click Add Rule Manual");
		workflow.clickSelectRuleFilter4().click();
		logger.info("click select rule filter 4");
		workflow.clickAccountPhone().click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[4]")).click();

		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[4]")).sendKeys("9876543"+randomnumber());
		logger.info("fill phone number");
		String PhoneNo=	(driver.findElement(By.xpath("(//input[@placeholder='Enter'])[4]"))).getAttribute("value");

		workflow.clickAddRuleManual().click();
		logger.info("click Add Rule Manual");
		workflow.clickSelectRuleFilter5().click();
		logger.info("select rule filter 5");
		Thread.sleep(1000);
		
		//workflow.clickAccountSource().click();
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Number of employe");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@role='listbox']")).click();
		Thread.sleep(1000);

		logger.info("select account employee");
		//driver.findElement(By.xpath("//ul[@role='listbox']")).click();
		logger.info("select item");
		Thread.sleep(1000);

	//	driver.findElement(By.xpath("//p-multiselectitem//li[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Select Items')])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
		String NumberOfEmployees=(driver.findElement(By.xpath("//p-multiselectitem//li[1]"))).getText();

		
		Thread.sleep(3000);
		workflow.clickAddRuleManual().click();
		logger.info("click Add Rule Manual");
		Thread.sleep(4000);
		workflow.clickSelectRuleFilter6().click();
		logger.info("click select filter 6");
		driver.findElement(By.xpath("//li[@aria-label='Account Type(s)']//div[@tooltipposition='top']//span")).click();
		Thread.sleep(4000);
		logger.info("click account type");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[contains(text(),'Select Items')]")).click();
		logger.info("click select item");
		Thread.sleep(2000);
		String Accounttype=(driver.findElement(By.xpath("//p-multiselectitem//li[1]"))).getText();

		driver.findElement(By.xpath("//p-multiselectitem//li[1]")).click();
		
		logger.info("click account test");
		Thread.sleep(2000);
		//jsScroll(driver,driver.findElement(By.xpath("(//button[@type='submit'])[1]")));
		workflow.clickAddRuleManual().click();
		logger.info("click Add Rule Manual");
		workflow.clickSelectRuleFilter7().click();
		logger.info("click select filter 7");
		driver.findElement(By.xpath("//li[@aria-label='Activation Number']//div[@tooltipposition='top']//span")).click();
		logger.info("click activation number");

		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[5]")).click();
		logger.info("fill activation number");

		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[5]")).sendKeys("98776"+randomnumber());
		String ActivationNumber=(driver.findElement(By.xpath("(//input[@placeholder='Enter'])[5]"))).getAttribute("value");
		workflow.clickAddRuleManual().click();
		logger.info("click Add Rule Manual");
		Thread.sleep(2000);
		workflow.clickSelectRuleFilter8().click();
		logger.info("click select filter 8");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-label='Address']//div[@tooltipposition='top']//span")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[6]")).click();
		logger.info("click address ");
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[6]")).sendKeys(" 11 Howard Street Manhattan");
		String Address=(driver.findElement(By.xpath("(//input[@placeholder='Enter'])[6]"))).getAttribute("value");

		workflow.clickAddRuleManual().click();
		logger.info("click add rule manual");
		Thread.sleep(2000);
		workflow.clickSelectRuleFilter9().click();
		logger.info("select rule filter 9");
		Thread.sleep(2000);
		workflow.clickCreatedBy().click();
		logger.info("click created by");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Select Items')]")).click();
		logger.info("click select item");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Andre");
		Thread.sleep(1000);
		workflow.clickSelectandrew().click();
		Thread.sleep(1000);
		workflow.clickAddRuleManual().click();
		logger.info("click add rule manual");
		Thread.sleep(3000);

		workflow.clickSelectRuleFilter10().click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("ownership");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@tooltipposition='top']//span")).click();

	
		//workflow.clickCurrency().click();
		Thread.sleep(3000);
		logger.info("click Value Enter");
		driver.findElement(By.xpath("(//div[contains(text(),'Select Items')])[1]")).click();
		Thread.sleep(1000);
		logger.info("click select iteem");
		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
		String ownership=(driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li"))).getText();
		workflow.clickAddRuleManual().click();
		Thread.sleep(2000);
		logger.info("click add rule manual");
		Thread.sleep(2000);
		workflow.clickSelectRuleFilter11().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Founded year");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@tooltipposition='top']//span")).click();

		logger.info("click founded year");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[7]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[7]")).sendKeys("2000");
		String foundedYear=(driver.findElement(By.xpath("(//input[@placeholder='Enter'])[7]"))).getAttribute("value");
		workflow.clickSubmit().click();
		//  Thread.sleep(1000);
		logger.info("click submit");

	//	workflow.clickPreviewData().click();
		//	Thread.sleep(8000);
		//logger.info("click on Submit");

		//workflow.clickCancel().click();
		//Thread.sleep(2000);
		//logger.info("click on cancel");

		workflow.clickAddAction().click();
		//Thread.sleep(2000);
		logger.info("click on Add Action");

		workflow.clickEmailAlert().click();
		//Thread.sleep(2000);
		logger.info("click on Email Alert");

		workflow.clickSelectuser().click();
		//	Thread.sleep(2000);
		logger.info("click on select user");

		workflow.clickuserhirerachy().click();
		logger.info("click on select user hirarchy");
		Thread.sleep(2000);

		workflow.clickSelectUserOption().click();
		//Thread.sleep(2000);
		logger.info("click on select user");
		driver.findElement(By.xpath("//div[@aria-label='Ruchika jaiswal']")).click();
		logger.info("click on user");
		//	Thread.sleep(2000);

		workflow.clickSelectuser().click();
		//	Thread.sleep(2000);
		logger.info("click on select user");
		workflow.clickSelectTemplate().click();
		Thread.sleep(2000);
		logger.info("click Select template");

		workflow.clickSelectTemplateoption().click();
		//	Thread.sleep(2000);
		logger.info("click Select template option");

		workflow.clickSubmit().click();
		Thread.sleep(2000);
		logger.info("click saved workflow");

		workflow.clickAddAction().click();
		//	Thread.sleep(2000);
		logger.info("click on Add Action");
		workflow.clickAddTask().click();
		//	Thread.sleep(2000);
		logger.info("click on Add Task");
		workflow.clickassigntoselectuser().click();
		//	Thread.sleep(2000);
		logger.info("click on assign user");
		driver.findElement(By.xpath("(//p-multiselectitem/li)[34]")).click();
		//		Thread.sleep(2000);
		logger.info("click list of user");

		jsClick(driver,workflow.clicktaskDescription());
		//	Thread.sleep(5000);
		logger.info("click task description");
		workflow.clicktaskDescription().sendKeys("Task created successfully"+randomstring());
		Thread.sleep(2000);
		logger.info("fill task description");
		jsClick(driver, workflow.clickchecklist());
		//		Thread.sleep(3000);
		logger.info("click checklist");

		workflow.clickchecklistfill().click();
		//	Thread.sleep(2000);
		logger.info("click checklist fill");
		workflow.clickchecklistfill().sendKeys("checklist"+randomstring());
		//	Thread.sleep(1000);
		logger.info("checklist fill");

		driver.findElement(By.xpath("(//button[@label='Save'])[3]")).click();
		//	Thread.sleep(5000);
		logger.info("click saved");

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		//	Thread.sleep(1000);
		logger.info("click saved task");


		workflow.clicktriggertime().click();
		//	Thread.sleep(2000);
		logger.info("click trigger");

		workflow.clicktime().click();
		Thread.sleep(1000);
		logger.info("click time value");

		workflow.clicktime().sendKeys("1");
		//	Thread.sleep(1000);
		logger.info("fill time");

		workflow.clicktriggertime2().click();
		Thread.sleep(1000);
		logger.info("click trigger dropdwon");

		driver.findElement(By.xpath("//span[normalize-space()='Minutes']")).click();
		//	Thread.sleep(1000);
		logger.info("click Minute");

		workflow.clickSubmit().click();
		//	Thread.sleep(1000);
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
		//	Thread.sleep(3000);
		logger.info("click Yes Button");

		Thread.sleep(5000);
		
		 
		createAccount(AccountName,AccountEmail,AccountNumber,PhoneNo,NumberOfEmployees,Accounttype,ActivationNumber,Address,ownership,foundedYear);
		
	}
	//Create Account
	public void createAccount(String account,String AccountEmail,String AccountNumber,String PhoneNo,String NumberOfEmployees,String Accounttype,String ActivationNumber,String Address,String ownership ,String foundedYear) throws InterruptedException {
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

		workflow.AccountName().click();
		workflow.AccountName().sendKeys(account);
		logger.info("sendkeys on accountname");
	//	Thread.sleep(4000);
		
		workflow.AccountEmail().click();
	    workflow.AccountEmail().sendKeys(AccountEmail);
		logger.info("sendkeys on accountemail");
	//	Thread.sleep(4000);
		workflow.AccountPhone().click();
		workflow.AccountPhone().sendKeys(PhoneNo);
		logger.info("sendkeys on account phone");
	//	Thread.sleep(4000);
        workflow.accountNumber().click();
        workflow.accountNumber().sendKeys(AccountNumber);
		logger.info("sendkeys on accountnumber");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//p-multiselect[@placeholder='Select Account Type(s)...']")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
		//driver.findElement(By.xpath("//span[text()='"+Accounttype+"']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("driver.findElement(By.xpath(\"//p-multiselectitem//li[1]\"))")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[27]")).sendKeys(ActivationNumber);
		Thread.sleep(1000);
		
		

		workflow.AccountDetails().click();
		logger.info("click account detail");
		Thread.sleep(5000);

		

	       jsClick(driver,workflow.NumberOfEmp());
		//driver.findElement(By.xpath("(//div[@role='button'])[7]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//p-dropdownitem/li[@role='option'])[3]")).click();		Thread.sleep(1000);


		//workflow.clickAccountSource().click();
         //driver.findElement(By.xpath("//span[normalize-space()='"+AccountSource+"']")).click();
         Thread.sleep(2000);
    //  workflow.NumberOfEmp().click();
           
                  
         //workflow.Currency().sendKeys(currency);
         //Thread.sleep(2000);
         
       //driver.findElement(By.xpath("//span[normalize-space()='Select Ownership...']")).click();
 		jsClick(driver,workflow.SelectOwnership());
         Thread.sleep(4000);
          driver.findElement(By.xpath("//p-dropdownitem/li[1]")).click();
          Thread.sleep(2000);
         
         workflow.AdressDetails().click();
 		logger.info("click on AdressDetails");
        Thread.sleep(2000);

         workflow.AdressDetailsIcon().click();
 		logger.info("click on address detail icon");
        Thread.sleep(2000);

 		driver.findElement(By.xpath("//input[@placeholder='Enter a location']")).click();
 		logger.info("click on address detail icon");

        Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@placeholder='Enter a location']")).sendKeys(Address);
        Thread.sleep(2000);

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
		workflow.clickHistory().click(); Thread.sleep(120000);
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
