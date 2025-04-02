package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NonInventoryPage {
	
	WebDriver ldriver;

	public NonInventoryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[text()='Inventory']")
	WebElement btnInventory;

	public WebElement clickInventory() {
		return btnInventory;
	}
	
	@FindBy(xpath = "//*[text()='Products']")
	WebElement btnProduct;

	public WebElement clickProduct() {
		return btnProduct;
	}
	
	@FindBy(xpath = "//*[text()='New']")
	WebElement btnNewProduct;

	public WebElement clickAddNewProduct() {
		return btnNewProduct;
	}
	
	@FindBy(xpath = "//input[@id='itemNo']")
	WebElement txtItemNo;

	public WebElement setItemNo() {
		return txtItemNo;
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement txtSearch;

	public WebElement setSearch() {
		return txtSearch;
	}
	
	@FindBy(xpath = "//*[text()='Select Variant']")
	WebElement drpVariant;

	public WebElement selectVariant() {
		return drpVariant;
	}

}
