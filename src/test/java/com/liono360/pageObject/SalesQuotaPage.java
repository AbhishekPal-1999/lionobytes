package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesQuotaPage {

	
	WebDriver ldriver;

	public SalesQuotaPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//span[text()='Sales Quota']")
	WebElement SalesQuotaModule;
	public WebElement SalesQuotaModule() {
		return SalesQuotaModule;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Choose Channel'])[1]")
	WebElement AccountChannel;
	public WebElement AccountChannel() {
		return AccountChannel;
	}
	
	
	@FindBy(xpath = "//span[text()='New']")
	WebElement New;
	public WebElement New() {
		return New;
	}
	
	
	
	@FindBy(xpath = "//label[contains(text(), 'Name')]/following-sibling::input")
	WebElement QuotaName;
	public WebElement QuotaName() {
		return QuotaName;
	}
	
	@FindBy(xpath = "//tbody//tr[1]//td[1]")
	WebElement AfterQuotaName;
	public WebElement AfterQuotaName() {
		return AfterQuotaName;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select' and contains(@class, 'p-element')])[1]")
	WebElement QuotaType;
	public WebElement QuotaType() {
		return QuotaType;
	}
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select' and contains(@class, 'p-element')])[2]")
	WebElement QuotaBy;
	public WebElement QuotaBy() {
		return QuotaBy;
	}
	
	
	
	@FindBy(xpath = "(//span[@aria-label='Select'])[1]")
	WebElement Module;
	public WebElement Module() {
		return Module;
	}
	
	
	
	
	
	
	@FindBy(xpath = "(//p-dropdown[@placeholder='Select' and contains(@class, 'p-element')])[3]")
	WebElement QuotaFor;
	public WebElement QuotaFor() {
		return QuotaFor;
	}
	
	
	
	@FindBy(xpath = "(//input[@id='integeronly'])[1]")
	WebElement QuotaCount;
	public WebElement QuotaCount() {
		return QuotaCount;
	}
	
	
	
	
	
	
	@FindBy(xpath = "(//input[@id='minmaxfraction'])[1]")
	WebElement Quotaamount;
	public WebElement Quotaamount() {
		return Quotaamount;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Next'])[1]")
	WebElement NextS;
	public WebElement NextS() {
		return NextS;
	}
	
	
	@FindBy(xpath = "(//input[@id='yearpicker'])[1]")
	WebElement ClickYear;
	public WebElement ClickYear() {
		return ClickYear;
	}
	
	
	
	@FindBy(xpath = "//div[contains(@class, 'yearpicker')]//span[contains(text(), '2025')]")
	WebElement year;
	public WebElement year() {
		return year;
	}
	
	
	@FindBy(xpath = "(//span[@aria-label='Select Period'])[1]")
	WebElement TargetPeriod;
	public WebElement TargetPeriod() {
		return TargetPeriod;
	}
	
	
	

	@FindBy(xpath = "(//span[@aria-label='Select Month'])[1]")
	WebElement Statingmonth;
	public WebElement Statingmonth() {
		return Statingmonth;
	}
	
	
	@FindBy(xpath = "//button[@ptooltip='Undistribute']")
	WebElement Undistrubute;
	public WebElement Undistrubute() {
		return Undistrubute;
	}
	
	
	@FindBy(xpath = "//button[@ptooltip='Distribute']")
	WebElement Distrubute;
	public WebElement Distrubute() {
		return Distrubute;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='Next'])[1]")
	WebElement Next;
	public WebElement Next() {
		return Next;
	}
	
	@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[1]")
	WebElement ByTerritory;
	public WebElement ByTerritory() {
		return ByTerritory;
	}
	
	@FindBy(xpath = "(//liono-treeselect[@placeholder='Select Owner'])[1]")
	WebElement SelectRolehirechey;
	public WebElement SelectRolehirechey() {
		return SelectRolehirechey;
	}
	
	

	
	@FindBy(xpath = "//input[@autocomplete='off']")
	WebElement SearchTR;
	public WebElement SearchTR() {
		return SearchTR;
	}
	
	
	@FindBy(xpath = "(//liono-treeselect[@placeholder='Select Territory'])[1]")
	WebElement Selectterritory;
	public WebElement Selectterritory() {
		return Selectterritory;
	}
	
		//(//div[contains(@class, 'p-treenode-content') and contains(@class, 'p-treenode-selectable')])[1]	
	
	@FindBy(xpath = "(//li[@role='treeitem'])[2]")
	WebElement SelectT;

	public WebElement SelectT() {
		return SelectT;
	}


	
	
	
	@FindBy(xpath = "(//span[contains(@class, 'btnBars') and contains(@class, 'ng-star-inserted')])[1]")
	WebElement SelectAction;
	public WebElement SelectAction() {
		return SelectAction;
	}
	
	
	@FindBy(xpath = "(//div[contains(@class, 'p-checkbox-box') and contains(@class, 'p-component')])[1]")
	WebElement SelectCheckbox;
	public WebElement SelectCheckbox() {
		return SelectCheckbox;
	}
	
	@FindBy(xpath = "(//input[@id='minmaxfraction'])[3]")
	WebElement AddAmount;
	public WebElement AddAmount() {
		return AddAmount;
	}
	
	
	@FindBy(xpath = "(//input[@id='integeronly'])[3]")
	WebElement AddQuotaCount;
	public WebElement AddQuotaCount() {
		return AddQuotaCount;
	}
	
	
	
	
	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Save'])[2]")
	WebElement Save;
	public WebElement Save() {
		return Save;
	}
	
	@FindBy(xpath = "(//span[contains(@class, 'p-element') and contains(@class, 'btnBars') and contains(@class, 'ng-star-inserted')])[1]")
	WebElement User;
	public WebElement User() {
		return User;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement Saveall;
	public WebElement Saveall() {
		return Saveall;
	}
	
//.........................................View Sales Quota..............................................//	
	
	
	
	@FindBy(xpath = "//tbody//tr[1]//td[1]")
	WebElement ClickOnSalesQuota;
	public WebElement ClickOnSalesQuota() {
		return ClickOnSalesQuota;
	}
	
	
	
	@FindBy(xpath = "(//i[@class='pi pi-bars'])[1]")
	WebElement HumerbergIcon;
	public WebElement HumerbergIcon() {
		return HumerbergIcon;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='View'])[1]")
	WebElement Clickonview;
	public WebElement Clickonview() {
		return Clickonview;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='View Sales Quota'])[1]")
	WebElement Verfiyviewsq;
	public WebElement Verfiyviewsq() {
		return Verfiyviewsq;
	}
	
	
//.....................................Edit Sales Quota.......................................................//	
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Edit'])[1]")
	WebElement Edit;
	public WebElement Edit() {
		return Edit;
	}
	
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Next'])[1]")
	WebElement Next1;
	public WebElement Next1() {
		return Next1;
	}
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Next'])[1]")
	WebElement Next2;
	public WebElement Next2() {
		return Next2;
	}
	
	

	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement Save1;
	public WebElement Save1() {
		return Save1;
	}
	
	
	@FindBy(xpath = "//div[text()='Sales Quota updated successfully...']")
	WebElement VerifyUpdatedsq;
	public WebElement VerifyUpdatedsq() {
		return VerifyUpdatedsq;
	}
	
	
	
	//.............................Delete Sales Quota.........................................................//
	
	
	
	@FindBy(xpath = "(//span[normalize-space()='Delete'])[1]")
	WebElement ClickOnDelete;
	public WebElement ClickOnDelete() {
		return ClickOnDelete;
	}
	
	
	

	@FindBy(xpath = "(//span[@class='p-button-label'][normalize-space()='Yes'])[1]")
	WebElement Yes;
	public WebElement Yes() {
		return Yes;
	}
	
	
	
	@FindBy(xpath = "//div[text()='Deleted Successfully...']")
	WebElement VerifyDelete;
	public WebElement VerifyDelete() {
		return VerifyDelete;
	}
	
	
	
}
