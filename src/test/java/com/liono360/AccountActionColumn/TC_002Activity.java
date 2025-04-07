package com.liono360.AccountActionColumn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountActionColumnPage;
import com.liono360.utility.ExcelDataProvider;


public class TC_002Activity extends Baseclass {

	@Test
	public void TC_002ActivityTest() throws InterruptedException, IOException {
		
		
AccountActionColumnPage Actioncolumn = new AccountActionColumnPage(driver);
		
		ExcelDataProvider excel = new ExcelDataProvider();
		Actions action = new Actions(driver);
		
		TryClick(Actioncolumn.Accounts());
		logger.info("Clicked on Accounts");
		
		
		TryClick(Actioncolumn.Activityicon());
		logger.info("Clicked on Activity icon");
		
	//..................................Log Add........................................................//	
		TryClick(Actioncolumn.Plusicon());
		logger.info("Clicked on Plus icon");
		
		
		SelectDropdown(Actioncolumn.SelectType(),1);
		logger.info("Log Type is selected");
		
		explWaitToClick(Actioncolumn.Comments());
		Thread.sleep(2000);
		Actioncolumn.Comments().sendKeys(excel.Comment());
		logger.info("Log Comments Added");
		
		
		
		Thread.sleep(2000);
		String filepath=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Cases\\Case_Add Imports_With Default Fileds 1.1.xlsx";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"file\"]"))
		.sendKeys(filepath);
		logger.info("File Upload");

		
		
		TryClick(Actioncolumn.Save());
		logger.info("Clicked on Save");
		
		
		TryClick(Actioncolumn.Clickonlog());
		logger.info("Clicked on Log");
		
		
		
		explWaitToClick(Actioncolumn.Comments2());
		Thread.sleep(2000);
		Actioncolumn.Comments2().sendKeys(excel.Comment());
		logger.info("Child Comments Added");
		
		
		TryClick(Actioncolumn.Save2());
		logger.info("Clicked on Save");
		
		
	//................................Email Add.....................................................................//	
		
	
		
		TryClick(Actioncolumn.Emailtab());
		logger.info("Clicked on email tab");	
		
		
		TryClick(Actioncolumn.Plusiconemail());
		logger.info("Clicked on Plus icon");	
		Thread.sleep(3000);
		waitUntilPageLoad();
		Actioncolumn.To().sendKeys(excel.FirstName()+randomnumber()+"@yopmail.com");
//		Thread.sleep(5000);
//		action.sendKeys(Keys.ARROW_DOWN).build().perform();
//		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("Clicked on To filed & Select value");
		
		
		TryClick(Actioncolumn.Outsideclick());
		logger.info("Clicked on Outside button");	
		
	
		
		SelectDropdown(Actioncolumn.Emailtemplate(),1);
		logger.info("Selected Email template");
		
		
		TryClick(Actioncolumn.Send());
		logger.info("Clicked on Send");	
		
	
	//...................................Add Task.................................................................//
		
		
		TryClick(Actioncolumn.Tasktab());
		logger.info("Clicked on Task Tab");	
		
		
		TryClick(Actioncolumn.Addtaskplus());
		logger.info("Clicked on plus icon");	
		
		
		
		TryClick(Actioncolumn.Slider());
		logger.info("Clicked on slider");
		
		TryClick(Actioncolumn.Yes());
		logger.info("Clicked on Yes");
		
		
		
		SelectDropdown(Actioncolumn.Taskcategory(),1);
		logger.info("Selected Task category");
		
		
		
		TryClick(Actioncolumn.SelectUser());
		TryClick(Actioncolumn.User1());
		TryClick(Actioncolumn.User2());
		logger.info("Clicked on Select user & Selected user");
		
		
		TryClick(Actioncolumn.Saveuser());
		logger.info("Clicked on Save user");
		
		
		TrySelectMultiDropdown(Actioncolumn.SharedTaskWith(),1,2);
		logger.info("Select Multiple User");
		
		
		
		explWaitToClick(Actioncolumn.TaskTitle());
		Thread.sleep(2000);
		Actioncolumn.TaskTitle().sendKeys(excel.Comment());
		logger.info("Task title added");
		
		
		
		
		explWaitToClick(Actioncolumn.Taskdetails());
		Thread.sleep(2000);
		Actioncolumn.Taskdetails().sendKeys(excel.Comment());
		logger.info("Task Details added");
		
		
		Thread.sleep(4000);
		String filepath2=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Cases\\Case_Add Imports_With Default Fileds 1.1.xlsx";
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"file\"]"))
		.sendKeys(filepath2);
		logger.info("File Upload");
		
		
		
		TryClick(Actioncolumn.tasksave());
		logger.info("Clicked on Save Task");
		
		
		
	//......................................Add Event................................................................//	
		
		
		
		TryClick(Actioncolumn.EventTab());
		logger.info("Clicked on Event Tab");
		
		
		TryClick(Actioncolumn.Pluseventadd());
		logger.info("Clicked on Plus icon");
		
		
		explWaitToClick(Actioncolumn.Title());
		Thread.sleep(2000);
		Actioncolumn.Title().sendKeys(excel.Comment());
		logger.info("Event title added");
		
		
		
		TryClick(Actioncolumn.Required());
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		TryClick(Actioncolumn.clickonOptional());
		logger.info("Clicked on optional");
		
		
		TryClick(Actioncolumn.Optional());
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		TryClick(Actioncolumn.teamsicon());
		logger.info("Clicked on teams icon");
		
		
		
		
		explWaitToClick(Actioncolumn.Description());
		Thread.sleep(2000);
		Actioncolumn.Description().sendKeys(excel.Comment());
		logger.info("Description added");
		
		
		TryClick(Actioncolumn.saveevent());
		logger.info("Clicked on Save event");
		
		
		
		
		
		
		
	}
	
	
	
}
