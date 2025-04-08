package com.liono360.opportunities;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.OpportunitiesPage;

public class TC_003EditOpportunity extends Baseclass{
	
	@Test
	public void EditOpportunityTest() throws InterruptedException, IOException {

// LOGIN TO CRM===============================================================================================
		
	    //redirectToCRM();
	    
		OpportunitiesPage opp=new OpportunitiesPage(driver);
		 Actions action = new Actions(driver);

	
		TryClick(opp.clickOpportunity());
		logger.info("Clicked on opportunities");
		
	
		Thread.sleep(2000);
		mouseActionRightClick(driver, opp.AddedOpportunity());
		logger.info("rigt clicked on added opportunity");
		
		
		
		
		TryClick(opp.clickEdit());
		logger.info("Edit button clicked");
		
	
		opp.waitUntilPageLoad();
		Thread.sleep(2000);
		opp.setOpportunityName().clear();
		explWaitToClick(opp.setOpportunityName());
		opp.setOpportunityName().sendKeys("Opportunity" + randomnumber());
		logger.info("opportunity name added");
		

		String OpportunityNameBeforeEdit= opp.setOpportunityName().getAttribute("value");
		Thread.sleep(2000);
		opp.setAccountname().clear();
		opp.setAccountname().sendKeys("b");
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		logger.info("Account Name Added");
		opp.waitUntilPageLoad();
		
		
		
		SelectDropdown(opp.selectOwner(),3);
		logger.info("Owner is selected");
		

		opp.ContactNames().clear();
		explWaitToClick(opp.ContactNames());
		opp.ContactNames().sendKeys("Karter"+randomnumber());
		logger.info("Contact Name Added");
		
		
		opp.setContactEmail().clear();
		explWaitToClick(opp.setContactEmail());
		Thread.sleep(2000);
		opp.setContactEmail().sendKeys("opportunities" + randomnumber() + "@lionobytes.com");
		logger.info("ContactEmail is selected");
		
		
		opp.setcontactPhone().clear();
		explWaitToClick(opp.setcontactPhone());
		Thread.sleep(2000);
		opp.setcontactPhone().sendKeys("63653404" + randomnumber());
		logger.info("Contact Phone is selected");
		

	

		
		SelectDropdown(opp.selectQuality(),1);
		logger.info("Quality is added");

		
		SelectDropdown(opp.selectSource(),2);
		logger.info("source is added");
		
		

		//opp.selectClosedate().click();
		//Thread.sleep(2000);
		//explWaitToClick(driver.findElement(By.xpath("//span[text()='28']")));
		//driver.findElement(By.xpath("//span[text()='28']")).click();
		
	

		
	//	SelectDropdown(opp.selectStage(),2);
	//	logger.info("stage is added");
		
		
		
		opp.setRepConfidence().clear();
		explWaitToClick(opp.setRepConfidence());
		opp.setRepConfidence().sendKeys(randomnumber());
		logger.info("rep confidence is added");

		opp.setTotalAmount().clear();
		explWaitToClick(opp.setTotalAmount());
		opp.setTotalAmount().sendKeys(randomnumber());
		logger.info("total amount is added");
		
		//TryClick(opp.clickPlusIcon());
		//logger.info("plus clicked");
	
		
		
      //  opp.waitUntilPageLoad();
       // TryClick(opp.selectProductList());
	

		
		
      //  SelectDropdown(opp.InventoryItem(),1);
        //logger.info("product type added");
		
	
		
       // SelectDropdown(opp.selectLocation(),4);
       // logger.info("location type added");
		
	
		
		
		
    //    explWaitToClick(opp.GloabalSearch());
     //   Thread.sleep(2000);
	//	opp.GloabalSearch().sendKeys("a");
		//logger.info("sendkeys on Global Search");
		
	//	 opp.waitUntilPageLoad();
	//	 TryClick(opp.selectItem1());
	//	 TryClick(opp.selectItem2());
		 //TryClick(opp.selectItem3());
			
		 
		 
		//driver.findElement(By.xpath("(//tbody//tr[1])[2]")).click();
		//driver.findElement(By.xpath("(//tbody//tr[3])[2]")).click();
		//driver.findElement(By.xpath("(//tbody//tr[5])[2]")).click();
		 
		 
		
		
		//TryClick(opp.clickAdd());
		//logger.info("add button clicked");
		
		
		opp.SetopportunityDetails().clear();
		explWaitToClick(opp.SetopportunityDetails());
		opp.SetopportunityDetails().sendKeys("this is notes about opporunites"+ randomnumber());
		logger.info("notes is added");
		

		
		
		TryClick(opp.clickSave());
		logger.info("save button clicked");
		
		
		//String OpportunityNameAfterCreate=opp.AddedOpportunity().getText();
		/*
		 * String OpportunityNameAfterEdit = opp.ListedOpportunity().getText();
		 * System.out.println("Opportunity name to edit: "+OpportunityNameBeforeEdit);
		 * System.out.println("Opportunity name after edit: "+OpportunityNameAfterEdit);
		 * 
		 * if (OpportunityNameBeforeEdit.equals(OpportunityNameAfterEdit)) {
		 * System.out.println("Opportunity name remains unchanged."); } else {
		 * System.out.println("Opportunity name has changed."); }
		 */
		
		}
		
	}


