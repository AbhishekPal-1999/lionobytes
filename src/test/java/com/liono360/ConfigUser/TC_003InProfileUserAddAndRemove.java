package com.liono360.ConfigUser;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.ConfigUser;
import com.liono360.pageObject.LoginPage;

public class TC_003InProfileUserAddAndRemove extends Baseclass {

	@Test
	public void InProfileUserAddAndRemoveTest() throws InterruptedException{
		
		//redirectToCRM();
		
		ConfigUser user = new ConfigUser(driver);	
		
		TryClick(user.Clickconfig());
		logger.info("Clicked on Clickconfig button");	
		
		
		TryClick(user.User1());
		logger.info("Clicked on User1 button");
		
		
		TryClick(user.ClickProfile());
		logger.info("Clicked on ClickProfile button");
		
		
		
		TryClick(user.AdduserClick());
		logger.info("Clicked on AdduserClick button");
		
		
		TryClick(user.PlusClick());
		logger.info("Clicked on PlusClick button");
		
		Actions action = new Actions(driver);
		
		
		SelectDropdown(user.AddSUser(),2);
		logger.info("select on dropdown for Add User");
		
		
	
		
		
		
		TryClick(user.Save());
		logger.info("Click on Save");	
		
		
		TryClick(user.Close());
		logger.info("Clicked on Close button");
		
		
		TryClick(user.AdduserClick());
		logger.info("Clicked on AdduserClick button");
		
		
		
		TryClick(user.Duser());
		logger.info("Clicked on user button");
		
		
		
		SelectDropdown(user.ProfileSTransfer(),2);
		logger.info("select on dropdown for Transfer Profile");
		
		
		
		TryClick(user.TransferAndDelete());
		logger.info("Clicked on TransferAndDelete button");
		
		
		
		TryClick(user.Close());
		logger.info("Clicked on Close button");
		
		
		
		
		
	//	TryClick(user.Save());
	//	logger.info("Click on Save");	
		
		
		
		Thread.sleep(2000);
	 java.util.List<WebElement> elements = driver.findElements(By.xpath("(//td[contains(@class, 'p-col-2') and contains(@class, 'click-enable')])[1]"));
     
        int[] numbers = new int[elements.size()];
        for (int i = 0; i < elements.size(); i++) {
            numbers[i] = Integer.parseInt(elements.get(i).getText().trim());
        }

        int variation = 0;
        if (numbers.length >= 2) {
            variation = numbers[1] - numbers[0];
            System.out.println("Associated Users Not Add&Transfer Successfully " + variation);
        } else {
            System.out.println("Associated Users Add&Transfer Successfully");
        }
		
		
		
	}
	
}
