package StepDefinitions;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchStep {
	
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("inside step - browser is open");
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("project path is : "+projectPath);
//		
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver");
//		
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//		
////		driver.manage().window().maximize();
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("inside step - user is on goole search page");
//		
//		driver.navigate().to("https://www.google.com/");
//	}
//
//	@When("user enter the text in search box")
//	public void user_enter_the_text_in_search_box() throws InterruptedException {
//		System.out.println("inside step - user enter the text is search box");
//		
//		driver.findElement(By.name("q")).sendKeys("Automation step by step");
//		
//		Thread.sleep(2000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		System.out.println("inside step - hits enter");
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		
//		Thread.sleep(2000);
//	}
//
//	@Then("user navigated to search result")
//	public void user_navigated_to_search_result() {
//		System.out.println("inside step - user navigated to search result");
//		
//		driver.getPageSource().contains("Online Courses");
//		
//		driver.close();
//		driver.quit();
//	}
}
