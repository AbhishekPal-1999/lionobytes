package com.liono360.WorkflowOpportunities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkflowOpportunityPage;

public class TC_001CreateWorkflowOpportunity extends Baseclass{

	@Test
public void CreateWorkflowOpportunityTest () throws InterruptedException, IOException {
	

		//redirectToCRM();

		Actions action = new Actions(driver);
		WorkflowOpportunityPage WfOpp = new WorkflowOpportunityPage(driver);
		
		
		
		TryClick(WfOpp.Misc());
		logger.info("Clicked on Misc.");
		
		
		
		TryClick(WfOpp.Workflow());
		logger.info("Clicked on Workflow");
		
		
		TryClick(WfOpp.New());
		logger.info("Clicked on New");
		
		
		explWaitToClick(WfOpp.Name());
		WfOpp.Name().sendKeys("WF-Jenifer"+randomnumber());
		logger.info("Sendkeys on Name Filed");
		
		String WorkflowNameNameBeforeCreate= WfOpp.Name().getAttribute("value");
		
		//TrySelectMultiDropdown(WfOpp.AccessPermission(),4, 5);
		//logger.info("Select Dropdown value For Access Permission");
		
		
		
		SelectDropdown(WfOpp.Module(),4);
		logger.info("Select Dropdown value For Module");
		
		
		SelectDropdown(WfOpp.Channel(),1);
		logger.info("Select Dropdown value For Channel");
		
		
		SelectDropdown(WfOpp.AccountChannel(),1);
		logger.info("Select Dropdown value For Account Channel");
		
		
		
		TryClick(WfOpp.WorkflowTypeEventBased());
		logger.info("Clicked on Event Based");
		
		
		
		TryClick(WfOpp.EvaluateCriteria1());
		logger.info("Clicked on Evaluated criteria");
		
		
		
	
		//WfOpp.StartDate().click();
		//explWaitToClick(driver.findElement(By.xpath("(//span[normalize-space()='20'])[1]")));
		//driver.findElement(By.xpath("(//span[normalize-space()='20'])[1]")).click();
		//logger.info("Star Date selected");
		
		
		
		//WfOpp.EndDate().click();
		//explWaitToClick(driver.findElement(By.xpath("(//span[normalize-space()='20'])[1]")));
		//driver.findElement(By.xpath("(//span[normalize-space()='20'])[1]")).click();
		//logger.info("End Date selected");
		
		
		
		
		TryClick(WfOpp.Next());
		logger.info("Clicked on Next");
		
		
		
		TryClick(WfOpp.ManuuelCondition());
		logger.info("Clicked on Manuuel Condition");
		
		
		TryClick(WfOpp.Plus());
		logger.info("Clicked on Plus");
		
		
		TryClick(WfOpp.Filter());
		explWaitToClick(driver.findElement(By.xpath("(//span[contains(text(),'Account Name')])[1]")));
		driver.findElement(By.xpath("(//span[contains(text(),'Account Name')])[1]")).click();
		logger.info("Select Dropdown value For Filter");
		
		
		SelectDropdown(WfOpp.Operator(),7);
		logger.info("Select Dropdown value For Operator");
		
		

		
		//TryClick(WfOpp.Value());
		//Thread.sleep(7000);
		//action.sendKeys(Keys.ARROW_DOWN).build().perform();
		//action.sendKeys(Keys.ENTER).build().perform();
		//logger.info("Select Dropdown value For Value");
		
		
		
		TryClick(WfOpp.Save2());
		logger.info("Clicked on Save");
		
		
		
		TryClick(WfOpp.AddActions());
		logger.info("Clicked on Add Action");
		
		
		TryClick(WfOpp.AddTask());
		logger.info("Clicked on Add Task");
		
		
		
		SelectDropdown(WfOpp.AssignType(),1);
		logger.info("Select Dropdown value For Assign type");
		
		
	
		
		TrySelectMultiDropdown(WfOpp.AssignTo(),1, 2);
		logger.info("Select Dropdown value For Assign To");
		
		
		SelectDropdown(WfOpp.ReminderType(),1);
		logger.info("Select Dropdown value For Reminder Type");
		
		
		
		SelectDropdown(WfOpp.Reminder(),1);
		logger.info("Select Dropdown value For Reminder");
		
		
		SelectDropdown(WfOpp.TaskRepeat(),1);
		logger.info("Select Dropdown value For Task Repeat");
		
		SelectDropdown(WfOpp.Priority(),1);
		logger.info("Select Dropdown value For Priority");
		
		
		explWaitToClick(WfOpp.Description());
		WfOpp.Description().sendKeys("Task Added Through Automation"+randomnumber());
		logger.info("Sendkeys on Description Filed");
		
		
		
		TryClick(WfOpp.ChecklistPlus());
		logger.info("Clicked on Checklist");
		
		
		explWaitToClick(WfOpp.ListItem());
		WfOpp.ListItem().sendKeys("Auto-Check"+randomnumber());
		logger.info("Sendkeys on List Item");
		
		
		TryClick(WfOpp.Save1());
		logger.info("Clicked on Save");
		
		
		TryClick(WfOpp.Save22());
		logger.info("Clicked on Save");
		
	//..........................Add Email..........................................//	
		TryClick(WfOpp.AddActions());
		logger.info("Clicked on Add Actions");
		
		
		TryClick(WfOpp.AddEmailAlert());
		logger.info("Clicked on Add Email Alert");
		
		
		
		//SelectDropdown(WfOpp.From(),1);
		//logger.info("Select Dropdown value For From");
		
		
		SelectDropdown(WfOpp.AssignType2(),1);
		logger.info("Select Dropdown value For Assign Type");
		
		
		//TrySelectMultiDropdown(WfOpp.SentTo(),1, 2);
		//logger.info("Select Dropdown value For Sent To");
		
		
		
		SelectDropdown(WfOpp.EmailTemplate(),1);
		logger.info("Select Dropdown value For Email Template");
		
		
	
		
		TryClick(WfOpp.Save22());
		logger.info("Clicked on Save");
		
		
//...................................Update Filed..............................................//		
		
		TryClick(WfOpp.AddActions());
		logger.info("Clicked on Add Actions");
		
		TryClick(WfOpp.UpdateFiled());
		logger.info("Clicked on Update Filed");
		
		
		SelectDropdown(WfOpp.FiledToUpdate(),1);
		logger.info("Select Dropdown value For Filed To Update");
		
		
		//SelectDropdown(WfOpp.NewFiledValue(),3);
		//logger.info("Select Dropdown value For New Filed Value");
		
		TryClick(WfOpp.Save22());
		logger.info("Clicked on Save");
		
	//............................2................................//	
		
		TryClick(WfOpp.AddActions());
		logger.info("Clicked on Add Actions");
		
		TryClick(WfOpp.UpdateFiled());
		logger.info("Clicked on Update Filed");
		
		
		SelectDropdown(WfOpp.FiledToUpdate(),2);
		logger.info("Select Dropdown value For Filed To Update");
		
		//SelectDropdown(WfOpp.NewFiledValue(),3);
		//logger.info("Select Dropdown value For New Filed Value");
		//TryClick(WfOpp.NewFiledValue());
		//Thread.sleep(7000);
		//action.sendKeys(Keys.ARROW_DOWN).build().perform();
		//action.sendKeys(Keys.ENTER).build().perform();
	    //logger.info("Select Dropdown value For New Filed Value");
		
		TryClick(WfOpp.Save22());
		logger.info("Clicked on Save");
		
		
		//............................3................................//	
		
		
		TryClick(WfOpp.AddActions());
		logger.info("Clicked on Add Actions");
		
		TryClick(WfOpp.UpdateFiled());
		logger.info("Clicked on Update Filed");
		
		
		SelectDropdown(WfOpp.FiledToUpdate(),1);
		logger.info("Select Dropdown value For Filed To Update");
		
		
	
		//explWaitToClick(WfOpp.EnterValue());
		//WfOpp.EnterValue().sendKeys("automation"+randomnumber()+"lionobytes.com");
		//logger.info("Sendkeys on Description Filed");
		
		TryClick(WfOpp.Save22());
		logger.info("Clicked on Save");
		
	//................................................................................................................................//	
		
		TryClick(WfOpp.Save());
		logger.info("Clicked on Save");
		
		
		/*
		 * Thread.sleep(4000); String SavedSearchNameAfterCreate
		 * =WfOpp.Listedworkflow().getText();
		 * System.out.println("Workflow name to create: "+WorkflowNameNameBeforeCreate);
		 * System.out.println("Workflow name after create: "+SavedSearchNameAfterCreate)
		 * ;
		 * 
		 * if (WorkflowNameNameBeforeCreate.equals(SavedSearchNameAfterCreate)) {
		 * Assert.assertTrue(true); logger.info("Add Workflow test passed"); } else {
		 * Assert.assertTrue(false); captureScreen(driver, "Add Workflow");
		 * logger.info("Add Workflow test failed"); }
		 * 
		 * 
		 */
	
	}

}
