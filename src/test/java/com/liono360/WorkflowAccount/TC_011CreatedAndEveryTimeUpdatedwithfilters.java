package com.liono360.WorkflowAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkFlowPage;

public class TC_011CreatedAndEveryTimeUpdatedwithfilters  extends Baseclass {
	
	
	@Test
	public void CreatedAndEveryTimeUpdatedwithfilters() throws InterruptedException {
		redirectToCRM();
		WorkFlowPage workflow = new WorkFlowPage(driver);
		Actions action = new Actions(driver);

		workflow.clickAccounts().click();
		logger.info("Clicked on Account button");

		Thread.sleep(18000);
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

		workflow.AccountName().sendKeys("workflowAccount"+randomnumber());
		logger.info("sendkeys on accountname");
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//input[@type='text'])[27]")).click();
		logger.info("activation number");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[27]")).sendKeys("98766"+randomnumber());
		logger.info("fill activation number");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='accountNumber']")).click();
		logger.info("account number");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='accountNumber']")).sendKeys("87654"+randomnumber());
		logger.info(" fill account number");
		Thread.sleep(2000);
		workflow.AccountDetails().click();
		logger.info(" click account detail");
		Thread.sleep(2000);
		jsClick(driver,workflow.NumberOfEmp());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p-dropdownitem/li[@role='option'])[3]")).click();		Thread.sleep(1000);
		workflow.AdressDetails().click();
		logger.info("click on AdressDetails");

		//Thread.sleep(2000);
		workflow.AdressDetailsIcon().click();
		logger.info("click on AdressDetails Icon");



		workflow.AdressType1().click();
		driver.findElement(By.xpath("//span[text()='Mailing']")).click();
		logger.info("select on accountType");

		workflow.AdressClass().click();
		driver.findElement(By.xpath("//span[text()='Residential']")).click();
		logger.info("select on AdressClass");

		workflow.StreetAdress1().sendKeys("10808 Culver Boulevard Park West");
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);


		workflow.StreetAdress2().sendKeys("Delhi");
		logger.info("sendkeys on StreetAdress2");
		workflow.SaveAccountDetails().click();
		logger.info("click on SaveAccountDetails button");

		Thread.sleep(2000);
		//explWaitToClick(account.SaveAllDeatilsBtn());
		workflow.SaveAllDeatilsBtn().click();
		logger.info("click on SaveAllDeatilsBtn button");


		workflow.SaveAccountDetails().click();
		logger.info("click on SaveAccountDetails button");
		Thread.sleep(10000);
		workflow.clickMisc().click();
		Thread.sleep(2000);
		logger.info("click Misc");

		workflow.clickWorkflow().click();
		Thread.sleep(2000);
		logger.info("click Workflow");

		workflow.clickNew().click();
		Thread.sleep(2000);
		logger.info("click New");

		workflow.clickWorkflowName().click();
		Thread.sleep(1000);
		logger.info("click Workflow name");

		workflow.clickWorkflowName().sendKeys("WorkFlow1994"+randomnumber());
		Thread.sleep(2000);
		logger.info("fill Workflow name");

		workflow.clickSelectModule().click();
		Thread.sleep(2000);
		logger.info("select Workflow module");



		driver.findElement(By.xpath("//li[@aria-label='Account']")).click();
		Thread.sleep(2000);
		logger.info("select Workflow module account");
		driver.findElement(By.xpath("//span[normalize-space()='Select Channel']")).click();
		Thread.sleep(2000);
		logger.info("select channel");
		driver.findElement(By.xpath("//li[@aria-label='Default Channel']")).click();
		Thread.sleep(2000);
		logger.info("select default channel");
		workflow.clickCreatedEveryTimeEdited().click();
		Thread.sleep(2000);
		logger.info(" click Every time Edited");

		workflow.clickNext().click();
		Thread.sleep(2000);
		logger.info("click next");

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
		workflow.clickValueEnter().sendKeys("WorkFlowTestAccount16");
		Thread.sleep(1000);
		logger.info("fill Value");
	
        




	}

}
