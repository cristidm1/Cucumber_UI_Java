package org.example.stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseStepsClass {

    @Given("User is on the Home Page")
    public void user_is_on_the_home_page() {
        System.out.println("User is going to home Page!");
    }
    @When("User retrieve the text for Menu Items")
    public void user_retrieve_the_text_for_menu_items() {
        homePage.getListOfMenuItems();
    }
    @Then("Text should be printed on the console")
    public void text_should_be_printed_on_the_console() {
        System.out.println("Text it's printed!");
    }

}
