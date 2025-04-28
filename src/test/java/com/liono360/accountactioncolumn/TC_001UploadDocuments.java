package com.liono360.accountactioncolumn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountActionColumnPage;

public class TC_001UploadDocuments extends Baseclass {

	@Test
	public void TC_001UploadDocumentsTest() throws InterruptedException {

		
		
		
		AccountActionColumnPage Actioncolumn = new AccountActionColumnPage(driver);
		
		
		Actions action = new Actions(driver);

		TryClick(Actioncolumn.Accounts());
		logger.info("Clicked on Accounts");

		TryClick(Actioncolumn.Documentsicon());
		logger.info("Clicked on Documents Icon");

		Thread.sleep(4000);
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		String userDirectoryPath = System.getProperty("user.dir");
		String[] filepaths = { userDirectoryPath + "\\TestData\\All Type Documents\\file-doc.doc",
				userDirectoryPath + "\\TestData\\All Type Documents\\txt.txt",
				userDirectoryPath + "\\TestData\\All Type Documents\\pdf File.pdf" };
		for (String filepath : filepaths) {
			Thread.sleep(5000);
			fileInput.sendKeys(filepath);
			System.out.println("Uploaded file: " + filepath);
		}

		TryClick(Actioncolumn.Uploaddocuments());
		logger.info("click on Upload");

		Thread.sleep(1000);
		if (Actioncolumn.Verifyuploaddocuments().isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("Documents Uploaded Successfully");
		} else {
			Assert.assertTrue(false);
			logger.info("Documents Not Uploaded Successfully");
		}

	}

}
