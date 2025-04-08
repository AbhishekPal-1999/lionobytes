package com.liono360.MiscSavedSearchesOpportunity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LoginPage;
import com.liono360.pageObject.MiscSavedSearches;

public class TC_034SavedSearchesWithTwoFilterAndOperator extends Baseclass{

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
		Search.Name().sendKeys("FNameZ3" + randomnumber());
		logger.info("First Name Added");

		Thread.sleep(3000);
		// explWaitToClick(account.AccessPermission());
		Search.AccessPermission().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Auto3 check']")));
		driver.findElement(By.xpath("//span[text()='Auto3 check']")).click();
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
		// explWaitToClick(account.Filter());
		Search.Filter().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='UpdatedBy']")));
		driver.findElement(By.xpath("//span[text()='UpdatedBy']")).click();
		logger.info("select on dropdown");

		Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		Search.Operator().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='IsEqualTo']")));
		driver.findElement(By.xpath("//span[text()='IsEqualTo']")).click();
		logger.info("select on dropdown");

		Thread.sleep(3000);
		// explWaitToClick(account.Operator());
		Search.Value().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Bill Gates']")));
		driver.findElement(By.xpath("//span[text()='Bill Gates']")).click();
		Search.Value().click();
		logger.info("select on dropdown");

		Thread.sleep(5000);
		Search.ClickPlus().click();
		logger.info("Clicked on ClickPlus button");

		Thread.sleep(3000); // explWaitToClick(account.Operator());
		Search.Choice1().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Or']")));
		driver.findElement(By.xpath("//span[text()='Or']")).click();
		logger.info("select on dropdown");

		Thread.sleep(3000);
		// explWaitToClick(account.Filter());
		Search.Filteropp().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Forecast Category']")));
		driver.findElement(By.xpath("//span[text()='Forecast Category']")).click();
		logger.info("select on dropdown");

		Thread.sleep(3000); // explWaitToClick(account.Operator());
		Search.Operator53().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[text()='IsEqualTo'])[3]")));
		driver.findElement(By.xpath("(//span[text()='IsEqualTo'])[3]")).click();
		logger.info("select on dropdown");

		Thread.sleep(5000); // explWaitToClick(account.Operator());
		Search.withvalue().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()=' Closed Lost ']")));
		driver.findElement(By.xpath("//span[text()=' Closed Lost ']")).click();
		Search.withvalue().click();
		logger.info("select on dropdown");

		Thread.sleep(5000);
		Search.Save1().click();
		logger.info("Clicked on Save1 button");

		

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
		Search.UpdatedBy().click();
		logger.info("Clicked on UpdatedBy button");


		Thread.sleep(5000);
		Search.ForecastCat().click();
		logger.info("Clicked on ForecastCat button");
		

		Thread.sleep(5000);
		Search.SettingSave().click();
		logger.info("Clicked on SettingSave button");

		Thread.sleep(5000);
		Search.Xcross().click();
		logger.info("Clicked on Xcross button");
		
		
		
		
		
		
		
		
		
	}
	
	
}
