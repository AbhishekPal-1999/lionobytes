package com.liono360.Stream;

import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.StreamPage;

public class TC_004AddNewAnnouncement extends Baseclass {

	@Test
	public void AddNewAnnouncementTest() throws InterruptedException {

		// redirectToCRM();

		StreamPage str = new StreamPage(driver);

		TryClick(str.Stream());
		logger.info("Clicked on Stream button");

		SelectDropdown(str.DropdownOption(), 1);
		logger.info("Select Message Filter Option");

		waitUntilPageLoad();
		jsClick(driver, str.New());
		logger.info("Clicked on New button");

		TryClick(str.Announcement());
		logger.info("Clicked on Announcement button");

		explWaitToClick(str.AnnouncementTitle());
		str.AnnouncementTitle().sendKeys("Release points");
		logger.info("Sendkeys on AnnouncementTitle");

		explWaitToClick(str.AnnouncementDesc());
		str.AnnouncementDesc().sendKeys("1st release will go from Dev4 on Thursday");
		logger.info("Sendkeys on AnnouncementDesc");

		scrollIntoView(str.AnnouncementTitle());

		TrySelectMultiDropdown(str.SelectUserAnno(), 1, 2);
		logger.info("select on dropdown");

		TryClick(str.Post());
		logger.info("Clicked on Post button");

		// .......................favorite,read,pin,........................................................//

		TryClick(str.StarFavourite());
		logger.info("Clicked on StarFavourite button");

		TryClick(str.Read());
		logger.info("Clicked on Read button");

		TryClick(str.Pin());
		logger.info("Clicked on Pin button");

		Thread.sleep(2000);
		TryClick(str.Line());
		logger.info("Clicked on Line button");

		// ...................Edit...............................//
		Thread.sleep(2000);
		TryClick(str.Edit());
		logger.info("Clicked on Edit button");

		Thread.sleep(2000);
		str.AnnouncementTitle().clear();
		// explWaitToClick(str.AnnouncementTitle());
		Thread.sleep(2000);
		str.AnnouncementTitle().sendKeys("Release");
		logger.info("edited");

		Thread.sleep(2000);
		TryClick(str.Post());
		logger.info("Clicked on Post button");

		// ........................Delete...................................//

		TryClick(str.Line());
		logger.info("Clicked on Line button");

		TryClick(str.Delete());
		logger.info("Clicked on Delete button");

		TryClick(str.Yes());
		logger.info("Clicked on Yes button");

	}

}
