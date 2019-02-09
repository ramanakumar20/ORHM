package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours 
{

	@FindBy(linkText="SIGN-ON")
	WebElement signon;
	public void signon()
	{
		signon.click();
	}
	@FindBy(linkText="REGISTER")
	WebElement register;
	public void register()
	{
		register.click();
	}
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement passWord;
	@FindBy(name="login")
	WebElement signIn;
	public void logIn(String userName,String password)
	{
		username.sendKeys(userName);
		passWord.sendKeys(password);
		signIn.click();
	}
	
}
