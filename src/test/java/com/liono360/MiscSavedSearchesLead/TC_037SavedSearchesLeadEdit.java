package com.liono360.MiscSavedSearchesLead;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_037SavedSearchesLeadEdit extends Baseclass{

	@Test
	public void SavedSearchesLeadEditTest () throws InterruptedException {
		
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
		Thread.sleep(9000);
		Search.Miscbtn().click();
		logger.info("Clicked on Miscbtn button");
		
		
		Thread.sleep(3000);
		Search.ClickSavedS().click();
		logger.info("Clicked on ClickSavedS button");
		
		
		
		Thread.sleep(3000);
		Search.Newbtn().click();
		logger.info("Clicked on Newbtn button");
		
		
		
		
		explWaitToClick(Search.Name());
		Search.Name().sendKeys("FNameSa2" + randomnumber());
		logger.info("First Name Added");
	
		
		Thread.sleep(3000);
		//explWaitToClick(account.AccessPermission());
		Search.AccessPermission().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto3 check']")));
		driver.findElement(By.xpath("//span[text()='Auto3 check']")).click();
		logger.info("select on dropdown");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Module());
		Search.Module().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Lead']")));
		driver.findElement(By.xpath("//span[text()='Lead']")).click();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(3000);
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
		
		
		
		
		
		
		
		Thread.sleep(5000);
		Search.Save2().click();
		logger.info("Clicked on Save2 button");
		
		Thread.sleep(5000);
		mouseActionRightClick(driver, Search.RightClick());
		logger.info("Right click");
		
		
		

		Thread.sleep(5000);
		Search.Edit().click();
		logger.info("Clicked on Edit button");
		
		
		explWaitToClick(Search.Name());
		Search.Name().clear();
		Search.Name().sendKeys("FNameA5" + randomnumber());
		logger.info("First Name Added");
	
		
		Thread.sleep(5000);
		//explWaitToClick(account.AccessPermission());
		Search.AccessPermission().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto3 check']")));
		driver.findElement(By.xpath("//span[text()='Auto3 check']")).click();
		
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Steve Jobs']")));
		driver.findElement(By.xpath("//span[text()='Steve Jobs']")).click();
		
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Karn Sheth']")));
		driver.findElement(By.xpath("//span[text()='Karn Sheth']")).click();
		Search.AccessPermission().click();
		
		
		
		Thread.sleep(5000);
		Search.Cpencil().click();
		logger.info("Clicked on Cpencil button");
		
		
		
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Filter());
		Search.Filter().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='UpdatedBy']")));
		driver.findElement(By.xpath("//span[text()='UpdatedBy']")).click();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='HasValue']")));
		driver.findElement(By.xpath("//span[text()='HasValue']")).click();
		logger.info("select on dropdown");
		

		//Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		//Search.Value().click();
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='Bill Gates']")));
		//driver.findElement(By.xpath("//span[text()='Bill Gates']")).click();
		//Search.Value().click();
		//logger.info("select on dropdown");
		
		
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
			
			
			
			//Thread.sleep(5000);
			//Search.CreatedDated().click();
			//logger.info("Clicked on CreatedDated button");
			
			Thread.sleep(5000);
			Search.UpdatedBy().click();
			logger.info("Clicked on UpdatedBy button");
			
		
			
			Thread.sleep(5000);
			Search.SettingSave().click();
			logger.info("Clicked on SettingSave button");
			
			
			
			Thread.sleep(5000); 
			Search.Xcross().click();
			logger.info("Clicked on Xcross button");
			
			
	
			//..........................Edit2...............................//
		
			Thread.sleep(5000);
			mouseActionRightClick(driver, Search.RightClick());
			logger.info("Right click");
			
			
			
			Thread.sleep(5000);
			Search.Edit().click();
			logger.info("Clicked on Edit button");
			
			
			explWaitToClick(Search.Name());
			Search.Name().clear();
			Search.Name().sendKeys("FAk89" + randomnumber());
			logger.info("First Name Added");
			
			
			
			Thread.sleep(5000);
			//explWaitToClick(account.AccessPermission());
			Search.AccessPermission().click();
			Thread.sleep(2000);
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto3 check']")));
			driver.findElement(By.xpath("//span[text()='Auto3 check']")).click();
			
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Steve Jobs']")));
			driver.findElement(By.xpath("//span[text()='Steve Jobs']")).click();
			
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Karn Sheth']")));
			driver.findElement(By.xpath("//span[text()='Karn Sheth']")).click();
			
			
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto2 Check']")));
			driver.findElement(By.xpath("//span[text()='Auto2 Check']")).click();
			
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Sanjeev Tiwari']")));
			driver.findElement(By.xpath("//span[text()='Sanjeev Tiwari']")).click();
			
			Search.AccessPermission().click();
			logger.info("select on dropdown");
			
			

			 Thread.sleep(5000);
			 Search.Cpencil().click();
			 logger.info("Clicked on Cpencil button");
			
			
			
				Thread.sleep(3000);
				//explWaitToClick(account.Filter());
				Search.Filter().click();
				Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//span[text()='Currency']")));
				driver.findElement(By.xpath("//span[text()='Currency']")).click();
				logger.info("select on dropdown");
				
				
				
				Thread.sleep(3000);
				//explWaitToClick(account.Operator());
				Search.Operator().click();
				Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//span[text()='IsEqualTo']")));
				driver.findElement(By.xpath("//span[text()='IsEqualTo']")).click();
				logger.info("select on dropdown");
				
				
				Thread.sleep(3000);
				//explWaitToClick(account.Operator());
				Search.Value().click();
				Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//span[text()=' Rupees ']")));
				driver.findElement(By.xpath("//span[text()=' Rupees ']")).click();
				Search.Value().click();
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
				
				
			//	Thread.sleep(5000);
			//	Search.UpdatedBy().click();
			//	logger.info("Clicked on UpdatedBy button");
				
				
				
				
				Thread.sleep(5000);
				Search.Currency().click();
				logger.info("Clicked on Country button");
				
			
				
				Thread.sleep(5000);
				Search.SettingSave().click();
				logger.info("Clicked on SettingSave button");
				
				
			//	Thread.sleep(5000); 
			//	Search.Xcross().click();
			//	logger.info("Clicked on Xcross button");
		
		
	}
	
}
