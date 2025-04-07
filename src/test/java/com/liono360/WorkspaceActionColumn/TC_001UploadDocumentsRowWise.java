package com.liono360.WorkspaceActionColumn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.WorkspaceActionColumnPage;

public class TC_001UploadDocumentsRowWise extends Baseclass{

	@Test
	public void TC_001UploadDocumentsRowWiseTest () throws InterruptedException {
		
		
		WorkspaceActionColumnPage Workspace = new WorkspaceActionColumnPage(driver);
		
		Actions action = new Actions(driver);

		
		
		
		TryClick(Workspace.Misc());
		logger.info("Clicked on Misc");

		TryClick(Workspace.Workspace());
		logger.info("Clicked on Workspace");
		
		
		TryClick(Workspace.ClickOnWorkspace());
		logger.info("Clicked on Workspace");

		TryClick(Workspace.ClickOnWorkbook());
		logger.info("Clicked on Workbook");
		
		
		TryClick(Workspace.Documenticon());
		logger.info("Clicked on Documenticon");
		

		Thread.sleep(4000);
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		String userDirectoryPath = System.getProperty("user.dir");
		String[] filepaths = { userDirectoryPath + "\\TestData\\All Type Documents\\file-doc.doc",
				userDirectoryPath + "\\TestData\\All Type Documents\\txt.txt",
				userDirectoryPath + "\\TestData\\All Type Documents\\pdf File.pdf" };
		for (String filepath : filepaths) {
			Thread.sleep(5000);
			fileInput.sendKeys(filepath);
			
			TryClick(Workspace.Upload());
			logger.info("Clicked on Upload");
			System.out.println("Uploaded file: " + filepath);
		}
		
		
	
		
		
		
		
	}
	
	
	
}
