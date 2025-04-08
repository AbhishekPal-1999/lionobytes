package com.liono360.opportunities;

import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.LeadWorkFlow.CommonMethods;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_017AddTaskInOpportunity extends Baseclass{

	
	@Test
	public void TC_017AddTaskInOpportunityTest () throws InterruptedException {
		
		OpportunitiesPage opp = new OpportunitiesPage(driver);
		Actions action = new Actions(driver);
		
		

		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");

		TryClick(opp.AddedOpportunity());
		logger.info("Clicked on listed opportunity");	
		
		
		TryClick(opp.AddTask());
		logger.info("Clicked on Add Task");
		
		
		TryClick(opp.AddTaskPlus());
		logger.info("Clicked on plus->Add Task");
		
		
		Thread.sleep(1000);
		opp.TaskTitle().sendKeys("New Opp Task"+randomnumber());
		logger.info("Sendkeys On Task Title");
		
		
		Thread.sleep(1000);
		opp.TaskDetails().sendKeys("Outline any follow-up actions required once the task is completed or any next steps to be taken"+randomnumber());
		logger.info("Sendkeys On Task Details");
		
		
		Thread.sleep(1000);
		CommonMethods commonMethods= new CommonMethods();
		String StartDate=commonMethods.EndDate();
		TryClick(opp.StartDate());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		try {
			driver.findElement(By.xpath("(//span[text()='"+StartDate+"'])[1]")).click();
		}
		catch(Exception e) {}
		try {
			driver.findElement(By.xpath("(//span[text()='"+StartDate+"'])[2]")).click();	    }
		catch(Exception e) {}
		logger.info("Start date added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
		Thread.sleep(1000);
		CommonMethods commonMethods1= new CommonMethods();
		String enddate=commonMethods1.EndDate();
		TryClick(opp.EndDate());
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
		
		
		
		
		SelectDropdown(opp.ReleatedTo(),4);
	    logger.info("Dropdown Value Selected for Opportunity");
		
		
		
	    SelectDropdown(opp.Channel(),1);
	    logger.info("Channel Selected");
		
		
	    SelectDropdown(opp.AssignedTo(),1);
	    logger.info("User Selected");
		
		
	    SelectDropdown(opp.TaskCategory(),1);
	    logger.info("Selected Task Category");
	    
	    
	    SelectDropdown(opp.Association(),1);
	    logger.info("Selected Association");
	    
	    
		
		TrySelectMultiDropdown(opp.Stage(),1,2);
		logger.info("select on dropdown value for Stages");
		
		
		
		
		TryClick(opp.AddCheckList());
		logger.info("Clicked on plus->Add Checklist");
		
		
		Thread.sleep(1000);
		opp.AddTextInChecklist().sendKeys("Issue Closed"+randomnumber());
		logger.info("Add Text In CheckList");
		
		TryClick(opp.Save1());
		logger.info("Clicked on Save");
		
		
		TryClick(opp.ShowMore());
		logger.info("Clicked on Show More");
		
		
		
		SelectDropdown(opp.ReminderType(), 1);
		logger.info("Selected ReminderType");

		SelectDropdown(opp.Reminder(), 1);
		logger.info("Selected Reminder");
		
		
		SelectDropdown(opp.TaskRepeat(), 1);
		logger.info("Selected Task Repeat");
		
		SelectDropdown(opp.Priority(), 1);
		logger.info("Selected Priority");
		
		
		TryClick(opp.Save2());
		logger.info("Clicked on Save");	
		
		
		Thread.sleep(3000);
		
	}
	
		public String EndDate() {

			LocalDate currentDate = LocalDate.now();
			int currentDay = currentDate.getDayOfMonth();
			int endDay = currentDay + 3;
			return String.valueOf(endDay);
		}
	}
