package com.liono360.MiscSavedSearchesLead;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_035SavedSearchesUpdatedDate extends Baseclass {
	@Test
	public void SavedSearchesUpdatedDateTest () throws InterruptedException {
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
		Search.Name().sendKeys("FName58p" + randomnumber());
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='UpdatedDate']")));
		driver.findElement(By.xpath("//span[text()='UpdatedDate']")).click();
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
		
		Thread.sleep(7000);
		Search.ClickNameopt().click();
		logger.info("Clicked on ClickNameopt button");
		
		Thread.sleep(5000);
		Search.List().click();
		logger.info("Clicked on List button");
		
	
		Thread.sleep(5000);
		Search.Setting().click();
		logger.info("Clicked on Setting button");
		
		
		Thread.sleep(5000);
		Search.UpadtedDate().click();
		logger.info("Clicked on UpadtedDate button");
	
		
		Thread.sleep(5000);
		Search.SettingSave().click();
		logger.info("Clicked on SettingSave button");
		

		//.........................GROUP................................//
			
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
			
		//...................GroupEnd...................................................//	
			Thread.sleep(8000);
			Search.GroupC().click();
			logger.info("Clicked on GroupC button");
			
			
			
			Thread.sleep(5000);
			//explWaitToClick(account.Operator());
			Search.GroupBy().click();
		    Thread.sleep(2000);
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Lead Name']")));
			driver.findElement(By.xpath("//span[text()='Lead Name']")).click();
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
			
		//..............................G1...............................................//	
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
			
		
		//..............................G2...............................................//		
			
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
			
		

		//..............................G3...............................................//	
			
			Thread.sleep(8000);
			Search.GroupC().click();
			logger.info("Clicked on GroupC button");
			
			
			
			Thread.sleep(5000);
			//explWaitToClick(account.Operator());
			Search.GroupBy().click();
		    Thread.sleep(2000);
			explWaitToClick(driver.findElement(By.xpath("//span[text()='UpdatedDate']")));
			driver.findElement(By.xpath("//span[text()='UpdatedDate']")).click();
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
			
			
		//..............................G4...............................................//	
			
		
		
		
	}
	
}
