package com.liono360.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//input[@type='text']")
	WebElement txtUsername;

	@FindBy(xpath="//input[@type='password']")
	WebElement txtPassword;

	@FindBy(xpath="//*[text()='Sign In']")
	WebElement btnLogIn;
	
	@FindBy(xpath="//a[@id='user-display']//img[@alt='main logo']")
	WebElement btnProfileImg;

	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	public void setPassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}
	public void clickSubmit()
	{
		btnLogIn.click();
	}
	public WebElement btnProfile()
	{
		return btnProfileImg;
	}

	@FindBy(xpath="//span[normalize-space()='Logout']")

	WebElement btnlogout;

	public WebElement btnlogout()
	{
	return btnlogout;

	}
	
}
