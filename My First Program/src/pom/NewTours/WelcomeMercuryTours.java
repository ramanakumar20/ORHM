package pom.NewTours;

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
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement passWord;
	@FindBy(name="login")
	WebElement signIn;
	public void logIN(String userName,String password)
	{
		username.sendKeys(userName);
		passWord.sendKeys(password);
		signIn.click();
		
	}
}
