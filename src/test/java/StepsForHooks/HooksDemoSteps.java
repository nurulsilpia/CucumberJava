package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	WebDriver driver = null;
	
	@Before(order=1)
	//@Before("@smoke") -> ini bakal di run buat scenarion yg punya tag smoke
	public void browserSetup() {
		
		System.out.println(" i am inside browser set up");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Before(order=0)
	public void setup2() {
		System.out.println("i am inside setup 2");
	}
	
	@After
	public void tearDown() {
		
		System.out.println("i am inside tear down");
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("--- i am inside beforeSteps ---");
	}
	
	@AfterStep
	public void afterSteps( ) {
		System.out.println("-- i am inside afterSteps ---");
	}
	
	@Given("user is on login page hooks")
	public void user_is_on_login_page_hooks() {
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	}
	@And("user click login button")
	public void user_click_login_button() {
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	}
}
