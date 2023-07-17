package StepDefs;

import static org.mockito.ArgumentMatchers.anyCollection;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FlightClassChecksPage {
	WebDriver driver =null;
	
	
	@And("The user click the Travel class button")
	public void the_user_click_the_travel_class_button() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div/div[1]/div/div/div/form[2]/div/div/div[2]/div[2]/div[1]/form/div/div[1]/label")).click();
		
		List<WebElement> elermentLists =driver.findElements(By.xpath("/html/body/main/div[2]/div[2]/div/div[1]/div/div/div/form[2]/div/div/div[2]/div[2]/div[1]/form/div/div[1]/label"));
		//driver.findElement(By.xpath("//*[@id=\"content\"]")).click();
		
		List<String> originalList = elermentLists.stream().map(t->t.getText()).collect(Collectors.toList());
		Thread.sleep(1000);
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertEquals(originalList, sortedList);
		//TODO
		//Selection from the dropdown list

	}
	
	
	@When("The user click on their of choice class and select {string}")
	public void the_user_click_on_their_of_choice_class_and_select(String TRAVELCLASS) {

		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div/div[1]/div/div/div/form[2]/div/div/div[2]/div[2]/div[1]/form/div/div[1]/label")).click();
	}
	@Then("The selected {string} is confirmed")
	public void the_selected_is_confirmed(String string) {
	  
	}
}