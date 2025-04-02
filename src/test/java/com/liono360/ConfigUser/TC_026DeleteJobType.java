package com.liono360.ConfigUser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_026DeleteJobType extends Baseclass {

	@Test
	public void DeleteJobTypeTest () throws InterruptedException {
		
		
		//redirectToCRM();
		
		Actions action = new Actions(driver);
		ConfigUser user = new ConfigUser(driver);
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.User2());
		logger.info("Clicked on User2 button");
			
		TryClick(user.Filedsc());
		logger.info("Clicked on Filedsc button");
		
		
		TryClick(user.Clickjobtype());
		logger.info("Click on Clickjobtype");
		
		
		
		TryClick(user.ClickAU());
		logger.info("Click on ClickAU");
		
		
		
		TryClick(user.Fadduser());
		logger.info("Click on Fadduser");
		
		TryClick(user.FSelectUser());
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("select on dropdown");
		
		TryClick(user.Save());
		logger.info("Click on Save");	
		
		TryClick(user.Close());
		logger.info("Click on Close");	
		
		
		
		
		
		
		
		Thread.sleep(5000);
		user.DeleteJtype().click();
		logger.info("Click on DeleteJtype");
		
		
		
		Thread.sleep(5000);
		user.Yesb().click();
		logger.info("Click on Yesb");
		
		
		Thread.sleep(5000);
		user.SelectJType().click();
		Thread.sleep(2000);
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Field study Frs']")));
		driver.findElement(By.xpath("//span[text()='Field study Frs']")).click();
		logger.info("select on dropdown");
		
		
		
		Thread.sleep(5000);
		user.TransferAndDelete().click();
		logger.info("click on TransferAndDelete");
		
		
		
	}
	
	
}
