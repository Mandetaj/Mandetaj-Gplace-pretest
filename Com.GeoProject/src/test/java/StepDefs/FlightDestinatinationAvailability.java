package StepDefs;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FlightDestinatinationAvailability {
	
	WebDriver driver =null;
	@Given("A user is on the British Airways home page")
	public void a_user_is_on_the_british_airways_home_page() throws Throwable {
		String projectPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"/src/test/resources/drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.navigate().to("https://www.britishairways.com");

		driver.findElement(By.xpath("//*[@id=\"ensCloseBanner\"]")).click();

	}

@Given("The user clicked on Search City break button")
public void the_user_clicked_on_search_city_break_button() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"hero-button\"]")).click();
}

	@And("The user enter the FROM destination with {string} and {string} in the search boxes")
	public void the_user_enter_the_from_destination_with_and_in_the_search_boxes(String ABBREVIATION, String FROM_DESTINATION) throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"from\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"from\"]")).sendKeys(ABBREVIATION);
		driver.findElement(By.xpath("//*[@id=\"from\"]")).sendKeys(FROM_DESTINATION);
		driver.findElement(By.xpath("//*[@id=\"from\"]")).click();
		Thread.sleep(1000);
		//Assert.assertEquals("London, London Heathrow (LHR), UK", FROM_DESTINATION);
	}

	@And("The user enter the TO destination {string} with {string} in the search boxes")
	public void the_user_enter_the_to_destination_with_in_the_search_boxes(String ABBREVIATION1, String TO_DESTINATION) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"to\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"to\"]")).sendKeys(ABBREVIATION1);
		driver.findElement(By.xpath("//*[@id=\"to\"]")).sendKeys(TO_DESTINATION);

	}

	@Given("The user select the leaving date {string} and {string}")
	public void the_user_select_the_leaving_date_and(String MONTH1, String DAY1) throws InterruptedException {

		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div/div[1]/div/div/div/div[3]/div/div/form/div/div[2]/div/div[1]/div[2]/div/div[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div/div[1]/div/div/div/div[4]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/span[1]/span")).getText();
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div/div[1]/div/div/div/div[4]/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/table/tbody/tr[4]/td[6]/div[1]")).click();
		Thread.sleep(1000);
	}
	
	@Given("The user select the return date {string} and {string}")
	public void the_user_select_the_return_date_and(String MONTH2, String DAY2) throws InterruptedException {
	  
		driver.findElement(By.xpath("//*[@id=\"flight-inbound-date-selector\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"datepicker-pop-up-modal ba-datepicker\"]/div/div[2]/div[1]/div/div[2]/span[3]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div/div[1]/div/div/div/div[4]/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/table/tbody/tr[2]/td[4]/div[1]/span")).click();
	}
	@When("The user click the submit button")
	public void the_user_click_the_submit_button() {
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div/div[1]/div/div/div/div[3]/div/div/form/div/div[2]/div/div[1]/div[5]/button[1]")).click(); 
	}
	@When("The user is blocked with permission issue due to automated software been used")
	public void the_user_is_blocked_with_permission_issue_due_to_automated_software_been_used() {
		String text=driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div/div[1]/div/div/div/div[3]/div/div/form/div/div[2]/div/div[1]/div[5]/button[1]")).getText();
		Assert.assertEquals("Error 403 - You don't have enough permissions to proceed further", text);
	}
	
	}
	

