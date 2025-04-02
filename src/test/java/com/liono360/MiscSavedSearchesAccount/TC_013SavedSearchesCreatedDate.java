package com.liono360.MiscSavedSearchesAccount;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_013SavedSearchesCreatedDate extends Baseclass{
	@Test
	public void SavedSearchesCreatedDateTest () throws InterruptedException, IOException {
		
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='CreatedDate']")));
		driver.findElement(By.xpath("//span[text()='CreatedDate']")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[text()='Between'])[2]")));
		driver.findElement(By.xpath("(//span[text()='Between'])[2]")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(5000);
		//explWaitToClick(account.Operator());
		Search.Avalue16().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='10']")));
		driver.findElement(By.xpath("//span[text()='10']")).click();
		explWaitToClick(driver.findElement(By.xpath("//span[text()='20']")));
		driver.findElement(By.xpath("//span[text()='20']")).click();
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Is']")));
		driver.findElement(By.xpath("//span[text()='Is']")).click();
		logger.info("select on dropdown");
		
		
		
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Avalue11().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Last Month']")));
		driver.findElement(By.xpath("//span[text()='Last Month']")).click();
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Before']")));
		driver.findElement(By.xpath("//span[text()='Before']")).click();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Avalue15().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='10']")));
		driver.findElement(By.xpath("//span[text()='10']")).click();
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
		
		
	//............................................3...................................................//
		
		Thread.sleep(5000);
		Search.Cpencil().click();
		logger.info("Clicked on Cpencil button");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='After']")));
		driver.findElement(By.xpath("//span[text()='After']")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Avalue15().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='8']")));
		driver.findElement(By.xpath("//span[text()='8']")).click();
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='OnOrBefore']")));
		driver.findElement(By.xpath("//span[text()='OnOrBefore']")).click();
		logger.info("select on dropdown");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Avalue15().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='13']")));
		driver.findElement(By.xpath("//span[text()='13']")).click();
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
		
 //................................................5....................................................//	
		Thread.sleep(5000);
		Search.Cpencil().click();
		logger.info("Clicked on Cpencil button");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='OnOrAfter']")));
		driver.findElement(By.xpath("//span[text()='OnOrAfter']")).click();
		logger.info("select on dropdown");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Avalue15().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='13']")));
		driver.findElement(By.xpath("//span[text()='13']")).click();
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
		
 //................................................6....................................................//	
	
//................................................7....................................................//	
		
		
		Thread.sleep(5000);
		Search.Cpencil().click();
		logger.info("Clicked on Cpencil button");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='NotOn']")));
		driver.findElement(By.xpath("//span[text()='NotOn']")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Avalue15().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='12']")));
		driver.findElement(By.xpath("//span[text()='12']")).click();
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
 //................................................8....................................................//
		
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
		Search.CreatedDated().click();
		logger.info("Clicked on CreatedDated button");
		
		
		Thread.sleep(5000);
		Search.SettingSave().click();
		logger.info("Clicked on SettingSave button");
		
		
		
		
		
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
				explWaitToClick(driver.findElement(By.xpath("//span[text()='CreatedDate']")));
				driver.findElement(By.xpath("//span[text()='CreatedDate']")).click();
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
		
		
		
				
		
		
		
		
		
		
	//	Thread.sleep(5000);
	//	Search.Xcross().click();
	//	logger.info("Clicked on Xcross button");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Payment Method']"
		 * ))); driver.findElement(By.xpath("//span[text()='Payment Method']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.Operator());
		 * Search.Opeartor1().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='IsNotEqualTo']"))
		 * ); driver.findElement(By.xpath("//span[text()='IsNotEqualTo']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.Operator());
		 * Search.Avalue1().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()=' Cash ']")));
		 * driver.findElement(By.xpath("//span[text()=' Cash ']")).click();
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
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Title']")));
		 * driver.findElement(By.xpath("//span[text()='Title']")).click();
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
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()=' Mr ']")));
		 * driver.findElement(By.xpath("//span[text()=' Mr ']")).click();
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
		 * 
		 * Thread.sleep(5000); Search.TimezoneClick1().click();
		 * logger.info("Clicked on TimezoneClick1 button");
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
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='CreatedDate']")))
		 * ; driver.findElement(By.xpath("//span[text()='CreatedDate']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.Operator().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Between']")));
		 * driver.findElement(By.xpath("//span[text()='Between']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.Operator());
		 * Search.Avalue10().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='10']")));
		 * driver.findElement(By.xpath("//span[text()='10']")).click();
		 * Search.Avalue10().click(); logger.info("select on dropdown");
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
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Payment Method']"
		 * ))); driver.findElement(By.xpath("//span[text()='Payment Method']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.Operator());
		 * Search.Opeartor1().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='IsNotEqualTo']"))
		 * ); driver.findElement(By.xpath("//span[text()='IsNotEqualTo']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(5000); //explWaitToClick(account.Operator());
		 * Search.Avalue1().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()=' Cash ']")));
		 * driver.findElement(By.xpath("//span[text()=' Cash ']")).click();
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
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='UpdatedDate']")))
		 * ; driver.findElement(By.xpath("//span[text()='UpdatedDate']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * Thread.sleep(3000); //explWaitToClick(account.Operator());
		 * Search.ADMoperator().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Is']")));
		 * driver.findElement(By.xpath("//span[text()='Is']")).click();
		 * logger.info("select on dropdown");
		 * 
		 * 
		 * Thread.sleep(5000); Search.ADMValue().click(); Thread.sleep(2000);
		 * explWaitToClick(driver.findElement(By.xpath("//span[text()='Last 30 days']"))
		 * ); driver.findElement(By.xpath("//span[text()='Last 30 days']")).click();
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
		 * 
		 * Thread.sleep(5000); Search.TimezoneClick1().click();
		 * logger.info("Clicked on TimezoneClick1 button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.SettingSave().click();
		 * logger.info("Clicked on SettingSave button");
		 * 
		 * 
		 * Thread.sleep(5000); Search.Xcross().click();
		 * logger.info("Clicked on Xcross button");
		 * 
		 */
		
		
	}
	
	
}
