package com.liono360.FSMroutes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMroutesPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_003EditMandatoryOnly extends Baseclass {
	
	@Test
	public void TC_003EditMandatoryOnlyTest() throws InterruptedException, IOException {
		
//LOGIN TO CRM==========================================================	
		
			//	redirectToCRM();	
				
//GO TO ROUTE MODULE=====================================================
				
	    FSMroutesPage routes=new FSMroutesPage(driver);
		ExcelDataProvider exceldata=new ExcelDataProvider();

		routes.clickFSM().click();
		logger.info("Clicked FSM ");
		  //Thread.sleep(1000);
		waitUntilPageLoad();
		TryClick(routes.selectRoutes());
		logger.info("Routes is selected");
		routes.waitUntilPageLoad();

		mouseActionRightClick(driver, routes.AddedRoutes());
		logger.info("rigt clicked on added routes");
		

		TryClick(routes.clickEditRoutes());
		logger.info("clicked edit button");
		routes.waitUntilPageLoad();
		routes.setRouteName().clear();
		routes.setRouteName().sendKeys("EditedRoute"+randomnumber());
		logger.info("route name added");
		//Thread.sleep(3000);

		String RouteNameBeforeEdit= routes.setRouteName().getAttribute("value");


		
	
		
		routes.selectRepName().click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
		logger.info("rep name added");
		TryClick(routes.setLocation());
		routes.setLocation().clear();
		routes.setLocation().sendKeys(exceldata.StreetAddress());
		Thread.sleep(3000);
		routes.setLocation().sendKeys(Keys.ARROW_DOWN);
		routes.setLocation().sendKeys(Keys.ENTER);
		logger.info("start loaction added");
		
		
		//Thread.sleep(4000);
		routes.PlusIcon().click();
		logger.info("clicked plus button");
		Thread.sleep(1000);
		
		
		try {
			driver.findElement(By.xpath("//p-table[@selectionmode=\"multiple\"]//tbody//tr[4]//td[1]")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//p-table[@selectionmode=\"multiple\"]//tbody//tr[5]//td[1]")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//p-table[@selectionmode=\"multiple\"]//tbody//tr[6]//td[1]")).click();
			//Thread.sleep(1000);
			}
			catch(Exception e) {
			  
			}
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		//Thread.sleep(4000);
		routes.clickSave().click();
		logger.info("clicked saved button");
		
		
		routes.waitUntilPageLoad();
		
		routes.searchRoutes().sendKeys(RouteNameBeforeEdit);
		routes.waitUntilPageLoad();
		Thread.sleep(3000);
 // assertion
		
		String RouteNameAfterEdit = routes.AddedRoutes().getText();
		System.out.println("Route name to edit: "+RouteNameBeforeEdit);
		System.out.println("Route name after edit: "+RouteNameAfterEdit);

		if (RouteNameBeforeEdit.equals(RouteNameAfterEdit)) {
			Assert.assertTrue(true);
			logger.info("Edit routes test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "edit routes");
			logger.info("Edit routes test failed");
			}
	}

}
