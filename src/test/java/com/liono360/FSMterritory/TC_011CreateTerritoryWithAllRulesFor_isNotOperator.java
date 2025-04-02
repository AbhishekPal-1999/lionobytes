package com.liono360.FSMterritory;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.FSMterritoryPage;

public class TC_011CreateTerritoryWithAllRulesFor_isNotOperator extends Baseclass{

	@Test
	public void TC_011CreateTerritoryWithAllRulesFor_IsNotOperator() throws IOException, InterruptedException {
		
	     redirectToCRM();
			
			FSMterritoryPage territory= new FSMterritoryPage(driver);
			territory.clickFSM().click();
			logger.info("Clicked FSM ");
			Thread.sleep(2000);
			territory.selectTerritory().click();
			logger.info("Territory is selected");
			Thread.sleep(20000);
			
	List<String> list1=new ArrayList<String>(); 
	List<String> list2=new ArrayList<String>();
	for(int i=1;i<=2;i++) {
			territory.clickNewButton().click();
			logger.info("Clicked new button ");
			Thread.sleep(2000);
			
			territory.clickToggleBtn().click();
			Thread.sleep(1000);
			logger.info("toggle button enabled");
			
			territory.setTerritoryName().sendKeys("territory"+randomnumber());
			logger.info("territory Name added");
			Thread.sleep(1000);
			
			String setTerritoryName=territory.setTerritoryName().getAttribute("value");
			
			list1.add(setTerritoryName);
			
			territory.selectTerritoryContact().click();
			explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")));
			driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
			logger.info("Territory Contact is added");
			
			Thread.sleep(3000);
			territory.selectAssocitedModule().click();
			explWaitToClick(driver.findElement(By.xpath("//li[@aria-label=\"Account\"]")));
			driver.findElement(By.xpath("//li[@aria-label=\"Account\"]")).click();
			logger.info("Account is added");
			
			Thread.sleep(7000);
			territory.selectTemplate().click();
			explWaitToClick(driver.findElement(By.xpath("//span[text()='Default Channel_template']")));
			driver.findElement(By.xpath("//span[text()='Default Channel_template']")).click();
			logger.info("Template is added");
			
			Thread.sleep(8000);
			territory.selectCountry().click();
			Thread.sleep(2000);
			explWaitToClick(driver.findElement(By.xpath("//li[@aria-label='USA']")));
			driver.findElement(By.xpath("//li[@aria-label='USA']")).click();
			logger.info("Country is added");
			
			Thread.sleep(2000);
			territory.clickPlusIcon().click();
			Thread.sleep(2000);
			territory.clickPlusIcon2().click();
			Thread.sleep(2000);
			String Type=null;
			try {
			territory.selectMiddleInitial().click();

	        Type=driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem["+i+"]//li")).getText();
			explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem["+i+"]//li")));
			driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem["+i+"]//li")).click();
			logger.info(Type+": is selected");
			Thread.sleep(1000);
			
			territory.ChooseOperator().click();
			explWaitToClick(driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")));
			driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
			logger.info("operator is selected");
			Thread.sleep(1000);
			
			if(i==9) {driver.findElement(By.xpath("(//input[@type=\"text\"])[14]")).sendKeys("277124");}
			territory.selectChooseValue().click();
			Thread.sleep(2000);
			explWaitToClick(driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[1]//li//div)[2]")));
			driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[1]//li//div)[2]")).click();
			
			driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[3]//li//div)[2]")).click();
			driver.findElement(By.xpath("(//ul[@role='listbox']//p-multiselectitem[4]//li//div)[2]")).click();
			
			
			
			logger.info("value is added");
			
			Thread.sleep(5000);
			territory.setNotes().sendKeys(" this is comment "+randomnumber()+" for "+Type);
			logger.info("Notes added successfully for "+Type);

	        Thread.sleep(2000);	
	       // territory.ChooseOperator().click();
	        driver.findElement(By.xpath("//p-dropdown//span[text()='Is not']")).click();
	        driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();

	        }
	       catch(Exception e) {
				
			}
			territory.clickSaveRule().click();
			logger.info("rules added-------------->"+Type);
			Thread.sleep(5000);
			territory.clickSaveTerritory().click();
			logger.info("territory added");
			Thread.sleep(17000);
			if(i==5||i==8) {
				Thread.sleep(60000);}
			
	      }
			Thread.sleep(25000);
	// Assertion
			territory.clickUSA().click();
			Thread.sleep(15000);
			
			for(int i=1;i<=2;i++) {
			String territoryNameAfterCreate=driver.findElement(By.xpath("(//tr)["+(3+i)+"]//td[1]//span")).getText();
			list2.add(territoryNameAfterCreate);
			}
			
			Collections.sort(list1);
			Collections.sort(list2);
			
			System.out.println("provided Territory name to create: "+list1);
			System.out.println("Listed Territory name after create: "+list2);
			if (list1.equals(list2)) {
				Assert.assertTrue(true);
				logger.info("Create territory test passed");
				} 
			
			else {
				Assert.assertTrue(false);
				captureScreen(driver, "addCase");
				logger.info("create territory test failed");
				}
		
		}
}
