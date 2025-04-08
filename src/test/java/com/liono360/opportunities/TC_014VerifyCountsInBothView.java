package com.liono360.opportunities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_014VerifyCountsInBothView extends Baseclass{

	
	@Test
	public void VerifyCountsInBothViewTest() throws InterruptedException, IOException {
		
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();
		
		OpportunitiesPage opp=new OpportunitiesPage(driver);
		opp.waitUntilPageLoad();
		opp.clickOpportunity().click();
		logger.info("Clicked on opportunities");
		opp.waitUntilPageLoad();
		
		
		List<Integer> list1=new ArrayList<Integer>(); 
		System.out.println("counts of opportunity of each stages in LIST VIEW: ");
		for(int i=2;i<=6;i++) {
		String countsOfListView =driver.findElement(By.xpath("(//span[@class='p-steps-number'])["+i+"]")).getText();
		int counts=Integer.parseInt(countsOfListView);  
		list1.add(counts);
		System.out.println(counts);
		}
		//Thread.sleep(2000);
		opp.clickCanabView().click();
		Thread.sleep(500);
		
		
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Kanban View']")));
		driver.findElement(By.xpath("//span[text()='Kanban View']")).click();
		logger.info("Canaban view selected");
		opp.waitUntilPageLoad();
		
		List<Integer> list2=new ArrayList<Integer>(); 
		System.out.println("counts of opportunity of each stages in KANBAN VIEW: ");

		for(int i=1;i<=5;i++) {
		String countsOfCanbanView =driver.findElement(By.xpath("(//div[@class='column-title'])["+i+"]")).getText();
		int counts=filterDigits(countsOfCanbanView);
		list2.add(counts);
		System.out.println(counts);
		}
	
//Assertion	
		if(list1.equals(list2)) {
			Assert.assertTrue(true);
			logger.info("VerifyCountsInBothViewTest is passed");
		} 
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "CountsInStagesTest");
			logger.info("VerifyCountsInBothViewTest is failed");
	
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
