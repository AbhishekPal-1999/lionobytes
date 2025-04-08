package com.liono360.cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.LeadWorkFlow.CommonMethods;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_013CasesStageChanges extends Baseclass{

	@Test
	public void TC_013CasesStageChanges() throws InterruptedException {

		CasesPage cases = new CasesPage(driver);

		waitUntilPageLoad();
		TryClick(cases.clickCases());
		logger.info("Clicked on Cases ");

		TryClick(cases.addedCase());
		logger.info("Clicked on created Cases");

		// .......................First
		// Stage..........................................//
		TryClick(cases.FirstStage());
		logger.info("Click On First Stage");

		Thread.sleep(2000);
		cases.setComment().sendKeys("First Stage Changed" + randomnumber());
		logger.info("comment added in stage");

		Thread.sleep(1000);
		TryClick(cases.clickSave());
		logger.info("save button clicked");

		// ............................Second
		// Stage..............................................//

		TryClick(cases.SecondStage());
		logger.info("Click On Second Stage");

		Thread.sleep(2000);
		cases.setComment().sendKeys("Second Stage Changed" + randomnumber());
		logger.info("comment added in stage");

		TryClick(cases.clickSave());
		logger.info("save button clicked");

		// ........................Custom Stage
		// ..................................................//

		TryClick(cases.CustomStage());
		logger.info("Click On Custom Stage");

		Thread.sleep(2000);
		cases.setComment().sendKeys("Custom Stage Changed" + randomnumber());
		logger.info("comment added in stage");

		TryClick(cases.clickSave());
		logger.info("save button clicked");

		// .....................Closed
		// Stage......................................................//

		TryClick(cases.ClosedStage());
		logger.info("Click On Closed Stage");

		SelectDropdown(cases.ClosedStageReason(), 1);
		logger.info("Select Value for Closed Stage Reason");

		TrySelectMultiDropdown(cases.CloseWonReason(), 1, 2);
		logger.info("Select Value for Closed won Reason");

		Thread.sleep(2000);
		CommonMethods commonMethods = new CommonMethods();
		String enddate = commonMethods.EndDate();
		TryClick(cases.ClosedWonDate());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		try {
			driver.findElement(By.xpath("(//span[text()='" + enddate + "'])[1]")).click();
		} catch (Exception e) {
		}
		try {
			driver.findElement(By.xpath("(//span[text()='" + enddate + "'])[2]")).click();
		} catch (Exception e) {
		}
		logger.info("end date added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Thread.sleep(2000);
		cases.setComment().sendKeys("Closed Stage" + randomnumber());
		logger.info("comment added in stage");

		TryClick(cases.clickSave());
		logger.info("save button clicked");

	}

}
