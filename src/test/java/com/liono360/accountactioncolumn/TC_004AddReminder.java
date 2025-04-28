package com.liono360.accountactioncolumn;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.LeadWorkFlow.CommonMethods;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountActionColumnPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_004AddReminder extends Baseclass{

	@Test
	public void TC_004AddReminderTest() throws InterruptedException, IOException {

AccountActionColumnPage Actioncolumn = new AccountActionColumnPage(driver);
		
		ExcelDataProvider excel = new ExcelDataProvider();
		Actions action = new Actions(driver);
		
		TryClick(Actioncolumn.Accounts());
		logger.info("Clicked on Accounts");
		
		
		TryClick(Actioncolumn.Remindericon());
		logger.info("Clicked on Reminder icon");
		
		
		TryClick(Actioncolumn.NewReminder());
		logger.info("Clicked on new Reminder");
		
		
		
		CommonMethods commonMethods= new CommonMethods();
		String enddate=commonMethods.EndDate();
		TryClick(Actioncolumn.selectClosedate());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[1]")).click();
		}
		catch(Exception e) {}
		try {
			driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[2]")).click();	    }
		catch(Exception e) {}
		logger.info("end date added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		SelectDropdown(Actioncolumn.Hour(),4);
		logger.info("Selected Hour");
		
		
		SelectDropdown(Actioncolumn.Minutes(),3);
		logger.info("Selected Minutes");
		
		SelectDropdown(Actioncolumn.Meridiem(),2);
		logger.info("Selected Meridiem");
		
		
		
		explWaitToClick(Actioncolumn.Reminderdescription());
		Thread.sleep(2000);
		Actioncolumn.Reminderdescription().sendKeys(excel.Comment());
		logger.info("Reminder Description Added");
		
		
		
		TryClick(Actioncolumn.Savereminder());
		logger.info("Clicked on Save Reminder");
		
		
		
		
		Thread.sleep(1000);
		if (Actioncolumn.VerifyReminder().isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Reminder Created Successfully");
		} else {
			Assert.assertTrue(false);
			logger.info("Reminder not Created Successfully");
		}
		
		
		
		
	}

}
