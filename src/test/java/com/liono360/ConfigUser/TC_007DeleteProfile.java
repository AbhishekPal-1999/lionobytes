package com.liono360.ConfigUser;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;

public class TC_007DeleteProfile extends Baseclass {

	@Test
	public void DeleteProfileTest () throws InterruptedException {
		
		//redirectToCRM();
		
		
		ConfigUser user = new ConfigUser(driver);	
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.ClickProfile());
		logger.info("Clicked on ClickProfile button");
		
		
		
		
		
		
		
		
		TryClick(user.AdduserClick());
		logger.info("Clicked on AdduserClick button");
		
		
		TryClick(user.PlusClick());
		logger.info("Clicked on PlusClick button");
		
		Actions action = new Actions(driver);
		

		
	
		SelectDropdown(user.AddSUser(),2);
		logger.info("select on dropdown for Add User");
		
	
		
		
		
		TryClick(user.Save());
		logger.info("Click on Save");	
		
		
		
		
		TryClick(user.Close());
		logger.info("Clicked on Close button");
		
		
		
		
		

		TryClick(user.DeletePro());
		logger.info("Clicked on DeletePro");
		
		
		TryClick(user.YesPro());
		logger.info("Clicked on YesPro");
		
		
		
		
		
		SelectDropdown(user.SelectPro(),2);
		logger.info("select on dropdown");
		
		
		TryClick(user.TransferAndDelete());
		logger.info("Clicked on TransferAndDelete");
		
		
		
		Thread.sleep(2000);
		if (user.DeleteAsseration().isDisplayed()) {
			System.out.println("Delete Succesfully");

		} else {

			System.out.println("Delete Not Succesfully");
		}

	}

}
