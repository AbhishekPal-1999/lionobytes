package com.liono360.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class FilterPage extends Baseclass{

	WebDriver ldriver;

	public FilterPage (WebDriver driver) {

		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[contains(text(),'Leads')]")
	WebElement btnLead;

	public WebElement clickLead() {
		return btnLead;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Accounts')]")
	WebElement btnAccounts;

	public WebElement Accounts() {
		return btnAccounts;
	}

	@FindBy(xpath = "//span[text()='New']")
	WebElement btnAddLead;

	public WebElement clickAddLead() {
		return btnAddLead;
	}
	
	@FindBy(xpath = "//button[@ptooltip=\"Filters\"]")
	WebElement btnFilterIcon;

	public WebElement clickFilterIcon() {
		return btnFilterIcon;
	}
	
	@FindBy(xpath = "//span[text()='Add Filter']")
	WebElement btnAddFilter;

	public WebElement AddFilter() {
		return btnAddFilter;
	}
	
	@FindBy(xpath = "//span[text()='Reset']")
	WebElement btnReset;

	public WebElement Reset() {
		return btnReset;
	}
	@FindBy(xpath = "//span[text()='Apply']")
	WebElement  btnApply;

	public WebElement Apply() {
		return btnApply;
	}
	
	@FindBy(xpath = "//i[@class=\"pi pi-trash\"]")
	WebElement  btnDeleteFilter;

	public WebElement DeleteFilter() {
		return btnDeleteFilter;
	}
	
	
	
	
	
//==========================================================================================================
		public WebElement Filter(int FieldNumber) {
			
			WebElement Filter = ldriver.findElement(By.xpath("(//p-dropdown[@placeholder=\"Select Field\"])["+FieldNumber+"]"));
			return Filter;
		}
		
		
	public WebElement Operator(int FieldNumber) {
			
			WebElement Filter = ldriver.findElement(By.xpath("(//p-dropdown[@placeholder=\"Select Operator\"])["+FieldNumber+"]"));
			return Filter;
		}
	
	
	public WebElement SelectSingleValue(int FieldNumber) {
			
			WebElement Filter = ldriver.findElement(By.xpath("(//p-dropdown[@placeholder=\"Select New Value\"])["+FieldNumber+"]"));
			return Filter;
		}

	public WebElement SelectMultivalues(int FieldNumber) {
		
		WebElement Filter = ldriver.findElement(By.xpath("(//p-multiselect[@placeholder=\"Select Items\"])["+FieldNumber+"]"));
		return Filter;
	}
}
