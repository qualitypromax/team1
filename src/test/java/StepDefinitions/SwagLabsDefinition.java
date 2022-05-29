package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SwagLabsDefinition {
	
	WebDriver driver;
	
	@Given("I go to SwagLabs website")
	public void i_go_to_swag_labs_website() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));  
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();		  
		driver.navigate().to("https://www.saucedemo.com/");
	}
	@When("I enter the username and password")
	public void i_enter_the_username_and_password() {
		
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");

		}
	
	

@When("I click the Login button")
public void i_click_the_login_button() {

	driver.findElement(By.id("login-button")).click();
	
}

@Then("I should be redirected to the Homepage")
public void i_should_be_redirected_to_the_homepage() {

	driver.findElement(By.className("shopping_cart_link")).isDisplayed();
	
	
}

@When("I click the Sauce Labs Backpack")
public void i_click_the_sauce_labs_backpack() {

	driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']")).click();
	
	
}

@Then("I should see its product image displayed")
public void i_should_see_its_product_image_displayed() {

	driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).isDisplayed();
	
}


@Then("I Validate the price of the product")
public void i_validate_the_price_of_the_product() {
	
	String amount = driver.findElement(By.className("inventory_details_price")).getText();
	
	System.out.println("This is my amount: " + amount);
	
	//assertEquals(amount, checkout.total());
	assertEquals(amount, "$29.99");
	
	//Assert.isTrue(true, amount, );
	
	driver.close();
	
	
}

}
