package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class CreditMemoPage  extends Baseclass {
	WebDriver ldriver;

	public CreditMemoPage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);

	}
	public void waitUntilPageLoad() throws InterruptedException {
		int maxWaitingTime = 40;
		Thread.sleep(600); 
		float time=1;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	    while (time<maxWaitingTime) {
			WebElement LoaderIcon = null;
			try {
				LoaderIcon = driver.findElement(By.xpath("//div[@class=\"splash-loader\"]"));

			} catch (Exception e) {
				//System.out.println("Now Page loaded fully !....");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				break; 
			}

			if (LoaderIcon!=null) {

				Thread.sleep(500); 
				time=(float) (time+.5);
				//System.out.println("page loader icon is occuring till: "+time +"Seconds");
			} 
			else {
				break;
			}
		    
		}
		
	  }

	@FindBy(xpath = "//span[contains(text(),'Inventory')]")
	WebElement btnInventory;

	public WebElement clickInventory() {

		return btnInventory;
	}
	@FindBy(xpath="//span[text()='Credit Memo']")
	WebElement btnCreditmemo;
	
	public WebElement clickCreditMemo() {
		return btnCreditmemo;
	}

	@FindBy(xpath = "//*[text()='Sales']")
	WebElement btnSales;

	public WebElement clickSales() {
		return btnSales;
	}
	
	@FindBy(xpath="//div[@aria-label='dropdown trigger']")
	WebElement dropdownOrder;
	
	public WebElement selectOrder() {
		return dropdownOrder;
	}
	
	@FindBy(xpath= "//span[contains(text(),'Credit Memo')]")
	WebElement optionCreditMemo;
	
	public WebElement selectCreditMemo() {
		return optionCreditMemo;
	}
	@FindBy(xpath = "//*[text()='New']")
	WebElement btnNewSales1;


	public WebElement clickAddNewCreditmemo() {

		return btnNewSales1;
	}
	@FindBy(xpath="(//div[@aria-label='dropdown trigger'])[5]")
	WebElement optionAccountChannel;
	
	public WebElement selectAccountChannel() {
		return optionAccountChannel;
	}
	@FindBy(xpath="//span[normalize-space()='Add']")
	WebElement btnAdd;

	public WebElement clickAddBtn() {
		return btnAdd;
	}

	@FindBy(xpath="//button[@label='Save']")
	WebElement btnSave;


	public WebElement clickSubmit() {
		return btnSave;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	WebElement btnCreditMemoList;

	public WebElement clickEstimateList() {
		return btnCreditMemoList;
	}
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement txtYes;

	public WebElement clickYes() {
		return txtYes;
	}
	@FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
	WebElement txtDelete;

	public WebElement clickDelete() {
		return txtDelete;
	}
	@FindBy(xpath = "//*[text()='New']")
	WebElement btnNewSales;

	public WebElement clickAddNewCreditMemo() {
		return btnNewSales;
	}
	@FindBy(xpath = "//input[@placeholder='Search Account...']")
	WebElement txtSearchAccount;

	public WebElement setSearchAccount() {
		return txtSearchAccount;
	}
	@FindBy(xpath="//span[contains(text(),'Select Sales Rep')]")
	WebElement btnSalesRep;

	public WebElement clickSalesRep() {
		return btnSalesRep;
	}
	@FindBy(xpath="//p-dropdownitem//li[@role='option']")
	WebElement btnPan;

	public WebElement clicksalesrepuser() {
		return btnPan;
	}
	@FindBy(xpath="//table[@role='table']//thead//tr//th//span//i")
	WebElement btnAddProductList;

	public WebElement clickAddProductList() {
		return btnAddProductList;
	}
	@FindBy(xpath="(//span[contains(text(),'Edit')])[2]")
	WebElement clickEditBtn;

	public WebElement clickEditEstimate() {
		return clickEditBtn;
	}

	@FindBy(xpath="//span[text()='Void']")
	WebElement btnVoid;
	
	public WebElement clickVoidOption() {
		return btnVoid;
	}
	@FindBy(xpath="//span[text()='Yes']")
	WebElement btnYes;
	
	public WebElement clickYesToDelete() {
		return btnYes;
	}
	@FindBy(xpath="//li[@role='option'][1]")
	WebElement txtEditNewAcc;

	public WebElement clickEditNewAcc() {
		return txtEditNewAcc;
	}
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement txtSave;

	public WebElement clickSaveBtn1() {
		return txtSave;
	}
}
