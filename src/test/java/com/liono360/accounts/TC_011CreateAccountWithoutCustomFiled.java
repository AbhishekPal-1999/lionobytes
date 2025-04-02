package com.liono360.accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.AccountsPage;
import com.liono360.pageObject.LoginPage;

public class TC_011CreateAccountWithoutCustomFiled extends Baseclass {
	
	@Test
	public void CreateAccountWithoutCustomFiledTest () throws InterruptedException {
		
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
		
		AccountsPage account = new AccountsPage(driver);
		Actions action = new Actions(driver);
		
//.........Create Account Without Custom Filed with contact details.........
		
		
		explWaitToClick(account.clickAccounts());
		account.clickAccounts().click();
		logger.info("Clicked on clickAccounts button");
		
		
		//explWaitToClick(account.DropdownSelectAccount());
		Thread.sleep(2000);
		account.DropdownSelectAccount().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Akash_Automation']")));
		driver.findElement(By.xpath("//span[text()='Akash_Automation']")).click();
		logger.info("select on DropdownSelectAccount");
		
		
		Thread.sleep(10000);
		//explWaitToClick(account.NewAbtn());
		account.NewButton().click();
		logger.info("Clicked on new button");
		
		explWaitToClick(account.Title1());
		account.Title1().click();
		logger.info("Clicked on title button");
		
		explWaitToClick(account.Selectopt());
		account.Selectopt().click();
		logger.info("Clicked on title option button");
		
		
		explWaitToClick(account.Selectopt());
		account.Firstname().sendKeys("FName" + randomnumber());
		logger.info("First Name Added");
		
		
		explWaitToClick(account.middlename());
		account.middlename().sendKeys("MName" + randomnumber());
		logger.info("Middle Name Added");
		
		explWaitToClick(account.LastName());
		account.LastName().sendKeys("LName" + randomnumber());
		logger.info("Last Name Added");
		
		explWaitToClick(account.Email());
		account.Email().sendKeys("AccountCreate" + randomnumber() + "@lionobytes.com");
		logger.info("Sendkeys on email");
		
		//Thread.sleep(2000);
		explWaitToClick(account.WorkPhone());
		account.WorkPhone().sendKeys("8788526" + randomnumber());
		logger.info("Sendkeys on phone1");
		
	
		Thread.sleep(10000);
		//explWaitToClick(account.JobFun());
		account.JobFunoption().click();
		logger.info("click on dropdown ");
		
		Thread.sleep(2000);
		//explWaitToClick(account.JobFunoption());
		account.JobFunoption().click();
		logger.info("click on dropdown option btn");
		
		
	// //.........Create Account Without Custom Filed with Account INformation.........//	
		
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.AccountName());
		account.AccountName().sendKeys("SName" + randomnumber());
		logger.info("sendkeys on accountname");
		String AaName= account.AccountName().getAttribute("value");
		
		
		Thread.sleep(2000);
		//explWaitToClick(account.accountOwner());
		account.accountOwner().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='TEST ROLE ']")));
		driver.findElement(By.xpath("//span[text()='TEST ROLE ']")).click();
		logger.info("select on dropdown");
		
		explWaitToClick(account.accountType());
		account.accountType().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Grocery store']")));
		driver.findElement(By.xpath("//span[text()='Grocery store']")).click();
		logger.info("select on dropdown");
		
		//Thread.sleep(2000);
		explWaitToClick(account.Timezones());
		account.Timezones().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='(UTC-09:00) Alaska']")));
		driver.findElement(By.xpath("//span[text()='(UTC-09:00) Alaska']")).click();
		logger.info("select on dropdown");
		
		//Thread.sleep(2000);
		explWaitToClick(account.Currency());
		account.Currency().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Bangladeshi Taka - BDT']")));
		driver.findElement(By.xpath("//span[text()='Bangladeshi Taka - BDT']")).click();
		logger.info("select on dropdown");
		
		
		
		 //.........Create Account Without Custom Filed with Account Details.........//
		
		explWaitToClick(account.AccountDetails());
		account.AccountDetails().click();
		logger.info("sendkeys on account details");
		
		//Thread.sleep(2000);
		explWaitToClick(account.DoingBusiness());
		account.DoingBusiness().sendKeys("123"+ randomnumber() );
		logger.info("sendkeys on doing business");
			
		
		explWaitToClick(account.TaxId());
		account.TaxId().sendKeys(randomnumber());
		logger.info("sendkeys on TaxId");
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.NumberOfEmp());
		account.NumberOfEmp().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='26 to 500']")));
		driver.findElement(By.xpath("//span[text()='26 to 500']")).click();
		logger.info("select on dropdown NumberOfEmp ");
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.EstimateAnnualRevenue());
		account.EstimateAnnualRevenue().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='$10M to more']")));
		driver.findElement(By.xpath("//span[text()='$10M to more']")).click();
		logger.info("select on dropdown EstimatedAnnualRevenue ");
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.OwnershipType());
		account.OwnershipType().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Limited liability Company']")));
		driver.findElement(By.xpath("//span[text()='Limited liability Company']")).click();
		logger.info("select on dropdown OwnershipType ");
		
		//Thread.sleep(2000);
		explWaitToClick(account.BusinessClassification());
		account.BusinessClassification().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Ex-Customer']")));
		driver.findElement(By.xpath("//span[text()='Ex-Customer']")).click();
		logger.info("select on dropdown BusinessClassification");
		
		//Thread.sleep(2000);
		explWaitToClick(account.FoundedYear());
		account.FoundedYear().sendKeys("2024"+randomnumber());
		logger.info("sendkeys on founded years");
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.IndustrysI());
		account.IndustrysI().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("(//span[text()='Publishing & Stationary'])[1]")));
		driver.findElement(By.xpath("(//span[text()='Publishing & Stationary'])[1]")).click();
		logger.info("select on dropdown IndustrysI");
		
		//Thread.sleep(2000);
		explWaitToClick(account.AccountEmail());
		account.AccountEmail().sendKeys("Createaccount" + randomnumber() + "@lionobytes.com");
		logger.info("sendkeys on AccountEmailShubham");
		
		//Thread.sleep(2000);
		explWaitToClick(account.AccountPhone());
		account.AccountPhone().sendKeys("8788526"+randomnumber());
		logger.info("sendkeys on AccountPhone");
		
		
		explWaitToClick(account.SICCodes());
		account.SICCodes().sendKeys("87"+randomnumber());
		logger.info("sendkeys on SICCodes");
		
		explWaitToClick(account.NAICScodes());
		account.NAICScodes().sendKeys("89"+randomnumber());
		logger.info("sendkeys on NAICScodes");
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.Notess());
		account.Notess().sendKeys("Fill account details");
		logger.info("sendkeys on Notess");
		
		
		// //.........Create Account Without Custom Filed with Address details.........//	
		
	
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
		
		
		explWaitToClick(account.AddressType());
		account.AddressType().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Official address']")));
		driver.findElement(By.xpath("//span[text()='Official address']")).click();
		logger.info("select on accountType");
		
		//Thread.sleep(2000);
		explWaitToClick(account.AdressClass());
		account.AdressClass().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Residential']")));
		driver.findElement(By.xpath("//span[text()='Residential']")).click();
		logger.info("select on AdressClass");
		
		explWaitToClick(account.StreetAdress1());
		account.StreetAdress1().sendKeys("10808 Culver Boulevard Park West");
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		
		//Thread.sleep(2000);
		explWaitToClick(account.StreetAdress2());
		account.StreetAdress2().sendKeys("Delhi");
		logger.info("sendkeys on StreetAdress2");
		
		
		explWaitToClick(account.SaveAccountDetails());
		account.SaveAccountDetails().click();
		logger.info("click on SaveAccountDetails button");
		
		Thread.sleep(2000);
		//explWaitToClick(account.SaveAllDeatilsBtn());
		account.SaveAllDeatilsBtn().click();
		logger.info("click on SaveAllDeatilsBtn button");
		
		
		
	}	

}
