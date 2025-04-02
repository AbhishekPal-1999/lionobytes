package com.liono360.WorkflowAccount;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkFlowPage;

public class TC_023CreatedWithETETmeetcriteraWithMultipleFilter extends Baseclass{
	String wfname = null;

	@Test
	public void CreatedWithETETmeetcriteraWithMultipleFilter() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[normalize-space()='Associated Module Rule']")).click();
		Thread.sleep(1000);
		logger.info("Associated module rule");
		driver.findElement(By.xpath("//span[normalize-space()='Associated with']")).click();
		Thread.sleep(1000);
		logger.info("Associated Rule");
		
		driver.findElement(By.xpath("//li[@aria-label='Contact']")).click();
		Thread.sleep(2000);
		logger.info("contact click");
		driver.findElement(By.xpath("//span[normalize-space()='Select Template']")).click();
		Thread.sleep(1000);
		logger.info("select template");
		driver.findElement(By.xpath("//span[normalize-space()='Contact Template']")).click();
		Thread.sleep(2000);
		logger.info("contact Template");
		
		driver.findElement(By.xpath("(//span[text()='1XR'])[1]")).click();
		Thread.sleep(500);
		logger.info("click select filter");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		logger.info("click input field");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("First Name");
		
		driver.findElement(By.xpath("//span[normalize-space()='First Name']")).click();
		logger.info("fill first name");
		//workflow.clickSelectOperator().click();
		Thread.sleep(2000);
		logger.info("click Select operator");
		driver.findElement(By.xpath("(//p-dropdown[@placeholder='select'])[2]")).click();
		//workflow.clickOperatorOptionIsEqual().click();
		driver.findElement(By.xpath("//li[@aria-label='HasValue']")).click();
		logger.info("click has value");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-hidden='false']//div[@title='Add Rule']")).click();
		logger.info("click add rule");
		Thread.sleep(1000);
		workflow.clickSelectRuleFilter3().click();
		//driver.findElement(By.xpath("(//span[text()='1XR'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		logger.info("click input field");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Last Name");
		
		driver.findElement(By.xpath("//span[normalize-space()='Last Name']")).click();
		logger.info("fill first name");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//p-dropdown[@placeholder='select'])[3]")).click();
		//workflow.clickSelectOperator().click();
		Thread.sleep(2000);
		logger.info("click Select operator");

		//workflow.clickOperatorOptionIsEqual().click();
		driver.findElement(By.xpath("(//li[@aria-label='HasValue'])")).click();
		logger.info("click has value");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@aria-hidden='false']//div[@title='Add Rule']")).click();
		logger.info("click add rule");
		Thread.sleep(1000);
		workflow.clickSelectRuleFilter4().click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		logger.info("click input field");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("CreatedBy");
		
		driver.findElement(By.xpath("//span[normalize-space()='CreatedBy']")).click();
		logger.info("click created by");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(text(),'Select Items')])[1]")).click();
		
		driver.findElement(By.xpath("//input[@role='textbox']")).click();
		logger.info("click textbox");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Andrew");
		logger.info("fil andrew");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[normalize-space()='Andrew']")).click();
		logger.info("click andrew");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@aria-hidden='false']//div[@title='Add Rule']")).click();
		logger.info("click add rule");
		workflow.clickSelectRuleFilter5().click();
		logger.info("click add rule");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		logger.info("click input field");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Country");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Country')])[1]")).click();
		logger.info("click country");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p-dropdown[@placeholder='select'])[5]")).click();
		logger.info("click operator");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//li[@aria-label='HasValue'])")).click();
		logger.info("click has value");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-hidden='false']//div[@title='Add Rule']")).click();
		logger.info("click add rule");
		workflow.clickSelectRuleFilter6().click();
		logger.info("click add rule");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		logger.info("click input field");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Email");
		logger.info("click email field");
		driver.findElement(By.xpath("//span[normalize-space()='Email']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p-dropdown[@placeholder='select'])[6]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[normalize-space()='Contains']")).click();
		Thread.sleep(500);
		logger.info("click contain rule");
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[5]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[5]")).sendKeys("Automation123@gmail.com");
		Thread.sleep(500);
		
		String email=(driver.findElement(By.xpath("(//input[@placeholder='Enter'])[5]"))).getAttribute("value");
		driver.findElement(By.xpath("//div[@aria-hidden='false']//div[@title='Add Rule']")).click();
		logger.info("click add rule");
		Thread.sleep(2000);
		workflow.clickSelectRuleFilter7().click();
		logger.info("click add rule");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		logger.info("click input field");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Job Function");
		logger.info(" fill job function field");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Job Function']")).click();
		logger.info("click job function field");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p-dropdown[@placeholder='select'])[7]")).click();
		logger.info(" select operator field");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@aria-label='HasValue'])")).click();
		logger.info("click has value");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-hidden='false']//div[@title='Add Rule']")).click();
		logger.info("click add rule");
		Thread.sleep(2000);
		workflow.clickSelectRuleFilter8().click();
		logger.info("click add rule");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		logger.info("click input field");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Street Address");
		logger.info("fill street field");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[@aria-label='Street Address 1']")).click();
		logger.info("click street field");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//p-dropdown[@placeholder='select'])[8]")).click();
		logger.info("select operator field");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[@aria-label='Contains']")).click();
		logger.info("fill operator field");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[7]")).click();
		logger.info("click enter  field");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[7]")).sendKeys("USA 112");
		logger.info("fill street addresss  field");
		Thread.sleep(1000);
		String address=(driver.findElement(By.xpath("(//input[@placeholder='Enter'])[7]"))).getAttribute("value");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@aria-hidden='false']//div[@title='Add Rule']")).click();
		logger.info("click add rule");
		Thread.sleep(2000);
		workflow.clickSelectRuleFilter9().click();
		logger.info("click add rule");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		logger.info("click input field");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Street Address 2");
		logger.info("fill street field");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[@aria-label='Street Address 2']")).click();
		logger.info("click street field");
		driver.findElement(By.xpath("(//p-dropdown[@placeholder='select'])[9]")).click();
		logger.info("select operator field");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[@aria-label='Contains']")).click();
		logger.info("fill operator field");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[8]")).click();
		logger.info("click enter  field");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@placeholder='Enter'])[8]")).sendKeys("Delhi");
		logger.info("fill street addresss  field");
		Thread.sleep(500);
		String address1=(driver.findElement(By.xpath("(//input[@placeholder='Enter'])[8]"))).getAttribute("value");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']//span[@class='p-button-label'][normalize-space()='Save']")).click();
		logger.info("click saved associated module");
		Thread.sleep(2000);
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
		Thread.sleep(00150);
		logger.info("click Yes Button");
		// Open the button link in a new tab
		
		action.keyDown(Keys.CONTROL).click(workflow.clickAccounts()).keyUp(Keys.CONTROL).perform();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));
		Thread.sleep(20000);
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

		
		
		workflow.Email().click();
		workflow.Email().sendKeys(email);
		logger.info("sendkeys on email");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p-multiselect[@placeholder='Select Job Function...']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[normalize-space()='Super Admin']")).click();
		Thread.sleep(1000);
		logger.info("select job funtion");
		Thread.sleep(2000);
		workflow.AccountName().click();
		workflow.AccountName().sendKeys(acname);
		logger.info("sendkeys on accountname");
		Thread.sleep(2000);

		workflow.AdressDetails().click();
		logger.info("click on AdressDetails");
		
		//Thread.sleep(2000);

		workflow.AdressDetailsIcon().click();
		logger.info("click on AdressDetails Icon");
		
		
		//Thread.sleep(3000);
		
		workflow.AdressType1().click();
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='Mailing']")));
		driver.findElement(By.xpath("//span[text()='Mailing']")).click();
		logger.info("select on accountType");
		
		//Thread.sleep(2000);
		
		workflow.AdressClass().click();
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='Residential']")));
		driver.findElement(By.xpath("//span[text()='Residential']")).click();
		logger.info("select on AdressClass");
		

		workflow.StreetAdress1().sendKeys(address);
		Thread.sleep(4000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		
		
		Thread.sleep(2000);
		
		workflow.StreetAdress2().sendKeys(address1);
		logger.info("sendkeys on StreetAdress2");
		
	
		workflow.SaveAccountDetails().click();
		logger.info("click on SaveAccountDetails button");
		Thread.sleep(10000);
		//Thread.sleep(2000);
		//explWaitToClick(account.SaveAllDeatilsBtn());
		workflow.SaveAllDeatilsBtn().click();
		logger.info("click on SaveAllDeatilsBtn button");
		
		Thread.sleep(10000);
				workflow.clickAccountList().click();
		logger.info("click on Account list");
		Thread.sleep(20000);
		workflow.clickAccountTask().click();
		logger.info("click on Account task");
		Thread.sleep(5000);
		workflow.clickAccountList().click();
		logger.info("click on Account list");
		Thread.sleep(20000);
		
		workflow.clickAccounttaskclick().click();
		logger.info("click on Account task click");
		Thread.sleep(8000);
		workflow.clickMisc().click(); logger.info("click misc"); Thread.sleep(5000);

		workflow.clickWorkflow().click();
		logger.info("click workflow");
		Thread.sleep(5000);
		workflow.clickGlobalSearch().sendKeys(wfname);
		logger.info("fill global search");
		Thread.sleep(5000);
		workflow.clickWorklowlist().click();
		logger.info("click workflow list"); Thread.sleep(2000);
		workflow.clickHistory().click(); Thread.sleep(5000);
		logger.info("click Yes Button"); workflow.clickAllActionType().click();
		Thread.sleep(5000); logger.info("click All action type");
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
		workflow.clickHistory().click(); Thread.sleep(180000);
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
		action.keyDown(Keys.CONTROL).click(workflow.clickAccounts()).keyUp(Keys.CONTROL).perform();
	//	action.keyDown(Keys.CONTROL).click(workflow.clickAccounts()).keyUp(Keys.CONTROL).perform();
		Thread.sleep(15000);

		 

		ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(tabs1.get(1));
		workflow.clickGlobalSearch().sendKeys("Associated Automation");
		logger.info("fill global search");
		Thread.sleep(7000);
		//workflow.clickAccountList().click();
		//logger.info("click account list");
		Thread.sleep(10000);
		mouseActionRightClick(driver, workflow.clickAccountList());
workflow.clickEdit().click();
logger.info("click  editsearch");

Thread.sleep(7000);
workflow.clickSave().click();
Thread.sleep(7000);
workflow.clickWorkflow().click();
logger.info("click workflow");
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
workflow.clickHistory().click(); Thread.sleep(180000);
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


		
	}

	

}
