package com.liono360.ConfigUser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_011AddAndRemoveUserInRole extends Baseclass{

	@Test
	public void AddUserInRoleTest () throws InterruptedException {
		
		//redirectToCRM();
		
		Actions action = new Actions(driver);
		ConfigUser user = new ConfigUser(driver);	
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on configuration button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.RoleHc());
		logger.info("Clicked on RoleHc button");
		
		
		
		TryClick(user.Kiwitechc());
		logger.info("Clicked on Kiwitechc button");
		
		TryClick(user.ClicksalesRep());
		logger.info("Clicked on ClicksalesRep button");
		
		
		TryClick(user.ClickAuser());
		logger.info("Clicked on ClickAuser button");
		
		TryClick(user.PlusA());
		logger.info("Clicked on PlusA button");
		
		
		
		SelectDropdown(user.AddSUser(),1);
		logger.info("Add User");
		
		
		
		TryClick(user.Save());
		logger.info("Click on Save");	
		
		
		
		
		
		/*
		 * TryClick(user.Close()); logger.info("Click on Close");
		 * 
		 * 
		 * TryClick(user.Kiwitechc()); logger.info("Clicked on Kiwitechc button");
		 * 
		 * TryClick(user.ClicksalesRep());
		 * logger.info("Clicked on ClicksalesRep button");
		 * 
		 * TryClick(user.ClickAuser()); logger.info("Clicked on ClickAuser button");
		 */
		
		
		TryClick(user.DeleteRoleUser());
		logger.info("Clicked on Click user button");
		
		
		
		Thread.sleep(2000);
		TryClick(user.SnewRole());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='CEO']")).click();
		logger.info("Select New Role");
		
		
		
		
		TryClick(user.TransferAndDelete());
		logger.info("Clicked on TransferAndDelete button");
		
		
		TryClick(user.Close());
		logger.info("Clicked on Close button");
		
		
	}
	
	
	
}
