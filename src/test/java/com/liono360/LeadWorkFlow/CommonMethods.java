package com.liono360.LeadWorkFlow;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.UrlChecker.TimeoutException;

import com.liono360.loginPage.Baseclass;
import com.liono360.pageObject.LeadWorkFlowPage;

public class CommonMethods extends Baseclass{

	
	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
	
// method for start date---------------------------------------------------------------------------------------
	
	public String StartDate() {

		LocalDate currentDate = LocalDate.now();
		int currentDay=currentDate.getDayOfMonth();
		
		return String.valueOf(currentDay);
	}
	
//method for end date------------------------------------------------------------------------------------------
	
	public String EndDate() {

		LocalDate currentDate = LocalDate.now();
		int currentDay=currentDate.getDayOfMonth();
		int endDay=currentDay+3;
		return String.valueOf(endDay);
	}
	
	
// METHOD TO CREATE NEW LEAD--------------------------------------------------------------------------------------	
	
    public void CreateLead(String ruleValue )throws InterruptedException {
		   
    	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

    	Actions actions = new Actions(driver);

        // Open the button link in a new tab
        actions.keyDown(Keys.CONTROL).click(workflow.clickLeads()).keyUp(Keys.CONTROL).perform();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        Thread.sleep(15000);

    	workflow.clickNew().click();
    	logger.info("Clicked new buuton");
    	Thread.sleep(15000);

    	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"ForWorkflow");
    	logger.info("first name added");
    	Thread.sleep(500);

    	String LeadName=  workflow.setFirstname().getAttribute("value");

    	workflow.setLeadNumber().sendKeys(ruleValue);
    	logger.info("lead number added");
    	Thread.sleep(3000);

    	workflow.clickSave1().click();
    	logger.info("save button clicked ");
    	Thread.sleep(25000);

    	workflow.setGlobalSearch().sendKeys(LeadName);
    	logger.info("lead name passed to global search ");
    	Thread.sleep(12000);

    	workflow.ListedLeads().click();
    	logger.info("clicked on listed leads");
    	Thread.sleep(10000);
    	
    	workflow.clickTask().click();
    	logger.info("clicked on task");
    	Thread.sleep(3000);
    	
    	driver.switchTo().window(tabs.get(0));

	}
    
    public void CreateLeadForCreated(String ruleValue )throws InterruptedException {
		   
    	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

    	Actions actions = new Actions(driver);

        // Open the button link in a new tab
        actions.keyDown(Keys.CONTROL).click(workflow.clickLeads()).keyUp(Keys.CONTROL).perform();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(15000);

    	workflow.clickNew().click();
    	logger.info("Clicked new buuton");
    	Thread.sleep(8000);

    	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"ForWorkflow");
    	logger.info("first name added");
    	Thread.sleep(500);

    	String LeadName=  workflow.setFirstname().getAttribute("value");

    	workflow.setLeadNumber().sendKeys(ruleValue);
    	logger.info("lead number added");
    	Thread.sleep(3000);

    	workflow.clickSave1().click();
    	logger.info("save button clicked ");
    	Thread.sleep(25000);

    	workflow.setGlobalSearch().sendKeys(LeadName);
    	logger.info("lead name passed to global search ");
    	Thread.sleep(12000);

    	workflow.ListedLeads().click();
    	logger.info("clicked on listed leads");
    	Thread.sleep(10000);
    	
    	workflow.clickTask().click();
    	logger.info("clicked on task");
    	Thread.sleep(3000);
    	
    	driver.switchTo().window(tabs.get(0));

	}
    
    public void CreateLeadForAssociatedRule(String ruleValue )throws InterruptedException {
		   
    	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
    	
        Thread.sleep(5000);

    	workflow.clickNew().click();
    	logger.info("Clicked new buuton");
    	Thread.sleep(15000);

    	workflow.setFirstname().sendKeys("AssociatedFirstName"+randomnumber());
    	logger.info("first name added");
    	Thread.sleep(500);

    	String Lead=  workflow.setFirstname().getAttribute("value");

    	workflow.clickSave1().click();
    	logger.info("save button clicked ");
    	Thread.sleep(25000);

    	workflow.setGlobalSearch().sendKeys(Lead);
    	logger.info("lead name passed to global search ");
    	Thread.sleep(12000);

    	workflow.ListedLeads().click();
    	logger.info("clicked on listed leads");
    	Thread.sleep(10000);
    	
    	workflow.clickTask().click();
    	logger.info("clicked on task");
    	Thread.sleep(3000);
    	
    	

	}
    
    public void CreateLeadForSaveSearchCreated()throws InterruptedException {
		   
    	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

    	Actions actions = new Actions(driver);

        Thread.sleep(15000);

    	workflow.clickNew().click();
    	logger.info("Clicked new buuton");
    	Thread.sleep(15000);

    	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"SaveSearchWorkflow");
    	logger.info("first name added");
    	Thread.sleep(500);

    	String LeadName=  workflow.setFirstname().getAttribute("value");
    	
    	workflow.setLeadName().sendKeys("Liono lead"+randomnumber()+" Pvt. Ltd.");
    	logger.info("lead name added");
    	Thread.sleep(3000);
    	
    	workflow.setLeadNumber().sendKeys("5"+randomnumber());
    	logger.info("lead number added");
    	Thread.sleep(600);
    	
    	workflow.setActivationNumber().sendKeys("ACV"+randomnumber());
    	logger.info("activation number added");
    	Thread.sleep(2000);
    	
    	workflow.selectLeadType().click();
	    driver.findElement(By.xpath("//span[text()='News']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='News']")).click();
	    logger.info("lead type added ");
	    Thread.sleep(500);

    	workflow.clickSave1().click();
    	logger.info("save button clicked ");
    	Thread.sleep(25000);

    	workflow.setGlobalSearch().sendKeys(LeadName);
    	logger.info("lead name passed to global search ");
    	Thread.sleep(12000);

    	workflow.ListedLeads().click();
    	logger.info("clicked on listed leads");
    	Thread.sleep(10000);
    	
    	workflow.clickTask().click();
    	logger.info("clicked on task");
    	Thread.sleep(3000);
    

	}
    
    
    public void GotoExistingLeadAndEdit(String ExistedLead) throws InterruptedException {
    	
    	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

    	Actions actions = new Actions(driver);

        // Open the button link in a new tab
        actions.keyDown(Keys.CONTROL).click(workflow.clickLeads()).keyUp(Keys.CONTROL).perform();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(15000);
        
        workflow.setGlobalSearch().sendKeys(ExistedLead);
    	logger.info("lead name passed to global search ");
    	Thread.sleep(12000);
    	
		mouseActionRightClick(driver, workflow.ListedLeads());
		Thread.sleep(2000);
    	workflow.btnEdit().click();
    	logger.info("clicked edit button");
    	Thread.sleep(10000);
    	
    	workflow.setLeadName().clear();
    	workflow.setLeadName().sendKeys("EditedLead"+randomnumber());
    	logger.info("lead name edited");
    	Thread.sleep(3000);

    	workflow.clickSave1().click();
    	logger.info("save button clicked ");
    	Thread.sleep(10000);
    	
    	actions.doubleClick(workflow.ListedLeads()).perform();

     	logger.info("clicked on listed lead");
    	Thread.sleep(8000);
    	
    	workflow.clickTask().click();
    	logger.info("clicked on task");
    	Thread.sleep(5000);

        driver.switchTo().window(tabs.get(0));

    }
    
  public void GotoExistingLead(String ExistedLead) throws InterruptedException {
    	
    	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

    	Actions actions = new Actions(driver);

        // Open the button link in a new tab
        actions.keyDown(Keys.CONTROL).click(workflow.clickLeads()).keyUp(Keys.CONTROL).perform();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        Thread.sleep(15000);
        
        workflow.setGlobalSearch().sendKeys(ExistedLead);
    	logger.info("lead name passed to global search ");
    	Thread.sleep(12000);
    	
    	workflow.ListedLeads().click();

     	logger.info("clicked on listed lead");
    	Thread.sleep(8000);
    	
    	workflow.clickTask().click();
    	logger.info("clicked on task");
    	Thread.sleep(5000);

        driver.switchTo().window(tabs.get(0));

    }
  
  public void EditExistingLeadToUpdateFields(String ExistedLead) throws InterruptedException {
  	
	  LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	  workflow.setGlobalSearch().sendKeys(ExistedLead);
	  logger.info("lead first name passed to global search ");
	  workflow.waitUntilPageLoad();

	  mouseActionRightClick(driver, workflow.ListedLeads());
	  Thread.sleep(2000);
	  workflow.btnEdit().click();
	  logger.info("clicked edit button");
	  workflow.waitUntilPageLoad();

	  workflow.selectjobfunction().click();

	  driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();

	  logger.info("job function added");

	  workflow.clickSave1().click();
	  logger.info("save button clicked ");

	  workflow.waitUntilPageLoad();   

  }


    
    public boolean CheckMultipleActionStatusInHistory() throws InterruptedException {
   	 
    	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

        int Status=0;
    	workflow.clickHistory().click();
    	logger.info("clicked on history");
    	Thread.sleep(5000);

    	workflow.SelectfilterStatus().click();
    	driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
    	logger.info("status filter added");
    	Thread.sleep(10000);
    	for(int i=1;i<=50;i++) {
    		workflow.RefreshWorkflow().click();
    		logger.info("clicked refresh button " +i+ " time");
    		Thread.sleep(10000);
    		try{
    			if( workflow.executedEvent().isDisplayed()&&workflow.executedEvent5().isDisplayed()) {
    				Status=1;
    				break;
    			}}
    		catch(Exception e) {}
    		Thread.sleep(4000); 
    	}
    	
    	if(Status==1) {
        	return true;
        }

    	return false; 
   	}
	
    
    
    public boolean CheckMultipleActionStatusInExistingLead() throws InterruptedException {

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
    	
    	int Status=0;
    	for(int i=1;i<=3;i++) {
    		workflow.clickContacts().click();
    		Thread.sleep(10000);
    		logger.info("clicked on contact");
    		workflow.clickTask().click();
    		Thread.sleep(7000);
    		try{
    			if( workflow.ListedTtask3().isDisplayed()) {
                  
    				Status=1;
    				break;
    			}}
    		catch(Exception e) {}}
        if(Status==1) {
        	return true;
        }
    	Thread.sleep(2000);
    	return false; 

    }
    
    
 public boolean CheckMultipleActionStatusInCreatedLead() throws InterruptedException {
    	
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(2));
    	
    	int Status=0;
    	for(int i=1;i<=3;i++) {
    		workflow.clickContacts().click();
    		Thread.sleep(10000);
    		logger.info("clicked on contact");
    		workflow.clickTask().click();
    		Thread.sleep(7000);
    		try{
    			if( workflow.ListedTtask3().isDisplayed()) {
                  
    				Status=1;
    				break;
    			}}
    		catch(Exception e) {}}
        if(Status==1) {
        	return true;
        }
    	Thread.sleep(2000);
    	return false; 
    }
 public boolean CheckActionStatusInHistory() throws InterruptedException {
   	 
	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 int Status=0;
	 workflow.clickHistory().click();
	 logger.info("clicked on history");
	 workflow.waitUntilPageLoad();

	 workflow.SelectfilterStatus().click();
	 driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
	 logger.info("status filter added");
	 workflow.waitUntilPageLoad();
	
	 for(int i=1;i<=50;i++) {
		 workflow.waitUntilPageLoad();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 workflow.RefreshWorkflow().click();
		 logger.info("clicked refresh button " +i+ " time");
		 Thread.sleep(10000);
		 try{
			 if( workflow.executedEvent().isDisplayed()&&workflow.executedEvent2().isDisplayed()) {
				 Status=1;
				
				 break;
			 }}
		 catch(Exception e) {}
		// Thread.sleep(4000); 
	 }
	 
	 if(Status==1) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 return true;
	 }
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 return false; 
	}
	
 
 
 public boolean CheckActionStatusInExistingLead() throws InterruptedException {

     ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
 	driver.switchTo().window(tabs.get(1));
 	
 	int Status=0;
 	for(int i=1;i<=3;i++) {
 		workflow.clickContacts().click();
 		Thread.sleep(10000);
 		logger.info("clicked on contact");
 		workflow.clickTask().click();
 		Thread.sleep(7000);
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
 		try{
 			if( workflow.ListedTtask().isDisplayed()) {
               
 				Status=1;
 				break;
 			}}
 		catch(Exception e) {}}
     if(Status==1) {
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	return true;
     }
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 	Thread.sleep(2000);
 	return false; 

 }
 
 
public boolean CheckActionStatusInCreatedLead() throws InterruptedException {
 	
     ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
 	driver.switchTo().window(tabs.get(2));
 	
 	int Status=0;
 	for(int i=1;i<=3;i++) {
 		workflow.clickContacts().click();
 		Thread.sleep(10000);
 		logger.info("clicked on contact");
 		workflow.clickTask().click();
 		Thread.sleep(7000);
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
 		try{
 			if( workflow.ListedTtask().isDisplayed()) {
               
 				Status=1;
 				break;
 			}}
 		catch(Exception e) {}}
     if(Status==1) {
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	return true;
     }
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 	Thread.sleep(2000);
 	return false; 
 }
 
 
 public boolean CheckActionStatusforCreatedLeadInCreated() throws InterruptedException {
 	
     ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
 	driver.switchTo().window(tabs.get(1));
 	
 	int Status=0;
 	for(int i=1;i<=3;i++) {
 		workflow.clickContacts().click();
 		Thread.sleep(10000);
 		logger.info("clicked on contact");
 		workflow.clickTask().click();
 		Thread.sleep(7000);
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
 		try{
 			if( workflow.ListedTtask().isDisplayed()) {
               
 				Status=1;
 				break;
 			}}
 		catch(Exception e) {}}
     if(Status==1) {
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	return true;
     }
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 	Thread.sleep(2000);
 	return false; 
 }   
 
 public void CreateLeadForMultipleRule(String leadname,String leadNumber, String LeadEmail,String leadPhone,String LeadType,String leadSource,String NumberofEmployees,String Stage,String Timezone,String EstimatedAnnualRevenue,String Industry) throws InterruptedException {
	 
    LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

 	Actions actions = new Actions(driver);
 	

     ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

    Thread.sleep(4000);
 	workflow.clickNew().click();
 	logger.info("Clicked new button");
 	Thread.sleep(12000);

 	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"ForWorkflow");
 	logger.info("first name added");
 	Thread.sleep(500);
 	String firstName =  workflow.setFirstname().getAttribute("value");
 	
 	
 	workflow.setLeadName().sendKeys(leadname);
 	logger.info("lead name added");
 	Thread.sleep(500);
 	

 	workflow.setLeadNumber().sendKeys(leadNumber);
 	logger.info("lead number added");
 	Thread.sleep(3000);
 	
 	workflow.selectLeadType().click();
 	driver.findElement(By.xpath("//span[contains(text(),'"+LeadType+"')]")).click();
 	Thread.sleep(1000);
 	driver.findElement(By.xpath("//span[contains(text(),'"+LeadType+"')]")).click();
 	// driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
 	logger.info("lead type added ");
 	Thread.sleep(2000);
 	
    jsScroll(driver,workflow.set1XR());
    Thread.sleep(2000);
 	workflow.selectTimeZone().click();
    driver.findElement(By.xpath("//span[contains(text(),'"+Timezone+"')]")).click();
    logger.info("time Zone added ");
    Thread.sleep(500);
    
    jsScroll(driver,workflow.clickLeadDetails());
    Thread.sleep(2000);
    
    workflow.clickLeadDetails().click();
    logger.info(" clicked lead details ");
    Thread.sleep(5000);

    workflow.setLeadPhone().sendKeys(leadPhone);
 	logger.info("lead phone added");
 	Thread.sleep(3000);
 	
 	workflow.setLeadEmail().sendKeys(LeadEmail);
 	logger.info("lead phone added");
 	Thread.sleep(3000);
    
 	 workflow.selectIndustry().click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[contains(text(),'"+Industry+"')])[1]")).click();
     logger.info("industry added ");
     Thread.sleep(2000);
 	
    workflow.selectNumberOfEmployee().click();
    Thread.sleep(500);
    driver.findElement(By.xpath("//span[contains(text(),'"+NumberofEmployees+"')]")).click();
    logger.info("number of employees added ");
    Thread.sleep(500);
    
    workflow.selectRevenue().click();
    Thread.sleep(500);
    driver.findElement(By.xpath("//span[contains(text(),'"+EstimatedAnnualRevenue+"')]")).click();
    logger.info("revenue added ");
    Thread.sleep(500);
    
    workflow.selectStage().click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//span[contains(text(),'"+Stage+"')])[2]")).click();
    logger.info("stage type added ");
    Thread.sleep(500);
    
    workflow.clickLeadSource().click();
    Thread.sleep(500);
    driver.findElement(By.xpath("//span[contains(text(),'"+leadSource+"')]")).click();
    logger.info("lead source added ");
    Thread.sleep(3000);
   
    
 	workflow.clickSave1().click();
 	logger.info("save button clicked ");
 	Thread.sleep(15000);
 	
 	driver.switchTo().window(tabs.get(0));
 	

  }
 
 
 
 public void CreateNewLeadForMultipleRule(String leadname,String leadNumber, String LeadEmail,String leadPhone,String LeadType,String leadSource,String NumberofEmployees,String Stage,String Timezone,String EstimatedAnnualRevenue,String Industry) throws InterruptedException, TimeoutException {
	 
	    LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 	Actions actions = new Actions(driver);
	 	
	     ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	     workflow.waitUntilPageLoad();
	  //  Thread.sleep(5000);
	 	workflow.clickNew().click();
	 	logger.info("Clicked new button");
	 	workflow.waitUntilPageLoad();

	 	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"ForWorkflow");
	 	logger.info("first name added");
	 	Thread.sleep(500);
	 	String firstName =  workflow.setFirstname().getAttribute("value");
	 	
	 	
	 	workflow.setLeadName().sendKeys(leadname);
	 	logger.info("lead name added");
	 	Thread.sleep(500);
	 	

	 	workflow.setLeadNumber().sendKeys(leadNumber);
	 	logger.info("lead number added");
	 	Thread.sleep(3000);
	 	
	 	workflow.selectLeadType().click();
	 	driver.findElement(By.xpath("//span[contains(text(),'"+LeadType+"')]")).click();
	 	Thread.sleep(1000);
	 	driver.findElement(By.xpath("//span[contains(text(),'"+LeadType+"')]")).click();
	 	//driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	 	logger.info("lead type added ");
	 	Thread.sleep(2000);
	 	
	    jsScroll(driver,workflow.set1XR());
	    Thread.sleep(2000);
	 	workflow.selectTimeZone().click();
	    driver.findElement(By.xpath("//span[contains(text(),'"+Timezone+"')]")).click();
	    logger.info("time Zone added ");
	    Thread.sleep(500);
	    
	    jsScroll(driver,workflow.clickLeadDetails());
	    Thread.sleep(2000);
	    
	    workflow.clickLeadDetails().click();
	    logger.info(" clicked lead details ");
	    Thread.sleep(5000);

	    workflow.setLeadPhone().sendKeys(leadPhone);
	 	logger.info("lead phone added");
	 	Thread.sleep(3000);
	 	
	 	workflow.setLeadEmail().sendKeys(LeadEmail);
	 	logger.info("lead phone added");
	 	Thread.sleep(3000);
	    
	 	 workflow.selectIndustry().click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//span[contains(text(),'"+Industry+"')])[1]")).click();
	     logger.info("industry added ");
	     Thread.sleep(2000);
	 	
	    workflow.selectNumberOfEmployee().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[contains(text(),'"+NumberofEmployees+"')]")).click();
	    logger.info("number of employees added ");
	    Thread.sleep(500);
	    
	    workflow.selectRevenue().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[contains(text(),'"+EstimatedAnnualRevenue+"')]")).click();
	    logger.info("revenue added ");
	    Thread.sleep(500);
	    
	    workflow.selectStage().click();
	     Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[contains(text(),'"+Stage+"')])[2]")).click();
	    logger.info("stage type added ");
	    Thread.sleep(500);
	    
	    workflow.clickLeadSource().click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//span[contains(text(),'"+leadSource+"')]")).click();
	    logger.info("lead source added ");
	 Thread.sleep(3000);
	   
	    
	 	workflow.clickSave1().click();
	 	logger.info("save button clicked ");
	 	workflow.waitUntilPageLoad();
	 	Thread.sleep(15000);

	 	workflow.setGlobalSearch().sendKeys(leadname);
	 	logger.info("lead name passed to global search ");
	   Thread.sleep(12000);

	 	workflow.ListedLeads().click();
	 	logger.info("clicked on listed leads");
	 	Thread.sleep(10000);
	 	
	 	workflow.clickTask().click();
	 	logger.info("clicked on task");
	 	Thread.sleep(3000);
	 	
	 	driver.switchTo().window(tabs.get(0));
	 	

	  }

 
 public void EditLead(String ExistedLead) throws InterruptedException, TimeoutException {
 	
	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 Actions actions = new Actions(driver);

	 ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	 driver.switchTo().window(tabs.get(1));
    // Thread.sleep(4000);
	 workflow.waitUntilPageLoad();
	 
	 workflow.setGlobalSearch().sendKeys(ExistedLead);
	 logger.info("lead name passed to global search ");
	 Thread.sleep(8000);

	 mouseActionRightClick(driver, workflow.ListedLeads());
	 Thread.sleep(2000);
	 workflow.btnEdit().click();
	 logger.info("clicked edit button");
	 workflow.waitUntilPageLoad();

//	 workflow.setSimSale().clear();
//	 workflow.setSimSale().sendKeys(randomnumber());
//	 logger.info("sim sale edited");
//	 Thread.sleep(3000);
	 workflow.selectjobfunction().click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	 Thread.sleep(500);
	 logger.info("job function added");

	 workflow.clickSave1().click();
	 logger.info("save button clicked ");
	 Thread.sleep(10000);
	 workflow.waitUntilPageLoad();

	 actions.doubleClick(workflow.ListedLeads()).perform();

	 logger.info("clicked on listed lead");
	 Thread.sleep(8000);

	 workflow.clickTask().click();
	 logger.info("clicked on task");
	 //Thread.sleep(5000);
	 workflow.waitUntilPageLoad();

	 driver.switchTo().window(tabs.get(0));

 }
 
 
 public void EditLead2(String ExistedLead) throws InterruptedException {
	 	
	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 Actions actions = new Actions(driver);

	 ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	 driver.switchTo().window(tabs.get(1));
	 Thread.sleep(4000);

	 workflow.setGlobalSearch().sendKeys(ExistedLead);
	 logger.info("lead name passed to global search ");
	 Thread.sleep(8000);

	 mouseActionRightClick(driver, workflow.ListedLeads());
	 Thread.sleep(2000);
	 workflow.btnEdit().click();
	 logger.info("clicked edit button");
	 Thread.sleep(10000);

	 workflow.setLeadNumber().clear();
	 workflow.setLeadNumber().sendKeys(randomnumber());
	 logger.info("lead number edited");
	 Thread.sleep(5000);

	 workflow.clickSave1().click();
	 logger.info("save button clicked ");
	 Thread.sleep(10000);

	 actions.doubleClick(workflow.ListedLeads()).perform();

	 logger.info("clicked on listed lead");
	 Thread.sleep(8000);

	 workflow.clickTask().click();
	 logger.info("clicked on task");
	 Thread.sleep(5000);

	 driver.switchTo().window(tabs.get(0));

 }
 
 
 public void CreateLeadForMultipleRule2(String simsale,String activationNumber,String sic,String FoundedYear,String country,String TaxId,String Website,String twitter,String facebook,String OwnershipType,String Rating) throws InterruptedException {
	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 	Actions actions = new Actions(driver);
      

	     ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	 	workflow.clickNew().click();
	 	logger.info("Clicked new buuton");
	 	Thread.sleep(8000);

	 	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"ForWorkflow");
	 	logger.info("first name added");
	 	Thread.sleep(500);
	 	String firstName =  workflow.setFirstname().getAttribute("value");
        
	 	workflow.setActivationNumber().sendKeys(activationNumber);
	    logger.info("activation number added");
	    Thread.sleep(500);
	    
	    workflow.setSimSale().sendKeys(simsale);
	    logger.info("sim sale added");
	    Thread.sleep(500);
	    
	    workflow.clickLeadDetails().click();
	    logger.info("lead details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.setTaxID().sendKeys(TaxId);
	    logger.info("tax id added");
	    Thread.sleep(500);
	    
	    workflow.selectRating().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'"+Rating+"')]")).click();
	    logger.info("rating added ");
	    Thread.sleep(500);
	    
	    workflow.setFoundedYear().sendKeys(FoundedYear);
	    logger.info("Founded year added");
	    Thread.sleep(500);
	    
	    workflow.SelectOwnership().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'"+OwnershipType+"')]")).click();
	    logger.info("ownership type added ");
	    Thread.sleep(2000);
	    
	    workflow.setWebsite().sendKeys(Website);
	    logger.info("website added");
	    Thread.sleep(500);
	    
	    workflow.setFacebook().sendKeys(facebook);
	    logger.info("facebook added");
	    Thread.sleep(500);
	    
	    workflow.setTwitter().sendKeys(twitter);
	    logger.info("twitter added");
	    Thread.sleep(2000);
	    
	    workflow.setSicCode().sendKeys(sic);
	    logger.info("sic code added");
	    Thread.sleep(500);
	    
	    workflow.clickAddressDetails().click();
	    logger.info("address details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.plusButtonforAddress().click();
	    logger.info("address details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.selectdrpCountry().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'"+country+"')]")).click();
	    logger.info("country added ");
	    Thread.sleep(2000);
	    
	    workflow.clickSave1().click();
	    logger.info("save button clicked ");
	    Thread.sleep(10000);
	    
	    workflow.clickSave1().click();
	 	logger.info("save button clicked ");
	 	Thread.sleep(25000);
	 	
	 	driver.switchTo().window(tabs.get(0));
    
 }
 
 public void CreateNewLeadForMultipleRule2(String simsale,String activationNumber,String sic,String FoundedYear,String country,String TaxId,String Website,String twitter,String facebook,String OwnershipType,String Rating) throws InterruptedException {
	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 	Actions actions = new Actions(driver);
   

	     ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	 	workflow.clickNew().click();
	 	logger.info("Clicked new buuton");
	 	Thread.sleep(15000);

	 	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"ForWorkflow");
	 	logger.info("first name added");
	 	Thread.sleep(500);
	 	String firstName =  workflow.setFirstname().getAttribute("value");
     
	 	workflow.setActivationNumber().sendKeys(activationNumber);
	    logger.info("activation number added");
	    Thread.sleep(500);
	    
	    workflow.setSimSale().sendKeys(simsale);
	    logger.info("sim sale added");
	    Thread.sleep(500);
	    
	    workflow.clickLeadDetails().click();
	    logger.info("lead details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.setSicCode().sendKeys(sic);
	    logger.info("sic code added");
	    Thread.sleep(500);
	    
	    workflow.setTaxID().sendKeys(TaxId);
	    logger.info("tax id added");
	    Thread.sleep(500);
	    
	    workflow.selectRating().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'"+Rating+"')]")).click();
	    logger.info("rating added ");
	    Thread.sleep(500);
	    
	    workflow.setFoundedYear().sendKeys(FoundedYear);
	    logger.info("Founded year added");
	    Thread.sleep(500);
	    
	    workflow.SelectOwnership().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'"+OwnershipType+"')]")).click();
	    logger.info("ownership type added ");
	    Thread.sleep(2000);
	    
	    workflow.setWebsite().sendKeys(Website);
	    logger.info("website added");
	    Thread.sleep(500);
	    
	    workflow.setFacebook().sendKeys(facebook);
	    logger.info("facebook added");
	    Thread.sleep(500);
	    
	    workflow.setTwitter().sendKeys(twitter);
	    logger.info("twitter added");
	    Thread.sleep(2000);
	    
	    
	    workflow.clickAddressDetails().click();
	    logger.info("address details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.plusButtonforAddress().click();
	    logger.info("address details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.selectdrpCountry().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[text()='India'])")).click();
	    logger.info("country added ");
	    Thread.sleep(2000);
	    
	    workflow.clickSave1().click();
	    logger.info("save button clicked ");
	    Thread.sleep(10000);
	    
	    workflow.clickSave1().click();
	 	logger.info("save button clicked ");
	 	Thread.sleep(25000);
	 	
		workflow.setGlobalSearch().sendKeys(firstName);
	 	logger.info("lead name passed to global search ");
	 	Thread.sleep(12000);

	 	workflow.ListedLeads().click();
	 	logger.info("clicked on listed leads");
	 	Thread.sleep(10000);
	 	
	 	workflow.clickTask().click();
	 	logger.info("clicked on task");
	 	Thread.sleep(3000);
	 	
	 	driver.switchTo().window(tabs.get(0));
    
 }
 
 
 public void CreateNewLeadMultipleAssociatedRule(String MiddleInitial,String Lastname,String WorkEmail,String title,String HomeEmail, String jobFunction) throws InterruptedException {
	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 	Actions actions = new Actions(driver);
   
	 	workflow.clickNew().click();
	 	logger.info("Clicked new buuton");
	 	Thread.sleep(15000);

	 	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"ForWorkflow");
	 	logger.info("first name added");
	 	Thread.sleep(500);
	 	String firstName =  workflow.setFirstname().getAttribute("value");
     
	 	workflow.setMidleName().sendKeys(MiddleInitial);
	    logger.info("MiddleInitial added");
	    Thread.sleep(500);
	    
	    workflow.setLastName().sendKeys(Lastname);
	    logger.info("Last name added");
	    Thread.sleep(500);
	   
	    workflow.setWorkEmail().sendKeys(WorkEmail);
	    logger.info("Work Email code added");
	    Thread.sleep(500);
	    
	    workflow.SelectTitle().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'"+title+"')]")).click();
	    logger.info("title added ");
	    Thread.sleep(500);
	    
	    workflow.setHomeEmail().sendKeys(HomeEmail);
	    logger.info("Home Email year added");
	    Thread.sleep(500);
	    
	    workflow.selectjobfunction().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'"+jobFunction+"')]")).click();
	    logger.info("job Function type added ");
	    Thread.sleep(2000);
	    
	    workflow.clickSave1().click();
	    logger.info("save button clicked ");
	    Thread.sleep(10000);
	    
	    workflow.clickSave1().click();
	 	logger.info("save button clicked ");
	 	Thread.sleep(25000);
	 	
		workflow.setGlobalSearch().sendKeys(firstName);
	 	logger.info("lead name passed to global search ");
	 	Thread.sleep(12000);

	 	workflow.ListedLeads().click();
	 	logger.info("clicked on listed leads");
	 	Thread.sleep(10000);
	 	
	 	workflow.clickTask().click();
	 	logger.info("clicked on task");
	 	Thread.sleep(3000);
 }
 
 public void CreateNewLeadMultipleAssociatedRule2(String MiddleInitial,String Lastname,String WorkEmail,String title,String HomeEmail, String jobFunction) throws InterruptedException {
	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 	
   
	 	workflow.clickNew().click();
	 	logger.info("Clicked new buuton");
	 	Thread.sleep(15000);

	 	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"ForWorkflow");
	 	logger.info("first name added");
	 	Thread.sleep(500);
	 	String firstName =  workflow.setFirstname().getAttribute("value");
     
	 	workflow.setMidleName().sendKeys(MiddleInitial);
	    logger.info("MiddleInitial added");
	    Thread.sleep(500);
	    
	    workflow.setLastName().sendKeys(Lastname);
	    logger.info("Last name added");
	    Thread.sleep(500);
	   
	    workflow.setWorkEmail().sendKeys(WorkEmail);
	    logger.info("Work Email code added");
	    Thread.sleep(500);
	    
	    workflow.SelectTitle().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'"+title+"')]")).click();
	    logger.info("title added ");
	    Thread.sleep(500);
	    
	    workflow.setHomeEmail().sendKeys(HomeEmail);
	    logger.info("Home Email year added");
	    Thread.sleep(500);
	    
	    workflow.selectjobfunction().click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'"+jobFunction+"')]")).click();
	    logger.info("job Function type added ");
	    Thread.sleep(2000);
	    
	    workflow.clickSave1().click();
	    logger.info("save button clicked ");
	    Thread.sleep(10000);
	    
	    workflow.clickSave1().click();
	 	logger.info("save button clicked ");
	 	Thread.sleep(15000);
	
 }
 
 public void CreateLeadForMultipleRule3(String linkedin,String instagram, String naics,String notes,String StreetAddress1,String StreetAddress2,String zip) throws InterruptedException, TimeoutException {
	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 	Actions actions = new Actions(driver);
      

	     ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	 	workflow.clickNew().click();
	 	logger.info("Clicked new buuton");
	 	//Thread.sleep(15000);
	 	workflow.waitUntilPageLoad();

	 	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"ForWorkflow");
	 	logger.info("first name added");
	 	Thread.sleep(500);
	 	String firstName =  workflow.setFirstname().getAttribute("value");
        
	 	workflow.clickLeadDetails().click();
	    logger.info("lead details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.setLinkedin().sendKeys(linkedin);
	    logger.info("linkedin added");
	    
	    workflow.setInstagram().sendKeys(instagram);
	    logger.info("instagram url added");
	    Thread.sleep(500);
	    
	    workflow.clickLeadDetails().click();
	    logger.info("lead details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.setNAICScode().sendKeys(naics);
	    logger.info("NAICS code added");
	    Thread.sleep(500);
	    
	    workflow.setNotes().sendKeys(notes);
	    logger.info("notes code added");
	    Thread.sleep(500);
	    
	    workflow.clickAddressDetails().click();
	    logger.info("address details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.plusButtonforAddress().click();
	    logger.info("address details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.setStreetAddress1().sendKeys(StreetAddress1);
		Thread.sleep(7000);
		workflow.setStreetAddress1().sendKeys(Keys.ARROW_DOWN);
		workflow.setStreetAddress1().sendKeys(Keys.ENTER);
		logger.info("start loaction added");
	    
//	    workflow.setStreetAddress1().sendKeys(StreetAddress1);
//	    logger.info("street address1  added");
//	    Thread.sleep(500);
	    
	    workflow.txtStreetAddress2().sendKeys(StreetAddress2);
	    logger.info("street address2  added");
	    Thread.sleep(500);
	    
	    workflow.setZipAddress().sendKeys(zip);
	    logger.info("Zip address added");
	    Thread.sleep(2000);
	    
	    workflow.clickSave1().click();
	    logger.info("save button clicked ");
	  //Thread.sleep(10000);
	    workflow.waitUntilPageLoad();
	    
	    workflow.clickSave1().click();
	 	logger.info("save button clicked ");
	 	//Thread.sleep(25000);
	 	workflow.waitUntilPageLoad();
	 	driver.switchTo().window(tabs.get(0));
    
 }

 public void CreateNewLeadForMultipleRule3(String linkedin,String instagram, String naics,String notes,String StreetAddress1,String StreetAddress2,String zip) throws InterruptedException {
	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 	Actions actions = new Actions(driver);
   

	     ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	 	workflow.clickNew().click();
	 	logger.info("Clicked new buuton");
	 	Thread.sleep(15000);

	 	workflow.setFirstname().sendKeys("Lead"+randomnumber()+"ForWorkflow");
	 	logger.info("first name added");
	 	Thread.sleep(500);
	 	String firstName =  workflow.setFirstname().getAttribute("value");
     
	 	workflow.clickLeadDetails().click();
	    logger.info("lead details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.setLinkedin().sendKeys(linkedin);
	    logger.info("linkedin added");
	    
	    workflow.setInstagram().sendKeys(instagram);
	    logger.info("instagram url added");
	    Thread.sleep(500);
	    
	    workflow.clickLeadDetails().click();
	    logger.info("lead details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.setNAICScode().sendKeys(naics);
	    logger.info("NAICS code added");
	    Thread.sleep(500);
	    
	    workflow.setNotes().sendKeys(notes);
	    logger.info("notes code added");
	    Thread.sleep(500);
	    
	    workflow.clickAddressDetails().click();
	    logger.info("address details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.plusButtonforAddress().click();
	    logger.info("address details clicked ");
	    Thread.sleep(5000);
	    
	    workflow.setStreetAddress1().sendKeys(StreetAddress1);
	 		Thread.sleep(7000);
	 		workflow.setStreetAddress1().sendKeys(Keys.ARROW_DOWN);
	 		workflow.setStreetAddress1().sendKeys(Keys.ENTER);
	 		logger.info("start loaction added");
	    
	    workflow.txtStreetAddress2().sendKeys(StreetAddress2);
	    logger.info("street address2  added");
	    Thread.sleep(500);
	    
	    workflow.setZipAddress().sendKeys(zip);
	    logger.info("Zip address added");
	    Thread.sleep(500);
	    
	    workflow.clickSave1().click();
	    logger.info("save button clicked ");
	    Thread.sleep(10000);
	    
	    workflow.clickSave1().click();
	 	logger.info("save button clicked ");
	 	Thread.sleep(25000);
	 	
		workflow.setGlobalSearch().sendKeys(firstName);
	 	logger.info("lead name passed to global search ");
	 	Thread.sleep(12000);

	 	workflow.ListedLeads().click();
	 	logger.info("clicked on listed leads");
	 	Thread.sleep(10000);
	 	
	 	workflow.clickTask().click();
	 	logger.info("clicked on task");
	 	Thread.sleep(3000);
	 	
	 	driver.switchTo().window(tabs.get(0));
    
 }
 
 public void EditSaveSearchLead(String ExistedLead) throws InterruptedException {
	 	
	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);

	 Actions actions = new Actions(driver);

	 Thread.sleep(4000);

	 workflow.setGlobalSearch().sendKeys(ExistedLead);
	 logger.info("lead name passed to global search ");
	 Thread.sleep(8000);

	 mouseActionRightClick(driver, workflow.ListedLeads());
	 Thread.sleep(2000);
	 workflow.btnEdit().click();
	 logger.info("clicked edit button");
	 Thread.sleep(10000);
	 
	 workflow.selectjobfunction().click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//ul[@role='listbox']//p-multiselectitem[1]//li")).click();
	 Thread.sleep(500);
	 logger.info("job function added");

	 workflow.clickSave1().click();
	 logger.info("save button clicked ");
	 Thread.sleep(10000);

	 actions.doubleClick(workflow.ListedLeads()).perform();

	 logger.info("clicked on listed lead");
	 Thread.sleep(8000);

	 workflow.clickTask().click();
	 logger.info("clicked on task");
	 Thread.sleep(5000);

 }

public void CheckWorfloStatus() throws InterruptedException {
	LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
	if(true) {
		workflow.ListedLeads();
		Thread.sleep(5000);

		workflow.stopScheduler().click();
		logger.info("clicked stop scheduler");
		Thread.sleep(500);

		workflow.clickYes().click();
		logger.info("clicked yes button");
		Thread.sleep(3000);
	}
 }


 public void CreatTask(String workflowName ,int taskNumber) throws InterruptedException, TimeoutException {
	 
	   jsScroll(driver, driver.findElement(By.xpath("(//p-dropdown[@placeholder='Add Actions'])["+taskNumber+"]")));
	   Thread.sleep(500); 
	   driver.findElement(By.xpath("(//p-dropdown[@placeholder='Add Actions'])["+taskNumber+"]")).click();
	    
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("add actions button clicked ");
	    Thread.sleep(100);
	    
	    workflow.selectAssignType().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("assign type added");
	  Thread.sleep(100);
	    
	    workflow.selectTaskUsers().click();
	    driver.findElement(By.xpath("//div[text()='Satyendra Bhardwaj']")).click();
	    logger.info("user added");
	   Thread.sleep(100);
	    
	    workflow.selectcatagory().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("catagory added ");
	  Thread.sleep(100);
	    
	    workflow.selectReminderType().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("reminder type added");
	   Thread.sleep(100);
	    
	    workflow.selectReminder().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("reminder added ");
	   Thread.sleep(100);
	    
	    workflow.selectRepeatType().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("repeatType added ");
	  Thread.sleep(100);
	    
	    workflow.selectPriority().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("priority added");
	    Thread.sleep(100);
	    
	    workflow.setTaskEndDays().clear();
	    workflow.setTaskEndDays().sendKeys("3");
	    logger.info("task end days added");
	    Thread.sleep(100);
	    
	    int conditionNumber=6-taskNumber;
	    workflow.setDescription().sendKeys("this task is for manual condition: "+conditionNumber+" and generated by: "+workflowName);
	    logger.info("Description added");
	    Thread.sleep(100);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	    workflow.waitUntilPageLoad();
	    
 }
 
 public void CreateEmail(String workflowName ,int emailNumber) throws InterruptedException, TimeoutException {
	   
	    jsScroll(driver, driver.findElement(By.xpath("(//p-dropdown[@placeholder='Add Actions'])["+emailNumber+"]")));

	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//p-dropdown[@placeholder='Add Actions'])["+emailNumber+"]")).click();

	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[2]//li")).click();
	    logger.info("add actions button clicked ");
	  // Thread.sleep(100);
	    
	    workflow.selectAssignTypeTimeDependent().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[1]//li")).click();
	    logger.info("assign type added ");
	 //   Thread.sleep(100);
	    
	    workflow.selectSentTo().click();
	    driver.findElement(By.xpath("//p-treenode//button")).click();
	    driver.findElement(By.xpath("(//p-treenode//button)[4]")).click();
	    driver.findElement(By.xpath("//span[text()='Satyendra Bhardwaj']")).click();
	    logger.info("sent to selected ");
	//  Thread.sleep(500);
	    
	    workflow.SelectTemplate().click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//p-dropdownitem[4]//li")).click();
	    logger.info("template selected ");
	//   Thread.sleep(500);
	    
	   workflow.waitUntilPageLoad();
	   
	    workflow.setEmailBody().sendKeys("this is automotion generated email for manual condition:" +emailNumber);
	    logger.info("text added in email body selected ");
	//  Thread.sleep(500);
	    
	    String path=System.getProperty("user.dir") + "\\TestData\\test1.png";
	    workflow.SetAttachment().sendKeys(path);
	    logger.info("attachment added");
	  //  Thread.sleep(2000);
	    
	    workflow.clickSave2().click();
	    logger.info("save button clicked");
	   // Thread.sleep(8000);
	    workflow.waitUntilPageLoad();
	    
	    
	 
 }
 
 
 public String CreateLeadToupdateField(String ruleValue )throws InterruptedException {

	 LeadWorkFlowPage workflow= new LeadWorkFlowPage(driver);
	 workflow.waitUntilPageLoad();
	 workflow.clickLeads().click();
	 logger.info("clicked lead");

	 workflow.waitUntilPageLoad();

	 workflow.clickNew().click();
	 logger.info("Clicked new buuton");
	 workflow.waitUntilPageLoad();

	 workflow.setFirstname().sendKeys("KiwitechLead"+randomnumber());
	 logger.info("first name added");


	 String LeadFirstName=  workflow.setFirstname().getAttribute("value");

	 workflow.setLeadName().sendKeys(ruleValue);
	 logger.info("lead name added");


	 workflow.clickSave1().click();
	 logger.info("save button clicked ");

	 return LeadFirstName;


	}
 
 public boolean checkFieldUpdateStatus(String FirstNameOFCreatedLead,List<String> List1) throws InterruptedException {
	 
	 List<String> UpadtedFieldLists=new ArrayList<String>();
	 
	 workflow.setGlobalSearch().clear();
	 workflow.setGlobalSearch().sendKeys(FirstNameOFCreatedLead);
	 logger.info("lead name passed to global search ");
	 workflow.waitUntilPageLoad();

	 mouseActionRightClick(driver, workflow.ListedLeads());
	 Thread.sleep(2000);
	 workflow.btnEdit().click();
	 logger.info("clicked edit button");
	 workflow.waitUntilPageLoad();
	 Thread.sleep(3000);
	 String LeadType=workflow.selectLeadType().getText();
	 UpadtedFieldLists.add(LeadType);
	 
	 String leadNumber=workflow.setLeadNumber().getAttribute("value");
	 UpadtedFieldLists.add(leadNumber);

	
	 
	 jsScroll(driver,workflow.set1XR());
	 Thread.sleep(500);

	 String TimeZone=workflow.selectTimeZone().getText();
	 UpadtedFieldLists.add(TimeZone);
	 
	 String Currency=workflow.selectCurrency().getText();
	 UpadtedFieldLists.add(Currency);

	 String activationNumber=workflow.setActivationNumber().getAttribute("value");
	 UpadtedFieldLists.add(activationNumber);
	 
	 String SimSale=workflow.setSimSale().getAttribute("value");
	 UpadtedFieldLists.add(SimSale);
	 
	 String xr=workflow.set1XR().getAttribute("value");
	 UpadtedFieldLists.add(xr);
	 
	 jsScroll(driver,workflow.clickLeadDetails());
	 Thread.sleep(2000);

	 workflow.clickLeadDetails().click();
	 Thread.sleep(6000);
	 
	 String Dba= workflow.setDBA().getAttribute("value");
	 UpadtedFieldLists.add(Dba);
	 
	 String taxId= workflow.setTaxID().getAttribute("value");
	 UpadtedFieldLists.add(taxId);
	 
	 String industry=workflow.selectIndustry().getText();
	 UpadtedFieldLists.add(industry);
	 
	 String LeadPhone= workflow.setLeadPhone().getAttribute("value");
	 UpadtedFieldLists.add(LeadPhone);
	 
	 String noOfEmployee=workflow.selectNumberOfEmployee().getText();
	 UpadtedFieldLists.add(noOfEmployee);
	 
	 String ownershipType=workflow.SelectOwnership().getText();
	 UpadtedFieldLists.add(ownershipType);
	 
	 String revenue= workflow.selectRevenue().getText();
	 UpadtedFieldLists.add(revenue);
	 
	 String stage= workflow.selectStage().getText();
	 UpadtedFieldLists.add(stage);
	 
	 String FoundedYear= workflow.setFoundedYear().getAttribute("value");
	 UpadtedFieldLists.add(FoundedYear);
	 
	 String website=workflow.setWebsite().getAttribute("value");	    
	 UpadtedFieldLists.add(website);
	 
	 String twitter=workflow.setTwitter().getAttribute("value");	    
	 UpadtedFieldLists.add(twitter);
	 
	 String facbook=workflow.setFacebook().getAttribute("value");	    
	 UpadtedFieldLists.add(facbook);
	 
	 String linkedin=workflow.setLinkedin().getAttribute("value");	    
	 UpadtedFieldLists.add(linkedin);
	 
	 String instagram=workflow.setInstagram().getAttribute("value");	    
	 UpadtedFieldLists.add(instagram);
	 
	 String sic=workflow.setSicCode().getAttribute("value");	    
	 UpadtedFieldLists.add(sic);
	 
	 String Naics=workflow.setNAICScode().getAttribute("value");	    
	 UpadtedFieldLists.add(Naics);
	 
	 String leadSource=workflow.clickLeadSource().getText();
	 UpadtedFieldLists.add(leadSource);
	 
	 String rating=workflow.selectRating().getText();
	 UpadtedFieldLists.add(rating);
	 
	 String status=workflow.selectStatus().getText();
	 UpadtedFieldLists.add(status);
	 
	 String notes=workflow.setNotes().getAttribute("value");	    
	 UpadtedFieldLists.add(notes);
	 
	 workflow.clickCancel().click();
	 logger.info("cancel button clicked");
	 
	 Collections.sort(List1);
	 Collections.sort(UpadtedFieldLists);
	 
	 System.out.println("Total Provided Fields to update : "+List1.size());
	 System.out.println("Total updated fields: "+UpadtedFieldLists.size());
	 System.out.println("Provided Fields to update : "+List1);
	 System.out.println("Fields after upadted: "+UpadtedFieldLists);
	 int count=0;
	 for(int i=0;i<=26;i++) {
		 
		 String before = List1.get(i);
		 String after = UpadtedFieldLists.get(i);
		 
		 if(before.equalsIgnoreCase(after)) {
			 count=count+1;
		 }
		 else {
			 System.out.println();
			 System.out.print("unmatched fields: ");
			 System.out.println("before-->"+before+"  after-->"+after);
		 }
	 }
	 
	 if(count==27)
		 return true;
	 
	return false;
 }
 
// public void openAllTreeDropdown() throws InterruptedException {
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//	 workflow.drpLeadDetails().click();
//	  WebElement e1=null;
//	  try {
//		e1 = workflow.RightLeadDetails();
//		
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		System.out.println(e1);
//
//		e.printStackTrace();
//	}
//		if(e1!=null) {
//					workflow.drpLeadDetails().click();
//					System.out.println("lead lead deatils");
//					Thread.sleep(500);
//	   } 
//	
//	Thread.sleep(1000);
//	 workflow.drpLeadEmail().click();
//	  WebElement e2=null;
//	  try {
//		e2 = workflow.RightLeadEmail();
//		
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	  System.out.println(e2);
//
//	  Thread.sleep(1000);
//			if(e2!=null)	{	
//					workflow.drpLeadEmail().click();
//					System.out.println("lead email");
//					Thread.sleep(500);
//			}
//		
//	 workflow.drpLeadPhone().click();
//
//	 workflow.drpLeadSocial().click();
//
//	 workflow.drpAddressDetails().click();
//	 Thread.sleep(500);
//	 
////	 try {
////		if(workflow.RightLeadDetails().isDisplayed())
////				workflow.drpLeadDetails().click();
////				Thread.sleep(500);
////	} catch (InterruptedException e) {
////		// TODO Auto-generated catch block
////		e.printStackTrace();
////	}
////	try {
////		if(workflow.RightLeadEmail().isDisplayed())		
////				workflow.drpLeadEmail().click();
////				Thread.sleep(500);
////	} catch (InterruptedException e) {
////		// TODO Auto-generated catch block
////		e.printStackTrace();
////	}
////	try {
////		if(workflow.RightLeadPhone().isDisplayed())		
////				workflow.drpLeadPhone().click();
////				Thread.sleep(500);
////	} catch (InterruptedException e) {
////		// TODO Auto-generated catch block
////		e.printStackTrace();
////	}
////	try {
////		if(workflow.RightLeadSocial().isDisplayed())			
////				workflow.drpLeadSocial().click();
////				Thread.sleep(500);
////	} catch (InterruptedException e) {
////		// TODO Auto-generated catch block
////		e.printStackTrace();
////	}
////	try {
////		if(workflow.RightAddresDetails().isDisplayed())
////				workflow.drpAddressDetails().click();
////				Thread.sleep(500);
////	} catch (InterruptedException e) {
////		// TODO Auto-generated catch block
////		e.printStackTrace();
////	}
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// }
// 
 
 public void openAllTreeDropdown() throws InterruptedException {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	workflow.drpLeadDetails().click();
	//Thread.sleep(1000);
	  try {
		 workflow.RightLeadDetails().click();
		
	} catch (Exception e) {
		
	}
		
	 workflow.drpLeadEmail().click();
	 //Thread.sleep(1000);
	  try {
		 workflow.RightLeadEmail().click();
		
	} catch (Exception e) {
		
	}
	  
	 workflow.drpLeadPhone().click();
	 //Thread.sleep(1000);
	 try {
		 workflow.RightLeadPhone().click();
		
	} catch (Exception e) {
		
	}

	 workflow.drpLeadSocial().click();
	 //Thread.sleep(1000);
	 try {
		 workflow.RightLeadSocial().click();
		
	} catch (Exception e) {
		
	}

	 workflow.drpAddressDetails().click();
	 //Thread.sleep(1000);
	 try {
		 workflow.RightAddresDetails().click();
		
	} catch (Exception e) {
		
	}

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 }
 
}
