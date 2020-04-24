package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.BaseClass;

public class loginPage {
	WebDriver driver;
	BaseClass b= new BaseClass(); //Mrinmayee
	
	@Before
	public void initializedriver() throws InterruptedException {
	//BaseClass b= new BaseClass(); //Mrinmayee
	driver= b.getdriver();
	b.launchApplication();
	}
	
	//loginElements le= new loginElements(driver);
	
		
	/*public void launchApp() throws InterruptedException {
		b.launchApplication();
	}*/
	
	
	@When("^title of login page is Welcome$")
	public void title_of_login_page_is_Welcome() throws InterruptedException  {
		 String loginTitle= driver.getTitle();
		   Assert.assertTrue(loginTitle.contains("Welcome"));
		    Thread.sleep(5000);
	}

	@Then("^I will enter invalidone \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_will_enter_invalidone_and(String uName, String pwd)  {
		driver.findElement(By.name("userName")).sendKeys(uName);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	@Then("^I click on Login Button$")
	public void i_click_on_Login_Button()  {
		driver.findElement(By.name("login")).click();
	}
	
	@Then("^I am in Login Page$")
	public void i_am_in_Login_Page()  {
		String homePgTitle= driver.getTitle();
	    Assert.assertTrue(homePgTitle.contains("Find a Flight:"));
	}

	@Then("^I will enter validone \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_will_enter_validone_and_(String userName, String passWord)  {
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
	}

	@Then("^I am in Home Page$")
	public void i_am_in_Home_Page()  {
		String homePgTitle= driver.getTitle();
	    Assert.assertTrue(homePgTitle.contains("Mercury Tours")); 
	}
	
	
	@After
	public void closeapp() {
		//BaseClass c= new BaseClass(); //Mrinmayee
		b.closeBrowser();
		
	}
}
