package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    @Given("User navigates to the facebook website")
    public void user_navigates_to_the_facebook_website() {
        System.out.println("Given -- User navigates to the facebook website");
    }

    @When("user navigates the homepage title")
    public void user_navigates_the_homepage_title() {
        System.out.println("When -- user navigates the homepage title");
//        Assert.assertTrue(false);

    }

    @Then("user enters {string} username")
    public void user_enters_username(String uname) {
        System.out.println("Then -- user enters "+ uname + " username");
    }

    @Then("user enters {string} password")
    public void user_enters_password(String pwd) {
        System.out.println("Then -- user enters  "+ pwd + " password");
    }

    @Then("user clicks on signon button")
    public void user_clicks_on_signon_button() {
        System.out.println("Then -- user clicks on signon button");
    }

}