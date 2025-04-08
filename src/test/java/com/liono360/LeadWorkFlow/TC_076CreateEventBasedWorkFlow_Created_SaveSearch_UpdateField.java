package com.liono360.LeadWorkFlow;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;
import com.liono360.pageObject.LoginPage;

public class TC_076CreateEventBasedWorkFlow_Created_SaveSearch_UpdateField extends Baseclass{

	@Test
	public void TC072_CreateEventBasedWorkFlow_Created_UpdateField() throws InterruptedException, IOException {

// LOGIN TO CRM----------------------------------------------------------------------------------------
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Username added");
		lp.setPassword(password);
		logger.info("password added");
	   
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		CommonMethods commonMethods= new CommonMethods();
		
		LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
		workflow.waitUntilPageLoad();
		
		workflow.clickMisc().click();
		logger.info("Clicked Misc.");

		workflow.clickWorkFlow().click();
		logger.info("Clicked workflow");
		workflow.waitUntilPageLoad();

		workflow.clickNew().click();
		logger.info("Clicked new buuton");
		workflow.waitUntilPageLoad();
		
//CREATE WORK FLOW ----------------------------------------------------------------------------------------------	    
	    
	    workflow.setName().sendKeys("WorkFlow"+randomnumber()+"ToUpdateField");
	    logger.info("workflow name added");
	    
	    String WorkflowNameToCreate= workflow.setName().getAttribute("value");
	    
	    workflow.selectUsers().click();
	    //driver.findElement(By.xpath("//span[text()='Satyendra Bhardwaj']")).click();
	    logger.info("user selected");
	    
	    workflow.SelectModule().click();
	    driver.findElement(By.xpath("//span[text()='Lead']")).click();
	    logger.info("module selected");
	    workflow.waitUntilPageLoad();
	    
	    workflow.SelectChannel().click();
	    driver.findElement(By.xpath("//span[text()='Default Channel']")).click();
	    logger.info("user selected");
	   
	    String startdate=commonMethods.StartDate();
		String enddate=commonMethods.EndDate();
	    workflow.selectStartDate().click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	    try {
	    	driver.findElement(By.xpath("(//span[text()='"+startdate+"'])[1]")).click();
	    	
	    }catch(Exception e) {}
	    try {
	    	driver.findElement(By.xpath("(//span[text()='"+startdate+"'])[2]")).click();}
	    catch(Exception e) {}
	    logger.info("start date added");
	    
	    
	    workflow.selectEndDate().click();
	    try {
	    	driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[1]")).click();
	    }
	    catch(Exception e) {}
	    try {
	    	driver.findElement(By.xpath("(//span[text()='"+enddate+"'])[2]")).click();	    }
	    catch(Exception e) {}
	    logger.info("end date added");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    workflow.clickNext().click();
	    logger.info("next button clicked");
	    workflow.waitUntilPageLoad();

// ADD SAVE SEARCH CONDITOON HERE------------------------------------------------------------------------------------
	    
	    workflow.clickSaveSearch().click();
	    logger.info(" save search clicked");
	   
	    
	    workflow.clickPlus().click();
	    logger.info("plus button clicked");
	    
	    workflow.selectSaveSearch().click();
	    workflow.waitUntilPageLoad();
	    driver.findElement(By.xpath("//div[text()=' TestingUpdateField ']")).click();
	    logger.info("save search added");
	    
	    Thread.sleep(5000);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    workflow.waitUntilPageLoad();
	 
// ADD TRIGER TIME --------------------------------------------------------------------------------
	    
	    workflow.waitUntilPageLoad();
	    workflow.clickTrigger().click();
	    logger.info("trigger button clicked");
	   
	   
	    workflow.setValue().sendKeys("20");
	    logger.info("trigger value adeded ");
	   
	    
	    workflow.selectDays().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[6]//li")).click();
	    logger.info("trigger unit adeded ");
	  
	    
	    workflow.selectAfter().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("trigger status adeded ");
	    Thread.sleep(500);
	    
	    workflow.selectExecutaionDate().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("trigger execution date adeded ");
	   
	    Thread.sleep(500);
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	   
	    
// ADD INSTANT ACTION HERE(Update Field)----------------------------------------------------------------
	    workflow.waitUntilPageLoad();
	    Actions act = new Actions(driver);
	   List<String> list1=new ArrayList<String>();
	   
	//1.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	   // Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Lead Type(s)']")).click();
	    logger.info("Lead Type(s) field added");
	   
	    workflow.selectMultipleField().click();
	    String LeadType= driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).getText();
	    list1.add(LeadType);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	   
	    
	    act.doubleClick(workflow.UpdateHeader()).perform();
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
   //2.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	   // Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Lead Number']")).click();
	    logger.info("lead number field added");
	   
	    workflow.SetFieldValue().sendKeys(randomnumber());
	    String LeadNumber= workflow.SetFieldValue().getAttribute("value");
	    list1.add(LeadNumber);
	    
	    act.doubleClick(workflow.UpdateHeader()).perform();
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
	//3.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Time  zone']")).click();
	    logger.info("Time  zone field added");
	   
	    workflow.selectSingleField().click();
	    Thread.sleep(500);
	    String Timezone=  driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[4]//li")).getText();
	    list1.add(Timezone);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[4]//li")).click();
	   
	    
	    act.doubleClick(workflow.UpdateHeader()).perform();
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
	    
	 //4.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	   //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Currency']")).click();
	    logger.info("Currency field added");
	   
	    workflow.selectSingleField().click();
	    Thread.sleep(500);
	    String Currency=  driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).getText();
	    list1.add(Currency);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	   
	    act.doubleClick(workflow.UpdateHeader()).perform();
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
   //5.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	   // Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Activation Number']")).click();
	    logger.info("Activation Number field added");
	   
	    workflow.SetFieldValue().sendKeys("AMNXTV"+randomnumber());
	    String ActivationNumber= workflow.SetFieldValue().getAttribute("value");
	    list1.add(ActivationNumber);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
  //6.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	  //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Sim Sale']")).click();
	    logger.info(" SimSale field added");
	   
	    workflow.SetFieldValue().sendKeys("8004"+randomnumber());
	    String SimSale= workflow.SetFieldValue().getAttribute("value");
	    list1.add(SimSale);
	   
	    act.doubleClick(workflow.UpdateHeader()).perform();
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
 
  //7.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Doing Business as (DBA)']")).click();
	    logger.info(" Doing Business as (DBA) field added");
	   
	    workflow.SetFieldValue().sendKeys("DBA"+randomnumber());
	    String DBA= workflow.SetFieldValue().getAttribute("value");
	    list1.add(DBA);
	   
	    act.doubleClick(workflow.UpdateHeader()).perform();
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
  //8.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Tax ID (EIN)']")).click();
	    logger.info(" Tax ID (EIN) field added");
	   
	    workflow.SetFieldValue().sendKeys("EIN"+randomnumber());
	    String TaxId= workflow.SetFieldValue().getAttribute("value");
	    list1.add(TaxId);
	   
	    act.doubleClick(workflow.UpdateHeader()).perform();
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");

   //9.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	   //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Number of Employees']")).click();
	    logger.info("Number of Employees field added");
	   
	    workflow.selectSingleField().click();
	    Thread.sleep(500);
	    String NumberofEmployees=  driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).getText();
	    list1.add(NumberofEmployees);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");   


  //10.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);

	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Estimated Annual Revenue']")).click();
	    logger.info("Estimated Annual Revenue field added");

	    workflow.selectSingleField().click();
	    Thread.sleep(500);
	    String EstimatedAnnualRevenue=  driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[5]//li")).getText();
	    list1.add(EstimatedAnnualRevenue);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[5]//li")).click();

	    workflow.clickSave2().click();
	    logger.info("save button clicked"); 
	    
	    
//11.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);

	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Ownership Type']")).click();
	    logger.info("Ownership Type field added");

	    workflow.selectSingleField().click();
	    Thread.sleep(500);
	    String OwnershipType=  driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).getText();
	    list1.add(OwnershipType);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();

	    workflow.clickSave2().click();
	    logger.info("save button clicked");      
	    
	    
  //12.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);

	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Stage']")).click();
	    logger.info("Stage field added");

	    workflow.selectSingleField().click();
	    Thread.sleep(500);
	    String Stage=  driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).getText();
	    list1.add(Stage);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();

	    workflow.clickSave2().click();
	    logger.info("save button clicked");       

   //13.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Founded Year']")).click();
	    logger.info("Founded Year field added");
	   
	    workflow.SetFieldValue().sendKeys("1"+randomnumber());
	    String FoundedYear= workflow.SetFieldValue().getAttribute("value");
	    list1.add(FoundedYear);
	
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
  
 //14.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);

	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Industry']")).click();
	    logger.info("Industry field added");

	    workflow.selectSingleField().click();
	    Thread.sleep(500);
	    String Industry=  driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).getText();
	    list1.add(Industry);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();

	    workflow.clickSave2().click();
	    logger.info("save button clicked");       
	    
	    
  //15.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Lead Phone']")).click();
	    logger.info("Lead Phone field added");
	   
	    workflow.SetFieldValue().sendKeys("9935679"+randomnumber());
	    String LeadPhone= workflow.SetFieldValue().getAttribute("value");
	    list1.add(LeadPhone);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
	//16.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Lead Website']")).click();
	    logger.info("website field added");
	   
	    workflow.SetFieldValue().sendKeys("https://login.liono360.com/"+randomnumber()+"workflow/test");
	    String Website= workflow.SetFieldValue().getAttribute("value");
	    list1.add(Website);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
	//16.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Lead Twitter']")).click();
	    logger.info("Twitter field added");
	   
	    workflow.SetFieldValue().sendKeys("https://twitter.com/i/flow/login?"+randomnumber()+"login??");
	    String Twitter= workflow.SetFieldValue().getAttribute("value");
	    list1.add(Twitter);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
	//17.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Lead Facebook']")).click();
	    logger.info("Facebook field added");
	   
	    workflow.SetFieldValue().sendKeys("https://www.facebook.com/"+randomnumber()+"test/login??");
	    String Facebook= workflow.SetFieldValue().getAttribute("value");
	    list1.add(Facebook);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    

// ADD TIME DEPENDENT ACTIONS HERE(Update Field)-------------------------------------------------------------------	    
	
	//1. 
	    workflow.TimeDependentActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Lead Linkedin']")).click();
	    logger.info("Linkedin field added");
	   
	    workflow.SetFieldValue().sendKeys("https://www.google.com/search?q=linked"+randomnumber()+"login");
	    String Linkedin= workflow.SetFieldValue().getAttribute("value");
	    list1.add(Linkedin);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
	  //2. 
	    workflow.TimeDependentActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Lead Instagram']")).click();
	    logger.info("Instagram field added");
	   
	    workflow.SetFieldValue().sendKeys("https://www.google.com/search?q=instagram&sourceid=UTF"+randomnumber());
	    String Instagram= workflow.SetFieldValue().getAttribute("value");
	    list1.add(Instagram);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
	 //3. 
	    workflow.TimeDependentActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='SIC Code']")).click();
	    logger.info("SIC Code field added");
	   
	    workflow.SetFieldValue().sendKeys("SIC"+randomnumber());
	    String SICCode= workflow.SetFieldValue().getAttribute("value");
	    list1.add(SICCode);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
	 //4. 
	    workflow.TimeDependentActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='NAICS Code']")).click();
	    logger.info("NAICS Code field added");
	   
	    workflow.SetFieldValue().sendKeys("NAICS"+randomnumber());
	    String NAICSCode= workflow.SetFieldValue().getAttribute("value");
	    list1.add(NAICSCode);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    
	//5.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);

	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Lead Source']")).click();
	    logger.info("Lead Source field added");

	    workflow.selectSingleField().click();
	    Thread.sleep(500);
	    String LeadSource=  driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).getText();
	    list1.add(LeadSource);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();

	    workflow.clickSave2().click();
	    logger.info("save button clicked"); 
	    
	//6.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);

	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Rating']")).click();
	    logger.info("Rating field added");

	    workflow.selectSingleField().click();
	    Thread.sleep(500);
	    String Rating=  driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).getText();
	    list1.add(Rating);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();

	    workflow.clickSave2().click();
	    logger.info("save button clicked"); 
	    
	    
	  //6.    
	    workflow.clickAddActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);

	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Status']")).click();
	    logger.info("Status field added");

	    workflow.selectSingleField().click();
	    Thread.sleep(1000);
	    String Status=  driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).getText();
	    list1.add(Status);
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();

	    workflow.clickSave2().click();
	    logger.info("save button clicked"); 
	    
	    
	 //8. 
	    workflow.TimeDependentActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='Notes']")).click();
	    logger.info("Notes field added");
	   
	    workflow.SetFieldValue().sendKeys("Fields are updated by: "+WorkflowNameToCreate);
	    String Notes= workflow.SetFieldValue().getAttribute("value");
	    list1.add(Notes);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");	    
	    
	    workflow.TimeDependentActions().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[3]//li")).click();
	    logger.info("add actions button clicked ");
	    //Thread.sleep(1000);
	    
	    workflow.SelectField().click();
	    driver.findElement(By.xpath("//span[text()='1XR']")).click();
	    logger.info("1XR field added");
	   
	    workflow.SetFieldValue().sendKeys(randomnumber());
	    String XR= workflow.SetFieldValue().getAttribute("value");
	    list1.add(XR);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");	    
	    
	    workflow.clickSave1().click();
	    logger.info("save button clicked and workflow created");
	    workflow.waitUntilPageLoad();
	   
	    
//SEARCH CREATED WORKFLOW AND RUN SCHEDULER -----------------------------------------------------------------------
	    
	    workflow.setGlobalSearch().sendKeys(WorkflowNameToCreate);
	    logger.info("workflow passed to search");
	    workflow.waitUntilPageLoad();
	    
	    String WorkflowNameAfterCreate  = workflow.ListedWorkflow().getText();
	    
	    workflow.ListedWorkflow().click();
	    logger.info("clicked on listed workflow ");
	    workflow.waitUntilPageLoad();

	    workflow.clickRunScheduler().click();
	    logger.info("clicked run scheduler");
	    Thread.sleep(500);
	    
	    workflow.clickYes().click();
	    logger.info("clicked yes button");
	    workflow.waitUntilPageLoad();
	    
// VERIFY THAT WORKFLOW CREATED AND WORKING FINE OR NOT---------------------------------------------------

	    Actions actions = new Actions(driver);
	    actions.keyDown(Keys.CONTROL).click(workflow.clickLeads()).keyUp(Keys.CONTROL).perform();
	    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	    driver.switchTo().window(tabs.get(1));
	    Thread.sleep(2000);

	    String FnameOfCreatedLead=commonMethods.CreateLeadToupdateField("LionoLead101");
	    driver.switchTo().window(tabs.get(0));
	    Thread.sleep(2000);
	    boolean ActionStatusInHistory=commonMethods.CheckActionStatusInHistory();
	    driver.switchTo().window(tabs.get(1));
	    Thread.sleep(2000);
	    boolean FieldUpdateStatus=commonMethods.checkFieldUpdateStatus(FnameOfCreatedLead,list1);


	    System.out.println("workflow name to create: "+WorkflowNameToCreate);
	    System.out.println("workflow name after create: "+WorkflowNameAfterCreate);
	    //  System.out.println(ActionStatusInHistory+" "+ActionStatusInCreatedLead);    m

	    if(WorkflowNameToCreate.equals(WorkflowNameAfterCreate)) {
	    	if(ActionStatusInHistory) {
	    		logger.info("workflow is created and  actions are also triggered in history");
	    	}
	    	else {logger.info("workflow is created but  actions are not triggered in history");}

	    	if(FieldUpdateStatus) {
	    		logger.info("workflow is created and  fields are also updated in newly created lead ");
	    	}
	    	else {logger.info("workflow is created  fields are not updated in newly created lead ");}

	    }




	    driver.switchTo().window(tabs.get(0));

	    workflow.clickOverView().click();
	    logger.info("clicked overview");
	    Thread.sleep(500);

	    workflow.stopScheduler().click();
	    logger.info("clicked stop scheduler");
	    Thread.sleep(500);

	    workflow.clickYes().click();
	    logger.info("clicked yes button");
	    Thread.sleep(3000);


// ASSERTION--------------------------------------------------------------------------------------------------------

	    if (WorkflowNameToCreate.equals(WorkflowNameAfterCreate)&&ActionStatusInHistory&&FieldUpdateStatus) {
	    	Assert.assertTrue(true);
	    	logger.info("Add worklow test passed");
	    } 
	    else {
	    	Assert.assertTrue(false);
	    	captureScreen(driver, "add work flow");
	    	logger.info("Add workflow test failed");
	    }

	}	    
	
}
