package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User navigates to the facebook website")
    public void user_navigates_to_the_facebook_website() {
        System.out.println("Given -- User navigates to the facebook website");
    }

    @When("user navigates the homepage title")
    public void user_navigates_the_homepage_title() {
        System.out.println("When -- user navigates the homepage title");

    }

    @Then("user enters username")
    public void user_enters_username() {
        System.out.println("Then -- user enters username");
    }

    @Then("user enters password")
    public void user_enters_password() {
        System.out.println("Then -- user enters password");
    }

    @Then("user clicks on signon button")
    public void user_clicks_on_signon_button() {
        System.out.println("Then -- user clicks on signon button");
    }

}