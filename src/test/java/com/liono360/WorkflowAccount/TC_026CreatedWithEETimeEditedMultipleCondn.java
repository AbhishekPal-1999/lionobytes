package com.liono360.WorkflowAccount;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkFlowPage;

public class TC_026CreatedWithEETimeEditedMultipleCondn extends Baseclass{
	String wfname=null;
	@Test
	public void CreatedWithEETimeEditedMultipleCondn() throws InterruptedException {
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
		logger.info("select default channel");
		
		driver.findElement(By.xpath("(//div[@class='p-radiobutton-box'])[3]")).click();
		logger.info("select created nd everytime edited till meet criteria");
		Thread.sleep(2000);
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
		workflow.clickValueEnter().sendKeys("WorkflowAssociatedModule" + randomnumber());
		Thread.sleep(1000);
		logger.info("fill Value");
		String acname=workflow.clickValueEnter().getAttribute("value");


		workflow.clickAddRuleManual().click();
		//Thread.sleep(3000);
		logger.info("click Add Rule");
		Thread.sleep(1000);
		workflow.clickSelectRuleFilter2().click();
		logger.info("click select filter");
		workflow.clickAccountEmail().click();
		logger.info("click Account Email");

		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[2]")).click();

		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[2]")).sendKeys("Automation"+randomnumber()+"@Gmail.com");

		String AccountEmail=(driver.findElement(By.xpath("(//input[@placeholder='Enter'])[2]"))).getAttribute("value");
		workflow.clickAddRuleManual().click();
		logger.info("click Add Rule Manual");
		workflow.clickSelectRuleFilter3().click();
		logger.info(" select rule filter 3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@aria-label='Account No.']//div[@tooltipposition='top']//span")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'IsEqualTo')])[3]")).click();

		//workflow.clickSelectOperator().click();
		Thread.sleep(2000);
		logger.info("click Select operator");

		driver.findElement(By.xpath("//li[@aria-label='Contains']")).click();
		logger.info("click contains");

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

		driver.findElement(By.xpath("(//button[@label='Save'])[2]")).click();
		//workflow.clickSave().click();
		logger.info("click save");
		Thread.sleep(3000);

		workflow.clickPreviewData().click();
		logger.info("click Preview");
		Thread.sleep(3000);

		workflow.clickCancel().click();
		logger.info("click cancel");
		Thread.sleep(1000);

		workflow.clickAddAction().click();
		logger.info("click Add Actions");
		Thread.sleep(1000);
		workflow.clickAddTask().click();
		logger.info("click Add task");
		Thread.sleep(1000);



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

		workflow.clickManualCondition().click();
		Thread.sleep(2000);
		logger.info("click manual condition");

		workflow.clickAddRule().click();
		Thread.sleep(2000);
		logger.info("click  add rule");

		workflow.clickSelectFilter().click();
		Thread.sleep(1000);
		logger.info("click select filter");
		workflow.clickAccountSource().click();
		Thread.sleep(1000);
		logger.info("click acccount source");
		driver.findElement(By.xpath("(//span[contains(text(),'IsEqualTo')])[1]")).click();	
		//workflow.clickSelectOperator().click();
		Thread.sleep(1000);
		logger.info("click select operator");
		driver.findElement(By.xpath("//li[@aria-label='HasValue']//span[1]")).click();
		Thread.sleep(1000);
		logger.info("click has value");

		workflow.clickAddRuleManual().click();
		Thread.sleep(1000);
		logger.info("click add rule manual");
		workflow.clickSelectRuleFilter2().click();
		//		Thread.sleep(1000);
		logger.info("click rule filter 2");
		driver.findElement(By.xpath("//li[@aria-label='Account Type(s)']")).click();
		logger.info("click on Account type");
		driver.findElement(By.xpath("(//span[normalize-space()='IsEqualTo'])[1]")).click();
		//	workflow.clickSelectOperator().click();
		Thread.sleep(1000);
		logger.info("click select operator");
		driver.findElement(By.xpath("//li[@aria-label='HasValue']//span[1]")).click();
		Thread.sleep(1000);
		logger.info("click has value");
		workflow.clickAddRuleManual().click();
		Thread.sleep(1000);
		logger.info("click add rule manual 2");
		workflow.clickSelectRuleFilter3().click();
		logger.info("click select filter rule 3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Activation Number");
		driver.findElement(By.xpath("//li[@aria-label='Activation Number']//div[@tooltipposition='top']//span")).click();
		Thread.sleep(1000);
		logger.info("click Activation number ");
		driver.findElement(By.xpath("(//span[normalize-space()='IsEqualTo'])[1]")).click();
		//	workflow.clickSelectOperator().click();
		Thread.sleep(1000);
		logger.info("click select operator");
		driver.findElement(By.xpath("//li[@aria-label='HasValue']//span[1]")).click();
		Thread.sleep(1000);
		logger.info("click has value");
        driver.findElement(By.xpath("(//button[@label='Save'])[2]")).click();
		//workflow.clickSave().click();
		Thread.sleep(1000);
		logger.info("click save");
		workflow.clickAddAction().click();
		logger.info("click Add Actions");
		Thread.sleep(1000);
		workflow.clickAddTask().click();
		logger.info("click Add task");
		Thread.sleep(1000);



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
		/*
		 * jsClick(driver, workflow.clickchecklist()); // Thread.sleep(3000);
		 * logger.info("click checklist");
		 * 
		 * workflow.clickchecklistfill().click(); // Thread.sleep(2000);
		 * logger.info("click checklist fill");
		 * workflow.clickchecklistfill().sendKeys("checklist"+randomstring()); //
		 * Thread.sleep(1000); logger.info("checklist fill");
		 * 
		 * driver.findElement(By.xpath("(//button[@label='Save'])[3]")).click(); //
		 * Thread.sleep(5000); logger.info("click saved");
		 */
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		//	Thread.sleep(1000);
		logger.info("click saved task");

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
		workflow.clickManualCondition().click();
		Thread.sleep(1000);
		logger.info("click manual condition");
        workflow.clickAddRule().click();
		//workflow.clickAddRuleManual().click();
		Thread.sleep(1000);
		logger.info("click Add Rule manual condition");

		workflow.clickSelectFilter().click();
		logger.info("click Select filter");

		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Address");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@tooltipposition='top']//span")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='IsEqualTo'])[1]")).click();
		//	workflow.clickSelectOperator().click();
		Thread.sleep(1000);
		logger.info("click select operator");
		driver.findElement(By.xpath("//li[@aria-label='HasValue']//span[1]")).click();
		Thread.sleep(1000);
		logger.info("click has value");

		workflow.clickAddRuleManual().click();
		//	Thread.sleep(1000);
		logger.info("click add Rule manual");

		workflow.clickSelectRuleFilter2().click();
		Thread.sleep(1000);
		logger.info("click  select Rule filter 2");

		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("country");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@tooltipposition='top']//span")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='IsEqualTo'])[1]")).click();
		//	workflow.clickSelectOperator().click();
		Thread.sleep(1000);
		logger.info("click select operator");
		driver.findElement(By.xpath("//li[@aria-label='HasValue']//span[1]")).click();
		Thread.sleep(1000);
		logger.info("click has value");
		workflow.clickAddRuleManual().click();
		workflow.clickSelectRuleFilter3().click();
		Thread.sleep(1000);
		logger.info("click select rule filter 3");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("CreatedBy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@tooltipposition='top']//span")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Select Items')]")).click();
		logger.info("click select item");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Andre");
		Thread.sleep(1000);
		workflow.clickSelectandrew().click();
		Thread.sleep(1000);
		workflow.clickAddRuleManual().click();
		workflow.clickSelectRuleFilter4().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Currency");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@tooltipposition='top']//span")).click();

		logger.info("click  select rule filter 4");
		//	workflow.clickCurrency().click();
		//	logger.info("click  currency");

		driver.findElement(By.xpath("(//span[contains(text(),'IsEqualTo')])[2]")).click();
		logger.info("click  operator");
		driver.findElement(By.xpath("//li[@aria-label='HasValue']//span[1]")).click();
		Thread.sleep(1000);
		logger.info("click has value");

		workflow.clickAddRuleManual().click();

		workflow.clickSelectRuleFilter5().click();
		Thread.sleep(1000);
		logger.info("click select rule filter 5");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Email address");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@tooltipposition='top']//span")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'IsEqualTo')])[2]")).click();
		logger.info("click  operator");
		driver.findElement(By.xpath("//li[@aria-label='HasValue']//span[1]")).click();
		Thread.sleep(1000);
		logger.info("click has value");
		workflow.clickAddRuleManual().click();

		workflow.clickSelectRuleFilter6().click();
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Founded year");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@tooltipposition='top']//span")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[5]")).click();

		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[5]")).sendKeys("2000");
		driver.findElement(By.xpath("(//button[@label='Save'])[2]")).click();
	//	workflow.clickSave().click();
		Thread.sleep(1000);
		workflow.clickAddAction().click();
		logger.info("click Add Actions");
		Thread.sleep(1000);
		workflow.clickAddTask().click();
		logger.info("click Add task");
		Thread.sleep(1000);



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
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		//	Thread.sleep(1000);
		logger.info("click saved task");

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
		
		workflow.clickManualCondition().click();
		logger.info("click manaual condn");
		
		workflow.clickAddRule().click();
		logger.info("click Add rule manual");
		
		workflow.clickSelectFilter().click();
		logger.info("click select filter");
		
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Street Address");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@tooltipposition='top']//span")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[1]")).sendKeys("10808 Culver Boulevard Park West");
		
		driver.findElement(By.xpath("(//button[@label='Save'])[2]")).click();
		
		workflow.clickAddAction().click();
		logger.info("click Add Actions");
		Thread.sleep(1000);
		workflow.clickAddTask().click();
		logger.info("click Add task");
		Thread.sleep(1000);



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
	
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		//	Thread.sleep(1000);
		logger.info("click saved task");

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
	//	workflow.clickAccountEmail().click();
	//	workflow.clickAccountEmail().sendKeys(AccountEmail);
		workflow.Email().sendKeys(AccountEmail);
		logger.info("Sendkeys on email");
		
		Thread.sleep(1000);
	///	explWaitToClick(account.Phone1());
		workflow.Phone1().sendKeys(PhoneNo);
		logger.info("Sendkeys on phone1");
		Thread.sleep(1000);
		
	workflow.AccountName().click();
	workflow.AccountName().sendKeys(acname);
	logger.info("click Account name");
	Thread.sleep(1000);
	workflow.accountNumber().sendKeys(AccountNumber);
	logger.info("Sendkeys on accountNumber");
	Thread.sleep(1000);
	workflow.Currency().click();
	//	Thread.sleep(3000);
		//explWaitToClick(driver.findElement(By.xpath("//li[@aria-label='Baht - THB']")));
		driver.findElement(By.xpath("//li[@aria-label='Baht - THB']")).click();
		logger.info("select on dropdown");
		Thread.sleep(1000);
	workflow.AccountDetails().click();
	logger.info("sendkeys on account details");
	Thread.sleep(1000);
	workflow.FoundedYear().sendKeys("2000");
	logger.info("sendkeys on founded years");
	Thread.sleep(2000);
	workflow.AccountSource().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Book']")));
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		logger.info("select on dropdown AccountSource");
		Thread.sleep(1000);
		workflow.AdressDetails().click();
		logger.info("click on AdressDetails");
		
		Thread.sleep(1000);
	//	explWaitToClick(account.AdressDetailsIcon());
		workflow.AdressDetailsIcon().click();
		logger.info("click on AdressDetails Icon");
	//	Thread.sleep(2000);
		/*
		 * driver.findElement(By.xpath("//span[normalize-space()='Select Address Type']"
		 * )).click(); logger.info("  click on address type"); //Thread.sleep(2000);
		 * explWaitToClick(account.ShippingIiIcon()); account.ShippingIiIcon().click();
		 * logger.info("click on ShippingIiIcon");
		 */
		
		//Thread.sleep(2000);
		/*
		 * explWaitToClick(account.Slyders()); account.Slyders().click();
		 * logger.info("click on ShippingIiIcon");
		 */
		
		
		
	Thread.sleep(1000);
		//explWaitToClick(account.AdressType1());
		workflow.AdressType1().click();
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='Mailing']")));
		driver.findElement(By.xpath("//span[text()='Mailing']")).click();
		logger.info("select on accountType");
		
		//Thread.sleep(2000);
		//explWaitToClick(account.AdressClass());
		workflow.AdressClass().click();
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='Residential']")));
		driver.findElement(By.xpath("//span[text()='Residential']")).click();
		logger.info("select on AdressClass");
		
		//Thread.sleep(2000);
		//explWaitToClick(account.StreetAdress1());
		//Thread.sleep(2000);
		workflow.StreetAdress1().sendKeys("10808 Culver Boulevard Park West");
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		
		
		//Thread.sleep(2000);
		//explWaitToClick(account.StreetAdress2());
		workflow.StreetAdress2().sendKeys("Delhi");
		logger.info("sendkeys on StreetAdress2");
	
		
		
		//Thread.sleep(2000);
		//explWaitToClick(account.SaveAccountDetails());
		workflow.SaveAccountDetails().click();
		logger.info("click on SaveAccountDetails button");
		
		Thread.sleep(2000);
		//explWaitToClick(account.SaveAllDeatilsBtn());
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


