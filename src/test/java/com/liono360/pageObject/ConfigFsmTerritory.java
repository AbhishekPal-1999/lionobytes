package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigFsmTerritory {

	WebDriver ldriver;

	public ConfigFsmTerritory(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[text()='Configurations']")
	WebElement Clickconfig;

	public WebElement Clickconfig() {
		return Clickconfig;
	}
	
	@FindBy(xpath="(//span[text()='FSM'])[2]//parent::a")
	WebElement ClickFsm;

	public WebElement ClickFsm() {
		return ClickFsm;
	}
	
	@FindBy(xpath="//span[text()='Territory']")
	WebElement Clickterritory;

	public WebElement Clickterritory() {
		return Clickterritory;
	}
	
	@FindBy(xpath="//span[text()='Yes']")
	WebElement Yesbtn;

	public WebElement Yesbtn() {
		return Yesbtn;
	}
	
	
	@FindBy(xpath="(//span[text()='Yes'])[2]")
	WebElement Yesbtn1;

	public WebElement Yesbtn1() {
		return Yesbtn1;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Leads')]")
	WebElement btnLead;

	public WebElement clickLead() {
		return btnLead;
	}

	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
	WebElement listLead;

	public WebElement addedLead() {
		return listLead;
	}
	
	
	@FindBy(xpath = "//span[text()='Accounts']")
	WebElement CbtnAccount;

	public WebElement clickAccounts() {
		return CbtnAccount;	
	
	}
	
	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[1]")
	WebElement Accountnameclick;

	public WebElement AccountNameClick() {
		return Accountnameclick;	
}
	
	@FindBy(xpath = "//span[text()='No']")
	WebElement NOc;

	public WebElement NOc() {
		return NOc;	
}
	@FindBy(xpath = "//span[text()='Edit']")
	WebElement Edit;

	public WebElement Edit() {
		return Edit;	
}
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Lead Owner']")
	WebElement LeadOwner;

	public WebElement LeadOwner() {
		return LeadOwner;	
}
	@FindBy(xpath = "//span[text()='Save']")
	WebElement Save;

	public WebElement Save() {
		return Save;	
}
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Account Owner']")
	WebElement Accountowner;

	public WebElement Accountowner() {
		return Accountowner;	
}
	@FindBy(xpath = "//span[text()='Account Information']")
	WebElement AccountInfoClick;

	public WebElement AccountInfoClick() {
		return AccountInfoClick;	
}
	@FindBy(xpath = "//span[normalize-space()='Lead Information']")
	WebElement LeadInfoClick;

	public WebElement LeadInfoClick() {
		return LeadInfoClick;	
}
	
	@FindBy(xpath = "//span[@class='pi pi-plus p-button-icon ng-star-inserted']")
	WebElement AddPlus;

	public WebElement AddPlus() {
		return AddPlus;	
}
	
	
	@FindBy(xpath = "(//tr[@class='p-element p-selectable-row ng-star-inserted'])[3]")
	WebElement S1;

	public WebElement S1() {
		return S1;	
}
	

	@FindBy(xpath = "(//tr[@class='p-element p-selectable-row ng-star-inserted'])[4]")
	WebElement S2;

	public WebElement S2() {
		return S2;	
}
	
}
