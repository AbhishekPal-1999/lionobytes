package com.liono360.cases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.CasesPage;

public class TC_010CountsInStages extends Baseclass{
	@Test
	public void TC_010CountsInStagesOfListAndCanbanView() throws InterruptedException, IOException {
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();

		CasesPage cases= new CasesPage(driver);
		cases.clickCases().click();
		logger.info("Clicked on Cases ");
		cases.waitUntilPageLoad();
		
		List<Integer> list1=new ArrayList<Integer>(); 
		for(int i=2;i<6;i++) {
		String countsOfListView =driver.findElement(By.xpath("(//span[@class='p-steps-number'])["+i+"]")).getText();
		int counts=Integer.parseInt(countsOfListView);  
		list1.add(counts);
		System.out.println(counts);
		}
		Thread.sleep(2000);
		cases.clickCanabView().click();
		Thread.sleep(2000);
		
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Kanban View']")));
		driver.findElement(By.xpath("//span[text()='Kanban View']")).click();
		logger.info("Canaban view selected");
		cases.waitUntilPageLoad();
		
		List<Integer> list2=new ArrayList<Integer>(); 
		for(int i=1;i<5;i++) {
		String countsOfCanbanView =driver.findElement(By.xpath("(//div[@class='column-title'])["+i+"]")).getText();
		int counts=filterDigits(countsOfCanbanView);
		list2.add(counts);
		System.out.println(counts);
		}
	
//Assertion	
		if(list1.equals(list2)) {
			Assert.assertTrue(true);
			logger.info("CountsInStagesTest is passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "CountsInStagesTest");
			logger.info("CountsInStagesTest is failed");
	
			}
		
	}
	
	public static int filterDigits(String input){
		 
		String output = input.replaceAll("[a-zA-Z]", "");
		String brackets=output.replaceAll("[()]", "");
		String space=brackets.replaceAll("\\s", "");
		String FinalNumber=space.replaceAll("-", "");
		 int digits= Integer.parseInt(FinalNumber);  
		 
		return digits;
	}

}
