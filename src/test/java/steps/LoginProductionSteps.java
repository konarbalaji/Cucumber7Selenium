package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginProductionSteps {

    @Then("user validates captcha image")
    public void user_validates_captcha_image() {
        System.out.println("user validates captcha image");
    }
}
