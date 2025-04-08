package com.liono360.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liono360.loginPage.Baseclass;

public class RMAPage extends Baseclass{
	WebDriver ldriver;

	public RMAPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Inventory')]")
	WebElement btnInventory;

	public WebElement clickInventory() {

		return btnInventory;
	}
	
	@FindBy(xpath = "//*[text()='Purchases']")
	WebElement btnProduct;

	public WebElement clickPurchases() {
		return btnProduct;
	}
	@FindBy(xpath="//*[text()='Sales']")
    WebElement btnSales;
  
  public WebElement clickSales() {
	  return btnSales;
  }
  
  @FindBy(xpath="//span[text()='Customer Returns']")
  WebElement btnCustomerReturn;
  
  public WebElement clickCustomerReturn() {
	  return btnCustomerReturn;
  }
  @FindBy(xpath = "//*[text()='New']")
	WebElement btnNewSales;


	public WebElement clickAddNewSales() {
		
		return btnNewSales;
	}
	@FindBy(xpath = "//input[@placeholder='Search Account...']")
	WebElement txtSearchAccount;

	public WebElement setSearchAccount() {
		return txtSearchAccount;
	}
	
	@FindBy(xpath="//span[text()='Select a Location']")
	WebElement txtSelectLocation;
	
	public WebElement clickSelectLocation() {
		return txtSelectLocation;
	}
}
