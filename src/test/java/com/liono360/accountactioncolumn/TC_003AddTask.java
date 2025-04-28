package com.liono360.accountactioncolumn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountActionColumnPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_003AddTask extends Baseclass{

	
	@Test
	public void TC_003AddTaskTest () throws IOException, InterruptedException {
		
AccountActionColumnPage Actioncolumn = new AccountActionColumnPage(driver);
		
		ExcelDataProvider excel = new ExcelDataProvider();
		Actions action = new Actions(driver);
		
		TryClick(Actioncolumn.Accounts());
		logger.info("Clicked on Accounts");
		
		
		TryClick(Actioncolumn.Taskicon());
		logger.info("Clicked on Task icon");
		
		
		TryClick(Actioncolumn.Plusaddtask());
		logger.info("Clicked on Task icon");
		
		
		TryClick(Actioncolumn.Multipletask());
		logger.info("Clicked on Multiple Task Choose option");
		
		
		TryClick(Actioncolumn.Slider());
		logger.info("Clicked on slider");
		
		TryClick(Actioncolumn.Yes());
		logger.info("Clicked on Yes");
		
		SelectDropdown(Actioncolumn.Taskcategory(),1);
		logger.info("Selected Task category");
		
		
		
		TrySelectMultiDropdown(Actioncolumn.SharedTaskWith(),1,2);
		logger.info("Select Multiple User");
		
		
		
		explWaitToClick(Actioncolumn.TaskTitle());
		Thread.sleep(2000);
		Actioncolumn.TaskTitle().sendKeys(excel.Comment());
		logger.info("Task title added");
		
		//................add 1 st task..........................//
		
		TryClick(Actioncolumn.Plusmultipletask());
		logger.info("Clicked on Add plus multiple task");
		
		
		
		TryClick(Actioncolumn.SelectUserM1());
		TryClick(Actioncolumn.User1());
		logger.info("Clicked on Select user & Selected user");
	
		
		explWaitToClick(Actioncolumn.Descriptionum1());
		Thread.sleep(2000);
		Actioncolumn.Descriptionum1().sendKeys(excel.Comment());
		logger.info("Task title added");
		
		
		
		
		TryClick(Actioncolumn.SaveTaskM1());
		logger.info("Clicked on Save");
		
		//................add 2 nd task..........................//
		
		TryClick(Actioncolumn.Plusmultipletask());
		logger.info("Clicked on Add plus multiple task");
		
		
		
		TryClick(Actioncolumn.SelectUserM2());
		TryClick(Actioncolumn.User2());
		logger.info("Clicked on Select user & Selected user");
	
		
		
		explWaitToClick(Actioncolumn.Descriptionum1());
		Thread.sleep(2000);
		Actioncolumn.Descriptionum1().sendKeys(excel.Comment());
		logger.info("Task title added");
		
		
		
		
		TryClick(Actioncolumn.Usersave());
		logger.info("Clicked on Save");
		
		
		
		Thread.sleep(2000);
		String filepath2=System.getProperty("user.dir") + "\\TestData\\Excel-Files-Cases\\Case_Add Imports_With Default Fileds 1.1.xlsx";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"file\"]"))
		.sendKeys(filepath2);
		logger.info("File Upload");
		
		
		
		TryClick(Actioncolumn.Saveall());
		logger.info("Clicked on Save");
		
		
		
	}
	
	
}
