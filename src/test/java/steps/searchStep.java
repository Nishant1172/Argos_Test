package steps;

import co.argos.homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchStep {
    private co.argos.homepage homepage = new homepage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() {
        homepage.setUp();
    }

    @When("^I do search a product \"([^\"]*)\"$")
    public void i_do_search_a_product(String arg1) {
        homepage.doSearch("Nike");
    }

    @Then("^I see the respective product List and select random product$")
    public void i_see_the_respective_product_List_and_select_random_product() {
        homepage.selectAnyProduct();
        homepage.addToBasket();
    }

    @Then("^add the trolley$")
    public void add_the_trolley()  {
        homepage.goToTrolley();
    }

}
