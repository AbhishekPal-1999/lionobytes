package com.liono360.MiscSavedSearchesOpportunity;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_006SavedSearchesOpportunityContactPhone extends Baseclass{

	@Test
	public void SavedSearchesOpportunityContactPhoneTest () throws InterruptedException {
		
		//9898989898
		
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
		
		Thread.sleep(9000);
		Search.Miscbtn().click();
		logger.info("Clicked on Miscbtn button");
		
		
		Thread.sleep(3000);
		Search.ClickSavedS().click();
		logger.info("Clicked on ClickSavedS button");
		
		
		
		Thread.sleep(6000);
		Search.Newbtn().click();
		logger.info("Clicked on Newbtn button");
		
		
		explWaitToClick(Search.Name());
		Search.Name().sendKeys("Nameu5" + randomnumber());
		logger.info("First Name Added");
	
		Thread.sleep(5000);
		//explWaitToClick(account.AccessPermission());
		Search.AccessPermission().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto1 ']")));
		driver.findElement(By.xpath("//span[text()='Auto1 ']")).click();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Module());
		Search.Module().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Opportunity']")));
		driver.findElement(By.xpath("//span[text()='Opportunity']")).click();
		logger.info("select on dropdown");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Template());
		Search.Template().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Default_Channel_template']")));
		driver.findElement(By.xpath("//span[text()='Default_Channel_template']")).click();
		logger.info("select on dropdown");
		
			
		Thread.sleep(3000);
		//explWaitToClick(account.Template());
		Search.AccountChannelopp().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[text()='Default Channel'])[2]")));
		driver.findElement(By.xpath("(//span[text()='Default Channel'])[2]")).click();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(3000);
		Search.PlusC().click();
		logger.info("Clicked on PlusC button");
		
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Filter());
		Search.Filter().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Contact Phone']")));
		driver.findElement(By.xpath("//span[text()='Contact Phone']")).click();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='IsEqualTo']")));
		driver.findElement(By.xpath("//span[text()='IsEqualTo']")).click();
		logger.info("select on dropdown");
		
		 Thread.sleep(5000); 
		  Search.Value1().sendKeys("9898989898");
		  logger.info("Clicked on Value button");
		
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
		  Search.Value1().sendKeys("9898989898");
		  logger.info("Clicked on Value button");
		
		
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='StartsWith']")));
		driver.findElement(By.xpath("//span[text()='StartsWith']")).click();
		logger.info("select on dropdown");
		
		 Thread.sleep(5000); 
		  Search.Value1().sendKeys("9898989898");
		  logger.info("Clicked on Value button");
		
		
		
		
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='EndsWith']")));
		driver.findElement(By.xpath("//span[text()='EndsWith']")).click();
		logger.info("select on dropdown");
		
		
		 Thread.sleep(5000); 
		  Search.Value1().sendKeys("9898989898");
		  logger.info("Clicked on Value button");
		
		
		
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Contains']")));
		driver.findElement(By.xpath("//span[text()='Contains']")).click();
		logger.info("select on dropdown");
		
		 Thread.sleep(5000); 
		  Search.Value1().sendKeys("9898989898");
		  logger.info("Clicked on Value button");
		
		
		
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='DoesNotContain']")));
		driver.findElement(By.xpath("//span[text()='DoesNotContain']")).click();
		logger.info("select on dropdown");
		
		 Thread.sleep(5000); 
		  Search.Value1().sendKeys("9898989898");
		  logger.info("Clicked on Value button");
		
		
		
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
//................................................7....................................................//	
		
		
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
 //................................................8....................................................//
		
		Thread.sleep(5000);
		Search.Cpencil().click();
		logger.info("Clicked on Cpencil button");
		
		
		Thread.sleep(3000);
		//explWaitToClick(account.Operator());
		Search.Operator().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='DoesNotContain']")));
		driver.findElement(By.xpath("//span[text()='DoesNotContain']")).click();
		logger.info("select on dropdown");
		
		
		 Thread.sleep(5000); 
		 Search.Value1().sendKeys("9898989898");
		 logger.info("Clicked on Value1 button");
		
		
		
		
		
		Thread.sleep(5000);
		Search.ASave().click();
		logger.info("Clicked on ASave button");
		
		
		Thread.sleep(5000);
		Search.Preview().click();
		logger.info("Clicked on Preview button");
		
		
		
		Thread.sleep(5000);
		Search.Cancel().click();
		logger.info("Clicked on Cancel button");
		
		
		
		Thread.sleep(6000);
		Search.Save2().click();
		logger.info("Clicked on Save2 button");
		
		Thread.sleep(6000);
		Search.ClickNameopt().click();
		logger.info("Clicked on ClickNameopt button");
		
		Thread.sleep(6000);
		Search.List().click();
		logger.info("Clicked on List button");
		
	
		Thread.sleep(5000);
		Search.Setting().click();
		logger.info("Clicked on Setting button");
		
		Thread.sleep(5000);
		Search.ContactPhone().click();
		logger.info("Clicked on ContactPhone button");
		
		
		
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Contact Phone']")));
		driver.findElement(By.xpath("//span[text()='Contact Phone']")).click();
		logger.info("select on dropdown");
		
		
		 Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		 Search.AggregateFields().click();
		 Thread.sleep(2000);
		 explWaitToClick(driver.findElement(By.xpath("//span[text()='Item Total']")));
		 driver.findElement(By.xpath("//span[text()='Item Total']")).click();
		 Search.AggregateFields().click();
		 logger.info("select on dropdown");

		 Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		Search.AggregateType().click();
		 Thread.sleep(2000);
		 explWaitToClick(driver.findElement(By.xpath("//span[text()='Total']")));
		 driver.findElement(By.xpath("//span[text()='Total']")).click();
		 logger.info("select on dropdown");
		
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Account Name']")));
		driver.findElement(By.xpath("//span[text()='Account Name']")).click();
		logger.info("select on dropdown");
		
		
		// Thread.sleep(3000);
		 //explWaitToClick(account.Operator());
		// Search.AggregateFields().click();
		// Thread.sleep(2000);
		// explWaitToClick(driver.findElement(By.xpath("//span[text()='Item Total']")));
		// driver.findElement(By.xpath("//span[text()='Item Total']")).click();
		// Search.AggregateFields().click();
		// logger.info("select on dropdown");

		 Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		Search.AggregateType().click();
		 Thread.sleep(2000);
		 explWaitToClick(driver.findElement(By.xpath("//span[text()='Max']")));
		 driver.findElement(By.xpath("//span[text()='Max']")).click();
		 logger.info("select on dropdown");
		
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='CreatedDate']")));
		driver.findElement(By.xpath("//span[text()='CreatedDate']")).click();
		logger.info("select on dropdown");
		
		
		// Thread.sleep(3000);
		 //explWaitToClick(account.Operator());
		// Search.AggregateFields().click();
		// Thread.sleep(2000);
		 //explWaitToClick(driver.findElement(By.xpath("//span[text()='Item Total']")));
		 //driver.findElement(By.xpath("//span[text()='Item Total']")).click();
		 //Search.AggregateFields().click();
		 //logger.info("select on dropdown");

		 Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		Search.AggregateType().click();
		 Thread.sleep(2000);
		 explWaitToClick(driver.findElement(By.xpath("//span[text()='Max']")));
		 driver.findElement(By.xpath("//span[text()='Max']")).click();
		 logger.info("select on dropdown");
		
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Opportunity Name ']")));
		driver.findElement(By.xpath("//span[text()='Opportunity Name ']")).click();
		logger.info("select on dropdown");
		
		
		// Thread.sleep(3000);
		 //explWaitToClick(account.Operator());
		// Search.AggregateFields().click();
		// Thread.sleep(2000);
		 //explWaitToClick(driver.findElement(By.xpath("//span[text()='Item Total']")));
		 //driver.findElement(By.xpath("//span[text()='Item Total']")).click();
		 //Search.AggregateFields().click();
		// logger.info("select on dropdown");

		 Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		Search.AggregateType().click();
		 Thread.sleep(2000);
		 explWaitToClick(driver.findElement(By.xpath("//span[text()='Min']")));
		 driver.findElement(By.xpath("//span[text()='Min']")).click();
		 logger.info("select on dropdown");
		
		
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
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Source']")));
		driver.findElement(By.xpath("//span[text()='Source']")).click();
		logger.info("select on dropdown");
		
		// Thread.sleep(3000);
		 //explWaitToClick(account.Operator());
		// Search.AggregateFields().click();
		// Thread.sleep(2000);
		// explWaitToClick(driver.findElement(By.xpath("//span[text()='Item Total']")));
		// driver.findElement(By.xpath("//span[text()='Item Total']")).click();
		 //Search.AggregateFields().click();
		 //logger.info("select on dropdown");

		 Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		Search.AggregateType().click();
		 Thread.sleep(2000);
		 explWaitToClick(driver.findElement(By.xpath("//span[text()='Avg']")));
		 driver.findElement(By.xpath("//span[text()='Avg']")).click();
		 logger.info("select on dropdown");
		
		
		Thread.sleep(5000);
		Search.GSave().click();
		logger.info("Clicked on GSave button");
		
		
	//..............................G4...............................................//	
		
		Thread.sleep(8000);
		Search.GroupC().click();
		logger.info("Clicked on GroupC button");
		
		
		
		Thread.sleep(5000);
		//explWaitToClick(account.Operator());
		Search.GroupBy().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Stage']")));
		driver.findElement(By.xpath("//span[text()='Stage']")).click();
		logger.info("select on dropdown");
		
		// Thread.sleep(3000);
		 //explWaitToClick(account.Operator());
		// Search.AggregateFields().click();
		// Thread.sleep(2000);
		// explWaitToClick(driver.findElement(By.xpath("//span[text()='Item Total']")));
		 //driver.findElement(By.xpath("//span[text()='Item Total']")).click();
		// Search.AggregateFields().click();
		 //logger.info("select on dropdown");

		 Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		Search.AggregateType().click();
		 Thread.sleep(2000);
		 explWaitToClick(driver.findElement(By.xpath("//span[text()='Avg']")));
		 driver.findElement(By.xpath("//span[text()='Avg']")).click();
		 logger.info("select on dropdown");
		
		
		Thread.sleep(5000);
		Search.GSave().click();
		logger.info("Clicked on GSave button");
			
		
		Thread.sleep(8000);
		Search.GroupC().click();
		logger.info("Clicked on GroupC button");
		
//....................................................................................................//			
		
		Thread.sleep(5000);
		//explWaitToClick(account.Operator());
		Search.GroupBy().click();
	    Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Close Date']")));
		driver.findElement(By.xpath("//span[text()='Close Date']")).click();
		logger.info("select on dropdown");
		
		
	//	 Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		// Search.AggregateFields().click();
		// Thread.sleep(2000);
		// explWaitToClick(driver.findElement(By.xpath("//span[text()='Item Total']")));
		// driver.findElement(By.xpath("//span[text()='Item Total']")).click();
		// Search.AggregateFields().click();
		// logger.info("select on dropdown");

		 Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		Search.AggregateType().click();
		 Thread.sleep(2000);
		 explWaitToClick(driver.findElement(By.xpath("//span[text()='Total']")));
		 driver.findElement(By.xpath("//span[text()='Total']")).click();
		 logger.info("select on dropdown");
		
		Thread.sleep(5000);
		Search.GSave().click();
		logger.info("Clicked on GSave button");	

		
		
	}
}
