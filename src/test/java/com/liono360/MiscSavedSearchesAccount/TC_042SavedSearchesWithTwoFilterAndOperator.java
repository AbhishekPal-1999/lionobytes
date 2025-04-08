package com.liono360.MiscSavedSearchesAccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_042SavedSearchesWithTwoFilterAndOperator extends Baseclass{
	
	@Test
	public void SavedSearchesWithTwoFilterAndOperatorTest () throws InterruptedException {
		
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
		Thread.sleep(2000);
		lp.clickSubmit();
		logger.info("Clicked on submit button");	
		
		MiscSavedSearches Search = new MiscSavedSearches (driver);
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		  Thread.sleep(9000); 
		  Search.Miscbtn().click();
		  logger.info("Clicked on Miscbtn button");
		  
		  Thread.sleep(3000); 
		  Search.ClickSavedS().click();
		  logger.info("Clicked on ClickSavedS button");
		  
		  Thread.sleep(5000); 
		  Search.Newbtn().click();
		  logger.info("Clicked on Newbtn button");
		  
		  explWaitToClick(Search.Name()); 
		  Search.Name().sendKeys("FName" +randomnumber());
		  logger.info("First Name Added");
		
		  Thread.sleep(5000); //explWaitToClick(account.AccessPermission());
		  Search.AccessPermission().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto1 ']")));
		  driver.findElement(By.xpath("//span[text()='Auto1 ']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(5000); //explWaitToClick(account.Module());
		  Search.Module().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Account']")));
		  driver.findElement(By.xpath("//span[text()='Account']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(5000); //explWaitToClick(account.Template());
		  Search.Template().click();
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Default Channel_template']")));
		  driver.findElement(By.xpath("//span[text()='Default Channel_template']")).click(); 
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); 
		  Search.PlusC().click();
		  logger.info("Clicked on PlusC button");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Filter());
		  Search.Filter().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='CreatedBy']")));
		  driver.findElement(By.xpath("//span[text()='CreatedBy']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.Operator().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='IsEqualTo']")));
		  driver.findElement(By.xpath("//span[text()='IsEqualTo']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(5000); //explWaitToClick(account.Operator());
		  Search.Avalue1().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Bill Gates']")));
		  driver.findElement(By.xpath("//span[text()='Bill Gates']")).click();
		  Search.Avalue1().click(); 
		  logger.info("select on dropdown");
		  
		
		  Thread.sleep(5000); 
		  Search.ClickPlus().click();
		  logger.info("Clicked on ClickPlus button");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.Choice1().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Or']")));
		  driver.findElement(By.xpath("//span[text()='Or']")).click();
		  logger.info("select on dropdown");
		 
		  Thread.sleep(3000); //explWaitToClick(account.Filter());
		  Search.F1().click(); Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Country']")));
		  driver.findElement(By.xpath("//span[text()='Country']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.O1().click(); Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("(//span[text()='IsEqualTo'])[2]")));
		  driver.findElement(By.xpath("(//span[text()='IsEqualTo'])[2]")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(5000); //explWaitToClick(account.Operator());
		  Search.V1().click(); Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='USA']")));
		  driver.findElement(By.xpath("//span[text()='USA']")).click();
		  logger.info("select on dropdown");
		  
		  //........................................END................................
		  // ..............................// //..................................ADM
		  //New...........................................................//
		  
		  Thread.sleep(5000); 
		  Search.Save1().click();
		  logger.info("Clicked on Save1 button");
		  
		  
		  Thread.sleep(5000); 
		  Search.ADMplus().click();
		  logger.info("Clicked on ADMplus button");
		  
		  
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.AsscociatedModule().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Contact']")));
		  driver.findElement(By.xpath("//span[text()='Contact']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.ADMtemplate().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Contact Template']")));
		  driver.findElement(By.xpath("//span[text()='Contact Template']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.ADMchoice().click();
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Or']")));
		  driver.findElement(By.xpath("//span[text()='Or']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.ADMFilter().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Street Address 2']")));
		  driver.findElement(By.xpath("//span[text()='Street Address 2']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.ADMoperator().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='HasValue']")));
		  driver.findElement(By.xpath("//span[text()='HasValue']")).click();
		  logger.info("select on dropdown");
		  
		  
		//  Thread.sleep(5000);
		//  Search.ADMValue().click(); 
		 // Thread.sleep(2000);
		//  explWaitToClick(driver.findElement(By.xpath("//span[text()='Bill Gates']")));
		//  driver.findElement(By.xpath("//span[text()='Bill Gates']")).click(); 
		//  Search.ADMValue().click(); 
		//  logger.info("select on dropdown");
		  
		  
		  Thread.sleep(5000); 
		  Search.ADMSave().click();
		  logger.info("Clicked on ADMSave button");
		  
		  
		  Thread.sleep(5000); 
		  Search.Preview().click();
		  logger.info("Clicked on Preview button");
		  
		  
		  
		  Thread.sleep(5000); 
		  Search.Cancel().click();
		  logger.info("Clicked on Cancel button");
		  
		  //..................................ADM
		  //End...........................................//
		  
		  Thread.sleep(5000); 
		  Search.Save2().click();
		  logger.info("Clicked on Save2 button");
		  
		  Thread.sleep(5000);
		  Search.ClickNameopt().click();
		  logger.info("Clicked on ClickNameopt button");
		  
		  Thread.sleep(5000); 
		  Search.List().click();
		  logger.info("Clicked on List button");
		  
		  
		  Thread.sleep(5000);
		  Search.Setting().click();
		  logger.info("Clicked on Setting button");
		  
		  
		  Thread.sleep(5000);
		  Search.CreatedBy().click();
		  logger.info("Clicked on CreatedBy button");
		  
		  
		  Thread.sleep(5000); 
		  Search.UpdatedBy().click();
		  logger.info("Clicked on UpdatedBy button");
		  
		  
		  
		  Thread.sleep(5000); 
		  Search.SettingSave().click();
		  logger.info("Clicked on SettingSave button");
		  
		  
		  Thread.sleep(5000); 
		  Search.Xcross().click();
		  logger.info("Clicked on Xcross button");
		  
		  
		
		  
		  
		  //--------------------------------------And..................................
		  //..........//
		  
		  
		  Thread.sleep(9000);
		  Search.Miscbtn().click();
		  logger.info("Clicked on Miscbtn button");
		  
		  Thread.sleep(3000); 
		  Search.ClickSavedS().click();
		  logger.info("Clicked on ClickSavedS button");
		  
		  Thread.sleep(5000);
		  Search.Newbtn().click();
		  logger.info("Clicked on Newbtn button");
		  
		  explWaitToClick(Search.Name()); 
		  Search.Name().sendKeys("FName" +
		  randomnumber()); 
		  logger.info("First Name Added");
		  
		  Thread.sleep(5000); //explWaitToClick(account.AccessPermission());
		  Search.AccessPermission().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto1 ']")));
		  driver.findElement(By.xpath("//span[text()='Auto1 ']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(5000); //explWaitToClick(account.Module());
		  Search.Module().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Account']")));
		  driver.findElement(By.xpath("//span[text()='Account']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(5000); //explWaitToClick(account.Template());
		  Search.Template().click();
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.
		  xpath("//span[text()='Default Channel_template']")));
		  driver.findElement(By.xpath("//span[text()='Default Channel_template']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000);
		  Search.PlusC().click();
		  logger.info("Clicked on PlusC button");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Filter());
		  Search.Filter().click();
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='CreatedBy']")));
		  driver.findElement(By.xpath("//span[text()='CreatedBy']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.Operator52().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='HasValue']")));
		  driver.findElement(By.xpath("//span[text()='HasValue']")).click();
		  logger.info("select on dropdown");
		  
		//  Thread.sleep(5000); //explWaitToClick(account.Operator());
		//  Search.Avalue1().click();
		//  Thread.sleep(2000);
		//  explWaitToClick(driver.findElement(By.xpath("//span[text()='Bill Gates']")));
		//  driver.findElement(By.xpath("//span[text()='Bill Gates']")).click();
		 // logger.info("select on dropdown");
		  
		  //.................................!!!!!!!!!!new1!!!!!!!!!!..................
		  //..................................................// 
		  Thread.sleep(5000);
		  Search.ClickPlus().click();
		  logger.info("Clicked on ClickPlus button");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.Choice1().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("(//span[text()='And'])[2]")));
		  driver.findElement(By.xpath("(//span[text()='And'])[2]")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Filter());
		  Search.F1().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Country']")));
		  driver.findElement(By.xpath("//span[text()='Country']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.O1().click();
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("(//span[text()='HasValue'])[2]")));
		  driver.findElement(By.xpath("(//span[text()='HasValue'])[2]")).click();
		  logger.info("select on dropdown");
		  
		//  Thread.sleep(5000); //explWaitToClick(account.Operator());
		 // Search.V1().click(); 
		//  Thread.sleep(2000);
		//  explWaitToClick(driver.findElement(By.xpath("//span[text()='USA']")));
		//  driver.findElement(By.xpath("//span[text()='USA']")).click();
		//  logger.info("select on dropdown");
		  
		  
		  
		  //........................................END................................
		  //..............................// //..................................ADM
		  //New...........................................................//
		  
		  Thread.sleep(5000); 
		  Search.Save1().click();
		  logger.info("Clicked on Save1 button");
		  
		  
		  Thread.sleep(5000); 
		  Search.ADMplus().click();
		  logger.info("Clicked on ADMplus button");
		  
		  
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.AsscociatedModule().click();
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Territory']")));
		  driver.findElement(By.xpath("//span[text()='Territory']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.ADMtemplate().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("(//span[text()='Default Channel_template'])[2]")));
		  driver.findElement(By.xpath("(//span[text()='Default Channel_template'])[2]")).click(); 
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.ADMchoice().click();
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("(//span[text()='And'])[2]")));
		  driver.findElement(By.xpath("(//span[text()='And'])[2]")).click();
		  logger.info("select on dropdown");
		  
		
		  //explWaitToClick(account.Operator());
		  Thread.sleep(3000); 
		  Search.ADMFilter().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.
		  xpath("//span[text()='Territory Contact']")));
		  driver.findElement(By.xpath("//span[text()='Territory Contact']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.ADMoperator().click(); 
		  Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='HasValue']")));
		  driver.findElement(By.xpath("//span[text()='HasValue']")).click();
		  logger.info("select on dropdown");
		  
		  
	//	  Thread.sleep(5000); 
	//	  Search.ADMValue().click(); 
	//	  Thread.sleep(2000);
	//	  explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto1 ']")));
	//	  driver.findElement(By.xpath("//span[text()='Auto1 ']")).click();
	//	  Search.ADMValue().click();
	//	  logger.info("select on dropdown");
		  
		  
		  Thread.sleep(5000); 
		  Search.ADMSave().click();
		  logger.info("Clicked on ADMSave button");
		  
		  
		  Thread.sleep(5000); 
		  Search.Preview().click();
		  logger.info("Clicked on Preview button");
		  
		  
		  
		  Thread.sleep(5000); 
		  Search.Cancel().click();
		  logger.info("Clicked on Cancel button");
		  
		  //..................................ADM
		  //End...........................................//
		  
		  Thread.sleep(5000);
		  Search.Save2().click();
		  logger.info("Clicked on Save2 button");
		  
		  Thread.sleep(5000); 
		  Search.ClickNameopt().click();
		  logger.info("Clicked on ClickNameopt button");
		  
		  Thread.sleep(15000); 
		  Search.List().click();
		  logger.info("Clicked on List button");
		  
		  
		  Thread.sleep(5000); 
		  Search.Setting().click();
		  logger.info("Clicked on Setting button");
		  
		  
		  Thread.sleep(5000); 
		  Search.CreatedBy().click();
		  logger.info("Clicked on CreatedBy button");
		  
		  
		  Thread.sleep(5000); 
		  Search.UpdatedBy().click();
		  logger.info("Clicked on UpdatedBy button");
		  
		  Thread.sleep(6000); 
		  Search.SettingSave().click();
		  logger.info("Clicked on SettingSave button");
		  
		  
		 // Thread.sleep(5000); 
		//  Search.Xcross().click();
		 // logger.info("Clicked on Xcross button");
		  
		  

		
		
	}
	

}
