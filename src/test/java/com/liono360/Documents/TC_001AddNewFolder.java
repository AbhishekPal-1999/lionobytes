package com.liono360.Documents;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.Documents;


public class TC_001AddNewFolder extends Baseclass {
	
	@Test
	public void AddNewFolderTest () throws InterruptedException, IOException {
		
	
       // redirectToCRM();
	    
	    
	    Actions action = new Actions(driver);
	    Documents Doc= new Documents(driver);
			
		waitUntilPageLoad();
		TryClick(Doc.UserIcon());
		logger.info("Clicked on Company Logo");
		
		
		
		TryClick(Doc.Profile());
		logger.info("Clicked on Profile");
		
		
		
		TryClick(Doc.MyDocuments());
		logger.info("Clicked on My Documents");
		
		
		TryClick(Doc.HumbergIcon());
		logger.info("Clicked on Humberg Icon");
		
		
		TryClick(Doc.AddNewFolder());
		logger.info("Clicked on Add New Folder");
		
	
		
		explWaitToClick(Doc.FolderName());
		Doc.FolderName().sendKeys("All Documents"+randomnumber());
		logger.info("opportunity name added");
		
		
		 Thread.sleep(3000);
		 WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
	        String userDirectoryPath = System.getProperty("user.dir");
	        String[] filepaths = {
	                userDirectoryPath + "\\TestData\\All Type Documents\\file-doc.doc",
	                userDirectoryPath + "\\TestData\\All Type Documents\\file-docx.docx",
	                userDirectoryPath + "\\TestData\\All Type Documents\\xlsx File.xlsx"          
	        };
	        for (String filepath : filepaths) {
	            Thread.sleep(1000);
	            fileInput.sendKeys(filepath);
	            System.out.println("Uploaded file: " + filepath);
	        
	        }
	        
	   	    
	        
	        Thread.sleep(3000);
	        TryClick(Doc.Checkbox1());
			logger.info("Clicked on check 1");
	        
	        
			TryClick(Doc.Checkbox2());
			logger.info("Clicked on check 2");
	        
	        
			TryClick(Doc.Checkbox3());
			logger.info("Clicked on check 3");
	        
	        
	
	        TryClick(Doc.Save());
			logger.info("Clicked on Save");   
	        
	        
	        
	
			 Thread.sleep(3000);

			
		//..........................Share Documents.........................................//	
			
			TryClick(Doc.ShareDocuments());
			logger.info("Clicked on Share Documents");
			
			
			explWaitToClick(Doc.SearchKeyword());
			Doc.SearchKeyword().sendKeys("Akash Mogdul");
			logger.info("Search User Name");
			
			
			TryClick(Doc.Read());
			logger.info("Clicked on Read Checkbox");
			
			
			TryClick(Doc.Write());
			logger.info("Clicked on Write Checkbox");
			
			TryClick(Doc.Download());
			logger.info("Clicked on Download Checkbox");
			
			TryClick(Doc.Ok());
			logger.info("Clicked on Ok");
			
		//..........................Download Documents.........................................//
			
			
			TryClick(Doc.DownloadDocuments());
			logger.info("Clicked on Download Documents");
			
			
		//..........................Edit Document Name.........................................//
			
			
			TryClick(Doc.EditDocument());
			logger.info("Clicked on Edit Documents");
			
			
			explWaitToClick(Doc.RenameDocumentName());
			Doc.RenameDocumentName().clear();
			Doc.RenameDocumentName().sendKeys("IMP Documents" + randomnumber());
			logger.info("Updated Document Name");
			
			
			TryClick(Doc.Save());
			logger.info("Clicked on Save");
			
	   //..........................Delete Document Folder.........................................//	
			
			
			TryClick(Doc.DeleteDocument());
			logger.info("Clicked on Delete");
			
			
			TryClick(Doc.YesDelete());
			logger.info("Clicked on Yes---Delete Successfully");
			
		
}
}
