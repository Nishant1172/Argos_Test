package co.argos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class trolleyPage{
    private WebDriver driver;
    public List<String> getProductInTrolley(){
        List<String> allProductInTrolley = new ArrayList<>();

        List<WebElement> productInTrolley = driver.findElements(By.className("a[data-e2e='product-name']"));

        for (WebElement element : productInTrolley){
            String product = element.getText();
            allProductInTrolley.add(product);
        }
        return allProductInTrolley;

    }

    public double getPriceFromBasket(){
        String price = driver.findElement(By.cssSelector("span[data-e2e='product-line-price']")).getText().replace("£","");
        double priceInDouble = Double.parseDouble(price);
        return priceInDouble;
    }
}
