package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefinition {
	
	WebDriver driver;
	
	/*@Before
	public void launchApplication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize(); 
	    driver.manage().deleteAllCookies();
	    driver.get("http://newtours.demoaut.com/");
	    Thread.sleep(5000);
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}*/
	
	
	@Given("I am on Login Page")
	public void I_am_on_Login_Page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
	}
	
	@When("^title of login page contains Welcome$")
	public void title_of_login_page_contains_Welcome() throws InterruptedException  {
	    String loginTitle= driver.getTitle();
	    Assert.assertTrue(loginTitle.contains("Welcome"));
	    Thread.sleep(5000);
	}
	
	@Then("^I will enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_will_enter_invalid_username_and_password(String uName, String pwd)  {
		driver.findElement(By.name("userName")).sendKeys(uName);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	
	@Then("^I am on login page$")
	public void i_am_on_login_page()  {
		String homePgTitle= driver.getTitle();
	    Assert.assertTrue(homePgTitle.contains("Mercury Tours"));
	    driver.close();
	    
	}

	@Then("^I will enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_will_enter_valid_username_and_password(String userName, String passWord)  {
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
	}
	
	@Then("^I Click on Login Button$")
	public void i_Click_on_Login_Button()  {
		driver.findElement(By.name("login")).click();
	}

	@Then("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		String homePgTitle= driver.getTitle();
	    Assert.assertTrue(homePgTitle.contains("Find a Flight:"));
	    driver.close();
	}

}
