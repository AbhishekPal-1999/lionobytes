package com.liono360.MiscSavedSearchesAccount;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_041SavedSearchesAccountEdit extends Baseclass{
	@Test
	public void SavedSearchesAccountEditTest   () throws InterruptedException {
		
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
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
		Search.Name().sendKeys("FNameAk1" + randomnumber());
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
		
		
		//..........................Edit.......................................//

		Thread.sleep(5000);
		Search.Edit().click();
		logger.info("Clicked on Edit button");
		
		
		explWaitToClick(Search.Name());
		Search.Name().clear();
		Search.Name().sendKeys("FName8" + randomnumber());
		logger.info("First Name Added");
	
		Thread.sleep(5000);
		//explWaitToClick(account.AccessPermission());
		Search.AccessPermission().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto1 ']")));
		driver.findElement(By.xpath("//span[text()='Auto1 ']")).click();
		
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='John Claw']")));
		driver.findElement(By.xpath("//span[text()='John Claw']")).click();
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Bill Gates']")));
		driver.findElement(By.xpath("//span[text()='Bill Gates']")).click();
		Search.AccessPermission().click();
		logger.info("select on dropdown");
		
		
		
		 Thread.sleep(5000);
		 Search.Cpencil().click();
		 logger.info("Clicked on Cpencil button");
		
		 Thread.sleep(3000); //explWaitToClick(account.Filter());
		  Search.Filter().click(); Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='CreatedBy']")));
		  driver.findElement(By.xpath("//span[text()='CreatedBy']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(3000); //explWaitToClick(account.Operator());
		  Search.Operator().click(); Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='IsNotEqualTo']")));
		  driver.findElement(By.xpath("//span[text()='IsNotEqualTo']")).click();
		  logger.info("select on dropdown");
		  
		  Thread.sleep(5000); //explWaitToClick(account.Operator());
		  Search.Avalue1().click(); Thread.sleep(2000);
		  explWaitToClick(driver.findElement(By.xpath("//span[text()='Bill Gates']")));
		  driver.findElement(By.xpath("//span[text()='Bill Gates']")).click();
		  Search.Avalue1().click(); logger.info("select on dropdown");
		  
		
		  
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
			Search.CreatedBy().click();
			logger.info("Clicked on CreatedBy button");
			
		
			
			Thread.sleep(5000);
			Search.SettingSave().click();
			logger.info("Clicked on SettingSave button");
			
			
			Thread.sleep(5000); 
			Search.Xcross().click();
			logger.info("Clicked on Xcross button");
			
			
			
			//..............................2Edit.................................//
			Thread.sleep(5000);
			mouseActionRightClick(driver, Search.RightClick());
			logger.info("Right click");
			
			
			
			Thread.sleep(5000);
			Search.Edit().click();
			logger.info("Clicked on Edit button");
			
			
			explWaitToClick(Search.Name());
			Search.Name().clear();
			Search.Name().sendKeys("FName8" + randomnumber());
			logger.info("First Name Added");
			
			
			
			
			Thread.sleep(5000);
			//explWaitToClick(account.AccessPermission());
			Search.AccessPermission().click();
			Thread.sleep(2000);
			explWaitToClick(driver.findElement(By.xpath("//span[text()='John Claw']")));
			driver.findElement(By.xpath("//span[text()='John Claw']")).click();
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Bill Gates']")));
			driver.findElement(By.xpath("//span[text()='Bill Gates']")).click();
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Sanjeev Tiwari']")));
			driver.findElement(By.xpath("//span[text()='Sanjeev Tiwari']")).click();
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Steve Jobs']")));
			driver.findElement(By.xpath("//span[text()='Steve Jobs']")).click();
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Sundar  Pichai']")));
			driver.findElement(By.xpath("//span[text()='Sundar  Pichai']")).click();
			Search.AccessPermission().click();
			logger.info("select on dropdown");
			
			 Thread.sleep(8000);
			 Search.Cpencil().click();
			 logger.info("Clicked on Cpencil button");
			
			  Thread.sleep(3000); //explWaitToClick(account.Filter());
			  Search.Filter().click(); 
			  Thread.sleep(2000);
			  explWaitToClick(driver.findElement(By.xpath("//span[text()='Country']")));
			  driver.findElement(By.xpath("//span[text()='Country']")).click();
			  logger.info("select on dropdown");
				
				Thread.sleep(3000);
				// explWaitToClick(account.Operator());
				Search.Operator().click();
				Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//span[text()='IsNotEqualTo']")));
				driver.findElement(By.xpath("//span[text()='IsNotEqualTo']")).click();
				logger.info("select on dropdown");

				Thread.sleep(5000); // explWaitToClick(account.Operator());
				Search.Avalue9().click();
				Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//span[text()='USA']")));
				driver.findElement(By.xpath("//span[text()='USA']")).click();
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
				Search.Country().click();
				logger.info("Clicked on Country button");
				
			
				
				Thread.sleep(5000);
				Search.SettingSave().click();
				logger.info("Clicked on SettingSave button");
				
				
				Thread.sleep(5000); 
				Search.Xcross().click();
				logger.info("Clicked on Xcross button");
				
				
			
	}
	
	

}
