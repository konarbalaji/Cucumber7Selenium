package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.nio.file.attribute.GroupPrincipal;
import java.util.List;
import java.util.Map;

public class LoginProductionSteps {

    @Then("user validates captcha image")
    public void user_validates_captcha_image() {
        System.out.println("user validates captcha image");
    }

    @Then("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {

        /*int rows = dataTable.asLists().size();
        int cols = dataTable.asLists().get(0).size();

        System.out.println("Number of rows : " + rows);
        System.out.println("Number of rows : " + cols);

        for (int i = 0 ; i < rows ; i++){
            int j=0;
            System.out.println("Fname is " + dataTable.asLists().get(i).get(j++) + " Lname is " + dataTable.asLists().get(i).get(j++));
        }*/

        List<Map<String, String>> map = dataTable.asMaps();
        for (int i = 0 ; i < map.size() ; i++){
            System.out.println("firstname is : " + map.get(i).get("firstname") + " --- Lastname is : " + map.get(i).get("lastname"));
        }
    }
}