package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import smokeTest.smokeTest;

public class TrolleyStep{

    private smokeTest smokeTest = new smokeTest();
    @Given("^go to trolley page$")
    public void go_to_trolley_page() {
        smokeTest.searchTest();
    }

    @When("^check the trolley product$")
    public void check_the_trolley_product() {
        smokeTest.BasketTest();
    }

    @Then("^check the product quantity and price$")
    public void check_the_product_quantity_and_price() {
        smokeTest.trolleyTest();
    }
}
