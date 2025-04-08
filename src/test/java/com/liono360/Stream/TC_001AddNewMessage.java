package com.liono360.Stream;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.StreamPage;

public class TC_001AddNewMessage extends Baseclass {

	@Test
	public void AddnewTest() throws InterruptedException {

		// redirectToCRM();

		StreamPage str = new StreamPage(driver);

		TryClick(str.Stream());
		logger.info("Clicked on Stream button");

		SelectDropdown(str.DropdownOption(), 1);
		logger.info("Select Message Filter Option");

		waitUntilPageLoad();
		jsClick(driver, str.New());
		logger.info("Clicked on New button click");

		TryClick(str.Message());
		logger.info("Clicked on Message btn");

		waitUntilPageLoad();
		Thread.sleep(1000);
		explWaitToClick(str.ClickTitle());
		str.ClickTitle().sendKeys("Automation Test Cases" + randomnumber());
		logger.info("Clicked on ClickTitle button");

		scrollIntoView(str.ClickTitle());

		waitUntilPageLoad();
		explWaitToClick(str.TypeMessage());
		str.TypeMessage().sendKeys("Automate Test Case on Stage02 & Prod Env");
		logger.info("Sendkeys on Message ");

		waitUntilPageLoad();

		TrySelectMultiDropdown(str.SelectUser(), 1, 2);
		logger.info("Select Multiple User");

		TryClick(str.Post());
		logger.info("Clicked on Post button");

		// .................. Favorite ,Read,
		// Pin,Like,Comment.............................................................//

		TryClick(str.StarFavourite());
		logger.info("Clicked on StarFavourite button");

		TryClick(str.Read());
		logger.info("Clicked on Read button");

		TryClick(str.Pin());
		logger.info("Clicked on Pin button");

		TryClick(str.Like());
		logger.info("Clicked on Like button");

		jsClick(driver, str.Comment());
		logger.info("Clicked on Comment button");

		explWaitToClick(str.AddComment());
		str.AddComment().sendKeys("Add New Changes" + randomnumber());
		logger.info("Add Comment");

		jsClick(driver,str.Post());
		logger.info("Clicked on Post button");

//...................Edit...............................//

		jsClick(driver, str.Line());
		logger.info("Clicked on Option button");

		jsClick(driver, str.Edit());
		logger.info("Clicked on Edit button");

		Thread.sleep(2000);
		str.ClickTitle().clear();
		explWaitToClick(str.ClickTitle());
		str.ClickTitle().sendKeys("Automation Changes Added");
		logger.info("edited Message");

		jsScroll(driver, str.ClickTitle());

		waitUntilPageLoad();
		explWaitToClick(str.TypeMessage());
		str.TypeMessage().sendKeys("Edit Automation Test Case");
		logger.info("Sendkeys on Message ");

		waitUntilPageLoad();
		TrySelectMultiDropdown(str.SelectUser(), 1, 2);
		logger.info("Select Multiple User");

		TryClick(str.Post());
		logger.info("Clicked on Post button");

		// ........................Delete...................................//

		TryClick(str.Line());
		logger.info("Clicked on Option button");

		TryClick(str.Delete());
		logger.info("Clicked on Delete button");

		TryClick(str.Yes());
		logger.info("Clicked on Yes button");

	}

}
