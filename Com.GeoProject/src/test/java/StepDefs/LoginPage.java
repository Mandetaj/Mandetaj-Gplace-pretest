package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

@Given("I clicked on the LOG IN button")
public void i_clicked_on_the_log_in_button() {
	//TODO
   //assert LOG IN link on the home page before clicking
}

@And ("I am directed to the Your Account or Sign Up page")
public void i_am_directed_to_the_your_account_or_sign_up_page() {
	//TODO
   //assert this page
}

@Given("I Clicked on the Sign up link")
public void i_clicked_on_the_sign_up_link() {
	//TODO
	//Assert the link and all other info on the page
   
}

@When("I insert all the requuired details")
public void i_insert_all_the_requuired_details() {
	//TODO
	//All mandatory field must should be filled

}

@When("I tick the agree to Terms and Condition button")
public void i_tick_the_agree_to_terms_and_condition_button() {
	//TODO
	//Tick box after all the details has been completed
 
}

@Then("I should be registred")
public void i_should_be_registred() {
	//TODO
    //After registration i should see a welcome/acceptance page 
}




}
