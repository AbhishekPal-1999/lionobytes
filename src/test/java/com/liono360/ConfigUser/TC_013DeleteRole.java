package com.liono360.ConfigUser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_013DeleteRole extends Baseclass{
	
	@Test
	public void DeleteRoleTest () throws InterruptedException {
		
		//redirectToCRM();
		
		ConfigUser user = new ConfigUser(driver);	
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.RoleHc());
		logger.info("Clicked on RoleHc button");
		
		
		TryClick(user.Kiwitechc());
		logger.info("Clicked on Kiwitechc button");
		
		//TryClick(user.ClicksalesRep());
		//logger.info("Clicked on ClicksalesRep button");
		
		

		TryClick(user.ClickA4());
		logger.info("Clicked on ClickA4 button");
		
		
		
		TryClick(user.PlusA());
		logger.info("Clicked on PlusA button");
		
		Actions action = new Actions(driver);
		
		
		SelectDropdown(user.AddSUser(),1);
		logger.info("select on dropdown");
		
		
		TryClick(user.Save());
		logger.info("Click on Save");	
		
		TryClick(user.Close());
		logger.info("Click on Close");	
		
		
		TryClick(user.Kiwitechc());
		logger.info("Clicked on Kiwitechc button");
		

		//TryClick(user.ClicksalesRep());
		//logger.info("Clicked on ClicksalesRep button");
		
		
		
		
		TryClick(user.DeleteRole());
		logger.info("Clicked on DeleteRole button");
		
		

		TryClick(user.YesPro());
		logger.info("Clicked on YesPro");
		
		
		//SelectDropdown(user.Snewrole(),2);
		//logger.info("Select Value for Dropdown");
		
		
		
		
		//TryClick(user.TransferAndDelete());
		//logger.info("Clicked on TransferAndDelete");
		

		//TryClick(user.Clickexpandall());
		//logger.info("Clicked on Clickexpandall button");
		
		//Thread.sleep(2000);
		//jsScroll(driver, user.Clickexpandall());
		
		
		
		
		
		
	}

}
