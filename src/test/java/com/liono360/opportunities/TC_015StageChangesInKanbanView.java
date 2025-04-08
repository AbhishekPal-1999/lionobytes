package com.liono360.opportunities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_015StageChangesInKanbanView extends Baseclass{
	
	
	@Test
	public void StageChangesInKanbanView() throws InterruptedException {
		
// LOGIN TO CRM===============================================================================================
		
	    redirectToCRM();
	    
		OpportunitiesPage opp=new OpportunitiesPage(driver);
		opp.waitUntilPageLoad();
		opp.clickOpportunity().click();
		logger.info("Clicked on opportunities");
		opp.waitUntilPageLoad();
		
		opp.clickCanabView().click();
		Thread.sleep(500);
		
		explWaitToClick(driver.findElement(By.xpath("//span[text()='Kanban View']")));
		driver.findElement(By.xpath("//span[text()='Kanban View']")).click();
		logger.info("Canaban view selected");
		opp.waitUntilPageLoad();
		for(int i=1;i<6;i++) {
		//	WebElement SourceStage =	driver.findElement(By.xpath("((//div[@class='kanban-opportunity-tasks-container'])[2]//div)[5]"));
		WebElement SourceStage =driver.findElement(By.xpath("((//div[@class='kanban-opportunity-tasks-container'])["+i+"]//p)[1]"));
	    WebElement DestinationStage =	driver.findElement(By.xpath("((//div[@class='kanban-opportunity-tasks-container'])["+(i+1)+"]//p)[1]"))	;
	   // WebElement DestinationStage =	driver.findElement(By.xpath("((//div[@class='kanban-opportunity-tasks-container'])[3]//div)[6]"))	;
		Actions action = new Actions(driver);
		action.dragAndDrop(SourceStage, DestinationStage).build().perform();
		opp.waitUntilPageLoad();
		
		opp.setComment().sendKeys("abc");
		opp.waitUntilPageLoad();
		opp.clickSave().click();
		opp.waitUntilPageLoad();
		}
	}

}
