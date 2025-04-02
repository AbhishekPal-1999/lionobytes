package com.liono360.accountsToTerritory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.AccountsToTerritory;
import com.liono360.pageObject.LoginPage;

public class TC_001CreateAccountsToTerritory extends Baseclass{
	
	@Test
	public void CreateAccountsToTerritoryTest () throws InterruptedException {
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
		
		Actions action = new Actions(driver);
		AccountsPage account = new AccountsPage(driver);
		
		AccountsToTerritory Territory =new AccountsToTerritory(driver);
		
		Thread.sleep(9000);
		//explWaitToClick(account.clickAccounts());
		account.clickAccounts().click();
		logger.info("Clicked on Account button");
		
		Thread.sleep(9000);
		//explWaitToClick(account.accountOwner());
		account.AccountoptionDrp().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Akash_Automation']")));
		driver.findElement(By.xpath("//span[text()='Akash_Automation']")).click();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(9000);
		//explWaitToClick(account.NewAbtn());
		account.NewButton().click();
		logger.info("Clicked on new button");
		
		
		explWaitToClick(account.Firstname());
		account.Firstname().sendKeys("FName" + randomnumber());
		logger.info("First Name Added");
		
		explWaitToClick(account.middlename());
		account.middlename().sendKeys("MName" + randomnumber());
		logger.info("Middle Name Added");
		
		explWaitToClick(account.LastName());
		account.LastName().sendKeys("LName" + randomnumber());
		logger.info("Last Name Added");
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.Email());
		account.Email().sendKeys("AccountCreate" + randomnumber() + "@lionobytes.com");
		logger.info("Sendkeys on email");
		
		//Thread.sleep(2000);
		explWaitToClick(account.Phone89());
		account.Phone89().sendKeys("8788526" + randomnumber());
		logger.info("Sendkeys on phone1");
		
		Thread.sleep(5000);
		//explWaitToClick(account.JobFun());
		account.JobFunoption().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Super Admin']")));
		driver.findElement(By.xpath("//span[text()='Super Admin']")).click();
		logger.info("select on dropdown");
		
		
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.AccountName());
		account.AccountName().sendKeys("SName" + randomnumber());
		logger.info("sendkeys on accountname");
		String AaName= account.AccountName().getAttribute("value");
		
		
		Thread.sleep(2000);
		//explWaitToClick(account.accountOwner());
		account.accountOwner().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Mark Zuckerberg']")));
		driver.findElement(By.xpath("//span[text()='Mark Zuckerberg']")).click();
		logger.info("select on dropdown");
		
		jsScroll(driver, account.accountOwner());
	
		
		explWaitToClick(account.accountNumber());
		account.accountNumber().sendKeys("87885" + randomnumber());
		logger.info("Sendkeys on accountNumber");
		
		
		jsScroll(driver, account.accountNumber());
		
		Thread.sleep(5000);
		//explWaitToClick(account.Timezones());
		account.Timezones().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='(GMT-09:00) Alaska']")));
		driver.findElement(By.xpath("//span[text()='(GMT-09:00) Alaska']")).click();
		logger.info("select on dropdown");
		
		Thread.sleep(5000);
		//explWaitToClick(account.Currency());
		account.Currency().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//li[@aria-label='Baht - THB']")));
		driver.findElement(By.xpath("//li[@aria-label='Baht - THB']")).click();
		logger.info("select on dropdown");
		
	
	
		
		Thread.sleep(2000);
		account.XR().sendKeys("tb");
		logger.info("sendkeys on is testomi");
		
		
	
		//..............account details.................//
		
		//Thread.sleep(2000);
		
		explWaitToClick(account.AccountDetails());
		account.AccountDetails().click();
		logger.info("sendkeys on account details");
		
		//Thread.sleep(2000);
		explWaitToClick(account.DoingBusiness());
		account.DoingBusiness().sendKeys("123"+ randomnumber() );
		logger.info("sendkeys on doing business");
			
		
		explWaitToClick(account.TaxId());
		account.TaxId().sendKeys(randomnumber());
		
		
		
		jsScroll(driver, account.TaxId());
		
		Thread.sleep(5000);
		//explWaitToClick(account.NumberOfEmp());
		account.NumberOfEmp().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='201-500']")));
		driver.findElement(By.xpath("//span[text()='201-500']")).click();
		logger.info("select on dropdown NumberOfEmp ");
		
		
		Thread.sleep(5000);
		//explWaitToClick(account.EstimatedAnnualRevenue());
		account.EstimateAnnualRevenue().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='$3M to $5M']")));
		driver.findElement(By.xpath("//span[text()='$3M to $5M']")).click();
		logger.info("select on dropdown EstimatedAnnualRevenue ");
		
		jsScroll(driver, account.EstimateAnnualRevenue());
		
		
		Thread.sleep(5000);
		//explWaitToClick(account.OwnershipType());
		account.OwnershipType().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Cooperative Societies']")));
		driver.findElement(By.xpath("//span[text()='Cooperative Societies']")).click();
		logger.info("select on dropdown OwnershipType ");
		
		Thread.sleep(5000);
		//explWaitToClick(account.BusinessClassification());
		account.BusinessClassification().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Ex-Customer']")));
		driver.findElement(By.xpath("//span[text()='Ex-Customer']")).click();
		logger.info("select on dropdown BusinessClassification");
		
		//Thread.sleep(2000);
		explWaitToClick(account.FoundedYear());
		account.FoundedYear().sendKeys("2024"+randomnumber());
		logger.info("sendkeys on founded years");
		
		
		Thread.sleep(5000);
		//explWaitToClick(account.IndustrysI());
		account.IndustrysI().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()=' Accounting']")));
		driver.findElement(By.xpath("//span[text()=' Accounting']")).click();
		logger.info("select on dropdown IndustrysI");
		
		jsScroll(driver, account.IndustrysI());
		
		
		explWaitToClick(account.SICCodes());
		account.SICCodes().sendKeys("123");
		logger.info("sendkeys on SICCodes");
		

		explWaitToClick(account.NAICScodes());
		account.NAICScodes().sendKeys("12345");
		logger.info("sendkeys on SICCodes");
		
		
		jsScroll(driver, account.NAICScodes());

		Thread.sleep(5000);
		// explWaitToClick(account.AccountSource());
		account.AccountSource().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Book']")));
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		logger.info("select on dropdown AccountSource");

		Thread.sleep(5000);
		// explWaitToClick(account.AccountRating());
		account.AccountRating().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='B++']")));
		driver.findElement(By.xpath("//span[text()='B++']")).click();
		logger.info("select on dropdown AccountRating");
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.AccountEmail());
		account.AccountEmail().sendKeys("Createaccount" + randomnumber() + "@lionobytes.com");
		logger.info("sendkeys on AccountEmailShubham");
		
		//Thread.sleep(2000);
		explWaitToClick(account.AccountPhone());
		account.AccountPhone().sendKeys("8788526"+randomnumber());
		logger.info("sendkeys on AccountPhone");
		
		//Thread.sleep(2000);
		explWaitToClick(account.Notess());
		account.Notess().sendKeys("Fill account details");
		logger.info("sendkeys on Notess");
		
		
	
		
		//...........Adress Details................//
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.AdressDetails());
		account.AdressDetails().click();
		logger.info("click on AdressDetails");
		
		//Thread.sleep(2000);
		explWaitToClick(account.AdressDetailsIcon());
		account.AdressDetailsIcon().click();
		logger.info("click on AdressDetails Icon");
		
		//Thread.sleep(2000);
		explWaitToClick(account.ShippingIiIcon());
		account.ShippingIiIcon().click();
		logger.info("click on ShippingIiIcon");
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.Slyders());
		account.Slyders().click();
		logger.info("click on ShippingIiIcon");
		
		
		
		Thread.sleep(5000);
		//explWaitToClick(account.AdressType1());
		account.AddressType().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Mailing']")));
		driver.findElement(By.xpath("//span[text()='Mailing']")).click();
		logger.info("select on accountType");
		
		Thread.sleep(5000);
		//explWaitToClick(account.AdressClass());
		account.AdressClass().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Residential']")));
		driver.findElement(By.xpath("//span[text()='Residential']")).click();
		logger.info("select on AdressClass");
		
		//Thread.sleep(2000);
		//explWaitToClick(account.StreetAdress1());
		Thread.sleep(2000);
		account.StreetAdress1().sendKeys("B-12, Block B, Industrial Area, Sector 62, Noida, Uttar Pradesh 201309");
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.StreetAdress2());
		account.StreetAdress2().sendKeys("Delhi");
		logger.info("sendkeys on StreetAdress2");
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.SaveAccountDetails());
		account.SaveAccountDetails().click();
		logger.info("click on SaveAccountDetails button");
		
		Thread.sleep(2000);
		//explWaitToClick(account.SaveAllDeatilsBtn());
		account.SaveAllDeatilsBtn().click();
		logger.info("click on SaveAllDeatilsBtn button");
		
		//...............Fsm................//
		
		Thread.sleep(10000);
		//explWaitToClick(account.ClickFsm());
		Territory.ClickFsm().click();
		logger.info("click on ClickFsm button");
		
		
		Thread.sleep(5000);
		//explWaitToClick(account.ClickTerritory());
		Territory.ClickTerritory().click();
		logger.info("click on ClickTerritory button");
		
		
		Thread.sleep(5000);
		//explWaitToClick(account.ClickIndaiaIcon());
		Territory.ClickIndaiaIcon().click();
		logger.info("click on ClickIndaiaIcon button");
		
		
		Thread.sleep(5000);
		//explWaitToClick(account.ClickIndaiaIcon());
		Territory.ClickAkBk().click();
		logger.info("click on ClickAkBk button");
		
		
		
		Thread.sleep(5000);
		//explWaitToClick(account.ClickIndaiaIcon());
		Territory.ClickAssign().click();
		logger.info("click on ClickAkBk button");
		
		
	}	
		
	
		
	}
	
	
	


