package smokeTest;

import co.argos.homepage;
import co.argos.trolleyPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class smokeTest{
    private WebDriver driver;
    private co.argos.trolleyPage trolleyPage= new trolleyPage();
    private co.argos.homepage homepage = new homepage();
    public void searchTest(){
        homepage.setUp();
        homepage.doSearch("puma");
    }
    public void BasketTest(){
        homepage.selectAnyProduct();
        homepage.addToBasket();
        homepage.goToTrolley();
        homepage.sleep(5000);
    }

    public void trolleyTest(){

        double priceInOne = trolleyPage.getPriceFromBasket();
        double expected = priceInOne * 3;
        homepage.sleep(5000);
       Select quantity = new Select(driver.findElement(By.cssSelector("select[data-e2e='product-quantity']")));
        quantity.selectByVisibleText("3");
        double actual = trolleyPage.getPriceFromBasket();
        homepage.sleep(5000);
        assertThat(expected,is(equalTo(actual)));
    }



}
