package com.liono360.ConfigUser;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_028AddUsersFromJobType extends Baseclass {

	@Test
	public void EditVisibilityGroupTest() throws InterruptedException {

		// redirectToCRM();

		ConfigUser user = new ConfigUser(driver);

		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");

		TryClick(user.User1());
		logger.info("Clicked on User1 button");

		
		TryClick(user.ClickUV());
		logger.info("Clicked on ClickUV button");

		TryClick(user.TestUserClick());
		logger.info("Click on TestUserClick");
		

		//TryClick(user.AddPlusGroup());
		//logger.info("Click on AddPlusGroup");
		
		

		TryClick(user.Plus1());
		logger.info("Click on Plus1");
		
		
		TryClick(user.AddUserinjobtype());
		logger.info("Click on pilus to add user");
		
		
		
		
		

		TryClick(user.SelectAllUsers());
		logger.info("Click on Plus1");

		TryClick(user.Save2());
		logger.info("Click on Save");

		TryClick(user.Save());
		logger.info("Click on Save");
		
		
		/*
		 * TryClick(user.Plus2()); logger.info("Click on Plus2");
		 * 
		 * TryClick(user.S1()); logger.info("Click on S1");
		 * 
		 * TryClick(user.S2()); logger.info("Click on S2");
		 * 
		 * TryClick(user.Save2()); logger.info("Click on Save");
		 * 
		 * TryClick(user.Save()); logger.info("Click on Save");
		 * 
		 * // ............remove.....................//
		 * 
		 * TryClick(user.View1()); logger.info("Click on Save");
		 */
		 

	}

}
