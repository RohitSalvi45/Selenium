package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.readProperty;

public class BaseClass {
	readProperty pro= new readProperty();
	protected WebDriver driver;
	
	/*public BaseClass(WebDriver driver) {
		this.driver= driver;
	}*/
	public WebDriver getdriver() {
		
		System.setProperty("webdriver.chrome.driver", pro.getdriver());
		driver= new ChromeDriver();
		return driver;
	}
	
	
	public void launchApplication() throws InterruptedException {
		//driver= getdriver(); //Mrinmayee
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(pro.getApplicationURL());
		Thread.sleep(5000);
		
	}
	
	
	public void closeBrowser() {
		driver.quit();
	}

}
