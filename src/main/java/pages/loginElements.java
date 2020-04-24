package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginElements {
	WebDriver driver;
	By userName= By.name("userName");
	By pswd= By.name("password");
	By Loginbtn= By.name("login");
	
	public loginElements(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void entries(String u, String p)
	{
		
		driver.findElement(userName).sendKeys(u);
		driver.findElement(pswd).sendKeys(p);
	}
	
	public void signinbutn() {
		driver.findElement(Loginbtn).click();
	}

}
