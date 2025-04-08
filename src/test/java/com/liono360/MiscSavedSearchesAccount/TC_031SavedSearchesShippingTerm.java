package com.liono360.MiscSavedSearchesAccount;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_031SavedSearchesShippingTerm extends Baseclass{

	
	@Test
	public void SavedSearchesShippingTermTest () throws InterruptedException, IOException {
		
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
		Search.Name().sendKeys("FName" + randomnumber());
		logger.info("First Name Added");
	
		Thread.sleep(5000);
		//explWaitToClick(account.AccessPermission());
		Search.AccessPermission().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto1 ']")));
		driver.findElement(By.xpath("//span[text()='Auto1 ']")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(5000);
		//explWaitToClick(account.Module());
		Search.Module().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Account']")));
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(5000);
		//explWaitToClick(account.Template());
		Search.Template().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Default Channel_template']")));
		driver.findElement(By.xpath("//span[text()='Default Channel_template']")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(3000);
		Search.PlusC().click();
		logger.info("Clicked on PlusC button");
		
		Thread.sleep(3000);
		//explWaitToClick(account.Filter());
		Search.Filter().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Shipping Term']")));
		driver.findElement(By.xpath("//span[text()='Shipping Term']")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='IsEqualTo']")));
		driver.findElement(By.xpath("//span[text()='IsEqualTo']")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(5000);
		//explWaitToClick(account.Operator());
		Search.Avalue1().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()=' Term1 ']")));
		driver.findElement(By.xpath("//span[text()=' Term1 ']")).click();
		Search.Avalue1().click();
		logger.info("select on dropdown");
		
		
		
		
		Thread.sleep(5000);
		Search.ASave().click();
		logger.info("Clicked on ASave button");
		
		
		Thread.sleep(5000);
		Search.Preview().click();
		logger.info("Clicked on Preview button");
		
		
		
		Thread.sleep(5000);
		Search.Cancel().click();
		logger.info("Clicked on Cancel button");
		
		
		//......................................1.............................................//

		Thread.sleep(5000);
		Search.Cpencil().click();
		logger.info("Clicked on Cpencil button");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='IsNotEqualTo']")));
		driver.findElement(By.xpath("//span[text()='IsNotEqualTo']")).click();
		logger.info("select on dropdown");
		
		
		Thread.sleep(5000);
		Search.ASave().click();
		logger.info("Clicked on ASave button");
		
		
		Thread.sleep(5000);
		Search.Preview().click();
		logger.info("Clicked on Preview button");
		
		
		
		Thread.sleep(5000);
		Search.Cancel().click();
		logger.info("Clicked on Cancel button");
		
	//...............................................2..............................................//	

		Thread.sleep(5000);
		Search.Cpencil().click();
		logger.info("Clicked on Cpencil button");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='HasValue']")));
		driver.findElement(By.xpath("//span[text()='HasValue']")).click();
		logger.info("select on dropdown");
		
		
		Thread.sleep(5000);
		Search.ASave().click();
		logger.info("Clicked on ASave button");
		
		
		Thread.sleep(5000);
		Search.Preview().click();
		logger.info("Clicked on Preview button");
		
		
		
		Thread.sleep(5000);
		Search.Cancel().click();
		logger.info("Clicked on Cancel button");
//................................................4....................................................//	
		
		
		Thread.sleep(5000);
		Search.Cpencil().click();
		logger.info("Clicked on Cpencil button");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='NoValue']")));
		driver.findElement(By.xpath("//span[text()='NoValue']")).click();
		logger.info("select on dropdown");
		
		
		Thread.sleep(5000);
		Search.ASave().click();
		logger.info("Clicked on ASave button");
		
		
		Thread.sleep(5000);
		Search.Preview().click();
		logger.info("Clicked on Preview button");
		
		
		
		Thread.sleep(5000);
		Search.Cancel().click();
		logger.info("Clicked on Cancel button");
	  
	  
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
		Search.ShippingTerm().click();
		logger.info("Clicked on ShippingTerm button");
		
		
		
		
		Thread.sleep(5000);
		Search.StreetAdress2().click();
		logger.info("Clicked on StreetAdress2 button");
		
		
		Thread.sleep(5000);
		Search.SettingSave().click();
		logger.info("Clicked on SettingSave button");
		
		
	//	Thread.sleep(5000);
	//	Search.Xcross().click();
	//	logger.info("Clicked on Xcross button");
		
		//............................Group 1.......................................................//	
		
				Thread.sleep(8000);
				Search.GroupC().click();
				logger.info("Clicked on GroupC button");
				
				
				
				Thread.sleep(5000);
				//explWaitToClick(account.Operator());
				Search.GroupBy().click();
			    Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//span[text()='Account Name']")));
				driver.findElement(By.xpath("//span[text()='Account Name']")).click();
				logger.info("select on dropdown");
				
				
				// Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				// Search.AggregateFields().click();
				// Thread.sleep(2000);
				// explWaitToClick(driver.findElement(By.xpath("")));
				// driver.findElement(By.xpath("")).click();
				// logger.info("select on dropdown");

				// Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				// Search.AggregateType().click();
				// Thread.sleep(2000);
				// explWaitToClick(driver.findElement(By.xpath("")));
				// driver.findElement(By.xpath("")).click();
				// logger.info("select on dropdown");
						
				
				
				Thread.sleep(5000);
				Search.GSave().click();
				logger.info("Clicked on GSave button");
				
				
			
				Thread.sleep(8000);
				Search.GroupC().click();
				logger.info("Clicked on GroupC button");
				
				
				
				Thread.sleep(5000);
				//explWaitToClick(account.Operator());
				Search.GroupBy().click();
			    Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//span[text()='Parent Account']")));
				driver.findElement(By.xpath("//span[text()='Parent Account']")).click();
				logger.info("select on dropdown");
				
				
				// Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				// Search.AggregateFields().click();
				// Thread.sleep(2000);
				// explWaitToClick(driver.findElement(By.xpath("")));
				// driver.findElement(By.xpath("")).click();
				// logger.info("select on dropdown");

				// Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				// Search.AggregateType().click();
				// Thread.sleep(2000);
				// explWaitToClick(driver.findElement(By.xpath("")));
				// driver.findElement(By.xpath("")).click();
				// logger.info("select on dropdown");
						
				
				
				Thread.sleep(5000);
				Search.GSave().click();
				logger.info("Clicked on GSave button");
				
				
			//............................Group 4.......................................................//	
				Thread.sleep(8000);
				Search.GroupC().click();
				logger.info("Clicked on GroupC button");
				
				
				
				Thread.sleep(5000);
				//explWaitToClick(account.Operator());
				Search.GroupBy().click();
			    Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//span[text()='First Name']")));
				driver.findElement(By.xpath("//span[text()='First Name']")).click();
				logger.info("select on dropdown");
				
				
				// Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				// Search.AggregateFields().click();
				// Thread.sleep(2000);
				// explWaitToClick(driver.findElement(By.xpath("")));
				// driver.findElement(By.xpath("")).click();
				// logger.info("select on dropdown");

				// Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				// Search.AggregateType().click();
				// Thread.sleep(2000);
				// explWaitToClick(driver.findElement(By.xpath("")));
				// driver.findElement(By.xpath("")).click();
				// logger.info("select on dropdown");
						
				
				
				Thread.sleep(5000);
				Search.GSave().click();
				logger.info("Clicked on GSave button");
				
				
				
				
			//............................Group 5.......................................................//	
				
				
				Thread.sleep(8000);
				Search.GroupC().click();
				logger.info("Clicked on GroupC button");
				
				
				
				Thread.sleep(5000);
				//explWaitToClick(account.Operator());
				Search.GroupBy().click();
			    Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//span[text()='Last Name']")));
				driver.findElement(By.xpath("//span[text()='Last Name']")).click();
				logger.info("select on dropdown");
				
				
				// Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				// Search.AggregateFields().click();
				// Thread.sleep(2000);
				// explWaitToClick(driver.findElement(By.xpath("")));
				// driver.findElement(By.xpath("")).click();
				// logger.info("select on dropdown");

				// Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				// Search.AggregateType().click();
				// Thread.sleep(2000);
				// explWaitToClick(driver.findElement(By.xpath("")));
				// driver.findElement(By.xpath("")).click();
				// logger.info("select on dropdown");
						
				
				
				Thread.sleep(5000);
				Search.GSave().click();
				logger.info("Clicked on GSave button");
					
				
				
				//............................Group 2.......................................................//		
				Thread.sleep(8000);
				Search.GroupC().click();
				logger.info("Clicked on GroupC button");
				
				
				
				Thread.sleep(5000);
				//explWaitToClick(account.Operator());
				Search.GroupBy().click();
			    Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//span[text()='Shipping Term']")));
				driver.findElement(By.xpath("//span[text()='Shipping Term']")).click();
				logger.info("select on dropdown");
				
				
				// Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				// Search.AggregateFields().click();
				// Thread.sleep(2000);
				// explWaitToClick(driver.findElement(By.xpath("")));
				// driver.findElement(By.xpath("")).click();
				// logger.info("select on dropdown");

				// Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				// Search.AggregateType().click();
				// Thread.sleep(2000);
				// explWaitToClick(driver.findElement(By.xpath("")));
				// driver.findElement(By.xpath("")).click();
				// logger.info("select on dropdown");
						
				
				
				Thread.sleep(5000);
				Search.GSave().click();
				logger.info("Clicked on GSave button");
				
				
				
			//............................Group 3.......................................................//
				
				
		

		
		
		
		
		
		
				/*
				 * if(Search.Tabledata().isDisplayed()) { Assert.assertTrue(true);
				 * 
				 * logger.info("Data is Coming test passed");
				 * 
				 * } else {
				 * 
				 * Assert.assertTrue(false); captureScreen(driver, "");
				 * logger.info("Data is not Coming test failed"); }
				 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//.................................!!!!!!!!!!new1!!!!!!!!!!....................................................................//
		/*
		 * Thread.sleep(5000); Search.ClickPlus().click();
		 * logger.info("Clicked on ClickPlus button");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.Choice1().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Or']")));
		 * driver.findElement(By.xpath("//span[text()='Or']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Filter());
		 * Search.Filter1().click(); Thread.sleep(4000);
		 * explWaitToClick(driver.findElement(By.
		 * xpath("//span[text()='Street Address 2']")));
		 * driver.findElement(By.xpath("//span[text()='Street Address 2']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.Operator());
		 * Search.Opeartor1().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='HasValue']")));
		 * driver.findElement(By.xpath("//span[text()='HasValue']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * // Thread.sleep(5000); //explWaitToClick(account.Operator()); //
		 * Search.Avalue1().click(); // Thread.sleep(2000); //
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='USA']"))); //
		 * driver.findElement(By.xpath("//span[text()='USA']")).click(); //
		 * logger.info("select on dropdown");
		 * //........................................END................................
		 * ..............................// //..................................ADM
		 * New...........................................................//
		 * 
		 * Thread.sleep(5000); Search.Save1().click();
		 * logger.info("Clicked on Save1 button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ADMplus().click();
		 * logger.info("Clicked on ADMplus button");
		 * 
		 * 
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.AsscociatedModule().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Contact']")));
		 * driver.findElement(By.xpath("//span[text()='Contact']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.ADMtemplate().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.
		 * xpath("//span[text()='Contact Template']")));
		 * driver.findElement(By.xpath("//span[text()='Contact Template']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.ADMchoice().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Or']")));
		 * driver.findElement(By.xpath("//span[text()='Or']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.ADMFilter().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.
		 * xpath("//span[text()='Shipping Method']")));
		 * driver.findElement(By.xpath("//span[text()='Shipping Method']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.ADMoperator().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='IsEqualTo']")));
		 * driver.findElement(By.xpath("//span[text()='IsEqualTo']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ADMValue().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()=' EasyPost ']")));
		 * driver.findElement(By.xpath("//span[text()=' EasyPost ']")).click();
		 * Search.ADMValue().click(); logger.info("select on dropdown");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ADMSave().click();
		 * logger.info("Clicked on ADMSave button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.Preview().click();
		 * logger.info("Clicked on Preview button");
		 * 
		 * 
		 * 
		 * Thread.sleep(5000); Search.Cancel().click();
		 * logger.info("Clicked on Cancel button");
		 * 
		 * //..................................ADM
		 * End...........................................//
		 * 
		 * Thread.sleep(5000); Search.Save2().click();
		 * logger.info("Clicked on Save2 button");
		 * 
		 * Thread.sleep(5000); Search.ClickNameopt().click();
		 * logger.info("Clicked on ClickNameopt button");
		 * 
		 * Thread.sleep(5000); Search.List().click();
		 * logger.info("Clicked on List button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.Setting().click();
		 * logger.info("Clicked on Setting button");
		 * 
		 * Thread.sleep(5000); Search.ShippingTerm().click();
		 * logger.info("Clicked on ShippingTerm button");
		 * 
		 * 
		 * 
		 * 
		 * Thread.sleep(5000); Search.StreetAdress2().click();
		 * logger.info("Clicked on StreetAdress2 button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.SettingSave().click();
		 * logger.info("Clicked on SettingSave button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.Xcross().click();
		 * logger.info("Clicked on Xcross button");
		 * 
		 * 
		 * //--------------------------------------And..................................
		 * ..........//
		 * 
		 * 
		 * 
		 * Thread.sleep(9000); Search.Miscbtn().click();
		 * logger.info("Clicked on Miscbtn button");
		 * 
		 * Thread.sleep(3000); Search.ClickSavedS().click();
		 * logger.info("Clicked on ClickSavedS button");
		 * 
		 * Thread.sleep(5000); Search.Newbtn().click();
		 * logger.info("Clicked on Newbtn button");
		 * 
		 * explWaitToClick(Search.Name()); Search.Name().sendKeys("FName" +
		 * randomnumber()); logger.info("First Name Added");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.AccessPermission());
		 * Search.AccessPermission().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto1 ']")));
		 * driver.findElement(By.xpath("//span[text()='Auto1 ']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.Module());
		 * Search.Module().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Account']")));
		 * driver.findElement(By.xpath("//span[text()='Account']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.Template());
		 * Search.Template().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.
		 * xpath("//span[text()='Default Channel_template']")));
		 * driver.findElement(By.xpath("//span[text()='Default Channel_template']")).
		 * click(); logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); Search.PlusC().click();
		 * logger.info("Clicked on PlusC button");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Filter());
		 * Search.Filter().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Shipping Term']")
		 * )); driver.findElement(By.xpath("//span[text()='Shipping Term']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.Operator().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='IsEqualTo']")));
		 * driver.findElement(By.xpath("//span[text()='IsEqualTo']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.Operator());
		 * Search.Avalue1().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()=' Term1 ']")));
		 * driver.findElement(By.xpath("//span[text()=' Term1 ']")).click();
		 * Search.Avalue1().click(); logger.info("select on dropdown");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ASave().click();
		 * logger.info("Clicked on ASave button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.Preview().click();
		 * logger.info("Clicked on Preview button");
		 * 
		 * 
		 * 
		 * Thread.sleep(5000); Search.Cancel().click();
		 * logger.info("Clicked on Cancel button");
		 * 
		 * 
		 * //......................................1....................................
		 * .........//
		 * 
		 * Thread.sleep(5000); Search.Cpencil().click();
		 * logger.info("Clicked on Cpencil button");
		 * 
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.Operator().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='IsNotEqualTo']"))
		 * ); driver.findElement(By.xpath("//span[text()='IsNotEqualTo']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ASave().click();
		 * logger.info("Clicked on ASave button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.Preview().click();
		 * logger.info("Clicked on Preview button");
		 * 
		 * 
		 * 
		 * Thread.sleep(5000); Search.Cancel().click();
		 * logger.info("Clicked on Cancel button");
		 * 
		 * //...............................................2...........................
		 * ...................//
		 * 
		 * Thread.sleep(5000); Search.Cpencil().click();
		 * logger.info("Clicked on Cpencil button");
		 * 
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.Operator().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='HasValue']")));
		 * driver.findElement(By.xpath("//span[text()='HasValue']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ASave().click();
		 * logger.info("Clicked on ASave button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.Preview().click();
		 * logger.info("Clicked on Preview button");
		 * 
		 * 
		 * 
		 * Thread.sleep(5000); Search.Cancel().click();
		 * logger.info("Clicked on Cancel button");
		 * //................................................4..........................
		 * ..........................//
		 * 
		 * 
		 * Thread.sleep(5000); Search.Cpencil().click();
		 * logger.info("Clicked on Cpencil button");
		 * 
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.Operator().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='NoValue']")));
		 * driver.findElement(By.xpath("//span[text()='NoValue']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ASave().click();
		 * logger.info("Clicked on ASave button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.Preview().click();
		 * logger.info("Clicked on Preview button");
		 * 
		 * 
		 * 
		 * Thread.sleep(5000); Search.Cancel().click();
		 * logger.info("Clicked on Cancel button");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //.................................!!!!!!!!!!new1!!!!!!!!!!..................
		 * ..................................................// Thread.sleep(5000);
		 * Search.ClickPlus().click(); logger.info("Clicked on ClickPlus button");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.Choice1().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("(//span[text()='And'])[2]")));
		 * driver.findElement(By.xpath("(//span[text()='And'])[2]")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Filter());
		 * Search.Filter1().click(); Thread.sleep(4000);
		 * explWaitToClick(driver.findElement(By.
		 * xpath("//span[text()='Street Address 2']")));
		 * driver.findElement(By.xpath("//span[text()='Street Address 2']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.Operator());
		 * Search.Opeartor1().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='HasValue']")));
		 * driver.findElement(By.xpath("//span[text()='HasValue']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * // Thread.sleep(5000); //explWaitToClick(account.Operator()); //
		 * Search.Avalue1().click(); // Thread.sleep(2000); //
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='USA']"))); //
		 * driver.findElement(By.xpath("//span[text()='USA']")).click(); //
		 * logger.info("select on dropdown");
		 * //........................................END................................
		 * ..............................// //..................................ADM
		 * New...........................................................//
		 * 
		 * Thread.sleep(5000); Search.Save1().click();
		 * logger.info("Clicked on Save1 button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ADMplus().click();
		 * logger.info("Clicked on ADMplus button");
		 * 
		 * 
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.AsscociatedModule().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Territory']")));
		 * driver.findElement(By.xpath("//span[text()='Territory']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.ADMtemplate().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.
		 * xpath("(//span[text()='Default Channel_template'])[2]")));
		 * driver.findElement(By.xpath("(//span[text()='Default Channel_template'])[2]")
		 * ).click(); logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.ADMchoice().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("(//span[text()='And'])[2]")));
		 * driver.findElement(By.xpath("(//span[text()='And'])[2]")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.ADMFilter().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.
		 * xpath("//span[text()='Territory Contact']")));
		 * driver.findElement(By.xpath("//span[text()='Territory Contact']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.ADMoperator().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='IsEqualTo']")));
		 * driver.findElement(By.xpath("//span[text()='IsEqualTo']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ADMValue().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto3 check']")))
		 * ; driver.findElement(By.xpath("//span[text()='Auto3 check']")).click();
		 * Search.ADMValue().click(); logger.info("select on dropdown");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ADMSave().click();
		 * logger.info("Clicked on ADMSave button");
		 * 
		 * 
		 * 
		 * Thread.sleep(5000); Search.Preview().click();
		 * logger.info("Clicked on Preview button");
		 * 
		 * 
		 * 
		 * Thread.sleep(5000); Search.Cancel().click();
		 * logger.info("Clicked on Cancel button");
		 * //..................................ADM
		 * End...........................................//
		 * 
		 * Thread.sleep(5000); Search.Save2().click();
		 * logger.info("Clicked on Save2 button");
		 * 
		 * Thread.sleep(5000); Search.ClickNameopt().click();
		 * logger.info("Clicked on ClickNameopt button");
		 * 
		 * Thread.sleep(5000); Search.List().click();
		 * logger.info("Clicked on List button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.Setting().click();
		 * logger.info("Clicked on Setting button");
		 * 
		 * 
		 * 
		 * Thread.sleep(5000); Search.ShippingTerm().click();
		 * logger.info("Clicked on ShippingTerm button");
		 * 
		 * 
		 * 
		 * 
		 * Thread.sleep(5000); Search.StreetAdress2().click();
		 * logger.info("Clicked on StreetAdress2 button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.SettingSave().click();
		 * logger.info("Clicked on SettingSave button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.Xcross().click();
		 * logger.info("Clicked on Xcross button");
		 */
		
	}
	
	
}
