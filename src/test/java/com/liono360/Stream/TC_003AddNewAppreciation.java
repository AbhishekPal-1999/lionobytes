package com.liono360.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.StreamPage;

public class TC_003AddNewAppreciation extends Baseclass {

	@Test
	public void AddNewAppreciationTest() throws InterruptedException {

		// redirectToCRM();

		StreamPage str = new StreamPage(driver);

		TryClick(str.Stream());
		logger.info("Clicked on Stream button");

		SelectDropdown(str.DropdownOption(), 1);
		logger.info("Select Message Filter Option");

		waitUntilPageLoad();
		jsClick(driver, str.New());
		logger.info("Clicked on New button");

		TryClick(str.Appreciation());
		logger.info("Clicked on Appreciation btn");

		explWaitToClick(str.AppTitle());
		str.AppTitle().sendKeys("Birthday");
		logger.info("sendkeys on AppTitle btn");

		SelectDropdown(str.AppList(), 6);
		logger.info("Select appreciation Cake");

		explWaitToClick(str.AppDesc());
		str.AppDesc().sendKeys("Happy Birthday To you");
		logger.info("sendkeys on AppDesc btn");

		waitUntilPageLoad();
		Thread.sleep(1000);
		TrySelectMultiDropdown(str.AppSharewith(), 1, 2);
		logger.info("select on dropdown");

		explWaitToClick(str.AppTo());
		 TrySelectMultiDropdown(str.AppTo(),1,2);

		Thread.sleep(2000);
		
//		Actions action = new Actions(driver);
//		action.doubleClick(element).perform();

//		Thread.sleep(2000);
//		explWaitToClick(driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")));
//		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
//		logger.info("select on dropdown");

		waitUntilPageLoad();
		Thread.sleep(1000);
		jsClick(driver,str.PostApp());
		logger.info("Clicked on Post btn");
		
		waitUntilPageLoad();
		Thread.sleep(3000);

		// ............................Favorite, Read,
		// pin...................................................//

		TryClick(str.StarFavourite());
		logger.info("Clicked on StarFavourite button");

		TryClick(str.Read());
		logger.info("Clicked on Read button");

		TryClick(str.Pin());
		logger.info("Clicked on Pin button");

		waitUntilPageLoad();
		Thread.sleep(1000);
		TryClick(str.Line());
		logger.info("Clicked on Line button");

		// ...................Edit...............................//

		waitUntilPageLoad();
		Thread.sleep(1000);
		jsClick(driver, str.Edit());
		logger.info("Clicked on Edit button");

		waitUntilPageLoad();
		Thread.sleep(1000);
		str.AppTitle().clear();
		waitUntilPageLoad();
		Thread.sleep(1000);
		str.AppTitle().sendKeys("Birthday Wish");
		logger.info("edited");

		waitUntilPageLoad();
		Thread.sleep(1000);
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
