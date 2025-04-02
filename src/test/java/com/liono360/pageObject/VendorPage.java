package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class VendorPage extends Baseclass {
	WebDriver ldriver;

	public VendorPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
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
				System.out.println("Now Page loaded fully !....");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				break; 
			}

			if (LoaderIcon!=null) {

				Thread.sleep(500); 
				time=(float) (time+.5);
				System.out.println("page loader icon is occuring till: "+time +"Seconds");
			} 
			else {
				break;
			}
		    
		}
	}
	@FindBy(xpath="//span[contains(text(),'Inventory')]")
	WebElement btnInventory;
	
	public WebElement clickInventory() {
		return btnInventory;
	}
	
	@FindBy(xpath="//span[contains(text(),'Purchases')]")
	WebElement btnPurchase;
	
	public WebElement clickPurchase() {
		return btnPurchase;
	}
	 @FindBy(xpath="//*[text()='Sales']")
	    WebElement btnSales;
	  
	  public WebElement clickSales() {
		  return btnSales;
	  }
	@FindBy(xpath="//div[@role='button']")
	WebElement btndrpdown;
	
	public WebElement PurchaseDrpdown() {
		return btndrpdown;
	}
	
	@FindBy(xpath="//span[contains(text(),'Vendors')]")
	WebElement btnVendors;
	
	public WebElement clickVendors() {
		return btnVendors;
	}
	
	@FindBy(xpath="(//a[@role='menuitem'])[1]")
	WebElement btnNew;
	
	public WebElement clickNew() {
		return btnNew;
		
	}
	
	@FindBy(xpath="//input[@id='name']")
	WebElement btnVendorName;
	
	public WebElement clickVendorName() {
		return btnVendorName;
		
		
	}
	@FindBy(xpath="//p-multiselect[@placeholder='Select Vendor Type']//div[3]")
	WebElement btnselectvendortype;
	
	public WebElement clickselectvendorType() {
		return btnVendorName;
	}
	
	@FindBy(xpath="//p-multiselect[@placeholder='Select Vendor Type']/div//div[3]")
	WebElement btnVendorType;
	
	public WebElement clickVendorType() {
		
		return btnVendorType;
	}
	
	@FindBy(xpath="//li[@aria-label='Vendor']")
	WebElement btnselectVendorType;
	
	public WebElement clickselectvendortype() {
		return btnselectVendorType;
	}
	
	
	@FindBy(xpath="(//input[@formcontrolname='accountNumber'])[1]")
	WebElement btnaccountNumber;
	
	public WebElement clickaccountNumber() {
		return btnaccountNumber;
	}
	
	@FindBy(xpath="//input[@formcontrolname='emailAddress']")
	WebElement btnemailaddress;
	
	public WebElement clickemailaddress() {
		return btnemailaddress;
	}
	
	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement btnphoneNumber;
	
	public WebElement clickPhoneNumber() {
		return btnphoneNumber;
	}
	@FindBy(xpath="//span[normalize-space()='Select Time Zone']")
	WebElement btnselectTimezone;
	
	public WebElement clickselectTimeZone() {
		return btnselectTimezone;
	}
	@FindBy(xpath="//span[normalize-space()='Select currency']")
	WebElement btnSelectCurrency;
	
	public WebElement clickSelectCurrency() {
		return btnSelectCurrency;
		
	}
	@FindBy(xpath="//input[@formcontrolname='doingBusinessAs']")
	WebElement btndoingBusinessAs;
	
	public WebElement clickDoingBusinessas() {
		
		return btndoingBusinessAs;
	}
	@FindBy(xpath="//input[@formcontrolname='taxId']")
	WebElement btntaxid;
	
	public WebElement clickTaxId() {
		return btntaxid;
	}
	@FindBy(xpath="//span[normalize-space()='Select Employee']")
	WebElement btnSelectEmployee;
	
	public WebElement clickSelectEmployee() {
		return btnSelectEmployee;
		
	}
	
	@FindBy(xpath="//p-dropdown[@placeholder='Select Time Zone']//div//i")
	WebElement btntimezoneclose;
	
	public WebElement clickTimeZoneClose() {
		return btntimezoneclose;
	}
	@FindBy(xpath="//span[normalize-space()='Select Revenue']")
	WebElement btnSelectRevenue;
	
	public WebElement clickSelectrevenue() {
		return btnSelectRevenue;
	}
	
	 @FindBy(xpath="//p-dropdown[@placeholder='Select currency']//div//i")
	 WebElement btncurrencyclose;
	 public WebElement clickcurrencyclose() {
		 return btncurrencyclose;
	 }
	 
	 @FindBy(xpath="//p-dropdown[@placeholder='Select Employee']//div//i")
	 WebElement btncloseemploye;
	 public WebElement clickcloseemployee() {
		 return btncloseemploye;
	 }
	 
	 @FindBy(xpath="//p-dropdown[@placeholder='Select Revenue']//div//i")
	 WebElement btncloserevenue;
	 public WebElement clickcloserevenue() {
		 return btncloserevenue;
	 }
	 
	 @FindBy(xpath="//p-dropdown[@placeholder='Select ownership']//div//i")
	 WebElement btncloseownership;
	 public WebElement clickcloseownership() {
		 return btncloseownership;
	 }
	@FindBy(xpath="//span[normalize-space()='Select ownership']")
	WebElement btnSelectOwnership;
	
	public WebElement clickSelectOwnership() {
		return btnSelectOwnership;
	}
	@FindBy(xpath="(//li[@role='option']/span)[1]")
	WebElement btnownershipchoice;
	
	public WebElement clickoptionownership() {
		return btnownershipchoice;
	}
	
	@FindBy(xpath="//input[@placeholder=\"Search\"]")
	WebElement btnSearch;

	public WebElement Search() {
		return btnSearch;
		}
	@FindBy(xpath="//input[@formcontrolname='foundedYear']")
	WebElement btnFoundedyear;
	
	public WebElement clickFoundedYear() {
		return btnFoundedyear;
	}
	@FindBy(xpath="//button[@label='Cancel']")
	WebElement btnCancel;
	
	public WebElement clickCancel() {
		return btnCancel;
	}
	
	@FindBy(xpath="//span[normalize-space()='Select Industry']")
	WebElement btnSelectIndustry;
	 
	
	public WebElement clickSelectIndustry() {
		return btnSelectIndustry;
		
	}
	
	@FindBy(xpath="(//li[@role='option']/span)[3]")
	WebElement btnIndustry;
	
	public WebElement clickIndustry() {
	return btnIndustry;
}
	
	@FindBy(xpath="//input[@formcontrolname='sicCode']")
	WebElement btnsicCode;
	
	public WebElement clickSiccode() {
		return btnsicCode;
		
		
	}
	
	@FindBy(xpath="//input[@formcontrolname='naicsCode']")
	WebElement btnnaicsCode;
	
	public WebElement clicknaicsCode() {
		return btnnaicsCode;
	}
	
	@FindBy(xpath="//span[normalize-space()='Select title']")
	WebElement btnSelectTitle;
	
	public WebElement clickSelectTitle() {
		return btnSelectTitle;
		
		
	}
	@FindBy(xpath="//input[@id='fname']")
	WebElement btnfname;
	
	public WebElement clickFname(){
	
	return btnfname;
}
	
	@FindBy(xpath="//input[@id='lname']")
	WebElement btnlname;
	
	public WebElement clicklname() {
		return btnlname;
	}
	
	@FindBy(xpath="(//tbody//tr[1]//td[1])[1]")
	WebElement listedVendor;

	public WebElement Listedvendor() {
		return listedVendor;
		}
	
		
	@FindBy(xpath="//input[@id='email']")
	WebElement btnemail;
	
	public WebElement clickemail() {
		return btnemail;
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Enter a location']")
    WebElement Streetadress1;
	
	public WebElement StreetAdress1() {
	return Streetadress1;	
}

	@FindBy(xpath = "//input[@name='streetAddress2']")
    WebElement Streetadress2;
	
	public WebElement StreetAdress2() {
	return Streetadress2;
	}
	@FindBy(xpath="//input[@formcontrolname='contactPhone']")
	WebElement btnphone;
	
	public WebElement clickphone() {
		return btnphone;
	}
	
	@FindBy(xpath="//input[@formcontrolname='socialProfile']")
	WebElement btnsocialprofile;
	
	public WebElement clicksocialProfile() {
		return btnsocialprofile;
	}
	@FindBy(xpath="//span[normalize-space()='Select gender']")
	WebElement btnSelectgender;
	
	
	public WebElement clickSelectGender() {
		return btnSelectgender;
		
	}
	@FindBy(xpath="//input[@placeholder='dd/mm/yyyy']")
	WebElement btnDOB;
	
	public WebElement clickDOB() {
		return btnDOB;
	}
	
	@FindBy(xpath="(//body/div/div/div/div//button[@type='button'])[3]")
	WebElement btnDobyear;
	
	public WebElement clickDobYear() {
		return btnDobyear;
	}
	
	@FindBy(xpath="//body/div/div/div/div/button[1]/span[1]")
	WebElement btnleft1year;
	
	public WebElement clickleft1year() {
		return btnleft1year;
		
	}
	@FindBy(xpath="//body/div/div/span[1]")
	WebElement btnyeardate;
	
	public WebElement clickyeardate() {
		return btnyeardate;
	}
	
	@FindBy(xpath="//body/div/div/span[1]")
	WebElement btnmonthdate;
	
	public WebElement clickmonthdate() {
		return btnmonthdate;
	}
	@FindBy(xpath="//tbody/tr[2]/td[1]/span[1]")
	WebElement btndate;
	
	public WebElement clickdate() {
		return btndate;
	}
	
	@FindBy(xpath="//p-multiselect[@placeholder='Select Language']")
	WebElement btnlanguage;
	
	public WebElement clickLanguage() {
		return btnlanguage;
	}
	@FindBy(xpath="(//body/div/div/ul[@role='listbox']//span[1])[2]")
	WebElement btnlanguageselection;
	
	public WebElement clicklanguageselection() {
		return btnlanguageselection;
	}
	
	@FindBy(xpath="//p-multiselect[@placeholder='Select Job']")
	WebElement btnjobfunction;
	
	public WebElement clickJobFunction()
	{
	return btnjobfunction;
	}
	@FindBy(xpath="//body/div/div/ul[@role='listbox']")
	WebElement btnselectjobfunction;
	
	public WebElement clickselectjobfunction() {
		return btnselectjobfunction;
	}
	@FindBy(xpath="//div[@role='dialog']//div//form//div//h5//span//i")
	WebElement btnaddaddress;
	
	public WebElement clickAddress() {
		return btnaddaddress;
	}
	@FindBy(xpath="//span[normalize-space()='Select Address Type']")
	WebElement btnaddresstype;
	
	public WebElement clickaddresstype() {
		return btnaddresstype;
	}
	
	@FindBy(xpath="//input[@placeholder='Enter a location']")
	WebElement btnlocation;
	
	public WebElement clicklocation() {
		return btnlocation;
		
	}
	@FindBy(xpath="(//span[contains(text(),'Save')])[2]")
	WebElement btnsave2;
	
	public WebElement clickSave2() {
		return btnsave2;
	}
	@FindBy(xpath="(//span[contains(text(),'Save')])[1]")
	WebElement btnsave1;
	
	public WebElement clicksave1()
	{
		return btnsave1;
	}
	
	@FindBy(xpath="(//tbody//tr[1])[1]")
	WebElement btnvendorlist;
	
	public WebElement clickVendorlist() {
		return btnvendorlist;
	}
	
	@FindBy(xpath="//span[normalize-space()='Edit']")
	WebElement btnEditVendor;
	
	public WebElement clickEditVendor() {
		return btnEditVendor;
	}
	
	@FindBy(xpath="//span[contains(text(),'View')]")
	WebElement btnViewVendor;
	
	public WebElement clickViewVendor() {
		return btnViewVendor;
	}
	
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement clickondeletebtn;

	public WebElement clickondeletebtn() {
		return clickondeletebtn;
}
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement clickonyesbtn;

	public WebElement clickOnYesbtn() {
		return clickonyesbtn;	
}}