package com.liono360.FSMroutes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMroutesPage;
import com.liono360.pageObject.LoginPage;
import com.liono360.utility.ExcelDataProvider;

public class TC_001CreateRouteWithAllFieldForLead extends Baseclass{

	@Test
	public void TC_001CreateRoutesWithAllFields() throws InterruptedException, IOException {
		
//LOGIN TO CRM=====================================================================================
		
		
			//	redirectToCRM();
				
				
//GO TO ROUTE MODULE=====================================================
		
	 	   FSMroutesPage routes=new FSMroutesPage(driver);
		   ExcelDataProvider exceldata=new ExcelDataProvider();
		TryClick(routes.clickFSM());
		logger.info("Clicked FSM ");
		//Thread.sleep(1000);
		waitUntilPageLoad();
		TryClick(routes.selectRoutes());
		logger.info("Routes is selected");
		routes.waitUntilPageLoad();
		
		TryClick(routes.clickAddRoutes());
		logger.info("Clicked on add routes button");
		routes.waitUntilPageLoad();
		
		routes.setRouteName().sendKeys("MyRoute"+randomnumber());
		logger.info("route name added");
		//Thread.sleep(3000);
		
		String RouteNameBeforeCreate= routes.setRouteName().getAttribute("value");

		
		TryClick(routes.selectParentTerritoryName());
		//Thread.sleep(3000);
		
		TryClick(routes.selectParentTerritoryNameHirerachy());
		Thread.sleep(500);
		TryClick(driver.findElement(By.xpath("(//div[@class='p-treenode-content p-treenode-selectable'])[3]")));
		//Thread.sleep(1000);
		logger.info("territory name added");
//		explWaitToClick(driver.findElement(By.xpath("//ul[@role=\"listbox\"]//p-dropdownitem[3]//li")));
//		driver.findElement(By.xpath("//ul[@role=\"listbox\"]//p-dropdownitem[3]//li")).click();
	
		
		
		TryClick(routes.selectRepName());
		
		
		TryClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
		logger.info("rep name added");
		

		routes.setLocation().sendKeys(exceldata.StreetAddress());
		Thread.sleep(4000);
		routes.setLocation().sendKeys(Keys.ARROW_DOWN);
		routes.setLocation().sendKeys(Keys.ENTER);
		logger.info("start loaction added");
		
		routes.setEndLoaction().sendKeys(exceldata.StreetAddress());
		Thread.sleep(3000);
		routes.setEndLoaction().sendKeys(Keys.ARROW_DOWN);
		routes.setEndLoaction().sendKeys(Keys.ENTER);
		routes.setEndLoaction().click();
		logger.info("end location added");
		
		//Thread.sleep(4000);
		routes.PlusIcon().click();
		logger.info("clicked plus button");
		routes.waitUntilPageLoad();
		
		
		try {
		driver.findElement(By.xpath("//p-table[@selectionmode=\"multiple\"]//tbody//tr[1]//td[1]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//p-table[@selectionmode=\"multiple\"]//tbody//tr[2]//td[1]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//p-table[@selectionmode=\"multiple\"]//tbody//tr[3]//td[1]")).click();
		//Thread.sleep(1000);
			}
			catch(Exception e) {
			  
			}
		
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		//Thread.sleep(4000);
		TryClick(routes.clickSave());;
		logger.info("clicked save button");
		
		routes.waitUntilPageLoad();
		
		//routes.searchRoutes().sendKeys(RouteNameBeforeCreate);
		routes.waitUntilPageLoad();
		Thread.sleep(2000);
 // assertion
		String RouteNameAfterCreate = routes.AddedRoutes().getText();
		System.out.println("Route name to create: "+RouteNameBeforeCreate);
		System.out.println("Route name after create: "+RouteNameAfterCreate);

		if (RouteNameBeforeCreate.equals(RouteNameAfterCreate)) {
			Assert.assertTrue(true);
			logger.info("Add routes test passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "add routes");
			logger.info("Add routes test failed");
			}
	
		
	}
}
