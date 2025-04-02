package com.liono360.FSMterritory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;
import com.liono360.pageObject.LoginPage;

public class TC_013CreateTerritoryForLeadWithManually extends Baseclass {
	
	
	List<String> list1=new ArrayList<String>();  
	@Test
	public void TC_013CreateTerritoryForLeadsWithManually() throws InterruptedException, IOException {
		
		// LOGIN TO CRM=======================================================

				driver.get(baseURL);
				logger.info("URL is opened");
				LoginPage lp = new LoginPage(driver);

				lp.setUserName(username);
				logger.info("Username added");
				lp.setPassword(password);
				logger.info("password added");
				lp.clickSubmit();
				logger.info("Clicked on submit button");

		// GO TO TERRITORY PAGE================================================

				FSMterritoryPage territory= new FSMterritoryPage(driver);
				territory.waitUntilPageLoad();
				territory.clickFSM().click();
				logger.info("Clicked FSM ");

				territory.selectTerritory().click();
				logger.info("Territory is selected");
				territory.waitUntilPageLoad();		

				territory.clickNewButton().click();
				logger.info("Clicked new button ");
				//Thread.sleep(2000);
				territory.waitUntilPageLoad();
				territory.clickToggleBtn().click();
				//Thread.sleep(1000);
				logger.info("clicked on toggle button to make active");
				
				territory.setTerritoryName().sendKeys("Territory_"+randomnumber());
				logger.info("territory Name added");
				//Thread.sleep(1000);
				
				String setTerritoryName=territory.setTerritoryName().getAttribute("value");
		    	territory.selectTerritoryContact().click();
				explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
				driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
				logger.info("Territory Contact is added");
				
				//Thread.sleep(3000);
				territory.selectOtherContacts().click();
				//Thread.sleep(4000);
				explWaitToClick(driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[1]//li//div)[2]")));
				driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
				driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[3]//li")).click();
				logger.info("Other Contact is added");
				//Thread.sleep(3000);
				territory.selectAssocitedModule().click();
				explWaitToClick(driver.findElement(By.xpath("//li[@aria-label=\"Lead\"]")));
				driver.findElement(By.xpath("//li[@aria-label=\"Lead\"]")).click();
				logger.info("Account is added");
				
				territory.waitUntilPageLoad();
				territory.selectTemplate().click();
				explWaitToClick(driver.findElement(By.xpath("//span[text()='Default Channel_template']")));
				driver.findElement(By.xpath("//span[text()='Default Channel_template']")).click();
				logger.info("Template is added");
				
				//Thread.sleep(2000);
				territory.selectCountry().click();
				//Thread.sleep(2000);
				explWaitToClick(driver.findElement(By.xpath("//li[@aria-label=\"India\"]")));
				driver.findElement(By.xpath("//li[@aria-label=\"India\"]")).click();
				
		        //Thread.sleep(2000);
				territory.ClickbtnMannualy().click();
				Thread.sleep(500);
				logger.info("clicked manually button");
				
				Thread.sleep(500);
				territory.clickPlusIcon().click();
				territory.waitUntilPageLoad();
				
				try {
					driver.findElement(By.xpath("(//tbody)[2]//tr[2]//td[2]")).click();
					//Thread.sleep(1000);
					list1.add(driver.findElement(By.xpath("(//tbody)[2]//tr[2]//td[2]")).getText());
					
					driver.findElement(By.xpath("(//tbody)[2]//tr[4]//td[2]")).click();
					//Thread.sleep(1000);
					list1.add(driver.findElement(By.xpath("(//tbody)[2]//tr[4]//td[2]")).getText());
					
					driver.findElement(By.xpath("(//tbody)[2]//tr[3]//td[2]")).click();
					//Thread.sleep(1000);
					list1.add(driver.findElement(By.xpath("(//tbody)[2]//tr[3]//td[2]")).getText());
					
					driver.findElement(By.xpath("(//tbody)[2]//tr[6]//td[2]")).click();
					//Thread.sleep(1000);
					list1.add(driver.findElement(By.xpath("(//tbody)[2]//tr[6]//td[2]")).getText());
					
					}
				catch(Exception e) {}
				
				
				logger.info("account are added");
				
				
				//Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[@label='Save'])[1]")).click();
				logger.info("rules added");
				//Thread.sleep(5000);
				territory.clickSaveTerritory().click();
				logger.info("territory added");
				
				territory.waitUntilPageLoad();
				
		// Assertion=======================================================================
				
				territory.setGlobalSearch().sendKeys(setTerritoryName);
				territory.waitUntilPageLoad();
				String territoryNameAfterCreate=territory.ListedTerritory().getText();
				System.out.println("provided Territory name to create: "+setTerritoryName);
				System.out.println("Listed Territory name after create: "+territoryNameAfterCreate);
				
				
				boolean assignValue=AssignUsers();
				
				if (setTerritoryName.equalsIgnoreCase(territoryNameAfterCreate)&& assignValue) {
					Assert.assertTrue(true);
					logger.info("Create territory test passed");
					} 
				
				else {
					Assert.assertTrue(false);
					captureScreen(driver, "addCase");
					logger.info("create territory test failed");
					}
			}
		   
			
			
			public boolean AssignUsers() throws InterruptedException {
				FSMterritoryPage territory= new FSMterritoryPage(driver);
				territory.ListedTerritory().click();
			
				logger.info("clicked listed territrory");
				territory.waitUntilPageLoad();
				
				territory.clickAssign().click();
				logger.info("clicked assign button");
				territory.waitUntilPageLoad();
				List<String> list2=new ArrayList<String>();  
				for(int i=1;i<=4;i++) {
					
				   String userName=driver.findElement(By.xpath("(//tbody)[2]//tr["+i+"]//td[2]")).getText();
				   list2.add(userName);
				 
				} 
				   Collections.sort(list1);
				   Collections.sort(list2);
				   System.out.println("added user name to create: "+list1);
				   System.out.println("listed user name after create: "+list2);
				   
				   if(list1.equals(list2)) {
					   return true;
				   }
				 return false;
			}

}
