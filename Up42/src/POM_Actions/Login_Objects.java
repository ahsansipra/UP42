package POM_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Objects {
	
	WebDriver driver;
	By Sign_in=By.xpath("(//button[@type='tertiary'][text()='Sign In'][text()='Sign In'])[2]");
	By username=By.id("email");
	By password=By.id("password");
	By click_SigIn=By.xpath("//BUTTON[@tabindex='3']");

	
	public Login_Objects(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
	public void signIn_Click()
	{
		driver.findElement(Sign_in).click();
	}
	
	public void setUserName(String userid)
	{
		driver.findElement(username).sendKeys(userid);
		
	}
	public void setPassword(String passwrd)
	{
		driver.findElement(password).sendKeys(passwrd);
		
	}
	public void click_SignIn()
	{
		driver.findElement(click_SigIn).click();
	}
	
	
}
