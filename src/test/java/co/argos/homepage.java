package co.argos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class homepage extends driver_manager {
    public void doSearch(String item){
       WebElement searchBok = driver.findElement(By.id("searchTerm"));
       searchBok.sendKeys(item);
       searchBok.sendKeys(Keys.ENTER);
       sleep(5000);
    }
    public void selectAnyProduct(){
        List<WebElement> productList = driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
        int indexNumber = randomNumber(productList.size());
        WebElement selectedProduct = productList.get(indexNumber);
        String expected =selectedProduct.getText();
        selectedProduct.click();
        sleep(5000);
    }
    public void addToBasket(){
        driver.findElement(By.cssSelector(".add-to-trolley-main")).click();
        sleep(5000);
    }
    public void goToTrolley(){
        driver.findElement(By.linkText("Go to Trolley")).click();
        sleep(4000);
    }

}
