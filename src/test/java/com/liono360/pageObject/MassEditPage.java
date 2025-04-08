package com.liono360.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MassEditPage {
	
WebDriver ldriver;
	
	public MassEditPage (WebDriver driver) {
		
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement CbtnAccount;

	public WebElement clickAccounts() {
		return CbtnAccount;	
	
	}
	@FindBy(xpath = "//span[text()='Leads']")
	WebElement CbtnLeads;

	public WebElement Leads() {
		return CbtnLeads;	
	
	}
	
	@FindBy(xpath = "//span[text()='Action']")
	WebElement btnAction;

	public WebElement ActionButton() {
		return btnAction;	
	}
	@FindBy(xpath="(//input[@placeholder=\"Search Fields...\"])")
	WebElement btnSearch;

	public WebElement Search() {
		return btnSearch;
		}

	@FindBy(xpath="//tbody//tr[1]//td[2]")
	WebElement listedAccount;

	public WebElement ListedAccount() {
		return listedAccount;
		}
	
	@FindBy(xpath = "//span[normalize-space()='Mass Edit']")
	WebElement btnMassEdit;

	public WebElement MassEdit() {
		return btnMassEdit;	
	}

	@FindBy(xpath = "//input[@placeholder=\"Search Fields...\"]")
	WebElement txtSearchFields;

	public WebElement txtSearchFields() {
		return txtSearchFields;	
	}
	
	@FindBy(xpath = "//p-button[@icon=\"pi pi-plus\"]//button")
	WebElement addRules;

	public WebElement addRules() {
		return addRules;	
	}
	
	@FindBy(xpath = "//liono-treeselect[@placeholder=\"Select a field\"]")
	WebElement Filter;

	public WebElement Filter() {
		return Filter;	
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder=\"select\"]")
	WebElement operator;

	public WebElement operator() {
		return operator;	
	}
	
	@FindBy(xpath = "//p-dropdown[@placeholder=\"Select Items\"]")
	WebElement valueDropdown;

	public WebElement SelectOperatorValue() {
		return valueDropdown;	
	}
	
	@FindBy(xpath = "//div[@title=\"Add Rule\"]//i")
	WebElement btnPlus;

	public WebElement Plus() {
		return btnPlus;	
	}
	
	@FindBy(xpath = "//button//span[normalize-space(.)='Save']")
	WebElement saveRules;

	public WebElement save() {
		return saveRules;	
	}
	
	@FindBy(xpath = "//button//span[normalize-space(.)='Next']")
	WebElement nextButton;

	public WebElement nextButton() {
		return nextButton;	
	}
	
	@FindBy(xpath = "(//p-dropdown[@formcontrolname=\"selectedField\"])[1]")
	WebElement btnMassEditDropdown1;

	public WebElement MassEditField1() {
		return btnMassEditDropdown1;	
	}
	
	
	@FindBy(xpath = "//p-dropdown[@placeholder=\"Select New Value\"]")
	WebElement drpSelectValue;

	public WebElement SelectValue() {
		return drpSelectValue;	
	}
	
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement btnYes;

	public WebElement Yes() {
		return btnYes;	
	}
	
	
	
	@FindBy(xpath = "//i[@class=\"pi pi-plus\"]")
	WebElement AddFields;

	public WebElement AddFields() {
		return AddFields;	
	}
	
	
	public WebElement MassEditField(int FieldNumaber) {
		
		WebElement Filter = ldriver.findElement(By.xpath("(//p-dropdown[@formcontrolname=\"selectedField\"])["+FieldNumaber+"]"));
		return Filter;
	}
	
public WebElement SelectSingleValue(int FieldNumaber) {
		
		WebElement Filter = ldriver.findElement(By.xpath("(//p-dropdown[@placeholder=\"Select New Value\"])["+FieldNumaber+"]"));
		return Filter;
	}

public WebElement SelectMultivalues(int FieldNumaber) {
	
	WebElement Filter = ldriver.findElement(By.xpath("(//p-multiselect[@placeholder=\"Select New Value\"])["+FieldNumaber+"]"));
	return Filter;
}
}
